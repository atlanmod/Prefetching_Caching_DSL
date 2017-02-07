package fr.inria.atlanmod.prefetchml.core.cache.monitoring;

import java.text.DateFormat;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Strings;

import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingRule;


public class PrefetchMLMonitor {

    private Date startMonitoringTs;
    
    // Use this to print the timestamp infos / interval
    private int intervals = 4;
    
    /*
     * Hit monitoring
     */
    private Map<PrefetchingRule, List<Date>> hitTimestampsPerRule;

    /*
     * Miss monitoring
     */
    private int globalMissCount;
    private Map<EStructuralFeature, List<Date>> missedFeatureTimestamps;
    
    private Map<PrefetchingRule, List<Long>> executionTimePerRule;
    
    private Map<PrefetchingRule, Integer> cachedPerRule;
    
    private Map<PrefetchingRule, List<Long>> cachingTimestampsPerRule;
    
    /**
     * Returns the instance of this class.
     *
     * @return the instance of this class
     */
    @Nonnull
    public static PrefetchMLMonitor getInstance() {
        return Holder.INSTANCE;
    }
    
    private PrefetchMLMonitor() {
        startMonitoringTs = new Date(System.currentTimeMillis());
        PrefetchMLLogger.info("PrefetchMLMonitor started");
        hitTimestampsPerRule = new HashMap<PrefetchingRule, List<Date>>();
        missedFeatureTimestamps = new HashMap<EStructuralFeature, List<Date>>();
        
        executionTimePerRule = new HashMap<PrefetchingRule, List<Long>>();
        cachedPerRule = new HashMap<PrefetchingRule, Integer>();
        cachingTimestampsPerRule = new HashMap<PrefetchingRule, List<Long>>();
    }
    
    public void reset() {
        startMonitoringTs = new Date(System.currentTimeMillis());
        hitTimestampsPerRule = new HashMap<PrefetchingRule, List<Date>>();
        missedFeatureTimestamps = new HashMap<EStructuralFeature, List<Date>>();
        
        executionTimePerRule = new HashMap<PrefetchingRule, List<Long>>();
        cachingTimestampsPerRule = new HashMap<PrefetchingRule, List<Long>>();
    }
    
    public void registerExecutionTime(PrefetchingRule rule, long time) {
        if(executionTimePerRule.containsKey(rule)) {
            executionTimePerRule.get(rule).add(time);
        }
        else {
            List<Long> l = new ArrayList<Long>();
            l.add(time);
            executionTimePerRule.put(rule,l);
        }
    }
    
    public void registerCachedElement(PrefetchingRule rule) {
        if(cachedPerRule.containsKey(rule)) {
            cachedPerRule.put(rule,cachedPerRule.get(rule) + 1);
        }
        else {
            cachedPerRule.put(rule, 1);
        }
    }
    
    public void hit(MonitoredCacheValue value) {
        if(value == null) {
            return;
        }
        Date hitTs = new Date(System.currentTimeMillis());
        PrefetchingRule cachingRule = value.cachingRule();
        
        // Record the hit timestamp
        if(hitTimestampsPerRule.containsKey(cachingRule)) {
            hitTimestampsPerRule.get(cachingRule).add(hitTs);
        }
        else {
            List<Date> ts = new ArrayList<>();
            ts.add(hitTs);
            hitTimestampsPerRule.put(cachingRule, ts);
        }
    }
    
    public void miss(EStructuralFeature feature) {
        Date missTs = new Date(System.currentTimeMillis());
        
        // Increment the global miss count
        globalMissCount++;
        
        // Record the feature that generate the miss and its timestamp
        if(missedFeatureTimestamps.containsKey(feature)) {
            missedFeatureTimestamps.get(feature).add(missTs);
        }
        else {
            List<Date> ts = new ArrayList<>();
            ts.add(missTs);
            missedFeatureTimestamps.put(feature, ts);
        }
    }
    
    public String getMonitoringInformations() {
        Date printTimestamp = new Date(System.currentTimeMillis());
        DateFormat tsFormatter = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss:SSSS");
        StringBuilder sb = new StringBuilder();
        sb.append("\n=== PrefetchML Monitoring ===\n")
            .append(MessageFormat.format("Monitoring started at {0}\n", tsFormatter.format(startMonitoringTs)))
            .append(MessageFormat.format("#Hits: {0}\n", getGlobalHitCount()))
            .append(MessageFormat.format("#Misses: {0}\n", getGlobalMissCount()));
        sb.append("== Rule -> #Execution | Total Execution Time | Avg Execution Time == | #Cached Elements | #Hits\n");
        for(PrefetchingRule r : executionTimePerRule.keySet()) {
            long total = 0;
            for(Long l : executionTimePerRule.get(r)) {
                total += l;
            }
            long avg = total / executionTimePerRule.get(r).size();
            sb.append(Strings.padEnd(r.getName(), 10, ' '))
                .append(" -> ")
                .append(Strings.padEnd(Integer.toString(executionTimePerRule.get(r).size()),10,' '))
                .append(" | ")
                .append(Strings.padEnd(Long.toString(total), 10, ' '))
                .append(" | ")
                .append(Strings.padEnd(Long.toString(avg), 10, ' '))
                .append(" | ");
                if(cachedPerRule.containsKey(r)) {
                    sb.append(Strings.padEnd(Integer.toString(cachedPerRule.get(r)), 10, ' '));
                }
                else {
                    sb.append(Strings.padEnd("0", 10, ' '));
                }
                sb.append(" | ");
                if(hitTimestampsPerRule.containsKey(r)) {
                    sb.append(Strings.padEnd(Integer.toString(hitTimestampsPerRule.get(r).size()), 10, ' '));
                }
                else {
                    sb.append(Strings.padEnd("0", 10, ' '));
                }
                sb.append("\n");
        }
        sb.append("== Feature -> #miss ==\n");
        for(EStructuralFeature f : missedFeatureTimestamps.keySet()) {
            sb.append(Strings.padEnd(f.getEContainingClass().getName() + "." + f.getName(), 100, ' '))
                .append(" -> ")
                .append(missedFeatureTimestamps.get(f).size())
                .append("\n");
        }
        
        return sb.toString();
    }
    
    public int getGlobalHitCount() {
        int sum = 0;
        for(PrefetchingRule r : hitTimestampsPerRule.keySet()) {
            sum += hitTimestampsPerRule.get(r).size();
        }
        return sum;
    }
    
    public int getGlobalMissCount() {
        return globalMissCount;
    }
    
    /**
     * The initialization-on-demand holder of the singleton of this class.
     */
    private static class Holder {

        /**
         * The instance of the outer class.
         */
        private static final PrefetchMLMonitor INSTANCE = new PrefetchMLMonitor();
    }
    
}

package fr.inria.atlanmod.prefetchml.core.cache.monitoring;

import fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingRule;

/**
 * A wrapper that contains a cached value and monitoring information that have
 * to be stored when the value is cached.
 * <p>
 * The raw value is accessible using the {@link #value()}. Monitoring informations are
 * used by {@link PrefetchMLMonitor} to compute statistics on the PrefetchML execution.
 *
 * @see PrefetchMLMonitor
 * @see Cache
 */
public class MonitoredCacheValue {

    /**
     * The wrapped value.
     */
    private Object value;
    
    /**
     * The rule that cached the {@code value}.
     */
    private PrefetchingRule rule;
    
    /**
     * The timestamp representing when the element has been cached.
     */
    private long cachingTimestamp;
    
    /**
     * Constructs a new {@link MonitoredCacheValue} from the given parameters.
     * 
     * @param value the value to wrap
     * @param rule the rule that cached the {@code value}
     * @param cacheTimestamp the timestamp representing when the element has been cached
     */
    public MonitoredCacheValue(Object value, PrefetchingRule rule, long cachingTimestamp) {
        this.value = value;
        this.rule = rule;
        this.cachingTimestamp = cachingTimestamp;
    }
    
    /**
     * Constructs a new {@link MonitoredCacheValue} from the given parameters.
     * <p>
     * The wrapper timestamp is set with the current timestamp. Use this constructor
     * when you construct a {@link MonitoredCacheValue} when adding a value to the cache:
     * {@code cache.put(key, new ValueWrapper(value, rule)}.
     * 
     * @param value the value to wrap
     * @param rule the rule that cached the {@code value}
     */
    public MonitoredCacheValue(Object value, PrefetchingRule rule) {
        this.value = value;
        this.rule = rule;
        this.cachingTimestamp = System.currentTimeMillis();
    }
    
    /**
     * Returns the wrapped value.
     * @return the wrapped value.
     */
    public Object value() {
        return value;
    }
    
    /**
     * Returns the rule that cached the {@code value}.
     * @return the rule that cached the {@code value}
     */
    public PrefetchingRule cachingRule() {
        return rule;
    }
    
    /**
     * Returns the timestamp representing when the element has been cached.
     * @return the timestamp representing when the element has been cached
     */
    public long cachingTimestamp() {
        return cachingTimestamp;
    }
}

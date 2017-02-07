package fr.inria.atlanmod.prefetchml.core;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.prefetchml.core.cache.monitoring.MonitoredCacheValue;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessor;
import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessorFactory;
import fr.inria.atlanmod.prefetchml.core.tasks.AccessRuleAction;
import fr.inria.atlanmod.prefetchml.core.tasks.InvalidateCacheAction;
import fr.inria.atlanmod.prefetchml.core.tasks.StartingRuleAction;
import fr.inria.atlanmod.prefetchml.core.tasks.UpdateCacheSizeAction;
import fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule;
import fr.inria.atlanmod.prefetchml.language.metamodel.StartingRule;

public class PrefetchWorker {

	private RuleProcessor theProcessor;
	private RuleStore ruleStore;
	private ExecutorService worker;
	
	public PrefetchWorker(RuleProcessorFactory processorFactory, RuleStore ruleStore, Map<Object,MonitoredCacheValue> cache, Object resourceStore, int executorCount) {
		assert executorCount > 0 : "PrefetchWorker need to instantiate at least one thread, " + executorCount + " given";
		this.theProcessor = processorFactory.createProcessor(cache, resourceStore);
		this.ruleStore = ruleStore;
		if(executorCount == 1) {
			PrefetchMLLogger.info("Creating a single thread worker");
			worker = Executors.newSingleThreadExecutor();
		}
		else {
			PrefetchMLLogger.info("Creating a multi-threaded ({0}) worder", executorCount);
			worker = Executors.newFixedThreadPool(executorCount);
		}
	}
	
	public PrefetchWorker(RuleProcessorFactory processorFactory, RuleStore ruleStore, Map<Object,MonitoredCacheValue> cache, Object resourceStore) {
		this(processorFactory,ruleStore,cache,resourceStore,1);
	}
	
	public void setCache(Map<Object,MonitoredCacheValue> newCache) {
		theProcessor.setCache(newCache);
	}
	
	public void handleStart(Object resourceStore) {
		List<StartingRule> sRules = ruleStore.getSRuleList();
		worker.submit(new StartingRuleAction(resourceStore, sRules, theProcessor));
	}
	
	
	public void handleAccess(EObject source) {
		List<AccessRule> pRules = ruleStore.getARuleList(source.eClass());
		if(pRules.isEmpty()) {
			return;
		}
		worker.submit(new AccessRuleAction(source, pRules, theProcessor));
	}
	
	public void handleAccess(Object source, EClass eClass) {
		List<AccessRule> pRules = ruleStore.getARuleList(eClass);
		if(pRules.isEmpty()) {
			return;
		}
		worker.submit(new AccessRuleAction(source, pRules, theProcessor));
	}
	
	public void handleUpdate(EObject source, EStructuralFeature feature, int index) {
	    worker.execute(new InvalidateCacheAction(source, feature, index, theProcessor));
	}
	
	public void handleSizeUpdate(EObject source, EStructuralFeature feature, int sizeDelta) {
	    worker.execute(new UpdateCacheSizeAction(source, feature, sizeDelta, theProcessor));
	}
	
	public void handleRemove(EObject source, EStructuralFeature feature) {
	    worker.execute(new InvalidateCacheAction(source, feature, -2, theProcessor));
	}
	
	public boolean isStarted() {
		return !worker.isShutdown();
	}
	
}

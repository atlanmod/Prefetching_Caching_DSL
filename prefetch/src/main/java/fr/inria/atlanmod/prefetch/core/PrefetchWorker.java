package fr.inria.atlanmod.prefetch.core;

import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule;
import fr.inria.atlanmod.prefetch.core.tasks.AccessRuleAction;
import fr.inria.atlanmod.prefetch.core.tasks.StartingRuleAction;
import fr.inria.atlanmod.prefetch.processor.RuleProcessor;
import fr.inria.atlanmod.prefetch.processor.RuleProcessorFactory;
import fr.inria.atlanmod.prefetch.util.PrefetchLogger;

public class PrefetchWorker {

	private RuleProcessor theProcessor;
	private RuleStore ruleStore;
	private ExecutorService worker;
	
	public PrefetchWorker(RuleProcessorFactory processorFactory, RuleStore ruleStore, Map<Object,Object> cache, Object resourceStore) {
		this.theProcessor = processorFactory.createProcessor(cache, resourceStore);
		this.ruleStore = ruleStore;
//		worker = Executors.newFixedThreadPool(10);
		worker = Executors.newSingleThreadExecutor();
	}
	
	public void setCache(Map<Object,Object> newCache) {
		theProcessor.setCache(newCache);
	}
	
	public void handleStart(Object resourceStore) {
		List<StartingRule> sRules = ruleStore.getSRuleList();
		worker.execute(new StartingRuleAction(resourceStore, sRules, theProcessor));
	}
	
	private AccessRuleAction ar;
	
	public void handleAccess(EObject source) {
		List<AccessRule> pRules = ruleStore.getARuleList(source.eClass());
		if(pRules.isEmpty()) {
			return;
		}
		ar = new AccessRuleAction(source, pRules, theProcessor);
//		ar.run();
		worker.execute(ar);
//		worker.execute(new Runnable() {
//			
//			@Override
//			public void run() {
//				System.out.println("whil whil");
//				while(true) {}
//			}
//		});
	}
	
	public void handleAccess(Object source, EClass eClass) {
		List<AccessRule> pRules = ruleStore.getARuleList(eClass);
//		PrefetchLogger.debug("RS for : " + eClass.getName() + " : " + pRules.size());
		if(pRules.isEmpty()) {
			return;
		}
		worker.execute(new AccessRuleAction(source, pRules, theProcessor));
	}
	
	public boolean isStarted() {
		return !worker.isShutdown();
	}
	
}

package fr.inria.atlanmod.prefetch.core.tasks;

import java.util.List;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule;
import fr.inria.atlanmod.prefetch.processor.RuleProcessor;

public class StartingRuleAction implements Runnable {
	
	private Object theResourceStore;
	private List<StartingRule> theRules;
	private RuleProcessor theProcessor;
	
	public StartingRuleAction(Object resourceStore, List<StartingRule> sRules, RuleProcessor processor) {
		this.theResourceStore = resourceStore;
		this.theRules = sRules;
		this.theProcessor = processor;
	}
	
	public void run() {
		this.theProcessor.processStartingRules(theRules,theResourceStore);
	}

}

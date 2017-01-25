package fr.inria.atlanmod.prefetchml.core.tasks;

import java.util.List;

import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessor;
import fr.inria.atlanmod.prefetchml.language.metamodel.StartingRule;

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

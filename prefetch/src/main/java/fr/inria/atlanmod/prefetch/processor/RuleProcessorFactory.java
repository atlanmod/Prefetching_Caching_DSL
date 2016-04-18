package fr.inria.atlanmod.prefetch.processor;

import java.util.Map;

public interface RuleProcessorFactory {
	
	public RuleProcessor createProcessor(Map<Object,Object> cache, Object resourceStore);
	
}

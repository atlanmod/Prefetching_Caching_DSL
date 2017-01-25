package fr.inria.atlanmod.prefetchml.core.processor;

import java.util.Map;

public interface RuleProcessorFactory {
	
	public RuleProcessor createProcessor(Map<Object,Object> cache, Object resourceStore);
	
}

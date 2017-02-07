package fr.inria.atlanmod.prefetchml.core.processor;

import java.util.Map;

import fr.inria.atlanmod.prefetchml.core.cache.monitoring.MonitoredCacheValue;

public interface RuleProcessorFactory {
	
	public RuleProcessor createProcessor(Map<Object,MonitoredCacheValue> cache, Object resourceStore);
	
}

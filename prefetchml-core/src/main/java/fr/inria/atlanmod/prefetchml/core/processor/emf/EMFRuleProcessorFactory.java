package fr.inria.atlanmod.prefetchml.core.processor.emf;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.core.cache.monitoring.MonitoredCacheValue;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessor;
import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessorFactory;

public class EMFRuleProcessorFactory implements RuleProcessorFactory {

	public RuleProcessor createProcessor(Map<Object,MonitoredCacheValue> cache, Object resourceStore) {
		if(!(resourceStore instanceof Resource)) {
			PrefetchMLLogger.error("EMFRuleProcessor can only work with EMF Resource");
			throw new IllegalArgumentException("EMFRuleProcessor needs an EMF Resource");
		}
		return new EMFRuleProcessor(cache, (Resource)resourceStore);
	}

}

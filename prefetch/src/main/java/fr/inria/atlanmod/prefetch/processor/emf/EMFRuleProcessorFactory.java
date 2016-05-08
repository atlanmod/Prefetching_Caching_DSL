package fr.inria.atlanmod.prefetch.processor.emf;

import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetch.processor.RuleProcessor;
import fr.inria.atlanmod.prefetch.processor.RuleProcessorFactory;
import fr.inria.atlanmod.prefetch.util.PrefetchLogger;

public class EMFRuleProcessorFactory implements RuleProcessorFactory {

	public RuleProcessor createProcessor(Map<Object,Object> cache, Object resourceStore) {
		if(!(resourceStore instanceof Resource)) {
			PrefetchLogger.error("EMFRuleProcessor can only work with EMF Resource");
			throw new IllegalArgumentException("EMFRuleProcessor needs an EMF Resource");
		}
//		return new EMFRuleProcessor(cache, (Resource)resourceStore);
		return new EMFRuleProcessor(cache, (Resource)resourceStore);
	}

}

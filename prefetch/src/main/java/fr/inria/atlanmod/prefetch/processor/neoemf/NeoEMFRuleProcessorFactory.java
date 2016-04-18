package fr.inria.atlanmod.prefetch.processor.neoemf;

import java.util.Map;

import com.tinkerpop.blueprints.KeyIndexableGraph;
import com.tinkerpop.blueprints.util.wrappers.id.IdGraph;

import fr.inria.atlanmod.prefetch.processor.RuleProcessor;
import fr.inria.atlanmod.prefetch.processor.RuleProcessorFactory;

public class NeoEMFRuleProcessorFactory implements RuleProcessorFactory {

	public RuleProcessor createProcessor(Map<Object, Object> cache, Object resourceStore) {
		if(!(resourceStore instanceof IdGraph<?>)) {
			throw new IllegalArgumentException("NeoEMFRuleProcessor needs a BlueprintsPersistenceBackend");
		}
//		return new NeoEMFRuleProcessor(cache, (IdGraph<KeyIndexableGraph>)resourceStore);
		return new NeoEMFRuleProcessor2(cache, (IdGraph<KeyIndexableGraph>)resourceStore);
	}
	
}

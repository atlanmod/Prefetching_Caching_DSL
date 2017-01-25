package fr.inria.atlanmod.prefetchml.core.processor.neoemf;

import java.util.Map;

import com.tinkerpop.blueprints.KeyIndexableGraph;
import com.tinkerpop.blueprints.util.wrappers.id.IdGraph;

import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessor;
import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessorFactory;

public class NeoEMFRuleProcessorFactory implements RuleProcessorFactory {
	
	/**
	 * Create a @see{RuleProcessor} specific to NeoEMF
	 * @param cache the structure to store the cached objects in
	 * @param resourceStore the IdGraph that contains the model representation
	 * @return an instance of @see{NeoEMFRuleProcessor}
	 * @throws IllegalArgumentException if resourceStore is not an instance of IdGraph
	 */
	@SuppressWarnings("unchecked")
	public RuleProcessor createProcessor(Map<Object, Object> cache, Object resourceStore) {
		if(!(resourceStore instanceof IdGraph<?>)) {
			throw new IllegalArgumentException("NeoEMFRuleProcessor needs a BlueprintsPersistenceBackend");
		}
		return new NeoEMFRuleProcessor(cache, (IdGraph<KeyIndexableGraph>)resourceStore);
	}
	
}

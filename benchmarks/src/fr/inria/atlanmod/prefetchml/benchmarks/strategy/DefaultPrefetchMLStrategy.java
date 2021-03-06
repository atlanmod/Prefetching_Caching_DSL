package fr.inria.atlanmod.prefetchml.benchmarks.strategy;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

/**
 * The default prefetching/caching strategy.
 * <p>
 * This class doesn't add any behavior to the query execution and doesn't
 * initialize any kind of prefetching/caching related to PrefetchML.
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public class DefaultPrefetchMLStrategy implements PrefetchMLStrategy {

    public static final String NAME = "NoPrefetch";
    
    @Override
    public String getName() {
        return NAME;
    }
    
    @Override
    public void init(Resource resource, URI scriptURI) {
    }

    @Override
    public void beforeExecutingQueries() {
    }

    @Override
    public void afterExecutingQueries() {
    }

    @Override
    public List<List<?>> adaptInput(List<List<?>> input) {
        return input;
    }

    @Override
    public List<List<Object>> adaptResult(List<List<Object>> result) {
        return result;
    }

}

package fr.inria.atlanmod.prefetchml.benchmarks.strategy;

import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.prefetchml.emf.event.runtime.EMFPrefetcherRuntime;
import static com.google.common.base.Preconditions.checkArgument;

/**
 * Extends {@link EMFPrefetchMLStrategy} by initializing the
 * {@link EMFPrefetcherRuntime} on top of a NeoEMF resource.
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public class NeoEMFPrefetchMLStrategy extends EMFPrefetchMLStrategy {

    public static final String NAME = "NeoEMFPrefetch";
    
    @Override
    public String getName() {
        return NAME;
    }
    
    /**
     * Initialize the {@link EMFPrefetcherRuntime} on the {@code resource}.
     */
    @Override
    protected void initRuntime() {
        checkArgument(resource instanceof PersistentResource,
                "{0} strategy expected a PersistentResource but found {1}", NAME, resource
                        .getClass().getName());
        prefetchmlRuntime = new EMFPrefetcherRuntime(resource);
    }
}

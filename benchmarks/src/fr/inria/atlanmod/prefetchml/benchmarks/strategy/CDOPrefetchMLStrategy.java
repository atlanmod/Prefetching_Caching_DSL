package fr.inria.atlanmod.prefetchml.benchmarks.strategy;

import static com.google.common.base.Preconditions.checkArgument;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.benchmarks.util.ResourceUtil;
import fr.inria.atlanmod.prefetchml.emf.event.runtime.EMFPrefetcherRuntime;

/**
 * Extends {@link EMFPrefetchMLStrategy} by initializing the
 * {@link EMFPrefetcherRuntime} on top of a CDO resource.
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public class CDOPrefetchMLStrategy extends EMFPrefetchMLStrategy {

    public static final String NAME = "CDOPrefetch";
    
    @Override
    public String getName() {
        return NAME;
    }
    
    /**
     * Initialize the {@link EMFPrefetcherRuntime} on a new view of the
     * {@code resource} to avoid resource-level locking issues.
     */
    @Override
    protected void initRuntime() throws Exception {
        checkArgument(resource instanceof CDOResource,
                "{0} strategy expected a CDOResource but found {1}", NAME, resource
                        .getClass().getName());
        Resource transactionalResource = ResourceUtil.openNewCDOTransaction();
        prefetchmlRuntime = new EMFPrefetcherRuntime(transactionalResource);
        prefetchmlRuntime.getPCore().setMirroredResource(resource);
    }
}

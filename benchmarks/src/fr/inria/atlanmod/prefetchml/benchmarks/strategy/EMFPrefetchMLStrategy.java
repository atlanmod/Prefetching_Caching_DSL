package fr.inria.atlanmod.prefetchml.benchmarks.strategy;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.core.cache.monitoring.PrefetchMLMonitor;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EventNotifierDelegateEList;
import fr.inria.atlanmod.prefetchml.emf.event.capture.EGetAspect;
import fr.inria.atlanmod.prefetchml.emf.event.runtime.EMFPrefetcherRuntime;

/**
 * An EMF-based prefetching/caching strategy.
 * <p>
 * This class enables EMF-based prefetching through the
 * {@link EMFPrefetcherRuntime}. Monitoring informations are also added after
 * query execution to see how the PrefetchML framework behave during the
 * computation.
 * 
 * @see EMFPrefetcherRuntime
 * @see PrefetchMLMonitor
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public abstract class EMFPrefetchMLStrategy implements PrefetchMLStrategy {

    protected EMFPrefetcherRuntime prefetchmlRuntime;
    protected Resource resource;
    protected URI scriptURI;

    /**
     * {@inheritDoc}
     */
    @Override
    public void init(Resource resource, URI scriptURI) throws Exception {
        this.resource = resource;
        this.scriptURI = scriptURI;
        initRuntime();
        prefetchmlRuntime.disable();
    }
    
    /**
     * Initializes the {@link EMFPrefetcherRuntime}.
     * <p>
     * This method has to be defined in subclasses.
     * 
     * @throws Exception
     *             if the {@link EMFPrefetcherRuntime} cannot be initialized
     */
    protected abstract void initRuntime() throws Exception;
    
    /**
     * Set the application thread priority to {@link Thread#MAX_PRIORITY} and
     * loads the PrefetchML script to use.
     */
    @Override
    public void beforeExecutingQuery() {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        prefetchmlRuntime.loadPrefetchScript(scriptURI,
                resource);
        prefetchmlRuntime.enable();
    }

    /**
     * Prints monitoring information after the query exection.
     * 
     * @see PrefetchMLMonitor
     */
    @Override
    public void afterExecutingQuery() {
        PrefetchMLLogger.info("#Hits: {0}", prefetchmlRuntime.getPCore().getHitCount());
        PrefetchMLLogger.info("#Misses: {0}", prefetchmlRuntime.getPCore().getMissCount());
        PrefetchMLLogger.info(PrefetchMLMonitor.getInstance().getMonitoringInformations());
        PrefetchMLLogger
                .info("Cache size: {0}", prefetchmlRuntime.getPCore().getActiveCache().size());
        prefetchmlRuntime.disable();
        prefetchmlRuntime.getPCore().resetHitCount();
        prefetchmlRuntime.getPCore().resetMissCount();
        PrefetchMLMonitor.getInstance().reset();
        PrefetchMLLogger.info("EGetAscpect triggered {0} times", EGetAspect.count);
        EGetAspect.count = 0;
    }

    /**
     * Wraps the provided {@code input} into an
     * {@link EventNotifierDelegateEList}.
     * <p>
     * This wrapper enables PrefetchML access events that are necessary to
     * trigger prefetching rules.
     */
    @SuppressWarnings("unchecked")
    @Override
    public List<?> adaptInput(List<?> input) {
        return new EventNotifierDelegateEList<EObject>(
                (List<EObject>) input, prefetchmlRuntime.getPCore());
    }

    @Override
    public List<Object> adaptResult(List<Object> result) {
        return result;
    }

}

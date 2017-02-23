package fr.inria.atlanmod.prefetchml.benchmarks;

import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.benchmarks.util.ResourceUtil;
import fr.inria.atlanmod.prefetchml.core.cache.monitoring.PrefetchMLMonitor;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EventNotifierDelegateEList;
import fr.inria.atlanmod.prefetchml.emf.event.capture.EGetAspect;
import fr.inria.atlanmod.prefetchml.emf.event.runtime.EMFPrefetcherRuntime;

public abstract class EMFPrefetchRailwayTestCDO extends AbstractRailwayTestCDO {

    protected EMFPrefetcherRuntime prefetchRuntime;
    
    protected Resource transactionalResource;
    
    private final static String SCRIPT_FOLDER = "plans/bin/";
    
    private final static String SCRIPT_CACHE_LITERAL = "_C1_";
    
    private final static String SCRIPT_EXTENSION = ".prefetch.bin";
    
    /**
     * Constructs a new {@link EMFPrefetchRailwayTestCDO} with the given
     * {@code resourceName}, {@code scriptSuffix}, and {@code resourceType}.
     * 
     * @param resourceName
     *            the name of the {@link Resource} to benchmark
     * @param xmiLocation
     *            the location of the file containing a XMI version of the model
     *            to benchmark
     * @param scriptSuffix
     *            the suffix used to identify the PrefetchML plan to use
     * @param resourceType
     *            the type of the benchmarked {@link Resource}
     * 
     */
    public EMFPrefetchRailwayTestCDO(String resourceName, String xmiLocation, String scriptSuffix,
            String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }
    
    @Override
    public void setUp() throws Exception {
        super.setUp();
        transactionalResource = ResourceUtil.openNewCDOTransaction();
        prefetchRuntime = new EMFPrefetcherRuntime(transactionalResource);
        prefetchRuntime.getPCore().setMirroredResource(resource);
        prefetchRuntime.disable();
    }
    
    @SuppressWarnings("unchecked")
    @Override
    protected List<?> adaptInput(List<?> input) {
        return new EventNotifierDelegateEList<EObject>(
                (List<EObject>) input, prefetchRuntime.getPCore());

    }
    
    @Override
    protected void beforeExecutingQuery() {
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        prefetchRuntime.loadPrefetchScript(this.getScriptURI(),
                resource);
        prefetchRuntime.enable();
    }
    
    protected URI getScriptURI() {
        return URI.createURI(SCRIPT_FOLDER + getScriptName() + SCRIPT_CACHE_LITERAL
                + scriptSuffix + SCRIPT_EXTENSION);
    }
    
    @Override
    protected void afterExecutingQuery() {
        PrefetchMLLogger.info("#Hits: {0}", prefetchRuntime.getPCore().getHitCount());
        PrefetchMLLogger.info("#Misses: {0}", prefetchRuntime.getPCore().getMissCount());
        PrefetchMLLogger.info(PrefetchMLMonitor.getInstance().getMonitoringInformations());
        PrefetchMLLogger
                .info("Cache size: {0}", prefetchRuntime.getPCore().getActiveCache().size());
        prefetchRuntime.disable();
        prefetchRuntime.getPCore().resetHitCount();
        prefetchRuntime.getPCore().resetMissCount();
        PrefetchMLMonitor.getInstance().reset();
        PrefetchMLLogger.info("EGetAscpect triggered {0} times", EGetAspect.count);
        EGetAspect.count = 0;
    }
    
    protected abstract String getScriptName();

}

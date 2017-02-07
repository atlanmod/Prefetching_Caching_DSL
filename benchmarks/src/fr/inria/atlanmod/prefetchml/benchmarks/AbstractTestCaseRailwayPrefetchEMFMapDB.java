package fr.inria.atlanmod.prefetchml.benchmarks;

import hu.bme.hit.trainbenchmark.railway.RailwayPackage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.Before;

import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.mapdb.MapDbPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.mapdb.option.MapDbOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.mapdb.util.MapDbURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;
import fr.inria.atlanmod.prefetchml.core.cache.monitoring.PrefetchMLMonitor;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.emf.event.runtime.EMFPrefetcherRuntime;

public abstract class AbstractTestCaseRailwayPrefetchEMFMapDB extends AbstractPrefetchTest {

	@SuppressWarnings("rawtypes")
	protected OCL ocl = null;
    @SuppressWarnings("rawtypes")
	protected OCLHelper oclHelper = null;
    
    protected PersistentResource resource;
    
    protected OCLExpression<EClassifier> expression = null;
    protected Query<EClassifier, EClass, EObject> query = null;
    
    protected EMFPrefetcherRuntime runtime;
    
    public AbstractTestCaseRailwayPrefetchEMFMapDB(String resourceName, String scriptSuffix) {
    	super(resourceName, scriptSuffix);
	}
    
	@Before
	public void setUp() {
		Registry.INSTANCE.put(RailwayPackage.eINSTANCE.getNsURI(), RailwayPackage.eINSTANCE);
        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        this.oclHelper = ocl.createOCLHelper();
        PersistenceBackendFactoryRegistry.register(MapDbURI.SCHEME, MapDbPersistenceBackendFactory.getInstance());
    	ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(MapDbURI.SCHEME, PersistentResourceFactory.getInstance());
		
		resource = (PersistentResource)resSet.createResource(MapDbURI.createFileURI(new File(resourceName)));
		
		Map<String, Object> options = MapDbOptionsBuilder.newBuilder()
		        .directWrite()
		        .asMap();
		try {
			resource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		runtime = new EMFPrefetcherRuntime(resource);
		
	}
	
	protected List<Object> computeQuery(Query query, List<?> input) {
	    runtime.getPCore().resetHitCount();
	    runtime.getPCore().resetMissCount();
	    PrefetchMLMonitor.getInstance().reset();
	    PrefetchMLLogger.info("Cache size (before computation) {0}", runtime.getPCore().getActiveCache().size());
//	    try {
//            Thread.sleep(10000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        startTimer();
        List<Object> results = query.evaluate(input);
        stopTimer();
        
        PrefetchMLLogger.info("Done : {0}ms", (stopTimestamp-startTimestamp));
        PrefetchMLLogger.info("Result contains {0} elements", getFlattenedSize(results));
        PrefetchMLLogger.info("#Hits: {0}", runtime.getPCore().getHitCount());
        PrefetchMLLogger.info("#Misses: {0}", runtime.getPCore().getMissCount());
        
        PrefetchMLLogger.info(PrefetchMLMonitor.getInstance().getMonitoringInformations());
        PrefetchMLLogger.info("Cache size: {0}", runtime.getPCore().getActiveCache().size());
//        try {
//            Thread.sleep(500000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
        return results;
    }
	
	protected abstract String getScriptString();
	
	protected String getScriptLargeCacheString() {
		return this.getScriptString() + "_C1_" + this.scriptSuffix + ".prefetch.bin";
	}
	
	protected String getScriptSmallCacheString() {
		return this.getScriptString() + "_C2_" + this.scriptSuffix + ".prefetch.bin";
	}
	
	protected String getScriptBadCacheString() {
		return this.getScriptString() + "_Bad_" + this.scriptSuffix + ".prefetch.bin";
	}

}

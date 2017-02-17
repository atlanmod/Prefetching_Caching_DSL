package fr.inria.atlanmod.prefetchml.benchmarks;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;








import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
//import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.pouet.cdo.java.JavaPackage;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.Before;

import railway.RailwayPackage;
import fr.inria.atlanmod.prefetchml.benchmarks.util.CdoBackend;
import fr.inria.atlanmod.prefetchml.core.cache.monitoring.MonitoredCacheValue;
import fr.inria.atlanmod.prefetchml.core.cache.monitoring.PrefetchMLMonitor;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.emf.event.runtime.EMFPrefetcherRuntime;

public abstract class AbstractTestCaseRailwayPrefetchEMFCDO extends AbstractPrefetchTest {

	@SuppressWarnings("rawtypes")
	protected OCL ocl = null;
    @SuppressWarnings("rawtypes")
	protected OCLHelper oclHelper = null;
    
    protected CdoBackend cdoBackend;
    protected CDOResource resource;
    protected CDOResource transactionalResource;
    
    protected OCLExpression<EClassifier> expression = null;
    protected Query<EClassifier, EClass, EObject> query = null;
    
    protected EMFPrefetcherRuntime runtime;
    
    public AbstractTestCaseRailwayPrefetchEMFCDO(String resourceName, String scriptSuffix) {
    	super(resourceName, scriptSuffix);
    	cdoBackend = new CdoBackend();
	}
    
	@Before
	public void setUp() {
		Registry.INSTANCE.put(RailwayPackage.eINSTANCE.getNsURI(), RailwayPackage.eINSTANCE);
        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        this.oclHelper = ocl.createOCLHelper();
    	ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		
		try {
		    resource = (CDOResource)cdoBackend.load(new File(this.resourceName));
		    transactionalResource = (CDOResource)cdoBackend.loadInNewTransaction();
		} catch(Exception e) {
		    e.printStackTrace();
		}
		
		runtime = new EMFPrefetcherRuntime(transactionalResource);
		runtime.getPCore().setMirroredResource(resource);
//		runtime = new EMFPrefetcherRuntime(resource);
		
	}
	
	protected List<Object> computeQuery(Query query, List<?> input) {
	    runtime.getPCore().resetHitCount();
	    runtime.getPCore().resetMissCount();
	    PrefetchMLMonitor.getInstance().reset();
	    PrefetchMLLogger.info("Cache size (before computation) {0}", runtime.getPCore().getActiveCache().size());
        startTimer();
        List<Object> results = query.evaluate(input);
        stopTimer();
        PrefetchMLLogger.info("Done : {0}ms", (stopTimestamp-startTimestamp));
        PrefetchMLLogger.info("Result contains {0} elements", getFlattenedSize(results));
        PrefetchMLLogger.info("#Hits: {0}", runtime.getPCore().getHitCount());
        PrefetchMLLogger.info("#Misses: {0}", runtime.getPCore().getMissCount());
        
        PrefetchMLLogger.info(PrefetchMLMonitor.getInstance().getMonitoringInformations());
        PrefetchMLLogger.info("Cache size: {0}", runtime.getPCore().getActiveCache().size());
        Map<Object,MonitoredCacheValue> cache = runtime.getPCore().getActiveCache();
//        for(Object k : cache.keySet()) {
//            MonitoredCacheValue v = cache.get(k);
//            if(v.value() instanceof CDOObject) {
//                System.out.println(((CDOObject)v.value()).cdoView().toString());
//            }
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
	
	protected EList<EObject> getAllInstances(Resource resource, EClass eClass) throws ConfigurationException {
        long begin = System.currentTimeMillis();
        EList<EObject> result = new BasicEList<>();
        File propertyFile = new File(this.resourceName + "/allInstances.properties");
        if(propertyFile.exists()) {
            PropertiesConfiguration propertyConfiguration = new PropertiesConfiguration(propertyFile);
            List<Object> uriFragments = propertyConfiguration.getList(eClass.getName());
            if(uriFragments == null) {
                throw new RuntimeException("Cannot find EClass " + eClass.getName() + " in allInstances.properties");
            }
            for(Object uriFragment : uriFragments) {
                result.add(resource.getEObject((String) uriFragment));
            }
            
        }
        else {
            throw new RuntimeException("Cannot find allInstances.properties");
        }
        long end = System.currentTimeMillis();
        PrefetchMLLogger.info("Time to compute allInstances(): {0}ms", (end-begin));
        return result;
    }

}

package fr.inria.atlanmod.prefetchml.benchmarks.railway.prefetch.emf.mapdb;

import hu.bme.hit.trainbenchmark.railway.RailwayPackage;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCasePrefetchEMF;
import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCasePrefetchEMFMapDB;
import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCaseRailwayPrefetchEMFMapDB;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EventNotifierDelegateEList;
import fr.inria.atlanmod.prefetchml.emf.event.capture.EGetAspect;

public class ConnectedSegmentsRailwayTestPrefetchEMFMapDB extends AbstractTestCaseRailwayPrefetchEMFMapDB {
	
	public ConnectedSegmentsRailwayTestPrefetchEMFMapDB(String resourceName, String scriptSuffix) {
		super(resourceName, scriptSuffix);
	}

	protected String textualQuery;
	protected EClass eContext;
	
    @SuppressWarnings("unchecked")
	@Before
    public void setUp() {
    	super.setUp();
    	eContext = RailwayPackage.eINSTANCE.getSensor();
        oclHelper.setContext(eContext);
        try {
        	textualQuery = ""
                    + "self.monitors->collect(segment1 | segment1.connectsTo->select(segment2 | segment2.monitoredBy->includes(self)))";
            expression = oclHelper.createQuery(textualQuery);
        } catch (ParserException e) {
            e.printStackTrace();
        }
        this.query = ocl.createQuery(expression);
    }
    
    @Override
    protected String getScriptString() {
    	return "plans/bin/CollectRailway";
    }
    
	@Test
    public void testBlockStatement_largeCache() {
		runtime.loadPrefetchScript(URI.createURI(this.getScriptLargeCacheString()),resource);
		performQuery();
    }
	
//	@Test
//	public void testBlockStatement_smallCache() {
//		runtime.loadPrefetchScript(URI.createURI(this.getScriptSmallCacheString()), resource);
//		performQuery();
//	}
//	
//	@Test
//	public void testBlockStatement_badPlan() {
//		runtime.loadPrefetchScript(URI.createURI(this.getScriptBadCacheString()), resource);
//		performQuery();
//	}
    
    @SuppressWarnings("unchecked")
	private void performQuery() {
    	try {
	    	Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			PrefetchMLLogger.info(this.getClass().getName());
			
			runtime.disable();
			EList<EObject> blocks = resource.getAllInstances(eContext);
			/*
			 * Necessary for now, we need to find a way to hide this to the client
			 */
			EList<EObject> prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,runtime.getPCore());			
			runtime.enable();
			PrefetchMLLogger.info("Input size: {0}", prefetchableAllInstances.size());
			
			PrefetchMLLogger.info("Q1");
			computeQuery(query, prefetchableAllInstances);

			PrefetchMLLogger.info("Q2");
			this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	        this.oclHelper = ocl.createOCLHelper();
	        eContext = RailwayPackage.eINSTANCE.getSensor();
	        oclHelper.setContext(eContext);
	        try {
	            expression = oclHelper.createQuery(textualQuery);
	        } catch (ParserException e) {
	            e.printStackTrace();
	        }
	        this.query = ocl.createQuery(expression);
	        runtime.disable();
	        blocks = resource.getAllInstances(eContext);
			prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,runtime.getPCore());
			runtime.enable();
			computeQuery(query, prefetchableAllInstances);
	        
			PrefetchMLLogger.info("Cache size: {0}", runtime.getPCore().getActiveCache().size());
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
		    resource.close();
		}
    }
}

package fr.inria.atlanmod.prefetchml.benchmarks.prefetch.emf.cdo;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.pouet.cdo.java.JavaPackage;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCasePrefetchEMFCDO;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EventNotifierDelegateEList;
import fr.inria.atlanmod.prefetchml.emf.event.capture.EGetAspect;

public class BlockStatementTestPrefetchEMFCDO extends AbstractTestCasePrefetchEMFCDO {
	
	public BlockStatementTestPrefetchEMFCDO(String resourceName, String scriptSuffix) {
		super(resourceName, scriptSuffix);
	}

	protected String textualQuery;
	protected EClass eContext;
	
    @SuppressWarnings("unchecked")
	@Before
    public void setUp() {
    	super.setUp();
    	eContext = JavaPackage.eINSTANCE.getBlock();
        oclHelper.setContext(eContext);
        try {
        	textualQuery = ""
        			+ "self.statements";
            expression = oclHelper.createQuery(textualQuery);
        } catch (ParserException e) {
            e.printStackTrace();
        }
        this.query = ocl.createQuery(expression);
    }
    
    @Override
    protected String getScriptString() {
    	return "plans/bin/Q3";
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
			EList<EObject> blocks = getAllInstances(resource, eContext);
			/*
			 * Necessary for now, we need to find a way to hide this to the client
			 */
			EList<EObject> prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,runtime.getPCore());			
			runtime.enable();
			PrefetchMLLogger.info("Input size: {0}", prefetchableAllInstances.size());
			
			PrefetchMLLogger.info("Q1");
			computeQuery(query, prefetchableAllInstances);
			PrefetchMLLogger.info("EGetAscpect triggered {0} times", EGetAspect.count);
			EGetAspect.count = 0;
			PrefetchMLLogger.info("Q2");
			Thread.sleep(10000);
			this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	        this.oclHelper = ocl.createOCLHelper();
	        eContext = JavaPackage.eINSTANCE.getBlock();
	        oclHelper.setContext(eContext);
	        try {
	            expression = oclHelper.createQuery(textualQuery);
	        } catch (ParserException e) {
	            e.printStackTrace();
	        }
	        this.query = ocl.createQuery(expression);
	        runtime.disable();
	        blocks = getAllInstances(resource, eContext);
			prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,runtime.getPCore());
			runtime.enable();
			computeQuery(query, prefetchableAllInstances);
	        
			PrefetchMLLogger.info("Cache size: {0}", runtime.getPCore().getActiveCache().size());
			PrefetchMLLogger.info("EGetAscpect triggered {0} times", EGetAspect.count);
			Thread.sleep(1000000);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
		    resource.unload();
		}
    }
}

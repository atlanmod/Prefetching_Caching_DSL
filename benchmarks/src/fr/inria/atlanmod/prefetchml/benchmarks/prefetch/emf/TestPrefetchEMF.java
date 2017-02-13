package fr.inria.atlanmod.prefetchml.benchmarks.prefetch.emf;

import java.util.HashSet;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCasePrefetchEMF;
import fr.inria.atlanmod.prefetchml.core.cache.EMFIndexedCacheKey;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.emf.DelegateEList;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EventNotifierDelegateEList;
import fr.inria.atlanmod.prefetchml.emf.event.capture.EGetAspect;

public class TestPrefetchEMF extends AbstractTestCasePrefetchEMF {
	
	public TestPrefetchEMF(String resourceName, String scriptSuffix) {
		super(resourceName, scriptSuffix);
	}

	protected String textualQuery;
	protected EClass eContext;
	
    @SuppressWarnings("unchecked")
	@Before
    public void setUp() {
    	super.setUp();
    	eContext = JavaPackage.eINSTANCE.getClassDeclaration();
        oclHelper.setContext(eContext);
        try {
        	textualQuery = ""
        			+ "self.bodyDeclarations.abstractTypeDeclaration->asSet().bodyDeclarations";
            expression = oclHelper.createQuery(textualQuery);
        } catch (ParserException e) {
            e.printStackTrace();
        }
        this.query = ocl.createQuery(expression);
    }
    
    @Override
    protected String getScriptString() {
    	return "plans/bin/Q2";
    }
    
	@Test
    public void testClassToUnit_largeCache() {
		runtime.loadPrefetchScript(URI.createURI(this.getScriptLargeCacheString()),resource);
		performQuery();
    }
	
//	@Test
//	public void testClassToUnit_smallCache() {
//		runtime.loadPrefetchScript(URI.createURI(this.getScriptSmallCacheString()),resource);
//		performQuery();
//	}
//	
//	@Test
//	public void testClassToUnit_badPlan() {
//		runtime.loadPrefetchScript(URI.createURI(this.getScriptBadCacheString()), resource);
//		performQuery();
//	}
    
    @SuppressWarnings("unchecked")
	private void performQuery() {
    	try {
    		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
            PrefetchMLLogger.info(this.getClass().getName());

            EList<EObject> blocks = resource.getAllInstances(eContext);
            /*
             * Necessary for now, we need to find a way to hide this to the client
             */
    		EList<EObject> prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,runtime.getPCore());
    		PrefetchMLLogger.info("Input size: {0}", prefetchableAllInstances.size());

    		PrefetchMLLogger.info("Q1");
    		computeQuery(query, prefetchableAllInstances);
            System.out.println("t = " + DelegateEList.t);

	        
	        PrefetchMLLogger.info("Q2");
	        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	        this.oclHelper = ocl.createOCLHelper();
	        oclHelper.setContext(eContext);
	        try {
	            expression = oclHelper.createQuery(textualQuery);
	        } catch (ParserException e) {
	            e.printStackTrace();
	        }
	        this.query = ocl.createQuery(expression);
	        blocks = resource.getAllInstances(eContext);
    		prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,runtime.getPCore());
            PrefetchMLLogger.info("Input size: {0}", prefetchableAllInstances.size());

            DelegateEList.t = 0;
    		computeQuery(query, prefetchableAllInstances);
    		System.out.println("t = " + DelegateEList.t);
	       
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
    	    resource.close();
    	}
    }
}

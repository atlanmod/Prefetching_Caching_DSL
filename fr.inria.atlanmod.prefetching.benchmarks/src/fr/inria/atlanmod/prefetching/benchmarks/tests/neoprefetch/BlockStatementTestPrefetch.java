package fr.inria.atlanmod.prefetching.benchmarks.tests.neoprefetch;

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

import fr.inria.atlanmod.neoemf.resources.impl.PersistentResourceImpl;
import fr.inria.atlanmod.prefetching.benchmarks.tests.AbstractTestCasePrefetch;

public class BlockStatementTestPrefetch extends AbstractTestCasePrefetch {
	
	protected String textualQuery;
	protected EClass eContext;
	
	public BlockStatementTestPrefetch(String resourceName, String scriptSuffix) {
		super(resourceName, scriptSuffix);
	}
	
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
    	pCore.loadPrefetchScript(URI.createURI(this.getScriptLargeCacheString()));
    	performQuery();
    }

	@Test
	public void testBlockStatement_smallCache() {
		pCore.loadPrefetchScript(URI.createURI(this.getScriptSmallCacheString()));
		performQuery();
	}
	
	@Test
	public void testBlockStatement_badPlan() {
		pCore.loadPrefetchScript(URI.createURI(this.getScriptBadCacheString()));
		performQuery();
	}
	
    @SuppressWarnings("unchecked")
	private void performQuery() {
    	try {
    		System.out.println(this.getClass().getName());
    		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    		EList<EObject> blocks = resource.getAllInstances(eContext);
			long begin = System.currentTimeMillis();
			System.out.println("Q1(1)");
			query.evaluate(blocks);
	        long end = System.currentTimeMillis();       
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + pCore.getHitCount());
	        System.out.println("Misses - " + pCore.getMissCount());
	        pCore.resetHitCount();
	        pCore.resetMissCount();
	        System.out.println("Q2");
	        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	        this.oclHelper = ocl.createOCLHelper();
	        oclHelper.setContext(eContext);
	        try {
	            expression = oclHelper.createQuery(textualQuery);
	        } catch (ParserException e) {
	            e.printStackTrace();
	        }
	        this.query = ocl.createQuery(expression);
	        begin = System.currentTimeMillis();
	        query.evaluate(blocks);
	        end = System.currentTimeMillis();
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + pCore.getHitCount());
	        System.out.println("Misses - " + pCore.getMissCount());
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
			PersistentResourceImpl.shutdownWithoutUnload((PersistentResourceImpl)resource);
    	}
    }
}

package fr.inria.atlanmod.prefetchml.benchmarks.prefetch.emf;

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
import fr.inria.atlanmod.prefetchml.core.PrefetchCore;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EventNotifierDelegateEList;

public class BlockStatementTestPrefetchEMF extends AbstractTestCasePrefetchEMF {
	
	public BlockStatementTestPrefetchEMF(String resourceName, String scriptSuffix) {
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
	
	@Test
	public void testBlockStatement_smallCache() {
		runtime.loadPrefetchScript(URI.createURI(this.getScriptSmallCacheString()), resource);
		performQuery();
	}
	
	@Test
	public void testBlockStatement_badPlan() {
		runtime.loadPrefetchScript(URI.createURI(this.getScriptBadCacheString()), resource);
		performQuery();
	}
    
    @SuppressWarnings("unchecked")
	private void performQuery() {
    	try {
	    	Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
			System.out.println(this.getClass().getName());
			PrefetchCore core = runtime.getPCore();
			EList<EObject> blocks = resource.getAllInstances(eContext);
			EList<EObject> prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,core);
			System.out.println(blocks.size() + " inputs");
			long begin = System.currentTimeMillis();
			System.out.println("Q1(1)");
			core.resetHitCount();
			core.resetMissCount();
			query.evaluate(prefetchableAllInstances);
	        long end = System.currentTimeMillis();       
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + core.getHitCount());
	        System.out.println("Misses - " + core.getMissCount());
	        
	        System.out.println("Q2");
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
	        blocks = resource.getAllInstances(eContext);
			prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,core);
	        begin = System.currentTimeMillis();
	        core.resetHitCount();
	        core.resetMissCount();
	        query.evaluate(prefetchableAllInstances);
	        end = System.currentTimeMillis();
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + core.getHitCount());
	        System.out.println("Misses - " + core.getMissCount());
	        System.out.println(core.getActiveCache().size());
	        
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
		    resource.close();
		}
    }
}

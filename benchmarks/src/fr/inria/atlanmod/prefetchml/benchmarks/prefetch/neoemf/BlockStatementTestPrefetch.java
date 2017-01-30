package fr.inria.atlanmod.prefetchml.benchmarks.prefetch.neoemf;

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
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCasePrefetch;

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
            Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    	    PrefetchMLLogger.info(this.getClass().getName());
    		
    	    EList<EObject> blocks = resource.getAllInstances(eContext);
			PrefetchMLLogger.info("Input size: {0}", blocks.size());
			
			PrefetchMLLogger.info("Q1");
			computeQuery(query, blocks);
			
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
	        computeQuery(query, blocks);
	        
	        PrefetchMLLogger.info("Cache size: {0}", pCore.getActiveCache().size());
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
    	    resource.close();
    	}
    }
}

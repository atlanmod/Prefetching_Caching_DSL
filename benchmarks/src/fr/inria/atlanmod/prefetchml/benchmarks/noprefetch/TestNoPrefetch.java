package fr.inria.atlanmod.prefetchml.benchmarks.noprefetch;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCaseNoPrefetch;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class TestNoPrefetch extends AbstractTestCaseNoPrefetch {
	
	public TestNoPrefetch(String resourceName, String scriptSuffix) {
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
    
    @SuppressWarnings("unchecked")
	@Test
    public void testClassToUnit() {
    	try {
    		PrefetchMLLogger.info(this.getClass().getName());
	        EList<EObject> classDeclarations = resource.getAllInstances(JavaPackage.eINSTANCE.getClassDeclaration());
			PrefetchMLLogger.info("Input size: {0}", classDeclarations.size());
			
			PrefetchMLLogger.info("Q1");
			computeQuery(query, classDeclarations);
	    
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
	        computeQuery(query, classDeclarations);
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
    	    resource.close();
    	}
    }
}

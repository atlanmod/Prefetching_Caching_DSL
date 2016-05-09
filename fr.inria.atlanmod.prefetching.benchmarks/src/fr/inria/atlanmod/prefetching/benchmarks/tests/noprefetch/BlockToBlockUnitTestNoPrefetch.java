package fr.inria.atlanmod.prefetching.benchmarks.tests.noprefetch;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.neoemf.resources.impl.PersistentResourceImpl;
import fr.inria.atlanmod.prefetching.benchmarks.tests.AbstractTestCaseNoPrefetch;

public class BlockToBlockUnitTestNoPrefetch extends AbstractTestCaseNoPrefetch {
	
	public BlockToBlockUnitTestNoPrefetch(String resourceName) {
		super(resourceName);
	}

	protected String textualQuery;
	protected EClass eContext;
	
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
    
    @Test
    public void compilTypesUsages() {
    	try {
    		System.out.println(this.getClass().getName());
	        EList<EObject> blocks = resource.getAllInstances(JavaPackage.eINSTANCE.getBlock());
	        System.out.println("size : " + blocks.size());
			
			System.out.println("Q1(1)");
	        long begin = System.currentTimeMillis();
	        Object res = query.evaluate(blocks);
	        long end = System.currentTimeMillis();       
	        System.out.println("Done : " + (end-begin) + "ms");

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
	        Object res2 = query.evaluate(blocks);
	        end = System.currentTimeMillis();
	        System.out.println("Done : " + (end-begin) + "ms");
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
			PersistentResourceImpl.shutdownWithoutUnload((PersistentResourceImpl)resource);
    	}
    }
}

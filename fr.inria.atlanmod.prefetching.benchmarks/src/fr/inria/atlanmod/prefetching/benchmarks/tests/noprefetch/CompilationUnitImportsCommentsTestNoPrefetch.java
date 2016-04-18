package fr.inria.atlanmod.prefetching.benchmarks.tests.noprefetch;

import java.util.Collection;

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

public class CompilationUnitImportsCommentsTestNoPrefetch extends AbstractTestCaseNoPrefetch {
	
	public CompilationUnitImportsCommentsTestNoPrefetch(String resourceName) {
		super(resourceName);
	}

	protected String textualQuery;
	protected EClass eContext;
	
    @Before
    public void setUp() {
    	super.setUp();
    	eContext = JavaPackage.eINSTANCE.getAbstractTypeDeclaration();
        oclHelper.setContext(eContext);
        try {
        	textualQuery = ""
        			+ "if(not(self.originalCompilationUnit.oclIsUndefined())) then"
            		+ "	let res : Set(ASTNode) = self.originalCompilationUnit.imports in "
            		+ "		res->union(self.originalCompilationUnit.comments)"
            		+ "		->union(self.comments)"
            		+ "		->union(self.commentsBeforeBody)"
            		+ "		->union(self.commentsAfterBody)"
            		+ "else "
            		+ " Set(ASTNode){}"
            		+ "endif";
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
	        EList<EObject> abstractTypeDeclarations = resource.getAllInstances(JavaPackage.eINSTANCE.getAbstractTypeDeclaration());
			System.out.println("input size : " + abstractTypeDeclarations.size());
			System.out.println("Q1(1)");
	        long begin = System.currentTimeMillis();
	        Object res = query.evaluate(abstractTypeDeclarations);
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
	        Object res2 = query.evaluate(abstractTypeDeclarations);
	        end = System.currentTimeMillis();
	        System.out.println("Done : " + (end-begin) + "ms");

    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
			PersistentResourceImpl.shutdownWithoutUnload((PersistentResourceImpl)resource);
    	}
    }
}

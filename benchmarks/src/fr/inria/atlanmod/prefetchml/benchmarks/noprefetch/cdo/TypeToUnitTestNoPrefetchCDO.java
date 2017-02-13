package fr.inria.atlanmod.prefetchml.benchmarks.noprefetch.cdo;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.pouet.cdo.java.JavaPackage;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCaseNoPrefetchCDO;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class TypeToUnitTestNoPrefetchCDO extends AbstractTestCaseNoPrefetchCDO {
	
	public TypeToUnitTestNoPrefetchCDO(String resourceName, String scriptSuffix) {
		super(resourceName, scriptSuffix);
	}

	protected String textualQuery;
	protected EClass eContext;
	
    @SuppressWarnings("unchecked")
	@Before
    public void setUp() {
    	super.setUp();
    	eContext = JavaPackage.eINSTANCE.getAbstractTypeDeclaration();
        oclHelper.setContext(eContext);
        try {
            textualQuery = ""
                    + "if(not(self.originalCompilationUnit.oclIsUndefined())) then"
                    + " let res : Set(ASTNode) = self.originalCompilationUnit.imports in "
                    + "     res->union(self.originalCompilationUnit.comments)"
                    + "     ->union(self.comments)"
                    + "     ->union(self.commentsBeforeBody)"
                    + "     ->union(self.commentsAfterBody)"
                    + "else "
                    + " Set(ASTNode){}"
                    + "endif";
            expression = oclHelper.createQuery(textualQuery);
        } catch (ParserException e) {
            e.printStackTrace();
        }
        this.query = ocl.createQuery(expression);
    }
    
    @SuppressWarnings("unchecked")
	@Test
    public void testBlockStatement() {
    	try {
    	    PrefetchMLLogger.info(this.getClass().getName());
	        EList<EObject> blocks = getAllInstances(resource, JavaPackage.eINSTANCE.getAbstractTypeDeclaration());
	        PrefetchMLLogger.info("Input size: " + blocks.size());
	        
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
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
    	    cdoBackend.unload(resource);
//    	    resource.close();
    	}
    }
}

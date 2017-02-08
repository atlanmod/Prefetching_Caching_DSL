package fr.inria.atlanmod.prefetchml.benchmarks.noprefetch.mapdb;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCaseNoPrefetch;
import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCaseNoPrefetchMapDB;

public class TypeToUnitTestNoPrefetchMapDB extends AbstractTestCaseNoPrefetchMapDB {
	
	public TypeToUnitTestNoPrefetchMapDB(String resourceName, String scriptSuffix) {
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
    
    @SuppressWarnings("unchecked")
	@Test
    public void testTypeToUnit() {
    	try {
    	    PrefetchMLLogger.info(this.getClass().getName());
	        EList<EObject> abstractTypeDeclarations = resource.getAllInstances(JavaPackage.eINSTANCE.getAbstractTypeDeclaration());
			PrefetchMLLogger.info("Input size: {0}", abstractTypeDeclarations.size());
			
			PrefetchMLLogger.info("Q1");
			computeQuery(query, abstractTypeDeclarations);
	        
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
	        computeQuery(query, abstractTypeDeclarations);
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
    	    resource.close();
    	}
    }
}

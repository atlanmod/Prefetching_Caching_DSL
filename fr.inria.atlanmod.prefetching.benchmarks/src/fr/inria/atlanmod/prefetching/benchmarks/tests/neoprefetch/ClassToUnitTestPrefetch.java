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

public class ClassToUnitTestPrefetch extends AbstractTestCasePrefetch {
	
	public ClassToUnitTestPrefetch(String resourceName, String scriptSuffix) {
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
        			+ "if(self.typeParameters->size() = 0) then "
        			+ "	if(not(self.originalCompilationUnit.oclIsUndefined())) then "
        			+ "		let res : Set(ASTNode) = self.originalCompilationUnit.imports in "
        			+ "			res->union(self.originalCompilationUnit.comments) "
        			+ "			->union(self.comments) "
        			+ "			->union(self.commentsBeforeBody) "
        			+ "			->union(self.commentsAfterBody) "
        			+ "			->union(self.bodyDeclarations->select(e | e.oclIsTypeOf(FieldDeclaration)) "
        			+ "				->collect( f |  "
        			+ "					if(f.oclAsType(AbstractVariablesContainer).fragments->size() = 0) then "
        			+ "						null "
        			+ "					else "
        			+ "						f.oclAsType(AbstractVariablesContainer).fragments "
        			+ "					endif "
        			+ "				)->oclAsSet()->flatten())"
        			+ "			->union(self.bodyDeclarations->select(e | not(e.oclIsTypeOf(FieldDeclaration)))) "
        			+ "			->including(self.modifier) "
        			+ "			->including(self.superClass) "
        			+ "	else "
        			+ "		Set(ASTNode){} "
        			+ "	endif "
        			+ "else "
        			+ "	Set(ASTNode){} "
        			+ "endif";
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
    	pCore.loadPrefetchScript(URI.createURI(this.getScriptLargeCacheString()));
    	performQuery();
    }
	
	@Test
	public void testClassToUnit_smallCache() {
		pCore.loadPrefetchScript(URI.createURI(this.getScriptSmallCacheString()));
		performQuery();
	}
	
	@Test
	public void testClassToUnit_badCache() {
		pCore.loadPrefetchScript(URI.createURI(this.getScriptBadCacheString()));
		performQuery();
	}
    
    @SuppressWarnings("unchecked")
	private void performQuery() {
    	try {
    		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    		System.out.println(this.getClass().getName());
    		EList<EObject> classDeclarations = resource.getAllInstances(eContext);
    		System.out.println("input size = " + classDeclarations.size());
			long begin = System.currentTimeMillis();
			System.out.println("Q1(1)");
			query.evaluate(classDeclarations);
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
	        query.evaluate(classDeclarations);
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

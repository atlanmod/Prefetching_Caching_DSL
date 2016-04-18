package fr.inria.atlanmod.prefetching.benchmarks.tests.emfprefetch;

import java.util.Collection;
import java.util.List;

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
import fr.inria.atlanmod.prefetch.core.PrefetchCore;
import fr.inria.atlanmod.prefetch.processor.emf.DelegateEList;
import fr.inria.atlanmod.prefetch.processor.emf.EventNotifierDelegateEList;
import fr.inria.atlanmod.prefetching.benchmarks.tests.AbstractTestCasePrefetchEMF;

public class ClassDeclarationToClassUnitTestPrefetchEMF extends AbstractTestCasePrefetchEMF {
	
	public ClassDeclarationToClassUnitTestPrefetchEMF(String resourceName) {
		super(resourceName);
	}

	protected String textualQuery;
	protected EClass eContext;
	
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
    	return "plans/Q2.prefetch.bin";
    }
    
    @Test
    public void compilTypesUsages() {
    	try {
    		System.out.println(this.getClass().getName());
    		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    		PrefetchCore core = runtime.getPCore();
    		EList<EObject> blocks = resource.getAllInstances(eContext);
    		EList<EObject> prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,core);
    		System.out.println("input size : " + blocks.size());
			System.out.println("Q1(1)");
			core.hitCount = 0;
			core.missCount = 0;
			long begin = System.currentTimeMillis();
			Object res = query.evaluate(prefetchableAllInstances);
	        long end = System.currentTimeMillis();       
	        System.out.println("Done : " + (end-begin) + "ms");
//	        System.out.println("resres = " + resCount);
	        System.out.println("Hits - " + core.hitCount);
	        System.out.println("Misses - " + core.missCount);
	        System.out.println("Wasred " + DelegateEList.wastedTime);
	        System.out.println("Missed time : " + DelegateEList.missTime);
	        System.out.println("Consistency miss time : " + DelegateEList.consistencyMissTime);
	        System.out.println("Event count : " + core.getEventAPI().accessCount);
	        
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
	        blocks = resource.getAllInstances(eContext);
    		prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,core);
	        begin = System.currentTimeMillis();
	        core.hitCount = 0;
	        core.missCount = 0;
	        
	        Object res2 = query.evaluate(prefetchableAllInstances);
	        end = System.currentTimeMillis();
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + core.hitCount);
	        System.out.println("Misses - " + core.missCount);
	        System.out.println("Missed time : " + DelegateEList.missTime);
	        System.out.println("Consistency miss time : " + DelegateEList.consistencyMissTime);
	        System.out.println("Event count : " + core.getEventAPI().accessCount);
	        System.out.println("cache size : "  + core.getActiveCache().size());
	       
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
			PersistentResourceImpl.shutdownWithoutUnload((PersistentResourceImpl)resource);
    	}
    }
}

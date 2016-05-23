package fr.inria.atlanmod.prefetching.benchmarks.tests.emfprefetch;

import java.util.Collection;
import java.util.Iterator;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.neoemf.resources.impl.PersistentResourceImpl;
import fr.inria.atlanmod.prefetch.core.PrefetchCore;
import fr.inria.atlanmod.prefetch.processor.emf.DelegateEList;
import fr.inria.atlanmod.prefetch.processor.emf.EventNotifierDelegateEList;
import fr.inria.atlanmod.prefetching.benchmarks.tests.AbstractTestCasePrefetchEMF;

public class CompilationUnitImportsCommentsTestPrefetchEMF extends AbstractTestCasePrefetchEMF {
	
	public CompilationUnitImportsCommentsTestPrefetchEMF(String resourceName) {
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
    
    @Override
    protected String getScriptString() {
    	return "plans/Q1.prefetch.bin";
    }
    
    @Test
    public void compilTypesUsages() {
    	try {
    		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    		System.out.println(this.getClass().getName());
    		PrefetchCore core = runtime.getPCore();
    		EList<EObject> blocks = resource.getAllInstances(eContext);
    		EList<EObject> prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,core);
    		System.out.println("input size : " + blocks.size());
			long begin = System.currentTimeMillis();
			System.out.println("Q1(1)");
			core.resetHitCount();;
			core.resetMissCount();;
			Object res = query.evaluate(prefetchableAllInstances);
	        long end = System.currentTimeMillis();       
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + core.getHitCount());
	        System.out.println("Misses - " + core.getMissCount());
	        
	        System.out.println("Q2");
	        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	        this.oclHelper = ocl.createOCLHelper();
	        eContext = JavaPackage.eINSTANCE.getBlock();
	        eContext = JavaPackage.eINSTANCE.getAbstractTypeDeclaration();
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
	        core.resetMissCount();;
	        Object res2 = query.evaluate(prefetchableAllInstances);
	        end = System.currentTimeMillis();
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + core.getHitCount());
	        System.out.println("Misses - " + core.getMissCount());
	        System.out.println(core.getActiveCache().size());
	        
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
			PersistentResourceImpl.shutdownWithoutUnload((PersistentResourceImpl)resource);
    	}
    }
}
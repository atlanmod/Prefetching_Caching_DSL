package fr.inria.atlanmod.prefetching.benchmarks.tests.emfprefetch;

import java.util.Collection;

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

public class BlockToBlockUnitTestPrefetchEMF extends AbstractTestCasePrefetchEMF {
	
	public BlockToBlockUnitTestPrefetchEMF(String resourceName) {
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
    
    @Override
    protected String getScriptString() {
    	return "plans/Q3.prefetch.bin";
    }
    
    @Test
    public void compilTypesUsages() {
    	try {
    		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    		System.out.println("Prio set");
    		System.out.println(this.getClass().getName());
    		PrefetchCore core = runtime.getPCore();
    		EList<EObject> blocks = resource.getAllInstances(eContext);
    		EList<EObject> prefetchableAllInstances = new EventNotifierDelegateEList<EObject>(blocks,core);
    		System.out.println(blocks.size() + " inputs");
			long begin = System.currentTimeMillis();
			System.out.println("Q1(1)");
			core.hitCount = 0;
			core.missCount = 0;
			Object res = query.evaluate(prefetchableAllInstances);
	        long end = System.currentTimeMillis();       
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + core.hitCount);
	        System.out.println("Misses - " + core.missCount);
	        System.out.println("Events : " + core.getEventAPI().accessCount);
	        System.out.println("Event types : " + core.getEventAPI().eventTypes.toString());
	        core.getEventAPI().accessCount = 0;
	        
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
	        core.hitCount = 0;
	        core.missCount = 0;
	        Object res2 = query.evaluate(prefetchableAllInstances);
	        end = System.currentTimeMillis();
	        System.out.println("Events : " + core.getEventAPI().accessCount);
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + core.hitCount);
	        System.out.println("Misses - " + core.missCount);
	        System.out.println(core.getActiveCache().size());
	        
	        System.out.println("Waiting");
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
			PersistentResourceImpl.shutdownWithoutUnload((PersistentResourceImpl)resource);
    	}
    }
}

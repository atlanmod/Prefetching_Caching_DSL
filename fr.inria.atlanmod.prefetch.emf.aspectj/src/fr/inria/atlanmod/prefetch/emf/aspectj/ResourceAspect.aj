package fr.inria.atlanmod.prefetch.emf.aspectj;

import org.eclipse.emf.ecore.resource.Resource;

public aspect ResourceAspect extends AbstractEMFAspect {
    
	pointcut getContentsCall() : execution(* Resource.getContents());
    
    Object around() : getContentsCall() {
    	// Needed to avoid useless computations
    	if(!isEnabled) {
    		return proceed();
    	}
//    	System.out.println("getContentsCall");
    	Object contents = proceed();
//    	System.out.println(contents);
    	return contents;
    }
    /*after(): getContentsCall() {
        System.out.println("test");
    }*/
}

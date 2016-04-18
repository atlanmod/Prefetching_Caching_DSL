package fr.inria.atlanmod.prefetch.emf.aspectj;

import java.util.List;
//import org.eclipse.emf.ecore.impl.BasicEObjectAspect;

import java.util.concurrent.ExecutorService;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import fr.inria.atlanmod.prefetch.processor.emf.EMFRuleProcessor;
import fr.inria.atlanmod.prefetch.cache.EMFCacheKey;
import fr.inria.atlanmod.prefetch.cache.EMFIndexedCacheKey;
import fr.inria.atlanmod.prefetch.util.PrefetchLogger;
import fr.inria.atlanmod.prefetch.processor.emf.DelegateEList;


public aspect EGetAspect extends AbstractEMFAspect {
	
	pointcut inP() : execution(void EMFRuleProcessor.processAccessRules(..));
	
	pointcut inURIFragment() : execution(String Resource.getURIFragment(..));
	
	pointcut inDelegateEList() : execution(* DelegateEList.delegateEGet());
	
	pointcut eGetCall() : execution(* EObject.eGet(..)) && !cflow(inDelegateEList()) && !within(EMFRuleProcessor) && !within(EGetAspect) && !cflow(inP()) && !cflowbelow(execution(* EObject.eGet(..))) && !cflow(inURIFragment());
	
//	pointcut eGetCall2() : BasicEObjectAspect.inEGetFrom() && !cflow(inDelegateEList()) && !within(EMFRuleProcessor) && !within(EGetAspect) && !cflow(inP()) && !cflowbelow(BasicEObjectAspect.inEGetFrom()) && !cflow(inURIFragment());
	
//	Object around() : eGetCall2() {
//		System.out.println("Test");
//		return proceed();
//	}
	
	Object around() : eGetCall() {
//		if(1==1)
//		return proceed();
    	// Needed to avoid useless computations
    	if(!isEnabled) {
    		return proceed();
    	}
    	EObject sourceObject = (EObject)thisJoinPoint.getThis();
    	EStructuralFeature feature = (EStructuralFeature)thisJoinPoint.getArgs()[0];
    	
    	EPackage pack = (EPackage)sourceObject.eClass().eContainer();
    	if(!pack.getNsURI().equals("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java-neoemf")) {
    		return proceed();
    	}
    	
    	if(sourceObject.eResource() == null || feature == null || feature.getName() == null) {
    		return proceed();
    	}
    	if(feature.isMany()) {
    		// No need to return the actual object, a mock list is enough
    		return new DelegateEList(sourceObject,feature,pCore);
    	}
    	else {
    		EMFIndexedCacheKey cacheKey = new EMFIndexedCacheKey(sourceObject.eResource().getURIFragment(sourceObject),feature,-1);
//    		EMFCacheKey cacheKey = new EMFCacheKey(sourceObject.eResource().getURIFragment(sourceObject), feature);
    		Object result = null;
    		if(pCore.getActiveCache().containsKey(cacheKey)) {
    			pCore.hitCount++;
    			result = pCore.getActiveCache().get(cacheKey);
    			return result;
//    			if(result instanceof List<?>) {
//    				// Should be allways the case
//    				Object singleResult = ((List) result).get(0);
//    				int singleResultSize = ((List) result).size();
//    				if(singleResult == null) {
//    					if(singleResultSize == 0) {
//    						// The feature has been prefetched as null
//    						return null;
//    					}
//    					else {
//    						// There is an object, but it has not been prefetched
//    						return proceed();
//    					}
//    				}
//    				else {
//    					// The result is in the cache, just return it
//    					// TODO send events
//    					return singleResult;
//    				}
//    			}
//    			else {
//    				PrefetchLogger.error("The cache contains an object that is not a list");
//    				return proceed();
//    			}
    		}
    		else {
    			// The value is not in the cache
    			return proceed();
    		}
    	}
    }
	
}

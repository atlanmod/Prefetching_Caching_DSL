package fr.inria.atlanmod.prefetchml.emf.event.capture;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.core.cache.EMFIndexedCacheKey;
import fr.inria.atlanmod.prefetchml.core.cache.monitoring.MonitoredCacheValue;
import fr.inria.atlanmod.prefetchml.core.processor.emf.DelegateEList;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EMFRuleProcessor;
//import org.eclipse.emf.ecore.impl.BasicEObjectAspect;


public aspect EGetAspect extends AbstractEMFAspect {
	
	pointcut inP() : execution(void EMFRuleProcessor.processAccessRules(..));
	
	pointcut inURIFragment() : execution(String Resource.getURIFragment(..));
	
	pointcut inDelegateEList() : execution(* DelegateEList.delegateEGet());
	
	pointcut eGetCall() : execution(* EObject.eGet(..)) && !cflow(inDelegateEList()) && !within(EMFRuleProcessor) && !within(EGetAspect) && !cflow(inP()) && !cflowbelow(execution(* EObject.eGet(..))) && !cflow(inURIFragment());
	
	@SuppressWarnings("rawtypes")
	Object around() : eGetCall() {
    	// Needed to avoid useless computations
    	if(!isEnabled) {
    		return proceed();
    	}
    	EObject sourceObject = (EObject)thisJoinPoint.getThis();
    	EStructuralFeature feature = (EStructuralFeature)thisJoinPoint.getArgs()[0];
    	
    	EPackage pack = (EPackage)sourceObject.eClass().eContainer();
    	if(!pack.getNsURI().equals("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java-neoemf")
    	        && !pack.getNsURI().equals("http://www.semanticweb.org/ontologies/2015/trainbenchmark")) {
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
    		MonitoredCacheValue cachedValue = pCore.getActiveCache().get(cacheKey);
    		if(cachedValue != null) {
    		    pCore.hit();
    		    return cachedValue.value();
    		}
    		else {
    		    Object theObject = proceed();
    		    pCore.miss();
    		    pCore.getActiveCache().put(cacheKey, new MonitoredCacheValue(theObject, null));
    		    return theObject;
    		}
    	}
    }
}

package fr.inria.atlanmod.prefetchml.emf.event.capture;

import org.aspectj.lang.ProceedingJoinPoint;
import org.eclipse.emf.cdo.CDOObject;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.id.CDOIDUtil;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.core.cache.EMFIndexedCacheKey;
import fr.inria.atlanmod.prefetchml.core.cache.monitoring.MonitoredCacheValue;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.emf.DelegateEList;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EMFRuleProcessor;
//import org.eclipse.emf.ecore.impl.BasicEObjectAspect;
import fr.inria.atlanmod.prefetchml.core.processor.emf.IDUtil;


public aspect EGetAspect extends AbstractEMFAspect {
	
    public static int count = 0;
    
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
    	        && !pack.getNsURI().equals("http://www.semanticweb.org/ontologies/2015/trainbenchmark")
    	        && !pack.getNsURI().equals("http://www.eclipse.org/MoDisco/Java/0.2.incubation/java-cdo")
    	        && !pack.getNsURI().equals("http://www.semanticweb.org/ontologies/2015/trainbenchmark-cdo")) {
    		return proceed();
    	}
    	count++;
//    	if(sourceObject.eResource() == null || feature == null || feature.getName() == null) {
    	if(feature == null || feature.getName() == null) {
    	    return proceed();
    	}
    	if(feature.isMany()) {
    		// No need to return the actual object, a mock list is enough
    		return new DelegateEList(sourceObject,feature,pCore);
    	}
    	else {
    	    String id = getURIFragment(sourceObject);
    		EMFIndexedCacheKey cacheKey = new EMFIndexedCacheKey(id,feature,-1);
    		MonitoredCacheValue cachedValue = pCore.getActiveCache().get(cacheKey);
    		if(cachedValue != null) {
    		    pCore.hit();
    		    Object returnValue = cachedValue.value();
    		    if(pCore.isMirrored()) {
    		        if(returnValue instanceof CDOObject) {
    		            CDOObject cdoObject = (CDOObject)returnValue;
    		            if(((CDOResource)pCore.getBaseResource()).cdoView().equals(cdoObject.cdoView())) {
    		                return cdoObject;
    		            }
    		            else {
    		                return pCore.getBaseResource().getEObject(getURIFragment((EObject)returnValue));
    		            }
    		        }
    		    }
    		    return returnValue;
    		}
    		else {
    		    Object theObject = proceed();
    		    pCore.miss();
    		    pCore.getActiveCache().put(cacheKey, new MonitoredCacheValue(theObject, null));
    		    return theObject;
    		}
    	}
    }
	
	public static String getURIFragment(EObject eObject) {
        String sourceFragment = null;
        if(eObject instanceof CDOObject) {
            StringBuilder sb = new StringBuilder();
            CDOIDUtil.write(sb, ((CDOObject)eObject).cdoID());
            sourceFragment = sb.toString();
        }
        else {
            // Accessing eResource, may be costly
            sourceFragment = eObject.eResource().getURIFragment(eObject);
        }
        return sourceFragment;
    }
}

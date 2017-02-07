package fr.inria.atlanmod.prefetchml.core.processor.emf;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.core.cache.EMFIndexedCacheKey;
import fr.inria.atlanmod.prefetchml.core.cache.monitoring.PrefetchMLMonitor;
import fr.inria.atlanmod.prefetchml.core.cache.monitoring.MonitoredCacheValue;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessor;
import fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule;
import fr.inria.atlanmod.prefetchml.language.metamodel.FeaturePattern;
import fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingRule;
import fr.inria.atlanmod.prefetchml.language.metamodel.StartingRule;

public class EMFRuleProcessor implements RuleProcessor {

	private Map<Object,MonitoredCacheValue> cache;
	private Resource resource;
	
	private Map<String,List<EObject>> instanceOfMap;
	
	public EMFRuleProcessor(Map<Object,MonitoredCacheValue> cache, Resource resource) {
		this.cache = cache;
		this.resource = resource;
	}
	
	@Override
	public Object getCache() {
		return this.cache;
	}
	
	@Override
	public void setCache(Map<Object,MonitoredCacheValue> newCache) {
		this.cache = newCache;
	}

	@Override
	public void processStartingRule(StartingRule sRule, Object resourceStore) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void processStartingRules(List<StartingRule> sRules, Object resourceStore) {
		if(!(resourceStore instanceof Resource)) {
			PrefetchMLLogger.error("EMFRuleProcessor can only work with EMF Resource");
			return;
		}
		// Update the resource
		resource = (Resource)resourceStore;
		PrefetchMLLogger.warn("StartingRule are discouraged when using EMFRuleProcessor");
		if(sRules.isEmpty()) {
			PrefetchMLLogger.debug("Empty sRule list");
			return;
		}
		for(StartingRule sRule : sRules) {
			List<EObject> allInstances = getAllInstances(sRule.getTargetPattern().getEClass(), sRules, resource);
			for(EObject e : allInstances) {
				processFeatures(e, sRule);
			}
		}
		
	}
	
	@Override
	public void processAccessRule(Object source, AccessRule aRule) {
		// TODO Auto-generated method stub

	}
	
	@Override
	public void processAccessRules(Object source, List<AccessRule> aRules) {
		if(!(source instanceof EObject)) {
			PrefetchMLLogger.error("Cannot use EMFRuleProcessor on non EMF source object");
			throw new IllegalArgumentException("Cannot use EMFRuleProcessor on non EMF source object");
		}
		if(aRules.isEmpty()) {
			return;
		}
		for(AccessRule aRule : aRules) {
			EClass sourceEClass = aRule.getSourcePattern().getEClass();
			EClass targetEClass = aRule.getTargetPattern().getEClass();
			if(sourceEClass.equals(targetEClass)) {
			    long startProcess = System.currentTimeMillis();
				// The target pattern is an extension of the source one, simply process the references
				processFeatures((EObject)source,aRule);
				long stopProcess = System.currentTimeMillis();
//				PrefetchMLMonitor.getInstance().registerExecutionTime(aRule, (stopProcess-startProcess));
			}
			else {
				// The target pattern starts with another EClass, fetch all the instances of this EClass
				// and process the references from them
				// Note: their is no reason to use this kind of patterns in EMFRuleProcessor, since 
				// allInstances() call will load the entire model into memory
				PrefetchMLLogger.warn("The use of different source and target EClass is discouraged with EMFRuleProcessor");
			}
		}
	}
	
	private void processFeatures(EObject source, PrefetchingRule rule) {
		this.processFeatures(source, rule,0);
	}
	
	private void processFeatures(EObject source, PrefetchingRule rule, int idx) {
	    EList<FeaturePattern> features = rule.getTargetPattern().getFeatures();
		if(source == null) {
			return;
		}
		if(features == null || idx >= features.size()) {
			return;
		}

		EStructuralFeature theFeature = features.get(idx).getFeature();
		String sourceFragment = source.eResource().getURIFragment(source);
		
		if(theFeature.isMany()) {
			// Not costly (just a wrapper)
			@SuppressWarnings("unchecked")
			EList<EObject> r = (EList<EObject>)source.eGet(theFeature);
			// Costly
			EMFIndexedCacheKey sizeKey = new EMFIndexedCacheKey(sourceFragment, theFeature, -2);
			int theSize = -1;
			MonitoredCacheValue cachedSize = cache.get(sizeKey);
			if(cachedSize != null) {
			    theSize = (int)cachedSize.value();
			}
			else {
			    theSize = r.size();
			    cache.put(sizeKey, new MonitoredCacheValue(theSize, rule));
			}
			
			for(int i = theSize - 1; i >= 0; i--) {
			    EMFIndexedCacheKey key = new EMFIndexedCacheKey(sourceFragment, theFeature, i);
			    MonitoredCacheValue cachedValue = cache.get(key);
			    if(cachedValue != null) {
			        EObject cachedEObject = (EObject)cachedValue.value();
			        processFeatures(cachedEObject, rule, idx + 1);
			    }
			    else {
			        EObject computedEObject = r.get(i);
			        cache.put(key, new MonitoredCacheValue(computedEObject, rule));
			        processFeatures(computedEObject, rule, idx + 1);
			    }
			}
		}
		else {
			EMFIndexedCacheKey key = new EMFIndexedCacheKey(sourceFragment, theFeature, -1);
			if(cache.containsKey(key)) {
				EObject cachedObject = (EObject)cache.get(key).value();
				processFeatures(cachedObject, rule, idx + 1);
			}
			else {
				EObject computedObject = (EObject)source.eGet(theFeature);
				cache.put(key, new MonitoredCacheValue(computedObject, rule));
//				PrefetchMLMonitor.getInstance().registerCachedElement(rule);
				processFeatures(computedObject, rule, idx + 1);
			}
		}
	}
	
	private List<EObject> getAllInstances(EClass eClass, List<? extends PrefetchingRule> pRules, Resource resource) {
		if(instanceOfMap == null) {
			instanceOfMap = new HashMap<String, List<EObject>>();
			Set<EClass> targetEClass = new HashSet<EClass>();
			for(PrefetchingRule pRule : pRules) {
				targetEClass.add(pRule.getTargetPattern().getEClass());
				instanceOfMap.put(pRule.getTargetPattern().getEClass().getName(), new ArrayList<EObject>());
			}
			Iterator<EObject> it = resource.getAllContents();
			while(it.hasNext()) {
				EObject eObject = it.next();
				for(EClass e : targetEClass) {
					if(e.isInstance(eObject)) {
						instanceOfMap.get(e.getName()).add(eObject);
					}
				}
			}
		}
		return instanceOfMap.get(eClass.getName());
	}

	@Override
	public void invalidateCacheValue(Object source, EStructuralFeature feature, int index) {
	    if(!(source instanceof EObject)) {
	        PrefetchMLLogger.error("Unknown source to invalidate {0}", source);
	        throw new IllegalArgumentException();
	    }
	    EObject eObject = (EObject)source;
	    EMFIndexedCacheKey key = new EMFIndexedCacheKey(((EObject)source).eResource().getURIFragment((EObject)source), feature, index);
	    if(index == -2) {
	        int size = (int)cache.get(key).value();
	        for(int i = 0; i < size; i++) {
	            EMFIndexedCacheKey vKey = new EMFIndexedCacheKey(eObject.eResource().getURIFragment(eObject), feature, i);
	            cache.remove(vKey);
	        }
	    }
	    cache.remove(key);
	}
	
	@Override
	public void updateCacheSize(Object source, EStructuralFeature feature, int sizeDelta) {
	    if(!(source instanceof EObject)) {
	        PrefetchMLLogger.error("Unknown source {0}", source);
	        throw new IllegalArgumentException();
	    }
	    EMFIndexedCacheKey key = new EMFIndexedCacheKey(((EObject)source).eResource().getURIFragment((EObject)source), feature, -2);
	    MonitoredCacheValue vWrapper = cache.get(key);
	    int oldValue = (int)vWrapper.value();
	    PrefetchingRule oldrule = vWrapper.cachingRule();
	    // Reset the cachingRule value to the previous one (does it make sense?)
	    // Furthermore, does it make sense to put the rule for a size caching?
	    cache.put(key, new MonitoredCacheValue(oldValue + sizeDelta, oldrule));
	}
	
}

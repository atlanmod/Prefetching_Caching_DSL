package fr.inria.atlanmod.prefetch.processor.emf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule;
import fr.inria.atlanmod.prefetch.cache.EMFCacheKey;
import fr.inria.atlanmod.prefetch.core.PrefetchCore;
import fr.inria.atlanmod.prefetch.processor.RuleProcessor;
import fr.inria.atlanmod.prefetch.util.PrefetchLogger;

public class EMFRuleProcessor implements RuleProcessor {

	private Map<Object,Object> cache;
	private Resource resource;
	
	private Map<String,List<EObject>> instanceOfMap;
	
	public EMFRuleProcessor(Map<Object,Object> cache, Resource resource) {
		this.cache = cache;
		this.resource = resource;
	}
	
	public Object getCache() {
		return this.cache;
	}
	
	public void setCache(Map<Object,Object> newCache) {
		this.cache = newCache;
	}

	public void processStartingRule(StartingRule sRule, Object resourceStore) {
		// TODO Auto-generated method stub

	}
	
	public void processStartingRules(List<StartingRule> sRules, Object resourceStore) {
		if(!(resourceStore instanceof Resource)) {
			PrefetchLogger.error("EMFRuleProcessor can only work with EMF Resource");
			return;
		}
		// Update the resource
		resource = (Resource)resourceStore;
		PrefetchLogger.warn("StartingRule are discouraged when using EMFRuleProcessor");
		if(sRules.isEmpty()) {
			PrefetchLogger.debug("Empty sRule list");
			return;
		}
		for(StartingRule sRule : sRules) {
			List<EObject> allInstances = getAllInstances(sRule.getTargetPattern().getEClass(), sRules, resource);
			for(EObject e : allInstances) {
				processFeatures(e, sRule.getTargetPattern().getFeatures());
			}
		}
		
	}
	
	public void processAccessRule(Object source, AccessRule aRule) {
		// TODO Auto-generated method stub

	}
	
	public void processAccessRules(Object source, List<AccessRule> aRules) {
//		if((PrefetchCore.hitCount + PrefetchCore.missCount) > 0 && (PrefetchCore.hitCount/(PrefetchCore.hitCount + PrefetchCore.missCount)) < 0.001 && PrefetchCore.missCount > 10000) {
//			return;
//		}
		if(!(source instanceof EObject)) {
			PrefetchLogger.error("Cannot use EMFRuleProcessor on non EMF source object");
			throw new IllegalArgumentException("Cannot use EMFRuleProcessor on non EMF source object");
		}
		if(aRules.isEmpty()) {
//			PrefetchLogger.debug("Empty aRule list for source " + source.toString() + ", returning");
			return;
		}
		for(AccessRule aRule : aRules) {
			EClass sourceEClass = aRule.getSourcePattern().getEClass();
			EClass targetEClass = aRule.getTargetPattern().getEClass();
			if(sourceEClass.equals(targetEClass)) {
				// The target pattern is an extension of the source one, simply process the references
				processFeatures((EObject)source,aRule.getTargetPattern().getFeatures());
//				PrefetchLogger.debug("DONE");
			}
			else {
				// The target pattern starts with another EClass, fetch all the instances of this EClass
				// and process the references from them
				// Note: their is no reason to use this kind of patterns in EMFRuleProcessor, since 
				// allInstances() call will load the entire model into memory
				PrefetchLogger.warn("The use of different source and target EClass is discouraged with EMFRuleProcessor");
			}
		}
	}
	
	private void processFeatures(EObject source, EList<FeaturePattern> features) {
		this.processFeatures(source, features,0);
	}
	
	private void processFeatures(EObject source, EList<FeaturePattern> features, int idx) {
		if(source == null) {
//			PrefetchLogger.debug("Null source, stoping recursion");
			return;
		}
//		long begin = System.currentTimeMillis();
		if(features == null || idx >= features.size()) {
//			PrefetchLogger.debug("No more features to process for " + source.toString());
			return;
		}
//		PrefetchLogger.debug("Processing feature " + features.get(idx).getFeature().getName() + " for " + source.eResource().getURIFragment(source));
//		PrefetchLogger.debug("Updated cache " + cache.toString());
		// TODO check if this does not take too many time (in particular in
		// lazy-loading persistence framework, where all the containers have to be fetched)
		
		EMFCacheKey key = new EMFCacheKey(source.eResource().getURIFragment(
				source), features.get(idx).getFeature());
		// Check if the elements are already in the cache
		if(cache.containsKey(key)) {
//			PrefetchLogger.debug(key.toString() + " is already cached");
			// Get from the cache the objects and continue with them
			List<EObject> cachedEObjects = (List<EObject>)cache.get(key);
			for(EObject e : cachedEObjects) {
				processFeatures(e, features, idx + 1);
			}
		}
		else {
			Object linkedEObjects = source.eGet(features.get(idx).getFeature());
			List<EObject> fetchedEObjects = null;
			if(linkedEObjects == null) {
				// The feature returns null
				synchronized (cache) {
					cache.put(key, Arrays.asList(new EObject[0]));
				}
				return;
			}
			else {
				if(features.get(idx).getFeature().isMany()) {
					List l = (List)linkedEObjects;
					// Delegate call to the store (costly !)
					int size = l.size();
					fetchedEObjects = Arrays.asList(new EObject[size]);
				}
				else {
					fetchedEObjects = Arrays.asList(new EObject[1]);
				}
				synchronized (cache) {
					cache.put(key, fetchedEObjects);
				}
 			}
			
			
			// Get from the PB the objects and continue with them
//			PrefetchLogger.debug(key.toString() + " is not in the cache");
			if(features.get(idx).getFeature().isMany()) {
//				PrefetchLogger.debug("Feature " + features.get(idx).getFeature().getName() + " is multi-valued");
//				List<EObject> refEObjects = (List<EObject>)source.eGet(features.get(idx).getFeature());
//				cache.put(key, refEObjects);
//				try {
					// Avoid concurrent accesses with standard EMF lists
					// it is ok because the prefetcher only reads the list, it
					// does not modify it
//				
//					Object[] array = ((EList)linkedEObjects).toArray();
					for(int i = 0; i < ((EList)linkedEObjects).size(); i++) {
						// pos == i (because EMF natively returns elements in the correct order)
//						fetchedEObjects.set(i, (EObject)array[i]);
						EObject linkedEObject = (EObject)((EList)linkedEObjects).get(i);
//						System.out.println("Adding " + linkedEObject + "("+ i + ")" + " to " + key.toString());
						fetchedEObjects.set(i, linkedEObject);
						processFeatures(linkedEObject, features, idx+1);
					}
//				} catch (Exception e ) {
//					System.out.println(refEObjects.size());
//					e.printStackTrace();
//					System.out.println(source);
//					System.out.println(features.get(idx).getFeature());
//				}
			} else {
				// TODO handle EAttributes
//				PrefetchLogger.debug("Feature " + features.get(idx).getFeature().getName() + " is single-valued");
//				EObject refEObject = (EObject)source.eGet(features.get(idx).getFeature());
				fetchedEObjects.set(0, (EObject)linkedEObjects);
				processFeatures((EObject)linkedEObjects, features, idx + 1);
			}
		}
//		long end = System.currentTimeMillis();
//		PrefetchLogger.debug("Fetch Computed in " + (end-begin) + " ms");
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



}

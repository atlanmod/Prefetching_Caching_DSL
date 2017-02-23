package fr.inria.atlanmod.prefetchml.core;

import java.io.IOException;
import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.gmt.modisco.java.JavaPackage;








import fr.inria.atlanmod.prefetchml.core.cache.CacheFactory;
import fr.inria.atlanmod.prefetchml.core.cache.monitoring.MonitoredCacheValue;
import fr.inria.atlanmod.prefetchml.core.event.EventAPI;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessorFactory;
import fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule;
import fr.inria.atlanmod.prefetchml.language.metamodel.MetamodelImport;
import fr.inria.atlanmod.prefetchml.language.metamodel.Model;
import fr.inria.atlanmod.prefetchml.language.metamodel.Plan;
import fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage;
import fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingRule;
import fr.inria.atlanmod.prefetchml.language.metamodel.StartingRule;

public class PrefetchCore {

	private ResourceSet prefetchStore;
	private Map<Object,MonitoredCacheValue> cache;
	private RuleStore ruleStore;
	private PrefetchWorker worker;
	private EventAPI eventAPI;
	private Object resourceStore;
	private Resource baseResource;
	
	private URI previousLoadedPlan;
	
	
	/**
	 * The number of cache hits
	 */
	private int hitCount = 0;
	/**
	 * The number of cache misses
	 */
	private int missCount = 0;
	
	public PrefetchCore(Object resourceStore, RuleProcessorFactory ruleProcessorFactory) {
		PrefetchMLLogger.info("Starting Prefetch Framework");
		// Register language package
		EPackage.Registry.INSTANCE.put(PrefetchingPackage.eNS_URI, PrefetchingPackage.eINSTANCE);
		PrefetchingPackage.eINSTANCE.eClass();
		PrefetchMLLogger.info("PrefetchingPackage Registered");
		// Init Ecore package to handle cross-reference navigation between Prefetch and Ecore concepts
		EcorePackage.eINSTANCE.eClass();
		PrefetchMLLogger.info("EcorePackage initialized");
		
		this.resourceStore = resourceStore;
		
		// Create the ResourceSet that stores the Prefetching Scripts
		prefetchStore = new ResourceSetImpl();
		// Register the Compiled Prefetch Script extension (bin) 
		// and ecore extension to enable metamodel navigation
		prefetchStore.getResourceFactoryRegistry().getExtensionToFactoryMap().put("bin",  new XMIResourceFactoryImpl());
		prefetchStore.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		PrefetchMLLogger.info("Prefetch Script store created");
		ruleStore = new RuleStore();
		PrefetchMLLogger.info("Rule Store Created");
		worker = new PrefetchWorker(ruleProcessorFactory, ruleStore, cache, resourceStore);
		PrefetchMLLogger.info("Prefetch Worker Created");
		eventAPI = new EventAPI(worker);
		PrefetchMLLogger.info("Event API Ready");
		PrefetchMLLogger.info("Prefetch Framework Started");
	}
	
	public void setMirroredResource(Resource baseResource) {
	    this.baseResource = baseResource;
	    this.worker.setMirroredResource(baseResource);
	}
	
	public void loadPrefetchScript(URI uri) {
		PrefetchMLLogger.info("Loading Prefetch Script " + uri.toFileString());
		Resource scriptResource = prefetchStore.createResource(uri);
		if(scriptResource == null) {
			PrefetchMLLogger.warn("Unable to find {0}, loading canceled", uri.toFileString());
			return;
		}
		try {
			scriptResource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			PrefetchMLLogger.error("Unable to load the Prefetch Script at {0}, loading canceled", uri.toFileString());
			PrefetchMLLogger.error(e);
			return;
		}
		
		if(scriptResource.getContents().size() == 0) {
			PrefetchMLLogger.warn("No Prefetching Model found, no rule added to the registry");
			return;
		}
		Model pModel = (Model)scriptResource.getContents().get(0);
		if(pModel.getPlans().size() == 0) {
			PrefetchMLLogger.warn("No Plan found, no rule added to the registry");
			return;
		}
		if(pModel.getMetamodel() != null) {
			MetamodelImport mImport = pModel.getMetamodel();
//			prefetchStore.getPackageRegistry().put(mImport.getNsURI(), JavaPackage.eINSTANCE);
			System.out.println(Registry.INSTANCE.getEPackage(mImport.getNsURI()));
		}
		PrefetchMLLogger.info("Creating Plan caches");
		// TODO handle multiple caches
		if(!uri.equals(previousLoadedPlan)) {
		    // Quick fix to avoid re-creation of the cache if the plan is simply reloaded
		    cache = CacheFactory.createCacheInstance(pModel.getPlans().get(0).getCache());
		}
		worker.setCache(cache);
		PrefetchMLLogger.info("Plan caches created");
		PrefetchMLLogger.info("Adding Plan Rules to Rule Store");
		for(Plan plan : pModel.getPlans()) {
			String planName = plan.getName();
			for(PrefetchingRule pRule : plan.getRules()) {
				if(pRule instanceof AccessRule) {
					AccessRule aRule = (AccessRule)pRule;
					ruleStore.putARule(planName, aRule.getSourcePattern().getEClass(), aRule);
					PrefetchMLLogger.info("ARule {0} added", aRule.getName());
				}
				else if(pRule instanceof StartingRule) {
					StartingRule sRule = (StartingRule)pRule;
					ruleStore.putSRule(planName, sRule);
					PrefetchMLLogger.info("SRule {0} added", sRule.getName());
				}
				// TODO Handle other rules
			}
		}
		eventAPI.startingEvent(resourceStore);
		hitCount = 0;
		missCount = 0;
		previousLoadedPlan = uri;
	}
	
	public final Map<Object,MonitoredCacheValue> getActiveCache() {
		return cache;
	}
	
	public Resource getBaseResource() {
	    return baseResource;
	}
	
	public boolean isMirrored() {
	    return baseResource != null;
	}
	
	public RuleStore getRuleStore() {
		return ruleStore;
	}
	
	public PrefetchWorker getWorker() {
		return worker;
	}
	
	public EventAPI getEventAPI() {
		return eventAPI;
	}
	
	/**
	 * @return the number of cache hits
	 */
	public int getHitCount() {
		return this.hitCount;
	}
	
	/**
	 * Records a cache hit
	 */
	public void hit() {
		this.hitCount++;
	}
	
	/**
	 * Resets the number of cache hits
	 */
	public void resetHitCount() {
		this.hitCount = 0;
	}
	
	/**
	 * @return the number of cache misses
	 */
	public int getMissCount() {
		return this.missCount;
	}
	
	/**
	 * Records a cache miss
	 */
	public void miss() {
		this.missCount++;
	}
	
	/**
	 * Resets the number of cache misses
	 */
	public void resetMissCount() {
		this.missCount = 0;
	}
}

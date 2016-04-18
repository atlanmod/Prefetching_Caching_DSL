package fr.inria.atlanmod.prefetch.core;

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

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule;
import fr.inria.atlanmod.prefetch.cache.CacheFactory;
import fr.inria.atlanmod.prefetch.event.EventAPI;
import fr.inria.atlanmod.prefetch.processor.RuleProcessorFactory;
import fr.inria.atlanmod.prefetch.util.PrefetchLogger;

public class PrefetchCore {

	private ResourceSet prefetchStore;
	private Map<Object,Object> cache;
	private RuleStore ruleStore;
	private PrefetchWorker worker;
	private EventAPI eventAPI;
	private Object resourceStore;
	
	public static int hitCount = 0;
	public static int missCount = 0;
	
	public PrefetchCore(Object resourceStore, RuleProcessorFactory ruleProcessorFactory) {
		PrefetchLogger.info("Starting Prefetch Framework");
		// Register language package
		EPackage.Registry.INSTANCE.put(PrefetchingPackage.eNS_URI, PrefetchingPackage.eINSTANCE);
		PrefetchingPackage.eINSTANCE.eClass();
		PrefetchLogger.info("PrefetchingPackage Registered");
		// Init Ecore package to handle cross-reference navigation between Prefetch and Ecore concepts
		EcorePackage.eINSTANCE.eClass();
		PrefetchLogger.info("EcorePackage initialized");
		
		this.resourceStore = resourceStore;
		
		// Create the ResourceSet that stores the Prefetching Scripts
		prefetchStore = new ResourceSetImpl();
		// Register the Compiled Prefetch Script extension (bin) 
		// and ecore extension to enable metamodel navigation
		prefetchStore.getResourceFactoryRegistry().getExtensionToFactoryMap().put("bin",  new XMIResourceFactoryImpl());
		prefetchStore.getResourceFactoryRegistry().getExtensionToFactoryMap().put("ecore", new EcoreResourceFactoryImpl());
		PrefetchLogger.info("Prefetch Script store created");
		ruleStore = new RuleStore();
		PrefetchLogger.info("Rule Store Created");
		worker = new PrefetchWorker(ruleProcessorFactory, ruleStore, cache, resourceStore);
		PrefetchLogger.info("Prefetch Worker Created");
		eventAPI = new EventAPI(worker);
		PrefetchLogger.info("Event API Ready");
		PrefetchLogger.info("Prefetch Framework Started");
	}
	
	public void loadPrefetchScript(URI uri) {
		PrefetchLogger.info("Loading Prefetch Script " + uri.toFileString());
		Resource scriptResource = prefetchStore.createResource(uri);
		if(scriptResource == null) {
			PrefetchLogger.warn("Unable to find " + uri.toFileString() + ", loading canceled");
			return;
		}
		try {
			scriptResource.load(Collections.EMPTY_MAP);
		} catch (IOException e) {
			PrefetchLogger.error("Unable to load the Prefetch Script at " + uri.toFileString() + ", loading canceled");
			PrefetchLogger.error(e);
			return;
		}
		
		if(scriptResource.getContents().size() == 0) {
			PrefetchLogger.warn("No Prefetching Model found, no rule added to the registry");
			return;
		}
		Model pModel = (Model)scriptResource.getContents().get(0);
		if(pModel.getPlans().size() == 0) {
			PrefetchLogger.warn("No Plan found, no rule added to the registry");
			return;
		}
		if(pModel.getMetamodel() != null) {
			MetamodelImport mImport = pModel.getMetamodel();
//			prefetchStore.getPackageRegistry().put(mImport.getNsURI(), JavaPackage.eINSTANCE);
			System.out.println(Registry.INSTANCE.getEPackage(mImport.getNsURI()));
		}
		PrefetchLogger.info("Creating Plan caches");
//		for(Plan plan : pModel.getPlans()) {
//			cacheStore.put(plan.getName(), CacheFactory.createCacheInstance(plan.getCache()));
//		}
		// TODO handle multiple caches
		cache = CacheFactory.createCacheInstance(pModel.getPlans().get(0).getCache());
		worker.setCache(cache);
		PrefetchLogger.info("Plan caches created");
		PrefetchLogger.info("Adding Plan Rules to Rule Store");
		for(Plan plan : pModel.getPlans()) {
			String planName = plan.getName();
			for(PrefetchingRule pRule : plan.getRules()) {
				if(pRule instanceof AccessRule) {
					AccessRule aRule = (AccessRule)pRule;
					ruleStore.putARule(planName, aRule.getSourcePattern().getEClass(), aRule);
					PrefetchLogger.debug("ARule " + aRule.getName() + " added");
				}
				else if(pRule instanceof StartingRule) {
					StartingRule sRule = (StartingRule)pRule;
					ruleStore.putSRule(planName, sRule);
					PrefetchLogger.debug("SRule " + sRule.getName() + " added");
				}
				// TODO Handle other rules
			}
		}
		eventAPI.startingEvent(resourceStore);
		hitCount = 0;
		missCount = 0;
	}
	
	public final Map<Object,Object> getActiveCache() {
		return cache;
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
	
}

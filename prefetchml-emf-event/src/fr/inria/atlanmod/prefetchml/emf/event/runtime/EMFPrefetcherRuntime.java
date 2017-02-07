package fr.inria.atlanmod.prefetchml.emf.event.runtime;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.core.PrefetchCore;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EMFRuleProcessorFactory;
import fr.inria.atlanmod.prefetchml.emf.event.capture.EGetAspect;

public class EMFPrefetcherRuntime {
	
	private PrefetchCore pCore;
	
	public EMFPrefetcherRuntime(Object resourceStore) {
		pCore = new PrefetchCore(resourceStore, new EMFRuleProcessorFactory());
		EGetAspect.aspectOf().setPrefetcher(pCore);
	}
	
	public PrefetchCore getPCore() {
		return pCore;
	}
	
	
	/**
	 * Load the Prefetch script at the given URI, and enable it for the
	 * given resource
	 * @param prefetchScriptURI the URI of the script to load
	 * @param resource the resource to enable the prefetching for
	 */
	public void loadPrefetchScript(URI prefetchScriptURI, Resource resource) {
		pCore.loadPrefetchScript(prefetchScriptURI);
		// Enable the aspects
		EGetAspect.aspectOf().enable();
		pCore.getEventAPI().startingEvent(resource);
	}
	
	public void disable() {
	    EGetAspect.aspectOf().disable();
	}
	
	public void enable() {
	    EGetAspect.aspectOf().enable();
	}
	
}

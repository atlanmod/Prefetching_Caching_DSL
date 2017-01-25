package fr.inria.atlanmod.prefetch.core;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.junit.Test;

import fr.inria.atlanmod.prefetchml.core.PrefetchCore;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EMFRuleProcessorFactory;

public class StartPrefetchCoreTest {

	@Test
	public void testConstructor() {
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource dummyResource = rSet.createResource(URI.createURI("dummy.xmi"));
		PrefetchCore pCore = new PrefetchCore(dummyResource, new EMFRuleProcessorFactory());
		assert pCore.getRuleStore().isEmptyA();
		assert pCore.getRuleStore().isEmptyS();
		assert pCore.getActiveCache() == null;
		assert pCore.getWorker().isStarted();
		assert pCore.getEventAPI() != null;
	}

}

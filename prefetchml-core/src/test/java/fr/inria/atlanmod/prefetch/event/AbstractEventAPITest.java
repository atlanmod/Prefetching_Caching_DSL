package fr.inria.atlanmod.prefetch.event;

import java.util.Collections;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.JavaPackage;
import org.junit.Before;

import fr.inria.atlanmod.prefetchml.core.PrefetchCore;
import fr.inria.atlanmod.prefetchml.core.event.EventAPI;
import fr.inria.atlanmod.prefetchml.core.processor.emf.EMFRuleProcessorFactory;

public abstract class AbstractEventAPITest {

	protected PrefetchCore pCore;
	protected String resourceFolderPath = "src/test/resources/";
	protected Map<Object,Object> cache;
	protected EventAPI eventAPI;
	
	protected JavaPackage jPackage = JavaPackage.eINSTANCE;
	
	protected Resource r;
	
	@Before
	public void setUp() throws Exception {
		Registry.INSTANCE.put(jPackage.getNsURI(), jPackage);
		
		ResourceSet rs = new ResourceSetImpl();
		rs.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		Resource dummyResource = rs.createResource(URI.createURI("dummy.xmi"));
		
		pCore = new PrefetchCore(rs, new EMFRuleProcessorFactory());
		eventAPI = pCore.getEventAPI();
		
		// Load the test model
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		r = rSet.createResource(URI.createURI(resourceFolderPath+"sample.xmi"));
		r.load(Collections.EMPTY_MAP);
		
		// Load the pScript
		this.loadScript();
		cache = pCore.getActiveCache();
	}
	
	protected abstract void loadScript();

}

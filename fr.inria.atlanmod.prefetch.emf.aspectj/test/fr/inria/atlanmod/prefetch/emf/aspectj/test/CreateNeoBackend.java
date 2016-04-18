package fr.inria.atlanmod.prefetch.emf.aspectj.test;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.JavaPackage;
import org.junit.Test;

import fr.inria.atlanmod.neoemf.datastore.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.graph.blueprints.datastore.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.graph.blueprints.neo4j.resources.BlueprintsNeo4jResourceOptions;
import fr.inria.atlanmod.neoemf.graph.blueprints.resources.BlueprintsResourceOptions;
import fr.inria.atlanmod.neoemf.graph.blueprints.util.NeoBlueprintsURI;
import fr.inria.atlanmod.neoemf.resources.impl.PersistentResourceFactoryImpl;

public class CreateNeoBackend {

	protected String resourceFolderPath = "";
	
	protected JavaPackage jPackage = JavaPackage.eINSTANCE;
	
	protected Resource r;
	
	@Test
	public void test() throws Exception {
		Registry.INSTANCE.put(jPackage.getNsURI(), jPackage);
		// Load the test model
		ResourceSet rSet = new ResourceSetImpl();
		rSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		r = rSet.createResource(URI.createURI(resourceFolderPath+"sample.xmi"));
		r.load(Collections.EMPTY_MAP);
//		
		PersistenceBackendFactoryRegistry.getFactories().put(NeoBlueprintsURI.NEO_GRAPH_SCHEME, new BlueprintsPersistenceBackendFactory());
		rSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(NeoBlueprintsURI.NEO_GRAPH_SCHEME, new PersistentResourceFactoryImpl());
		
		Resource neoR = rSet.createResource(NeoBlueprintsURI.createNeoGraphURI(new File("neo4jDB")));
		Map<Object,Object> options = new HashMap<Object,Object>();
		List<Object> storeOptions = new ArrayList<Object>();
		// [Define some store options]
		options.put(
		    BlueprintsResourceOptions.OPTIONS_BLUEPRINTS_GRAPH_TYPE,
		    BlueprintsNeo4jResourceOptions.OPTIONS_BLUEPRINTS_TYPE_NEO4J);
		neoR.save(options);
		
		neoR.getContents().addAll(r.getContents());
		neoR.save(options);
//		System.out.println(pCore.getActiveCache().toString());
//		System.out.println("test : " + result);
		
		// Load the pScript
//		runtime.loadPrefetchScript(prefetchScriptURI);
	}
	

}

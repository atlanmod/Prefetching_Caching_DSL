package fr.inria.atlanmod.prefetching.benchmarks.tests;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.Before;

import fr.inria.atlanmod.neoemf.datastore.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.graph.blueprints.datastore.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.graph.blueprints.neo4j.resources.BlueprintsNeo4jResourceOptions;
import fr.inria.atlanmod.neoemf.graph.blueprints.resources.BlueprintsResourceOptions;
import fr.inria.atlanmod.neoemf.graph.blueprints.util.NeoBlueprintsURI;
import fr.inria.atlanmod.neoemf.graph.prefetch.datastore.PrefetchPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.graph.prefetch.datastore.estores.impl.PrefetchingDirectWriteBlueprintsResourceEStoreImpl;
import fr.inria.atlanmod.neoemf.graph.prefetch.resources.PrefetchResourceOptions;
import fr.inria.atlanmod.neoemf.resources.PersistentResource;
import fr.inria.atlanmod.neoemf.resources.PersistentResourceOptions;
import fr.inria.atlanmod.neoemf.resources.impl.PersistentResourceFactoryImpl;
import fr.inria.atlanmod.prefetch.core.PrefetchCore;

public abstract class AbstractTestCasePrefetch extends AbstractPrefetchTest {

	@SuppressWarnings("rawtypes")
	protected OCL ocl = null;
    @SuppressWarnings("rawtypes")
	protected OCLHelper oclHelper = null;
    
    protected PersistentResource resource;
    
    protected OCLExpression<EClassifier> expression = null;
    protected Query<EClassifier, EClass, EObject> query = null;
    
    protected PrefetchingDirectWriteBlueprintsResourceEStoreImpl pStore;
    protected PrefetchCore pCore;
	
    public AbstractTestCasePrefetch(String resourceName, String scriptSuffix) {
    	super(resourceName,scriptSuffix);
    }
    
	@Before
	public void setUp() {
		Registry.INSTANCE.put(JavaPackage.eINSTANCE.getNsURI(), JavaPackage.eINSTANCE);
        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        this.oclHelper = ocl.createOCLHelper();
        PersistenceBackendFactoryRegistry.getFactories().put(NeoBlueprintsURI.NEO_GRAPH_SCHEME, new PrefetchPersistenceBackendFactory());
    	ResourceSet resSet = new ResourceSetImpl();
		resSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(NeoBlueprintsURI.NEO_GRAPH_SCHEME, new PersistentResourceFactoryImpl());
		
		resource = (PersistentResource)resSet.createResource(NeoBlueprintsURI.createNeoGraphURI(new File(resourceName)));
		
		Map<Object,Object> options = new HashMap<Object,Object>();
		List<Object> storeOptions = new ArrayList<Object>();
		storeOptions.add(PrefetchResourceOptions.EStorePrefetchOption.PREFETCHING);
		// [Define some store options]
		options.put(
		    BlueprintsResourceOptions.OPTIONS_BLUEPRINTS_GRAPH_TYPE,
		    BlueprintsNeo4jResourceOptions.OPTIONS_BLUEPRINTS_TYPE_NEO4J);
		options.put(PersistentResourceOptions.STORE_OPTIONS, storeOptions);
		try {
			resource.load(options);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		pStore = (PrefetchingDirectWriteBlueprintsResourceEStoreImpl)((PersistentResource)resource).eStore();
		pCore = pStore.getPrefetcher();
		
	}
	
	protected abstract String getScriptString();
	
	protected String getScriptLargeCacheString() {
		return this.getScriptString() + "_C1_" + this.scriptSuffix + ".prefetch.bin";
	}
	
	protected String getScriptSmallCacheString() {
		return this.getScriptString() + "_C2_" + this.scriptSuffix + ".prefetch.bin";
	}
	
	protected String getScriptBadCacheString() {
		return this.getScriptString() + "_Bad_" + this.scriptSuffix + ".prefetch.bin";
	}

}

package fr.inria.atlanmod.prefetching.benchmarks.tests;

import java.io.File;
import java.io.IOException;
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

import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.blueprints.neo4j.option.BlueprintsNeo4jResourceOptions;
import fr.inria.atlanmod.neoemf.data.blueprints.option.BlueprintsResourceOptions;
import fr.inria.atlanmod.neoemf.data.blueprints.util.BlueprintsURI;
import fr.inria.atlanmod.neoemf.prefetchml.blueprints.PrefetchMLBlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.prefetchml.blueprints.option.PrefetchMLBlueprintsOptionsBuilder;
import fr.inria.atlanmod.neoemf.prefetchml.blueprints.store.DirectWritePrefetchMLBlueprintsStore;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;
import fr.inria.atlanmod.prefetchml.core.PrefetchCore;

public abstract class AbstractTestCasePrefetch extends AbstractPrefetchTest {

    @SuppressWarnings("rawtypes")
    protected OCL ocl = null;
    @SuppressWarnings("rawtypes")
    protected OCLHelper oclHelper = null;

    protected PersistentResource resource;

    protected OCLExpression<EClassifier> expression = null;
    protected Query<EClassifier, EClass, EObject> query = null;

    protected DirectWritePrefetchMLBlueprintsStore pStore;
    protected PrefetchCore pCore;

    public AbstractTestCasePrefetch(String resourceName, String scriptSuffix) {
        super(resourceName, scriptSuffix);
    }

    @Before
    public void setUp() {
        Registry.INSTANCE.put(JavaPackage.eINSTANCE.getNsURI(), JavaPackage.eINSTANCE);
        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        this.oclHelper = ocl.createOCLHelper();
        PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME,
                PrefetchMLBlueprintsPersistenceBackendFactory.getInstance());
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());
        resSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
                .put(BlueprintsURI.SCHEME, PersistentResourceFactory.getInstance());

        resource = (PersistentResource) resSet.createResource(BlueprintsURI.createFileURI(new File(
                resourceName)));

        Map<String, Object> options = PrefetchMLBlueprintsOptionsBuilder
                .newBuilder()
                .option(BlueprintsResourceOptions.GRAPH_TYPE,
                        BlueprintsNeo4jResourceOptions.GRAPH_TYPE_NEO4J).asMap();

        try {
            resource.load(options);
        } catch (IOException e) {
            e.printStackTrace();
        }

        pStore = (DirectWritePrefetchMLBlueprintsStore) ((PersistentResource) resource)
                .eStore();
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

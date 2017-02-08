package fr.inria.atlanmod.prefetchml.benchmarks;

import hu.bme.hit.trainbenchmark.railway.RailwayPackage;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.Before;

import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.mapdb.MapDbPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.mapdb.option.MapDbOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.mapdb.util.MapDbURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class AbstractTestCaseRailwayNoPrefetchMapDB extends AbstractPrefetchTest {

    @SuppressWarnings("rawtypes")
    protected OCL ocl = null;
    @SuppressWarnings("rawtypes")
    protected OCLHelper oclHelper = null;

    protected PersistentResource resource;

    protected OCLExpression<EClassifier> expression = null;
    protected Query<EClassifier, EClass, EObject> query = null;

    public AbstractTestCaseRailwayNoPrefetchMapDB(String resourceName, String scriptSuffix) {
        super(resourceName, scriptSuffix);
    }

    @Before
    public void setUp() {
        Registry.INSTANCE.put(RailwayPackage.eINSTANCE.getNsURI(), RailwayPackage.eINSTANCE);
        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        this.oclHelper = ocl.createOCLHelper();
        PersistenceBackendFactoryRegistry.register(MapDbURI.SCHEME,
                MapDbPersistenceBackendFactory.getInstance());
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());
        resSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
                .put(MapDbURI.SCHEME, PersistentResourceFactory.getInstance());

        resource = (PersistentResource) resSet.createResource(MapDbURI.createFileURI(new File(
                this.resourceName)));
        
        Map<String, Object> options = MapDbOptionsBuilder.newBuilder()
                .directWrite()
                .asMap();

        try {
            resource.load(options);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    protected List<Object> computeQuery(Query query, List<?> input) {
        startTimer();
        List<Object> results = query.evaluate(input);
        stopTimer();
        PrefetchMLLogger.info("Done : {0}ms", (stopTimestamp-startTimestamp));
        PrefetchMLLogger.info("Result contains {0} elements", getFlattenedSize(results));
        return results;
    }

}

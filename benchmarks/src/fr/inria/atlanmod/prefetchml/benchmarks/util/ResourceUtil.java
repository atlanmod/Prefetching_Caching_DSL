package fr.inria.atlanmod.prefetchml.benchmarks.util;

import static com.google.common.base.Preconditions.checkNotNull;

import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.blueprints.neo4j.option.BlueprintsNeo4jOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.blueprints.util.BlueprintsURI;
import fr.inria.atlanmod.neoemf.data.mapdb.MapDbPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.mapdb.option.MapDbOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.mapdb.util.MapDbURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;
import fr.inria.atlanmod.prefetchml.benchmarks.AbstractPrefetchMLTest;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;


public class ResourceUtil {

    private static final String ALLINSTANCES_FRAGMENT = "/allInstances.properties";
    
    private static CdoBackend cdoBackend;
    
    public static Resource getResource(String resourceName, String resourceType) throws Exception {
        switch(resourceType) {
            case AbstractPrefetchMLTest.GRAPH_TYPE:
                return createGraphResource(resourceName);
            case AbstractPrefetchMLTest.MAP_TYPE:
                return createMapResource(resourceName);
            case AbstractPrefetchMLTest.CDO_TYPE:
                return createCDOResource(resourceName);
            default:
            throw new IllegalArgumentException(MessageFormat.format(
                    "Unknown resource type \"{0}\"", resourceType));
        }
    }
    
    @SuppressWarnings("unchecked")
    public static List<EObject> getAllInstances(EClass eClass, Resource resource, String resourceName) throws Exception {
        long start = System.currentTimeMillis();
        List<EObject> result = new ArrayList<EObject>();
        if (resource instanceof PersistentResource) {
            result = ((PersistentResource) resource).getAllInstances(eClass);
        } else if (resource instanceof CDOResource) {
            File propertyFile = new File(resourceName + ALLINSTANCES_FRAGMENT);
            if (propertyFile.exists()) {
                PropertiesConfiguration propertyConfiguration = new PropertiesConfiguration(
                        propertyFile);
                List<Object> uriFragments = propertyConfiguration.getList(eClass.getName());
                if (uriFragments == null) {
                    throw new RuntimeException(MessageFormat.format(
                            "Cannot find EClass {0} in {1}", eClass.getName(),
                            ALLINSTANCES_FRAGMENT));
                }
                for (Object uriFragment : uriFragments) {
                    result.add(resource.getEObject((String) uriFragment));
                }

            } else {
                throw new RuntimeException(MessageFormat.format("Cannot find {0}",
                        resourceName + ALLINSTANCES_FRAGMENT));
            }
        }
        else {
            throw new IllegalArgumentException(MessageFormat.format(
                    "Cannot handle resource {0}: unknown type {1}", resource.getURI().toString(),
                    resource.getClass().getName()));
        }
        long end = System.currentTimeMillis();
        PrefetchMLLogger.info("Computed allInstances in {0}ms", (end-start));
        return result;
    }
    
    public static void closeResource(Resource resource) {
        if(resource instanceof PersistentResource) {
            ((PersistentResource)resource).close();
        }
        else if(resource instanceof CDOResource) {
            resource.unload();
        }
        else {
            throw new IllegalArgumentException(MessageFormat.format(
                    "Cannot handle resource {0}: unknown type {1}", resource.getURI().toString(),
                    resource.getClass().getName()));
        }
    }
    
    public static Resource openNewCDOTransaction() throws Exception {
        checkNotNull(cdoBackend, "No registered CdoBackend instance, cannot open a new transaction");
        return cdoBackend.loadInNewTransaction();
    }
    
    private static Resource createGraphResource(String resourceName) throws Exception {
        PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME,
                BlueprintsPersistenceBackendFactory.getInstance());
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());
        resSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
                .put(BlueprintsURI.SCHEME, PersistentResourceFactory.getInstance());

        Resource resource = resSet.createResource(BlueprintsURI
                .createFileURI(new File(resourceName)));

        Map<String, Object> options = BlueprintsNeo4jOptionsBuilder.newBuilder()
                .weakCache()
                .directWrite()
                .asMap();
        resource.load(options);
        return resource;
    }
    
    private static Resource createMapResource(String resourceName) throws Exception {
        PersistenceBackendFactoryRegistry.register(MapDbURI.SCHEME,
                MapDbPersistenceBackendFactory.getInstance());
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());
        resSet.getResourceFactoryRegistry().getProtocolToFactoryMap()
                .put(MapDbURI.SCHEME, PersistentResourceFactory.getInstance());

        Resource resource = (PersistentResource) resSet.createResource(MapDbURI
                .createFileURI(new File(resourceName)));
        
        Map<String, Object> options = MapDbOptionsBuilder.newBuilder()
                .directWrite()
                .asMap();

        resource.load(options);
        return resource;
    }
    
    private static Resource createCDOResource(String resourceName) throws Exception {
        /*
         * Create a new CdoBackend each time to ensure new transactions are
         * opened on the same repository
         */
        cdoBackend = new CdoBackend();
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());
        return (CDOResource)cdoBackend.load(new File(resourceName));
    }
}

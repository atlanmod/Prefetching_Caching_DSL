package fr.inria.atlanmod.prefetchml.benchmarks.util;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.pouet.cdo.java.JavaPackage;

import railway.RailwayPackage;
import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.blueprints.neo4j.option.BlueprintsNeo4jOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.blueprints.util.BlueprintsURI;
import fr.inria.atlanmod.neoemf.data.mapdb.MapDbPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.mapdb.option.MapDbOptionsBuilder;
import fr.inria.atlanmod.neoemf.data.mapdb.util.MapDbURI;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;
import fr.inria.atlanmod.neoemf.resource.PersistentResourceFactory;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class ModelCreator {

	private static final int BUFFER_SIZE = 4096;
    /**
     * Extracts a zip file specified by the zipFilePath to a directory specified by
     * destDirectory (will be created if does not exists)
     * @param zipFilePath
     * @param destDirectory
     * @throws IOException
     */
    public static void unzip(String zipFilePath, String destDirectory) throws IOException {
        File destDir = new File(destDirectory);
        if (!destDir.exists()) {
            destDir.mkdir();
        }
        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFilePath));
        ZipEntry entry = zipIn.getNextEntry();
        // iterates over entries in the zip file
        while (entry != null) {
            String filePath = destDirectory + File.separator + entry.getName();
            if (!entry.isDirectory()) {
                // if the entry is a file, extracts it
                extractFile(zipIn, filePath);
            } else {
                // if the entry is a directory, make the directory
                File dir = new File(filePath);
                dir.mkdir();
            }
            zipIn.closeEntry();
            entry = zipIn.getNextEntry();
        }
        zipIn.close();
    }
    /**
     * Extracts a zip entry (file entry)
     * @param zipIn
     * @param filePath
     * @throws IOException
     */
    private static void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        byte[] bytesIn = new byte[BUFFER_SIZE];
        int read = 0;
        while ((read = zipIn.read(bytesIn)) != -1) {
            bos.write(bytesIn, 0, read);
        }
        bos.close();
    }
    
    public static void createCDOModel(File sourceFile, File targetFile) throws Exception {
        List<EClass> inputEClasses = new ArrayList<EClass>();
        inputEClasses.add(JavaPackage.eINSTANCE.getBlock());
        inputEClasses.add(JavaPackage.eINSTANCE.getClassDeclaration());
        inputEClasses.add(JavaPackage.eINSTANCE.getAbstractTypeDeclaration());
        inputEClasses.add(JavaPackage.eINSTANCE.getModifier());
        inputEClasses.add(JavaPackage.eINSTANCE.getTypeAccess());
        inputEClasses.add(JavaPackage.eINSTANCE.getStatement());
        inputEClasses.add(RailwayPackage.eINSTANCE.getSensor());
        inputEClasses.add(RailwayPackage.eINSTANCE.getRoute());
        
        URI sourceURI = URI.createFileURI(sourceFile.getAbsolutePath());
        CdoBackend cdoBackend = new CdoBackend();
        
        ResourceSet resourceSet = new ResourceSetImpl();
        
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("zxmi", new XMIResourceFactoryImpl());
        
        System.out.println("loading input");
//        Resource sourceResource = resourceSet.getResource(sourceURI, true);
        Resource sourceResource = resourceSet.createResource(sourceURI);
        sourceResource.load(Collections.emptyMap());
        
        Resource targetResource = cdoBackend.createResource(targetFile, resourceSet);
//        targetResource.save(Collections.emptyMap());
        
        targetResource.getContents().addAll(sourceResource.getContents());
        targetResource.save(Collections.emptyMap());

        
        Iterable<EObject> savedContents = () -> targetResource.getAllContents();
        long targetSize = StreamSupport.stream(savedContents.spliterator(), false).count();
        PrefetchMLLogger.info("Target size {0}", targetSize);
        Map<EClass, List<String>> uriFragments = new HashMap<>();
        // Initialize lists
        for(EClass eClass : inputEClasses) {
            uriFragments.put(eClass, new ArrayList<String>());
        }
        for(EObject e : savedContents) {
            for(EClass eClass : inputEClasses) {
                if(eClass.isInstance(e)) {
                    uriFragments.get(eClass).add(targetResource.getURIFragment(e));
                }
            }
        }
        
        PropertiesConfiguration propertyFile = new PropertiesConfiguration(new File(targetFile + "/allInstances.properties"));
        for(EClass eClass : uriFragments.keySet()) {
            propertyFile.addProperty(eClass.getName(), uriFragments.get(eClass));
            PrefetchMLLogger.info("Model contains {0} {1}", uriFragments.get(eClass).size(), eClass.getName());
        }
        
        propertyFile.save();        
    }
    
    public static void createNeoEMFMapModel(File sourceFile, File targetFile) throws IOException {
        PersistenceBackendFactoryRegistry.register(MapDbURI.SCHEME, MapDbPersistenceBackendFactory.getInstance());
        
        URI sourceURI = URI.createFileURI(sourceFile.getAbsolutePath());
        URI targetURI = MapDbURI.createFileURI(targetFile);

        ResourceSet resourceSet = new ResourceSetImpl();
        
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("zxmi", new XMIResourceFactoryImpl());
        resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(MapDbURI.SCHEME, PersistentResourceFactory.getInstance());
        
        Resource sourceResource = resourceSet.createResource(sourceURI);
        Map<String, Object> loadOpts = new HashMap<String, Object>();
        
        sourceResource.load(loadOpts);
        
        Resource targetResource = resourceSet.createResource(targetURI);
        
        Map<String, Object> saveOpts = MapDbOptionsBuilder.newBuilder()
                .directWrite()
                .asMap();
        
        targetResource.save(saveOpts);

        /*
         * Not needed here, and throws an NPE (see NeoEMF issue #64)
         */
//      targetResource.getContents().clear();
        targetResource.getContents().addAll(sourceResource.getContents());
        targetResource.save(saveOpts);
        
        if (targetResource instanceof PersistentResource) {
            ((PersistentResource)targetResource).close();
        } else {
            targetResource.unload();
        }
    }
    
    
    public static void createNeoEMFModel(File sourceFile, File targetFile) throws IOException {
    	PersistenceBackendFactoryRegistry.register(BlueprintsURI.SCHEME, BlueprintsPersistenceBackendFactory.getInstance());
		
		URI sourceURI = URI.createFileURI(sourceFile.getAbsolutePath());
		URI targetURI = BlueprintsURI.createFileURI(targetFile);

		ResourceSet resourceSet = new ResourceSetImpl();
		
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("zxmi", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getProtocolToFactoryMap().put(BlueprintsURI.SCHEME, PersistentResourceFactory.getInstance());
		
		Resource sourceResource = resourceSet.createResource(sourceURI);
		Map<String, Object> loadOpts = new HashMap<String, Object>();
		
		sourceResource.load(loadOpts);
		
		Resource targetResource = resourceSet.createResource(targetURI);
		
		Map<String, Object> saveOpts = BlueprintsNeo4jOptionsBuilder.newBuilder()
		        .autocommit()
		        .asMap();
		
		targetResource.save(saveOpts);

		/*
		 * Not needed here, and throws an NPE (see NeoEMF issue #64)
		 */
//		targetResource.getContents().clear();
		targetResource.getContents().addAll(sourceResource.getContents());
		targetResource.save(saveOpts);
		
		if (targetResource instanceof PersistentResource) {
		    ((PersistentResource)targetResource).close();
		} else {
			targetResource.unload();
		}
    }
	
}
package fr.inria.atlanmod.prefetchml.benchmarks;

import java.io.File;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.stream.StreamSupport;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
//import org.eclipse.gmt.modisco.java.cdo.meta.JavaPackage;
import org.eclipse.gmt.modisco.pouet.cdo.java.JavaPackage;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.Before;

import railway.RailwayPackage;
import fr.inria.atlanmod.prefetchml.benchmarks.util.CdoBackend;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class AbstractTestCaseRailwayNoPrefetchCDO extends AbstractPrefetchTest {

    @SuppressWarnings("rawtypes")
    protected OCL ocl = null;
    @SuppressWarnings("rawtypes")
    protected OCLHelper oclHelper = null;

    protected CdoBackend cdoBackend;
    protected CDOResource resource;

    protected OCLExpression<EClassifier> expression = null;
    protected Query<EClassifier, EClass, EObject> query = null;

    public AbstractTestCaseRailwayNoPrefetchCDO(String resourceName, String scriptSuffix) {
        super(resourceName, scriptSuffix);
        cdoBackend = new CdoBackend();
    }

    @Before
    public void setUp() {
        Registry.INSTANCE.put(RailwayPackage.eINSTANCE.getNsURI(), RailwayPackage.eINSTANCE);
        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        this.oclHelper = ocl.createOCLHelper();
        ResourceSet resSet = new ResourceSetImpl();
        resSet.getResourceFactoryRegistry().getExtensionToFactoryMap()
                .put("xmi", new XMIResourceFactoryImpl());

        try {
            resource = (CDOResource)cdoBackend.load(new File(this.resourceName));
        } catch(Exception e) {
            e.printStackTrace();
        }
        
        Resource newTransactionalResource = cdoBackend.loadInNewTransaction();
        
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.submit(new Runnable() {
//            
//            @Override
//            public void run() {
////                PrefetchMLLogger.info("Sleeping");
////                try {
////                    Thread.sleep(5000);
////                } catch (InterruptedException e) {
////                    // TODO Auto-generated catch block
////                    e.printStackTrace();
////                }
//                long begin = System.currentTimeMillis();
////                Iterable<EObject> allContents = () -> resource.getAllContents();
////                PrefetchMLLogger.info("Base resource contains {0} elements",
////                        StreamSupport.stream(allContents.spliterator(), false).count());
////                List<EObject> topLevelElements = resource.getContents();
//                int count = 0;
////                while(count < 200000) {
//                    try {
//                        // si on met resource on perturbe pas l'exec, si on
//                        // met newTransactionalResource on a du lock
//                        List<EObject> allBlocks = getAllInstances(resource, JavaPackage.eINSTANCE.getBlock());
//                        List<EObject> allClassDeclarations = getAllInstances(resource, JavaPackage.eINSTANCE.getClassDeclaration());
//                        List<EObject> allAbstractTypeDeclarations = getAllInstances(resource, JavaPackage.eINSTANCE.getAbstractTypeDeclaration());
//                        List<EObject> allModifiers = getAllInstances(resource, JavaPackage.eINSTANCE.getModifier());
//                        List<EObject> allTypeAccesses = getAllInstances(resource, JavaPackage.eINSTANCE.getTypeAccess());
//                        List<EObject> allStatements = getAllInstances(resource, JavaPackage.eINSTANCE.getStatement());
//                        count += allBlocks.size();
//                        count += allClassDeclarations.size();
//                        count += allAbstractTypeDeclarations.size();
//                        count += allModifiers.size();
//                        count += allTypeAccesses.size();
//                        count += allStatements.size();
//                        
//                        PrefetchMLLogger.info("Prefetched {0} elements", count);
//                    } catch (ConfigurationException e) {
//                        // TODO Auto-generated catch block
//                        e.printStackTrace();
//                    }
////                }
//                long end = System.currentTimeMillis();
//                PrefetchMLLogger.info("Base loop Computed in {0}ms", (end-begin));
//            }
//        });
                
        
//        long begin = System.currentTimeMillis();
//        Iterable<EObject> allContents = () -> newTransactionalResource.getAllContents();
//        PrefetchMLLogger.info("New resource contains {0} elements",
//                StreamSupport.stream(allContents.spliterator(), false).count());
//        long end = System.currentTimeMillis();
//        PrefetchMLLogger.info("New Computed in {0}ms", (end - begin));
//
//        try {
//            Thread.sleep(15000);
//        } catch (InterruptedException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//        
//        System.exit(0);

    }
    
    protected List<Object> computeQuery(Query query, List<?> input) {
        startTimer();
        List<Object> results = query.evaluate(input);
        stopTimer();
        PrefetchMLLogger.info("Done : {0}ms", (stopTimestamp-startTimestamp));
        PrefetchMLLogger.info("Result contains {0} elements", getFlattenedSize(results));
        return results;
    }
    
    protected EList<EObject> getAllInstances(Resource resource, EClass eClass) throws ConfigurationException {
        long begin = System.currentTimeMillis();
        EList<EObject> result = new BasicEList<>();
        File propertyFile = new File(this.resourceName + "/allInstances.properties");
        if(propertyFile.exists()) {
            PropertiesConfiguration propertyConfiguration = new PropertiesConfiguration(propertyFile);
            List<Object> uriFragments = propertyConfiguration.getList(eClass.getName());
            if(uriFragments == null) {
                throw new RuntimeException("Cannot find EClass " + eClass.getName() + " in allInstances.properties");
            }
            for(Object uriFragment : uriFragments) {
                result.add(resource.getEObject((String) uriFragment));
            }
            
        }
        else {
            throw new RuntimeException("Cannot find allInstances.properties");
        }
        long end = System.currentTimeMillis();
        PrefetchMLLogger.info("Time to compute allInstances(): {0}ms", (end-begin));
        return result;
    }

}

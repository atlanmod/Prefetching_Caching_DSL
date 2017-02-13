package fr.inria.atlanmod.prefetchml.benchmarks;

import java.io.File;
import java.util.List;

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

import fr.inria.atlanmod.prefetchml.benchmarks.util.CdoBackend;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class AbstractTestCaseNoPrefetchCDO extends AbstractPrefetchTest {

    @SuppressWarnings("rawtypes")
    protected OCL ocl = null;
    @SuppressWarnings("rawtypes")
    protected OCLHelper oclHelper = null;

    protected CdoBackend cdoBackend;
    protected CDOResource resource;

    protected OCLExpression<EClassifier> expression = null;
    protected Query<EClassifier, EClass, EObject> query = null;

    public AbstractTestCaseNoPrefetchCDO(String resourceName, String scriptSuffix) {
        super(resourceName, scriptSuffix);
        cdoBackend = new CdoBackend();
    }

    @Before
    public void setUp() {
        Registry.INSTANCE.put(JavaPackage.eINSTANCE.getNsURI(), JavaPackage.eINSTANCE);
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

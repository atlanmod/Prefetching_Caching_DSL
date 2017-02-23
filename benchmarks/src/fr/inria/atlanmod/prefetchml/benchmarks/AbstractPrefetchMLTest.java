package fr.inria.atlanmod.prefetchml.benchmarks;

import static com.google.common.base.Preconditions.checkArgument;

import java.io.File;
import java.text.MessageFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.prefetchml.benchmarks.util.ModelCreator;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryExecutorUtil;
import fr.inria.atlanmod.prefetchml.benchmarks.util.ResourceUtil;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

/**
 * Abstract test case that registers {@link EPackage}s, creates the
 * {@link Resource} to benchmark, and generic methods to compute benchmark
 * queries.
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public abstract class AbstractPrefetchMLTest {

    /**
     * The literal representation of a NeoEMF/Graph resource type.
     */
    public static final String GRAPH_TYPE = "neo-graph";

    /**
     * The literal representation of a NeoEMF/Map resource type.
     */
    public static final String MAP_TYPE = "neo-map";

    /**
     * The literal representation of a CDO resource type.
     */
    public static final String CDO_TYPE = "cdo";
    
    /**
     * The location of the zip file containing the XMI files to extract.
     */
    private static final String XMI_ZIP_PATH = "db/resources.zip";
    
    /**
     * The location of the extracted XMI files.
     */
    private static final String XMI_EXTRACTED_PATH = "db/xmi";
    
    /**
     * The name of the resource to benchmark.
     */
    protected String resourceName;
    
    /**
     * The location of the file containing an XMI version of the model to
     * benchmark.
     */
    protected String xmiLocation;

    /**
     * The suffix used to identify the PrefetchML plan to use.
     */
    protected String scriptSuffix;

    /**
     * The type of the benchmarked resource.
     */
    protected String resourceType;

    /**
     * The {@link OCL} instance used to compute the queries.
     */
    @SuppressWarnings("rawtypes")
    private OCL ocl;

    /**
     * The {@link OCLHelper} used to create the queries.
     */
    @SuppressWarnings("rawtypes")
    private OCLHelper oclHelper;
    
    /**
     * The {@link Query} to compute against the benchmarked resource.
     */
    private Query<EClassifier, EClass, EObject> oclQuery;

    /**
     * The {@link Resource} to benchmark.
     */
    protected Resource resource;

//    /**
//     * The list of resources to benchmarks.
//     * <p>
//     * {@link Resource}s are provided using the following pattern:
//     * <resource_location>,<script_suffix>,<resource_type>.
//     */
//    protected static String[][] parameters = new String[][] {
//    // {"db/modisco.graph","Modisco",GRAPH_TYPE},
//    // {"db/jdt-core.graph","JDT",GRAPH_TYPE},
//    // {"db/jdt-core.mapdb", "JDT-MAP",MAP_TYPE}
//    // {"db/railway-repair-64.mapdb", "RAILWAY-MAP",MAP_TYPE}
//    // {"db/modisco.cdo","Modisco-CDO",CDO_TYPE}
//    { "db/jdt-core.cdo", "JDT-CDO", CDO_TYPE }
//    // {"db/railway-repair-64.cdo", "RAILWAY-CDO",CDO_TYPE}
//    };

    /**
     * The list of {@link EPackage}s used in the benchmarks.
     */
    private static List<EPackage> benchmarkEPackages = Arrays.asList(new EPackage[] {
            org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage.eINSTANCE,
            org.eclipse.gmt.modisco.pouet.cdo.java.JavaPackage.eINSTANCE,
            hu.bme.hit.trainbenchmark.railway.RailwayPackage.eINSTANCE,
            railway.RailwayPackage.eINSTANCE });

    /**
     * Constructs a new {@link AbstractPrefetchMLTest} with the given
     * {@code resourceName}, {@code scriptSuffix}, and {@code resourceType}.
     * 
     * @param resourceName
     *            the name of the {@link Resource} to benchmark
     * @param xmiLocation
     *            the location of the file containing a XMI version of the model
     *            to benchmark
     * @param scriptSuffix
     *            the suffix used to identify the PrefetchML plan to use
     * @param resourceType
     *            the type of the benchmarked {@link Resource}
     * 
     */
    public AbstractPrefetchMLTest(String resourceName, String xmiLocation, String scriptSuffix, String resourceType) {
        this.resourceName = resourceName;
        this.xmiLocation = xmiLocation;
        this.scriptSuffix = scriptSuffix;
        this.resourceType = resourceType;
    }

    /**
     * Checks if the databases required to execute the benchmarks are created,
     * and creates the missing ones if needed.
     * 
     * @throws Exception
     *             if an exception is thrown during database creation
     */
    public static void checkDatabases(Collection<String[]> resourceNames) throws Exception {
        PrefetchMLLogger.info("Checking databases");
        String[][] sNames = (String[][])resourceNames.toArray();
        for(int i = 0; i < sNames.length; i++) {
            File modelFile = new File(sNames[i][0]);
            checkArgument(sNames[i].length == 4, "Invalid collection provided, should contain "
                    + "4 elements/line, but found {0}", sNames[i].length);
            if(!modelFile.exists()) {
                /*
                 *  Need to do it here because AspectJ listener will trigger
                 *  events otherwise.
                 */
                registerBenchmarkEPackages();
                PrefetchMLLogger.info("Database {0} doesn't exist, creating it", sNames[i][0]);
                File xmiFile = new File(sNames[i][1]);
                
                if(!xmiFile.exists()) {
                    /*
                     * Cannot find the xmi file needed to construct the model, we have
                     * to extract it from the zip resource file (this will extract all the 
                     * models needed for all the benchmarks).
                     */
                    PrefetchMLLogger.info("Unzipping XMI models");
                    ModelCreator.unzip(XMI_ZIP_PATH, XMI_EXTRACTED_PATH);
                }
                
                switch(sNames[i][3]) {
                case GRAPH_TYPE:
                    ModelCreator.createNeoEMFModel(xmiFile, modelFile);
                    break;
                case MAP_TYPE:
                    ModelCreator.createNeoEMFMapModel(xmiFile, modelFile);
                    break;
                case CDO_TYPE:
                    ModelCreator.createCDOModel(xmiFile, modelFile);
                    break;
                default:
                    throw new IllegalArgumentException(MessageFormat
                            .format("Unknown resource type {0}", sNames[i][3]));
                }
            }
        }
        File xmiFolder = new File(XMI_EXTRACTED_PATH + "/resources");
        if(xmiFolder.exists()) {
            PrefetchMLLogger.info("Cleaning temporary files");
            /*
             * This may be false if the resource have been extracted and not
             * cleaned before.
             */
            File[] xmiContents = xmiFolder.listFiles();
            for (int i = 0; i < xmiContents.length; i++) {
                xmiContents[i].delete();
            }
            xmiFolder.delete();
            File xmiRoot = new File(XMI_EXTRACTED_PATH);
            xmiRoot.delete();
            PrefetchMLLogger.info("Done");
        }
    }

    /**
     * Registers the {@link EPackage}s used in the benchmarks, create the
     * {@link Resource} to benchmark and the OCL helpers needed to compute the
     * queries.
     * 
     * @throws Exception
     *             if the benchmarked resource cannot be created
     */
    @Before
    public void setUp() throws Exception {
        registerBenchmarkEPackages();
        resource = ResourceUtil.getResource(resourceName, resourceType);
    }

    /**
     * Provides the textual representation of the OCL {@link Query} to compute
     * against the {@link Resource}.
     * <p>
     * This method has to be overridden by concrete subclasses.
     * 
     * @return the textual representation of the OCL {@link Query}
     */
    protected abstract String getTextualQuery();

    /**
     * Provides the context of the OCL {@link Query} to compute against the
     * {@link Resource}.
     * <p>
     * This method has to be overridden by concrete subclasses.
     * 
     * @return the context of the OCL {@link Query}
     */
    protected abstract EClass getQueryContext();

    /**
     * Provides the input elements to compute the OCL {@link Query} from.
     * <p>
     * This method provides a default implementation that retrieves all the
     * instances of the OCL query context (see {@link #getQueryContext()}).
     * Overrides this method in concrete subclasses if a different behavior is
     * needed.
     * 
     * @return a {@link List} containing the elements to compute the OCL
     *         {@link Query} from
     * @throws Exception
     *             if the {@code allInstances()} computation fails
     */
    protected List<?> getQueryInput() throws Exception {
        return ResourceUtil.getAllInstances(getQueryContext(), resource, resourceName);
    }

    /**
     * Creates the OCL helpers used to build the queries and execute them.
     */
    private void createOCLHelpers() {
        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
        this.oclHelper = ocl.createOCLHelper();
    }
    
    /**
     * Creates an OCL {@link Query} from the 
     * @throws ParserException
     */
    @SuppressWarnings("unchecked")
    private void createOCLQuery() throws ParserException {
        oclHelper.setContext(getQueryContext());
        OCLExpression<EClassifier> oclExpression = oclHelper.createQuery(getTextualQuery());
        oclQuery = ocl.createQuery(oclExpression);
    }

    /**
     * Compute the OCL {@link Query} against the benchmarked {@link Resource}.
     * <p>
     * This method prints basic monitoring informations such as result size and
     * query execution time. To provide additional information see
     * {@link #beforeExecutingQuery()} and {@link #afterExecutingQuery()} hooks.
     * 
     * @param input
     *            the input elements of the query
     * @return a {@link List} containing query results
     */
    protected final List<Object> computeQuery(List<?> input) {
        beforeExecutingQuery();
        List<?> adaptedInput = adaptInput(input);
        QueryExecutorUtil.startTimer();
        @SuppressWarnings("unchecked")
        List<Object> results = (List<Object>) oclQuery.evaluate(adaptedInput);
        QueryExecutorUtil.stopTimer();
        afterExecutingQuery();
        List<Object> adaptedResults = adaptResult(results);
        PrefetchMLLogger.info("Done : {0}ms", QueryExecutorUtil.getElapsedTime());
        PrefetchMLLogger.info("Result contains {0} elements", QueryExecutorUtil.getFlattenedSize(adaptedResults));
        return results;
    }

    /**
     * A hook that enables subclasses to adapt the input element {@link List}
     * before executing the OCL {@link Query}.
     * <p>
     * <b>Note:</b> this method is executed before
     * {@link #beforeExecutingQuery()} and
     * {@link QueryExecutorUtil#startTimer()}.
     * 
     * @param input
     *            the input element {@link List} to adapt
     * @return a {@link List} containing the adapted elements
     */
    protected List<?> adaptInput(List<?> input) {
        return input;
    }

    /**
     * A hook that enables subclasses to adapt the result of the OCL
     * {@link Query}.
     * <p>
     * <b>Note:</b> this method is executed after {@link #afterExecutingQuery()}
     * and {@link QueryExecutorUtil#stopTimer()}.
     * 
     * @param result
     *            the result of the OCL {@link Query} to adapt
     * @return a {@link List} containing the adapted elements
     */
    protected List<Object> adaptResult(List<Object> result) {
        return result;
    }

    /**
     * A hook that enables subclasses to add query monitoring computation before
     * executing the OCL {@link Query}.
     * <p>
     * <b>Note:</b> this method is executed before
     * {@link QueryExecutorUtil#startTimer()}.
     */
    protected void beforeExecutingQuery() {
        // Do nothing, can be extended in subclasses to provide additional
        // monitoring informations.
    }

    /**
     * A hook that enables subclasses to add query monitoring computation after
     * executing the OCL {@link Query}.
     * <p>
     * <b>Note:</b> this method is executed after
     * {@link QueryExecutorUtil#stopTimer()}.
     */
    protected void afterExecutingQuery() {
        // Do nothing, can be extended in subclasses to provide additional
        // monitoring informations.
    }

    /**
     * Registers the EPackages used in the benchmark.
     */
    private static void registerBenchmarkEPackages() {
        for (EPackage ePackage : benchmarkEPackages) {
            Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
        }
    }
    
    @Test
    public void test() throws Exception {
        createOCLHelpers();
        
        createOCLQuery();
        PrefetchMLLogger.info("Execution #1");
        computeQuery(getQueryInput());
        
        // We need to recreate the OCL helpers and the query to clear OCL-level caches
        createOCLHelpers();
        createOCLQuery();
        PrefetchMLLogger.info("Execution #2");
        computeQuery(getQueryInput());
        
        ResourceUtil.closeResource(resource);
    }
    
}

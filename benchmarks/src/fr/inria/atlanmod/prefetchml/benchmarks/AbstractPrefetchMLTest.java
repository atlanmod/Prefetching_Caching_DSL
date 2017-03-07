package fr.inria.atlanmod.prefetchml.benchmarks;

import java.io.File;
import java.text.MessageFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.common.util.URI;
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

import fr.inria.atlanmod.prefetchml.benchmarks.strategy.PrefetchMLStrategy;
import fr.inria.atlanmod.prefetchml.benchmarks.strategy.PrefetchMLStrategyFactory;
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
    
    private final static String SCRIPT_FOLDER = "plans/bin/";
    
    private final static String SCRIPT_CACHE_LITERAL = "_C1_";
    
    private final static String SCRIPT_EXTENSION = ".prefetch.bin";
    
    private final static int GC_ITERATIONS = 10;
    
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
    private List<Query<EClassifier, EClass, EObject>> oclQueries;

    /**
     * The {@link Resource} to benchmark.
     */
    protected Resource resource;
    
    /**
     * The prefetching strategy to use (see {@link PrefetchMLStrategy}
     * subclasses).
     */
    protected PrefetchMLStrategy strategy;

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
        String strategyName = System.getProperty("strategy");
        PrefetchMLLogger.info("STRATEGY USED: {0}", strategyName);
        this.strategy = PrefetchMLStrategyFactory.createStrategy(strategyName);
    }

    /**
     * Checks if the databases required to execute the benchmarks are created,
     * and creates the missing ones if needed.
     * 
     * @throws Exception
     *             if an exception is thrown during database creation
     */
    public static void checkDatabase(String resourceName, String xmiLocation, String scriptSuffix, String resourceType) throws Exception {
        PrefetchMLLogger.info("Checking database {0}", resourceName);
        File modelFile = new File(resourceName);
        if(!modelFile.exists()) {
            /*
             *  Need to do it here because AspectJ listener will trigger
             *  events otherwise.
             */
            registerBenchmarkEPackages();
            PrefetchMLLogger.info("Database {0} doesn't exist, creating it", resourceName);
            File xmiFile = new File(xmiLocation);
            
            if(!xmiFile.exists()) {
                /*
                 * Cannot find the xmi file needed to construct the model, we have
                 * to extract it from the zip resource file (this will extract all the 
                 * models needed for all the benchmarks).
                 */
                PrefetchMLLogger.info("Unzipping XMI models");
                ModelCreator.unzip(XMI_ZIP_PATH, XMI_EXTRACTED_PATH);
            }
            
            switch(resourceType) {
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
                        .format("Unknown resource type {0}", resourceType));
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
    
    protected final URI getPlanURI() {
        return URI.createURI(SCRIPT_FOLDER + getPlanName() + SCRIPT_CACHE_LITERAL
                + scriptSuffix + SCRIPT_EXTENSION);
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
        checkDatabase(resourceName, xmiLocation, scriptSuffix,
                resourceType);
        resource = ResourceUtil.getResource(resourceName, resourceType);
    }

    public void tearDown() throws Exception {
        resource = null;
        for(int i = 0; i < GC_ITERATIONS; i++) {
            System.gc();
        }
    }

    /**
     * Provides the textual representation of the OCL {@link Query} to compute
     * against the {@link Resource}.
     * <p>
     * This method has to be overridden by concrete subclasses.
     * 
     * @return the textual representation of the OCL {@link Query}
     */
    protected abstract List<String> getTextualQueries();

    /**
     * Provides the context of the OCL {@link Query} to compute against the
     * {@link Resource}.
     * <p>
     * This method has to be overridden by concrete subclasses.
     * 
     * @return the context of the OCL {@link Query}
     */
    protected abstract List<EClass> getQueryContexts();

    /**
     * Provides the name of the PrefetchML plan associated to the OCL
     * {@link Query}.
     * <p>
     * This method has to be overriden by concrete subclasses even if the
     * {@link PrefetchMLStrategy} used to compute the query doesn't use
     * PrefetchML plans.
     * 
     * @return the name of the PrefetchML plan associated to the OCL
     *         {@link Query}
     */
    protected abstract String getPlanName();
    
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
    protected List<List<?>> getQueryInput() throws Exception {
        List<EClass> queryContexts = getQueryContexts();
        List<List<?>> result = new ArrayList<>();
        for(EClass e : queryContexts) {
            result.add(ResourceUtil.getAllInstances(e, resource, resourceName));
        }
        return result;
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
    private void createOCLQueries() throws ParserException {
        oclQueries = new ArrayList<>();
        List<EClass> queryContexts = getQueryContexts();
        List<String> textualQueries = getTextualQueries();
        
        for(int i = 0; i < queryContexts.size(); i++) {
            oclHelper.setContext(queryContexts.get(i));
            OCLExpression<EClassifier> oclExpression = oclHelper.createQuery(textualQueries.get(i));
            oclQueries.add(ocl.createQuery(oclExpression));
        }
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
    protected final List<List<Object>> computeQuery(List<List<?>> input) {
        strategy.beforeExecutingQueries();
        List<List<?>> adaptedInput = strategy.adaptInput(input);
        List<List<Object>> globalResults = new ArrayList<>();
        QueryExecutorUtil.startTimer();
        for(int i = 0; i < oclQueries.size(); i++) {
            PrefetchMLLogger.info("Computing {0}", oclQueries.get(i));
            PrefetchMLLogger.info("Input contains {0} elements", adaptedInput.get(i).size());
            globalResults.add((List<Object>) oclQueries.get(i).evaluate(adaptedInput.get(i)));
        }
        QueryExecutorUtil.stopTimer();
        strategy.afterExecutingQueries();
        List<List<Object>> adaptedResults = strategy.adaptResult(globalResults);
        PrefetchMLLogger.info("Done : {0}ms", QueryExecutorUtil.getElapsedTime());
        for(int i = 0; i < adaptedResults.size(); i++) {
            PrefetchMLLogger.info("Result contains {0} elements", QueryExecutorUtil.getFlattenedSize(adaptedResults.get(i)));
        }
        return adaptedResults;
    }

    /**
     * Registers the EPackages used in the benchmark.
     */
    private static void registerBenchmarkEPackages() {
        for (EPackage ePackage : benchmarkEPackages) {
            Registry.INSTANCE.put(ePackage.getNsURI(), ePackage);
        }
    }

    public void run() throws Exception {
        createOCLHelpers();
        
        createOCLQueries();
        PrefetchMLLogger.info("Execution #1");
        computeQuery(getQueryInput());
        
        // We need to recreate the OCL helpers and the query to clear OCL-level
        // caches
        createOCLHelpers();
        createOCLQueries();
        PrefetchMLLogger.info("Execution #2");
        computeQuery(getQueryInput());
        
        ResourceUtil.closeResource(resource);
    }
    
    @Test
    public void test() throws Exception {
        strategy.init(resource, getPlanURI());
        run();
    }
}

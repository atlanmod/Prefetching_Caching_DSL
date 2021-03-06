package fr.inria.atlanmod.prefetchml.benchmarks;

import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.resource.Resource;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

/**
 * Abstract test case used to execute Java-based queries on top of NeoEMF
 * <p>
 * This class is parameterized with all the NeoEMF-based java models used in the
 * benchmark.
 * <p>
 * <b>Note:</b> in the future {@link AbstractRailwayTestCDO} and
 * {@link AbstractRailwayTestNeoEMF} will be merged in an unique abstract test
 * {@code AbstractRailwayTest}.
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
@RunWith(Parameterized.class)
public abstract class AbstractRailwayTestCDO extends AbstractPrefetchMLTest { 
    
    /**
     * The list of resources to benchmarks.
     * <p>
     * {@link Resource}s are provided using the following pattern:
     * <resource_location>,<xmi_location>,<script_suffix>,<resource_type>.
     */
    protected static String[][] parameters = new String[][] {
        {"db/railway-repair-64.cdo", "db/xmi/resources/railway-repair-64.cdo.xmi", "RAILWAY-CDO",CDO_TYPE} };

    /**
     * Provides tests' parameters to JUnit.
     * 
     * @return the elements in the {@code parameters} array wrapped in a
     *         {@link Collection}
     */
    @Parameters
    public static Collection<String[]> resourceNames() {
        return Arrays.asList(parameters);
    }

    /**
     * Constructs a new {@link AbstractRailwayTestCDO} with the given
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
    public AbstractRailwayTestCDO(String resourceName, String xmiLocation, String scriptSuffix, String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }

}

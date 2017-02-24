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
 * <b>Note:</b> in the future {@link AbstractJavaTestNeoEMF} and
 * {@link AbstractJavaTestCDO} will be merged in an unique abstract test
 * {@code AbstractJavaTest}.
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
@RunWith(Parameterized.class)
public abstract class AbstractJavaTestNeoEMF extends AbstractPrefetchMLTest { 
    
    /**
     * The list of resources to benchmarks.
     * <p>
     * {@link Resource}s are provided using the following pattern:
     * <resource_location>,<xmi_location>,<script_suffix>,<resource_type>.
     */
    protected static String[][] parameters = new String[][] {
            { "db/modisco.graph", "db/xmi/resources/org.eclipse.gmt.modisco.java.kyanos.xmi", "Modisco", GRAPH_TYPE },
//            { "db/jdt-core.graph", "db/xmi/resources/org.eclipse.jdt.core.xmi", "JDT", GRAPH_TYPE },
//            { "db/jdt-core.mapdb", "db/xmi/resources/org.eclipse.jdt.core.xmi", "JDT-MAP", MAP_TYPE } 
            };

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
     * Constructs a new {@link AbstractJavaTestNeoEMF} with the given
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
    public AbstractJavaTestNeoEMF(String resourceName, String xmiLocation, String scriptSuffix, String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }
}

package fr.inria.atlanmod.prefetchml.benchmarks;

import org.eclipse.emf.ecore.resource.Resource;

/**
 * Generic test case used to execute java-based queries on top of CDO without
 * prefetching.
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public abstract class NoPrefetchJavaTestCDO extends AbstractJavaTestCDO { 

    /**
     * Constructs a new {@link NoPrefetchJavaTestCDO} with the given
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
    public NoPrefetchJavaTestCDO(String resourceName, String xmiLocation, String scriptSuffix, String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }

}

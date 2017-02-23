package fr.inria.atlanmod.prefetchml.benchmarks.noprefetch.railway.cdo;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import railway.RailwayPackage;
import fr.inria.atlanmod.prefetchml.benchmarks.NoPrefetchRailwayTestCDO;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryUtil;

/**
 * Computes {@code ConnectedSegments} query on all the railway-based models stored in
 * a CDO resource. Prefetching is disabled.
 * <p>
 * The following OCL query is executed over each {@code Sensor} model element:
 * 
 * <pre>
 * {@code
 * self.monitors
 *     ->collect(segment1 | segment1.connectsTo
 *         ->select(segment2 | segment2.monitoredBy
 *             ->includes(self)))
 * }
 * </pre>
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public class ConnectedSegmentsTestNoPrefetchCDO extends NoPrefetchRailwayTestCDO {

    /**
     * Constructs a new {@link ConnectedSegmentsTestNoPrefetchCDO} with the given
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
	public ConnectedSegmentsTestNoPrefetchCDO(String resourceName, String xmiLocation,
            String scriptSuffix, String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }
	
	@Override
	protected EClass getQueryContext() {
	    return RailwayPackage.eINSTANCE.getSensor();
	}
	
	@Override
	protected String getTextualQuery() {
	    return QueryUtil.getConnectedSegmentsQuery();
	}
}

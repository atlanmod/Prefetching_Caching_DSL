package fr.inria.atlanmod.prefetchml.benchmarks.railway.neoemf;

import hu.bme.hit.trainbenchmark.railway.RailwayPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractRailwayTestNeoEMF;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryUtil;

/**
 * Computes {@code RouteSensors} query on all the railway-based models stored in
 * a NeoEMF resource.
 * <p>
 * The following OCL query is executed over each {@code Sensor} model element:
 * 
 * <pre>
 * {@code
 * self.follows->collect(
 *     swP | swP.target->collect(
 *         sw | sw.monitoredBy->select(
 *             sensor | self.gathers->excludes(sensor)
 *         )
 *     )
 * )
 * }
 * </pre>
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public class RouteSensorsNeoEMF extends AbstractRailwayTestNeoEMF {

    private static final String SCRIPT_NAME = "RouteSensorsRailway";

    /**
     * Constructs a new {@link RouteSensorsNeoEMF} with the given
     * {@code resourceName}, {@code xmiLocation}, {@code scriptSuffix}, and
     * {@code resourceType}.
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
    public RouteSensorsNeoEMF(String resourceName, String xmiLocation,
            String scriptSuffix, String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }

    @Override
    protected EClass getQueryContext() {
        return RailwayPackage.eINSTANCE.getRoute();
    }

    @Override
    protected String getTextualQuery() {
        return QueryUtil.getRouteSensorsQuery();
    }

    @Override
    protected String getPlanName() {
        return SCRIPT_NAME;
    }
}

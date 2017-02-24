package fr.inria.atlanmod.prefetchml.benchmarks.railway.neoemf;

import hu.bme.hit.trainbenchmark.railway.RailwayPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractRailwayTestNeoEMF;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryUtil;

/**
 * Computes {@code SemaphoreNeighbor} query on all the railway-based models
 * stored in a NeoEMF resource.
 * <p>
 * The following OCL query is executed over each {@code Sensor} model element:
 * 
 * <pre>
 * {@code
 * self.exit->collect(
 *     semaphore | self.gathers->collect(
 *         sensor1 | sensor1.monitors->collect(
 *             te1 | te1.connectsTo->collect(
 *                 te2 | te2.monitoredBy->collect(
 *                     sensor2 | Route.allInstances()->select(
 *                         route2 | route2.gathers->includes(sensor2) and
 *                         route2.entry->excludes(semaphore) and
 *                         self <> route2
 *                     )
 *                 )
 *             )
 *         )
 *     )
 * )
 * }
 * </pre>
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public class SemaphoreNeighborNeoEMF extends AbstractRailwayTestNeoEMF {

    /**
     * Constructs a new {@link SemaphoreNeighborNeoEMF} with the given
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
    public SemaphoreNeighborNeoEMF(String resourceName, String xmiLocation,
            String scriptSuffix, String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }

    @Override
    protected EClass getQueryContext() {
        return RailwayPackage.eINSTANCE.getRoute();
    }

    @Override
    protected String getTextualQuery() {
        return QueryUtil.getSemaphoreNeighborQuery();
    }

    @Override
    protected String getPlanName() {
        // TODO Auto-generated method stub
        return null;
    }

}

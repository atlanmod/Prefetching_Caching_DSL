package fr.inria.atlanmod.prefetchml.benchmarks.railway.cdo;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import railway.RailwayPackage;
import fr.inria.atlanmod.prefetchml.benchmarks.AbstractRailwayTestCDO;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryUtil;

/**
 * Computes {@code SemaphoreNeighbor} query on all the railway-based models
 * stored in a CDO resource.
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
public class SemaphoreNeighborCDO extends AbstractRailwayTestCDO {

    /**
     * Constructs a new {@link SemaphoreNeighborCDO} with the
     * given {@code resourceName}, {@code xmiLocation}, {@code scriptSuffix},
     * and {@code resourceType}.
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
    public SemaphoreNeighborCDO(String resourceName, String xmiLocation,
            String scriptSuffix, String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }

    @Override
    protected List<EClass> getQueryContexts() {
        return Arrays.asList(new EClass[]{RailwayPackage.eINSTANCE.getRoute()});
    }

    @Override
    protected List<String> getTextualQueries() {
        return Arrays.asList(new String[]{QueryUtil.getSemaphoreNeighborQuery()});
    }

    @Override
    protected String getPlanName() {
        return null;
    }
}

package fr.inria.atlanmod.prefetchml.benchmarks.railway.neoemf;

import hu.bme.hit.trainbenchmark.railway.RailwayPackage;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractRailwayTestNeoEMF;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryUtil;

/**
 * Computes {@code ConnectedSegments} query on all the railway-based models
 * stored in a NeoEMF resource.
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
public class ConnectedSegmentsNeoEMF extends AbstractRailwayTestNeoEMF {

    private static final String SCRIPT_NAME = "CollectRailway";

    /**
     * Constructs a new {@link ConnectedSegmentsNeoEMF} with the given
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
    public ConnectedSegmentsNeoEMF(String resourceName, String xmiLocation,
            String scriptSuffix, String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }

    @Override
    protected List<EClass> getQueryContexts() {
        return Arrays.asList(new EClass[]{RailwayPackage.eINSTANCE.getSensor()});
    }

    @Override
    protected List<String> getTextualQueries() {
        return Arrays.asList(new String[]{QueryUtil.getConnectedSegmentsQuery()});
    }

    @Override
    protected String getPlanName() {
        return SCRIPT_NAME;
    }
}

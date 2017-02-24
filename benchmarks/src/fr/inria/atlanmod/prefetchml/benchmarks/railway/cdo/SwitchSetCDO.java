package fr.inria.atlanmod.prefetchml.benchmarks.railway.cdo;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;

import railway.RailwayPackage;
import fr.inria.atlanmod.prefetchml.benchmarks.AbstractRailwayTestCDO;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryUtil;

/**
 * Computes {@code SwitchSet} query on all the railway-based models stored in a
 * CDO resource.
 * <p>
 * The following OCL query is executed over each {@code Sensor} model element:
 * 
 * <pre>
 * {@code
 * self.entry->select(signal = Signal::GO)->collect(
 *     semaphore | self.follows->collect(
 *         swP | swP.target->select(sw | sw.currentPosition <> swP.position)
 *     )
 * )
 * }
 * </pre>
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public class SwitchSetCDO extends AbstractRailwayTestCDO {

    /**
     * Constructs a new {@link SwitchSetCDO} with the given
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
    public SwitchSetCDO(String resourceName, String xmiLocation,
            String scriptSuffix, String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }

    @Override
    protected EClass getQueryContext() {
        return RailwayPackage.eINSTANCE.getRoute();
    }

    @Override
    protected String getTextualQuery() {
        return QueryUtil.getSwitchSetQuery();
    }

    @Override
    protected String getPlanName() {
        return null;
    }
}

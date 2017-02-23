package fr.inria.atlanmod.prefetchml.benchmarks.noprefetch.java.cdo;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.pouet.cdo.java.JavaPackage;

import fr.inria.atlanmod.prefetchml.benchmarks.NoPrefetchJavaTestCDO;
import fr.inria.atlanmod.prefetchml.benchmarks.NoPrefetchJavaTestNeoEMF;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryUtil;

/**
 * Computes {@code BlockStatement} query on all the java-based models stored in
 * a CDO resource. Prefetching is disabled.
 * <p>
 * The following OCL query is executed over each {@code Block} model element:
 * 
 * <pre>
 * {@code
 * self.statements
 * }
 * </pre>
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public class BlockStatementTestNoPrefetchCDO extends NoPrefetchJavaTestCDO {

    /**
     * Constructs a new {@link BlockStatementTestNoPrefetchCDO} with the given
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
	public BlockStatementTestNoPrefetchCDO(String resourceName, String xmiLocation, String scriptSuffix, String resourceType) {
		super(resourceName, xmiLocation, scriptSuffix, resourceType);
	}
	
	@Override
	protected EClass getQueryContext() {
	    return JavaPackage.eINSTANCE.getBlock();
	}
	
	@Override
	protected String getTextualQuery() {
	    return QueryUtil.getBlockStatementsQuery();
	}
	
}

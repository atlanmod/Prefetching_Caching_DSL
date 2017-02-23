package fr.inria.atlanmod.prefetchml.benchmarks.emf.prefetch.java.cdo;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.pouet.cdo.java.JavaPackage;

import fr.inria.atlanmod.prefetchml.benchmarks.EMFPrefetchJavaTestCDO;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryUtil;

/**
 * Computes {@code TypeToUnit} query on all the java-based models stored in a
 * CDO resource. Prefetching is disabled.
 * <p>
 * The following OCL query is executed over each {@code AbstractTypeDeclaration}
 * model element:
 * 
 * <pre>
 * {@code
 * if(not(self.originalCompilationUnit.oclIsUndefined())) then
 *     let res : Set(ASTNode) = self.originalCompilationUnit.imports in 
 *         res->union(self.originalCompilationUnit.comments)
 *         ->union(self.comments)
 *         ->union(self.commentsBeforeBody)
 *         ->union(self.commentsAfterBody)
 * else
 *     Set(ASTNode){}
 * endif
 * }
 * </pre>
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public class TypeToUnitPrefetchEMFCDO extends EMFPrefetchJavaTestCDO {

    private static final String SCRIPT_NAME = "Q1";
    
    /**
     * Constructs a new {@link TypeToUnitPrefetchEMFCDO} with the given
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
    public TypeToUnitPrefetchEMFCDO(String resourceName, String xmiLocation, String scriptSuffix,
            String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }
    
    @Override
    protected EClass getQueryContext() {
        return JavaPackage.eINSTANCE.getAbstractTypeDeclaration();
    }
    
    @Override
    protected String getTextualQuery() {
        return QueryUtil.getTypeToUnitQuery();
    }
    
    @Override
    protected String getScriptName() {
        return SCRIPT_NAME;
    }

}

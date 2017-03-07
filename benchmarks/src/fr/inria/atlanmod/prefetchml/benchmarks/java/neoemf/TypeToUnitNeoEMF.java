package fr.inria.atlanmod.prefetchml.benchmarks.java.neoemf;

import java.util.Arrays;
import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractJavaTestNeoEMF;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryUtil;

/**
 * Computes {@code TypeToUnit} query on all the java-based models stored in a
 * NeoEMF resource.
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
public class TypeToUnitNeoEMF extends AbstractJavaTestNeoEMF {

    private static final String SCRIPT_NAME = "Q1";

    /**
     * Constructs a new {@link TypeToUnitNeoEMF} with the given
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
    public TypeToUnitNeoEMF(String resourceName, String xmiLocation, String scriptSuffix,
            String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }

    @Override
    protected List<EClass> getQueryContexts() {
        return Arrays.asList(new EClass[]{JavaPackage.eINSTANCE.getAbstractTypeDeclaration()});
    }

    @Override
    protected List<String> getTextualQueries() {
        return Arrays.asList(new String[]{QueryUtil.getTypeToUnitQuery()});
    }

    @Override
    protected String getPlanName() {
        return SCRIPT_NAME;
    }
}

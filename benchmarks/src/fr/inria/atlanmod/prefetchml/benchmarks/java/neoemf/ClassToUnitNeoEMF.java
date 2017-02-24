package fr.inria.atlanmod.prefetchml.benchmarks.java.neoemf;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractJavaTestNeoEMF;
import fr.inria.atlanmod.prefetchml.benchmarks.util.QueryUtil;

/**
 * Computes {@code ClassToUnit} query on all the java-based models stored in a
 * NeoEMF resource.
 * <p>
 * The following OCL query is executed over each {@code ClassDeclaration} model
 * element:
 * 
 * <pre>
 * {@code
 * if(self.typeParameters->size() = 0) then
 *     if(not(self.originalCompilationUnit.oclIsUndefined())) then 
 *         let res : Set(ASTNode) = self.originalCompilationUnit.imports in 
 *             res->union(self.originalCompilationUnit.comments)
 *             ->union(self.comments)
 *             ->union(self.commentsBeforeBody)
 *             ->union(self.commentsAfterBody)
 *             ->union(self.bodyDeclarations->select(e | e.oclIsTypeOf(FieldDeclaration)) 
 *                 ->collect(f |
 *                     if(f.oclAsType(AbstractVariablesContainer).fragments->size() = 0) then
 *                         null
 *                     else
 *                         f.oclAsType(AbstractVariablesContainer).fragments
 *                     endif
 *                 )->oclAsSet()->flatten())
 *             ->union(self.bodyDeclarations->select(e | not(e.oclIsTypeOf(FieldDeclaration))))
 *             ->including(self.modifier)
 *             ->including(self.superClass)
 *     else
 *         Set(ASTNode){}
 *     endif
 * else
 *     Set(ASTNode){}
 * endif 
 * }
 * </pre>
 * 
 * @author Gwendal DANIEL (AtlanMod Team)
 *
 */
public class ClassToUnitNeoEMF extends AbstractJavaTestNeoEMF {

    private static final String SCRIPT_NAME = "Q2";

    /**
     * Constructs a new {@link ClassToUnitNeoEMF} with the given
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
    public ClassToUnitNeoEMF(String resourceName, String xmiLocation, String scriptSuffix,
            String resourceType) {
        super(resourceName, xmiLocation, scriptSuffix, resourceType);
    }

    @Override
    protected EClass getQueryContext() {
        return JavaPackage.eINSTANCE.getClassDeclaration();
    }

    @Override
    protected String getTextualQuery() {
        return QueryUtil.getClassToUnitQuery();
    }

    @Override
    protected String getPlanName() {
        return SCRIPT_NAME;
    }
}

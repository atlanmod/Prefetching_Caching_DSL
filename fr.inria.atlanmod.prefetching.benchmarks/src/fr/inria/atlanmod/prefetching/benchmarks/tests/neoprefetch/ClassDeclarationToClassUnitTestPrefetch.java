package fr.inria.atlanmod.prefetching.benchmarks.tests.neoprefetch;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;
import org.eclipse.ocl.OCL;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.expressions.OCLExpression;
import org.eclipse.ocl.helper.OCLHelper;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.neoemf.datastore.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.graph.blueprints.datastore.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.graph.prefetch.datastore.estores.impl.PrefetchingDirectWriteBlueprintsResourceEStoreImpl;
import fr.inria.atlanmod.neoemf.graph.blueprints.neo4j.resources.BlueprintsNeo4jResourceOptions;
import fr.inria.atlanmod.neoemf.graph.blueprints.resources.BlueprintsResourceOptions;
import fr.inria.atlanmod.neoemf.graph.blueprints.util.NeoBlueprintsURI;
import fr.inria.atlanmod.neoemf.resources.PersistentResource;
import fr.inria.atlanmod.neoemf.resources.PersistentResourceOptions;
import fr.inria.atlanmod.neoemf.resources.impl.PersistentResourceFactoryImpl;
import fr.inria.atlanmod.neoemf.resources.impl.PersistentResourceImpl;
import fr.inria.atlanmod.prefetching.benchmarks.tests.AbstractTestCasePrefetch;

public class ClassDeclarationToClassUnitTestPrefetch extends AbstractTestCasePrefetch {
	
	public ClassDeclarationToClassUnitTestPrefetch(String resourceName) {
		super(resourceName);
	}

	protected String textualQuery;
	protected EClass eContext;
	
    @Before
    public void setUp() {
    	super.setUp();
    	eContext = JavaPackage.eINSTANCE.getClassDeclaration();
        oclHelper.setContext(eContext);
        try {
        	textualQuery = ""
        			+ "if(self.typeParameters->size() = 0) then "
        			+ "	if(not(self.originalCompilationUnit.oclIsUndefined())) then "
        			+ "		let res : Set(ASTNode) = self.originalCompilationUnit.imports in "
        			+ "			res->union(self.originalCompilationUnit.comments) "
        			+ "			->union(self.comments) "
        			+ "			->union(self.commentsBeforeBody) "
        			+ "			->union(self.commentsAfterBody) "
        			+ "			->union(self.bodyDeclarations->select(e | e.oclIsTypeOf(FieldDeclaration)) "
        			+ "				->collect( f |  "
        			+ "					if(f.oclAsType(AbstractVariablesContainer).fragments->size() = 0) then "
        			+ "						null "
        			+ "					else "
        			+ "						f.oclAsType(AbstractVariablesContainer).fragments "
        			+ "					endif "
        			+ "				)->oclAsSet()->flatten())"
        			+ "			->union(self.bodyDeclarations->select(e | not(e.oclIsTypeOf(FieldDeclaration)))) "
        			+ "			->including(self.modifier) "
        			+ "			->including(self.superClass) "
        			+ "	else "
        			+ "		Set(ASTNode){} "
        			+ "	endif "
        			+ "else "
        			+ "	Set(ASTNode){} "
        			+ "endif";
            expression = oclHelper.createQuery(textualQuery);
        } catch (ParserException e) {
            e.printStackTrace();
        }
        this.query = ocl.createQuery(expression);
    }
    
    @Override
    protected String getScriptString() {
    	return "plans/Q2.prefetch.bin";
    }
    
    @Test
    public void compilTypesUsages() {
    	try {
    		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
    		System.out.println(this.getClass().getName());
    		EList<EObject> classDeclarations = resource.getAllInstances(eContext);
    		System.out.println("input size = " + classDeclarations.size());
			long begin = System.currentTimeMillis();
			System.out.println("Q1(1)");
	        @SuppressWarnings("unused")
			Object res = query.evaluate(classDeclarations);
	        long end = System.currentTimeMillis();       
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + pStore.hitCount);
	        System.out.println("Misses - " + pStore.missCount);
	        pStore.hitCount = 0;
	        pStore.missCount = 0;
	        
	        System.out.println("Q2");
	        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	        this.oclHelper = ocl.createOCLHelper();
	        oclHelper.setContext(eContext);
	        try {
	            expression = oclHelper.createQuery(textualQuery);
	        } catch (ParserException e) {
	            e.printStackTrace();
	        }
	        this.query = ocl.createQuery(expression);
	        begin = System.currentTimeMillis();
	        Object res2 = query.evaluate(classDeclarations);
	        end = System.currentTimeMillis();
	        System.out.println("Done : " + (end-begin) + "ms");
	        System.out.println("Hits - " + pStore.hitCount);
	        System.out.println("Misses - " + pStore.missCount);
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
			PersistentResourceImpl.shutdownWithoutUnload((PersistentResourceImpl)resource);
    	}
    }
}

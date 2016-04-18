package fr.inria.atlanmod.prefetching.benchmarks.tests.emfprefetch;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	BlockToBlockUnitTestPrefetchEMF.class,
	ClassDeclarationToClassUnitTestPrefetchEMF.class,
	CompilationUnitImportsCommentsTestPrefetchEMF.class 
	})
public class EMFTestSuite {

}

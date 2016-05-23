package fr.inria.atlanmod.prefetching.benchmarks.tests.neoprefetch;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	BlockToBlockUnitTestPrefetch.class,
	ClassDeclarationToClassUnitTestPrefetch.class,
	CompilationUnitImportsCommentsTestPrefetch.class 
	})
public class NeoPrefetchTestSuite {

}

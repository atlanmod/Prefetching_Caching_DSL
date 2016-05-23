package fr.inria.atlanmod.prefetching.benchmarks.tests.noprefetch;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	BlockToBlockUnitTestNoPrefetch.class,
	ClassDeclarationToClassUnitTestNoPrefetch.class,
	CompilationUnitImportsCommentsTestNoPrefetch.class 
	})
public class NoPrefetchTestSuite {

}

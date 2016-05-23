package fr.inria.atlanmod.prefetching.benchmarks.tests.neoprefetch.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.inria.atlanmod.prefetching.benchmarks.tests.neoprefetch.BlockStatementTestPrefetch;
import fr.inria.atlanmod.prefetching.benchmarks.tests.neoprefetch.ClassToUnitTestPrefetch;
import fr.inria.atlanmod.prefetching.benchmarks.tests.neoprefetch.TypeToUnitTestPrefetch;

@RunWith(Suite.class)
@SuiteClasses({ 
	BlockStatementTestPrefetch.class,
	ClassToUnitTestPrefetch.class,
	TypeToUnitTestPrefetch.class 
	})
public class NeoPrefetchTestSuite {

}

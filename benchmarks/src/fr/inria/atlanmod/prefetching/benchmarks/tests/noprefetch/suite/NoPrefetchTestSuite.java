package fr.inria.atlanmod.prefetching.benchmarks.tests.noprefetch.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.inria.atlanmod.prefetching.benchmarks.tests.noprefetch.BlockStatementTestNoPrefetch;
import fr.inria.atlanmod.prefetching.benchmarks.tests.noprefetch.ClassToUnitTestNoPrefetch;
import fr.inria.atlanmod.prefetching.benchmarks.tests.noprefetch.TypeToUnitTestNoPrefetch;

@RunWith(Suite.class)
@SuiteClasses({ 
	BlockStatementTestNoPrefetch.class,
	ClassToUnitTestNoPrefetch.class,
	TypeToUnitTestNoPrefetch.class 
	})
public class NoPrefetchTestSuite {

}

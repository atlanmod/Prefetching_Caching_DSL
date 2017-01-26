package fr.inria.atlanmod.prefetchml.benchmarks.prefetch.neoemf;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	BlockStatementTestPrefetch.class,
	ClassToUnitTestPrefetch.class,
	TypeToUnitTestPrefetch.class 
	})
public class NeoPrefetchTestSuite {

}

package fr.inria.atlanmod.prefetchml.benchmarks.noprefetch;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	BlockStatementTestNoPrefetch.class,
	ClassToUnitTestNoPrefetch.class,
	TypeToUnitTestNoPrefetch.class 
	})
public class NoPrefetchTestSuite {

}

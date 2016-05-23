package fr.inria.atlanmod.prefetching.benchmarks.tests.emfprefetch.suite;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.inria.atlanmod.prefetching.benchmarks.tests.emfprefetch.BlockStatementTestPrefetchEMF;
import fr.inria.atlanmod.prefetching.benchmarks.tests.emfprefetch.ClassToUnitTestPrefetchEMF;
import fr.inria.atlanmod.prefetching.benchmarks.tests.emfprefetch.TypeToUnitPrefetchEMF;

@RunWith(Suite.class)
@SuiteClasses({ 
	BlockStatementTestPrefetchEMF.class,
	ClassToUnitTestPrefetchEMF.class,
	TypeToUnitPrefetchEMF.class 
	})
public class EMFTestSuite {

}

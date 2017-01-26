package fr.inria.atlanmod.prefetching.benchmarks.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.inria.atlanmod.prefetching.benchmarks.tests.emfprefetch.suite.EMFTestSuite;
import fr.inria.atlanmod.prefetching.benchmarks.tests.neoprefetch.suite.NeoPrefetchTestSuite;
import fr.inria.atlanmod.prefetching.benchmarks.tests.noprefetch.suite.NoPrefetchTestSuite;

@RunWith(Suite.class)
@SuiteClasses({
	NoPrefetchTestSuite.class,
	EMFTestSuite.class,
	NeoPrefetchTestSuite.class
})
public class AllTests {

}

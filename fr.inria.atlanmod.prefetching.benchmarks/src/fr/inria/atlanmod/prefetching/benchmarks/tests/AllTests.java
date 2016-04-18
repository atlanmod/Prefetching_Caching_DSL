package fr.inria.atlanmod.prefetching.benchmarks.tests;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.inria.atlanmod.prefetching.benchmarks.tests.emfprefetch.EMFTestSuite;
import fr.inria.atlanmod.prefetching.benchmarks.tests.neoprefetch.NeoPrefetchTestSuite;
import fr.inria.atlanmod.prefetching.benchmarks.tests.noprefetch.NoPrefetchTestSuite;

@RunWith(Suite.class)
@SuiteClasses({
	NoPrefetchTestSuite.class,
	EMFTestSuite.class,
	NeoPrefetchTestSuite.class
})
public class AllTests {

}

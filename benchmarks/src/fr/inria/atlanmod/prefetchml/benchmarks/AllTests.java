package fr.inria.atlanmod.prefetchml.benchmarks;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import fr.inria.atlanmod.prefetchml.benchmarks.noprefetch.NoPrefetchTestSuite;
import fr.inria.atlanmod.prefetchml.benchmarks.prefetch.emf.EMFTestSuite;
import fr.inria.atlanmod.prefetchml.benchmarks.prefetch.neoemf.NeoPrefetchTestSuite;

@RunWith(Suite.class)
@SuiteClasses({
	NoPrefetchTestSuite.class,
	EMFTestSuite.class,
	NeoPrefetchTestSuite.class
})
public class AllTests {

}

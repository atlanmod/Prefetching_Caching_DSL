package fr.inria.atlanmod.prefetchml.benchmarks.prefetch.emf;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ 
	BlockStatementTestPrefetchEMF.class,
	ClassToUnitTestPrefetchEMF.class,
	TypeToUnitPrefetchEMF.class 
	})
public class EMFTestSuite {

}

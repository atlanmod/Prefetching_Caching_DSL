package fr.inria.atlanmod.prefetching.benchmarks.tests;

import java.util.Arrays;
import java.util.Collection;

import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AbstractPrefetchTest {

	protected String resourceName;
	
	private static String[][] parameters = new String[][]{
		{"db/modisco.graph"},
		{"db/jdt-core.graph"}
		};
	
    @Parameters
    public static Collection<String[]> resourceNames() {
        return Arrays.asList(parameters);
    }
    
    public AbstractPrefetchTest(String resourceName) {
    	this.resourceName = resourceName;
    }

}

package fr.inria.atlanmod.prefetchml.benchmarks;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collection;

import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.gmt.modisco.java.neoemf.meta.JavaPackage;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import fr.inria.atlanmod.prefetchml.benchmarks.util.ModelCreator;


@RunWith(Parameterized.class)
public class AbstractPrefetchTest {

	protected String resourceName;
	protected String scriptSuffix;
	
	protected static String[][] parameters = new String[][]{
		{"db/modisco.graph","Modisco"},
		{"db/jdt-core.graph","JDT"}
		};
	
    @Parameters
    public static Collection<String[]> resourceNames() {
        return Arrays.asList(parameters);
    }
    
    public AbstractPrefetchTest(String resourceName, String scriptSuffix) {
    	this.resourceName = resourceName;
    	this.scriptSuffix = scriptSuffix;
    }
    
    @BeforeClass
    public static void setUpBeforeClass() {
        Registry.INSTANCE.put(JavaPackage.eINSTANCE.getNsURI(), JavaPackage.eINSTANCE);
    	System.out.println("Checking databases");
    	File modelFile = new File(parameters[0][0]);
    	if(!modelFile.exists()) {
    		System.out.println("Databases can not be found, creating them");
    		try {
    			System.out.println("Unzipping XMI models");
				ModelCreator.unzip("db/resources.zip", "db/xmi");
				System.out.println("Creating modisco.graph");
				ModelCreator.createNeoEMFModel(
						new File("db/xmi/resources/org.eclipse.gmt.modisco.java.kyanos.xmi"), 
						new File("db/modisco.graph"));
				System.out.println("Creating jdt-core.graph");
				ModelCreator.createNeoEMFModel(
						new File("db/xmi/resources/org.eclipse.jdt.core.xmi"), 
						new File("db/jdt-core.graph"));
				System.out.println("Cleaning temp files");
				File xmiFolder = new File("db/xmi/resources");
				File[] xmiContents = xmiFolder.listFiles();
				for(int i = 0; i < xmiContents.length; i++) {
					xmiContents[i].delete();
				}
				xmiFolder.delete();
				File xmiRoot = new File("db/xmi/");
				xmiRoot.delete();
			} catch (IOException e) {
				e.printStackTrace();
			}
    	}
    }

}

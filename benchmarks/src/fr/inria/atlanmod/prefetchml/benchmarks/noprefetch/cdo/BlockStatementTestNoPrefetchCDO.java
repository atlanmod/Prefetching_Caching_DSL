package fr.inria.atlanmod.prefetchml.benchmarks.noprefetch.cdo;

import java.io.File;
import java.util.List;

import org.apache.commons.configuration.ConfigurationException;
import org.apache.commons.configuration.PropertiesConfiguration;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.gmt.modisco.pouet.cdo.java.JavaPackage;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCaseNoPrefetchCDO;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class BlockStatementTestNoPrefetchCDO extends AbstractTestCaseNoPrefetchCDO {

	public BlockStatementTestNoPrefetchCDO(String resourceName, String scriptSuffix) {
		super(resourceName, scriptSuffix);
	}

	protected String textualQuery;
	protected EClass eContext;
	
    @SuppressWarnings("unchecked")
	@Before
    public void setUp() {
    	super.setUp();
    	eContext = JavaPackage.eINSTANCE.getBlock();
        oclHelper.setContext(eContext);
        try {
        	textualQuery = ""
        			+ "self.statements";
            expression = oclHelper.createQuery(textualQuery);
        } catch (ParserException e) {
            e.printStackTrace();
        }
        this.query = ocl.createQuery(expression);
    }
    
    @SuppressWarnings("unchecked")
	@Test
    public void testBlockStatement() {
    	try {
    	    PrefetchMLLogger.info(this.getClass().getName());
	        EList<EObject> blocks = getAllInstances(resource, JavaPackage.eINSTANCE.getBlock());
	        PrefetchMLLogger.info("Input size: " + blocks.size());
	        
			PrefetchMLLogger.info("Q1");
			computeQuery(query, blocks);

	        PrefetchMLLogger.info("Q2");
	        this.ocl = OCL.newInstance(EcoreEnvironmentFactory.INSTANCE);
	        this.oclHelper = ocl.createOCLHelper();
	        oclHelper.setContext(eContext);
	        try {
	            expression = oclHelper.createQuery(textualQuery);
	        } catch (ParserException e) {
	            e.printStackTrace();
	        }
	        this.query = ocl.createQuery(expression);
	        computeQuery(query, blocks);
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
    	    cdoBackend.unload(resource);
//    	    resource.close();
    	}
    }
}

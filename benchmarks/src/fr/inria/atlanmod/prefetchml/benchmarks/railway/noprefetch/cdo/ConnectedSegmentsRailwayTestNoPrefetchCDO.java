package fr.inria.atlanmod.prefetchml.benchmarks.railway.noprefetch.cdo;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.gmt.modisco.pouet.cdo.java.JavaPackage;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.junit.Before;
import org.junit.Test;

import railway.RailwayPackage;
import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCaseNoPrefetchCDO;
import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCaseRailwayNoPrefetchCDO;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class ConnectedSegmentsRailwayTestNoPrefetchCDO extends AbstractTestCaseRailwayNoPrefetchCDO {

	public ConnectedSegmentsRailwayTestNoPrefetchCDO(String resourceName, String scriptSuffix) {
		super(resourceName, scriptSuffix);
	}

	protected String textualQuery;
	protected EClass eContext;
	
    @SuppressWarnings("unchecked")
	@Before
    public void setUp() {
    	super.setUp();
    	eContext = RailwayPackage.eINSTANCE.getSensor();
        oclHelper.setContext(eContext);
        try {
            textualQuery = ""
                    + "self.monitors->collect(segment1 | segment1.connectsTo->select(segment2 | segment2.monitoredBy->includes(self)))";
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
	        Thread.sleep(10000);
    	    EList<EObject> blocks = getAllInstances(resource, RailwayPackage.eINSTANCE.getSensor());
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

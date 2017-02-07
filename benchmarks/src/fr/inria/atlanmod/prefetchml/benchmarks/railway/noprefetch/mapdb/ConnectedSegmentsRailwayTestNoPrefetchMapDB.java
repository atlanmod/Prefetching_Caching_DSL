package fr.inria.atlanmod.prefetchml.benchmarks.railway.noprefetch.mapdb;

import hu.bme.hit.trainbenchmark.railway.RailwayPackage;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.EcoreEnvironmentFactory;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.ecore.internal.OCLStandardLibraryImpl;
import org.junit.Before;
import org.junit.Test;

import fr.inria.atlanmod.prefetchml.benchmarks.AbstractTestCaseNoPrefetchMapDB;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class ConnectedSegmentsRailwayTestNoPrefetchMapDB extends AbstractTestCaseNoPrefetchMapDB {
	

	public ConnectedSegmentsRailwayTestNoPrefetchMapDB(String resourceName, String scriptSuffix) {
		super(resourceName, scriptSuffix);
	}

	protected String textualQuery;
	protected EClass eContext;
	
    @SuppressWarnings("unchecked")
	@Before
    public void setUp() {
    	super.setUp();
    	eContext = RailwayPackage.eINSTANCE.getSensor();
    	oclHelper.setContext(RailwayPackage.eINSTANCE.getSensor());
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
	        EList<EObject> sensors = resource.getAllInstances(RailwayPackage.eINSTANCE.getSensor());
	        PrefetchMLLogger.info("Input size: " + sensors.size());
	        
			PrefetchMLLogger.info("Q1");
			computeQuery(query, sensors);

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
	        computeQuery(query, sensors);
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
    	    resource.close();
    	}
    }
}

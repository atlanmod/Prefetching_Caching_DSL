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

public class SwitchSetRailwayTestNoPrefetchMapDB extends AbstractTestCaseNoPrefetchMapDB {
	

	public SwitchSetRailwayTestNoPrefetchMapDB(String resourceName, String scriptSuffix) {
		super(resourceName, scriptSuffix);
	}

	protected String textualQuery;
	protected EClass eContext;

//	switchSet: Bag(Switch) = Route.allInstances()->collect(
//	        route | route.entry->select(signal = Signal::GO)->collect(
//	            semaphore | route.follows->collect(
//	                swP | swP.target->select(currentPosition <> swP.position)
//	                )
//	            )
//	        )
	
    @SuppressWarnings("unchecked")
	@Before
    public void setUp() {
    	super.setUp();
    	eContext = RailwayPackage.eINSTANCE.getRoute();
    	oclHelper.setContext(RailwayPackage.eINSTANCE.getRoute());
        try {
        	textualQuery = ""
        	        + "self.entry->select(signal = Signal::GO)->collect("
        	        + "    semaphore | self.follows->collect("
        	        + "        swP | swP.target->select(currentPosition <> swP.position)"
        	        + "    )"
        	        + ")";
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
	        EList<EObject> routes = resource.getAllInstances(RailwayPackage.eINSTANCE.getRoute());
	        PrefetchMLLogger.info("Input size: " + routes.size());
	        
			PrefetchMLLogger.info("Q1");
			computeQuery(query, routes);

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
	        computeQuery(query, routes);
    	} catch(Exception e) {
    		e.printStackTrace();
    	} finally {
    	    resource.close();
    	}
    }
}

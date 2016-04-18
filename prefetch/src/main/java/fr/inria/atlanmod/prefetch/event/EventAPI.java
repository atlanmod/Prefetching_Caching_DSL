package fr.inria.atlanmod.prefetch.event;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import fr.inria.atlanmod.prefetch.core.PrefetchWorker;
import fr.inria.atlanmod.prefetch.util.PrefetchLogger;

public class EventAPI {

	private PrefetchWorker worker;
	
	public EventAPI(PrefetchWorker worker) {
		this.worker = worker;
	}
	
	public void startingEvent(Object resourceStore) {
		worker.handleStart(resourceStore);
	}
	
	public static Set<String> eventTypes = new HashSet<String>();
	public static int accessCount = 0;
	
	public void accessEvent(EObject accessedObject) {
		
		eventTypes.add(accessedObject.eClass().getName());
//		if(accessedObject.eClass().getName().equals("Block")) {
			accessCount++;
//		PrefetchLogger.debug("Access " + accessedObject.eResource().getURIFragment(accessedObject) + " / " + accessedObject.eClass().getName() + "(" + accessedObject + ")");
		worker.handleAccess(accessedObject);
//		}
	}
	
	public void accessEvent(Object accessedObject, EClass eClass) {
		accessCount++;
//		PrefetchLogger.debug("Access " + eClass.getName() + "("+accessedObject+")");
		worker.handleAccess(accessedObject, eClass);
	}
	
}

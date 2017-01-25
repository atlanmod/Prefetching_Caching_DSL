package fr.inria.atlanmod.prefetch.event;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import fr.inria.atlanmod.prefetch.core.PrefetchWorker;

public class EventAPI {

	private PrefetchWorker worker;
	
	public EventAPI(PrefetchWorker worker) {
		this.worker = worker;
	}
	
	public void startingEvent(Object resourceStore) {
		worker.handleStart(resourceStore);
	}
	
	public static Set<String> eventTypes = new HashSet<String>();
	
	public void accessEvent(EObject accessedObject) {
		eventTypes.add(accessedObject.eClass().getName());
		worker.handleAccess(accessedObject);
	}
	
	public void accessEvent(Object accessedObject, EClass eClass) {
		worker.handleAccess(accessedObject, eClass);
	}
	
}

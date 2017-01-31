package fr.inria.atlanmod.prefetchml.core.event;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.prefetchml.core.PrefetchWorker;

public class EventAPI {

	private PrefetchWorker worker;
	
	public EventAPI(PrefetchWorker worker) {
		this.worker = worker;
	}
	
	public void startingEvent(Object resourceStore) {
		worker.handleStart(resourceStore);
	}
	
	public void accessEvent(EObject accessedObject) {
		worker.handleAccess(accessedObject);
	}
	
	public void accessEvent(Object accessedObject, EClass eClass) {
		worker.handleAccess(accessedObject, eClass);
	}
	
	public void updateEvent(EObject source, EStructuralFeature feature, int index) {
	    worker.handleUpdate(source, feature, index);
	}
	
	public void addEvent(EObject source, EStructuralFeature feature) {
	    worker.handleAdd(source, feature);
	}
	
	public void removeEvent(EObject source, EStructuralFeature feature) {
	    worker.handleRemove(source, feature);
	}
	
	
}

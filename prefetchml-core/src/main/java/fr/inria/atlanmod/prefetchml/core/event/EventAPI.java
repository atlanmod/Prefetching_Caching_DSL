package fr.inria.atlanmod.prefetchml.core.event;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.prefetchml.core.PrefetchWorker;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

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
	    PrefetchMLLogger.debug("EventAPI.handleUpdate {0}.{1}/{2}", source, feature.getName(), index);
	    worker.handleUpdate(source, feature, index);
	}
	
	public void addEvent(EObject source, EStructuralFeature feature) {
	    PrefetchMLLogger.debug("EventAPI.handleAdd {0}.{1}", source, feature.getName());
	    worker.handleSizeUpdate(source, feature, 1);
	}
	
	public void addEvent(EObject source, EStructuralFeature feature, int addSize) {
	    PrefetchMLLogger.debug("EventAPI.handleAdd {0}.{1}/{2}", source, feature.getName(), addSize);
	    worker.handleSizeUpdate(source, feature, addSize);
	}
	
	public void removeEvent(EObject source, EStructuralFeature feature) {
	    PrefetchMLLogger.debug("EventAPI.handleRemove {0}.{1}", source, feature.getName());
	    worker.handleRemove(source, feature);
	}
	
	public void removeEvent(EObject source, EStructuralFeature feature, int removeSize) {
	    PrefetchMLLogger.debug("EventAPI.handleRemove {0}.{1}/{2}", source, feature.getName(), removeSize);
	    worker.handleRemove(source, feature);
	}
	
	
}

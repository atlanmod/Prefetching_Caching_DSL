package fr.inria.atlanmod.prefetchml.core.tasks;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessor;

public class DecrementCacheSizeAction implements Runnable {
	
	private EObject theSource;
	private EStructuralFeature theFeature;
	private RuleProcessor theProcessor;
	
	public DecrementCacheSizeAction(EObject source, EStructuralFeature feature, RuleProcessor processor) {
		this.theSource = source;
		this.theFeature= feature;
		this.theProcessor = processor;
	}
	
	public void run() {
		this.theProcessor.decrementCacheSize(theSource,theFeature);
	}

}

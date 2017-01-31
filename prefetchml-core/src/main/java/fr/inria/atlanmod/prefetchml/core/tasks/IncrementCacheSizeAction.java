package fr.inria.atlanmod.prefetchml.core.tasks;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessor;

public class IncrementCacheSizeAction implements Runnable {
	
	private EObject theSource;
	private EStructuralFeature theFeature;
	private RuleProcessor theProcessor;
	
	public IncrementCacheSizeAction(EObject source, EStructuralFeature feature, RuleProcessor processor) {
		this.theSource = source;
		this.theFeature= feature;
		this.theProcessor = processor;
	}
	
	public void run() {
		this.theProcessor.incrementCacheSize(theSource,theFeature);
	}

}

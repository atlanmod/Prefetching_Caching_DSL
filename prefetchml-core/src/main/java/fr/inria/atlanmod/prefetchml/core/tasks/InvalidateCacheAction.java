package fr.inria.atlanmod.prefetchml.core.tasks;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessor;

public class InvalidateCacheAction implements Runnable {
	
	private EObject theSource;
	private EStructuralFeature theFeature;
	private int theIndex;
	private RuleProcessor theProcessor;
	
	public InvalidateCacheAction(EObject source, EStructuralFeature feature, int index, RuleProcessor processor) {
		this.theSource = source;
		this.theFeature= feature;
		this.theIndex = index;
		this.theProcessor = processor;
	}
	
	public void run() {
		this.theProcessor.invalidateCache(theSource,theFeature,theIndex);
	}

}

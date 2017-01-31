package fr.inria.atlanmod.prefetchml.core.tasks;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessor;

public class UpdateCacheSizeAction implements Runnable {
	
	private EObject theSource;
	private EStructuralFeature theFeature;
	private int theAddSize;
	private RuleProcessor theProcessor;
	
	public UpdateCacheSizeAction(EObject source, EStructuralFeature feature, int addSize, RuleProcessor processor) {
		this.theSource = source;
		this.theFeature= feature;
		this.theAddSize = addSize;
		this.theProcessor = processor;
	}
	
	public void run() {
		this.theProcessor.updateCacheSize(theSource,theFeature,theAddSize);
	}

}

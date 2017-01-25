package fr.inria.atlanmod.prefetchml.emf.event.capture;

import fr.inria.atlanmod.prefetchml.core.PrefetchCore;

public abstract aspect AbstractEMFAspect {

	protected PrefetchCore pCore;
	protected boolean isEnabled = false;
	
	public void setPrefetcher(PrefetchCore core) {
		this.pCore = core;
	}
	
	public PrefetchCore getPrefetcher() {
		return this.pCore;
	}
	
	public void enable() {
		this.isEnabled = true;
	}
	
	public void disable() {
		this.isEnabled = false;
	}
	
}

package fr.inria.atlanmod.prefetch.cache;

import org.eclipse.emf.ecore.EStructuralFeature;

public class EMFCacheKey {
	public String uriFragment;
	public EStructuralFeature feature;
	
	public EMFCacheKey(String uriFragment, EStructuralFeature feature) {
		this.uriFragment = uriFragment;
		this.feature = feature;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EMFCacheKey) {
			EMFCacheKey key = (EMFCacheKey)obj;
			return this.uriFragment.equals(key.uriFragment) && this.feature.equals(key.feature);
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return (uriFragment.hashCode() + feature.getName().hashCode());
	}
	
	@Override
	public String toString() {
		return "(" + uriFragment + "," + feature.getName() + ")";
	}
}

package fr.inria.atlanmod.prefetchml.core.cache;

import org.eclipse.emf.ecore.EStructuralFeature;

public class EMFIndexedCacheKey {
	public String uriFragment;
	public EStructuralFeature feature;
	public int index;
	
	public EMFIndexedCacheKey(String uriFragment, EStructuralFeature feature, int index) {
		this.uriFragment = uriFragment;
		this.feature = feature;
		this.index = index;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof EMFIndexedCacheKey) {
			EMFIndexedCacheKey key = (EMFIndexedCacheKey)obj;
			return this.uriFragment.equals(key.uriFragment) && this.feature.equals(key.feature) && this.index == key.index;
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return (index + uriFragment.hashCode() + feature.getName().hashCode());
	}
	
	@Override
	public String toString() {
		return "(" + uriFragment + "," + feature.getName() + "/" + index +  ")";
	}
}

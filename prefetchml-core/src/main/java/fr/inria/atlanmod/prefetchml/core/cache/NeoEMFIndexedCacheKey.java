package fr.inria.atlanmod.prefetchml.core.cache;

import org.eclipse.emf.ecore.EStructuralFeature;

public class NeoEMFIndexedCacheKey {
	public String id;
	public EStructuralFeature feature;
	public int index;
	
	public NeoEMFIndexedCacheKey(String id, EStructuralFeature feature, int index) {
		this.id = id;
		this.feature = feature;
		this.index = index;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof NeoEMFIndexedCacheKey) {
			NeoEMFIndexedCacheKey key = (NeoEMFIndexedCacheKey)obj;
			return this.id.equals(key.id) && this.feature.equals(key.feature) && this.index == key.index;
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return (index + id.hashCode() + feature.getName().hashCode());
	}
	
	@Override
	public String toString() {
		return "(" + id + "," + feature.getName() + ")";
	}
}

package fr.inria.atlanmod.prefetch.cache;

import org.eclipse.emf.ecore.EStructuralFeature;

public class NeoEMFCacheKey {
	public String id;
	public EStructuralFeature feature;
	
	public NeoEMFCacheKey(String id, EStructuralFeature feature) {
		this.id = id;
		this.feature = feature;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof NeoEMFCacheKey) {
			NeoEMFCacheKey key = (NeoEMFCacheKey)obj;
			return this.id.equals(key.id) && this.feature.equals(key.feature);
		}
		return super.equals(obj);
	}
	
	@Override
	public int hashCode() {
		return (id.hashCode() + feature.getName().hashCode());
	}
	
	@Override
	public String toString() {
		return "(" + id + "," + feature.getName() + ")";
	}
}

package fr.inria.atlanmod.prefetchml.core.cache;

import org.apache.commons.collections4.map.LRUMap;

import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;

public class MRUCache<K,V> extends LRUMap<K,V> {

    private static final long serialVersionUID = 168806750032635506L;
    
    private int chunkSize = 100;
	
    public MRUCache(int size, int chunkSize) {
		super(size);
		this.chunkSize = chunkSize;
	}
	
	@Override
	public V put(K key, V value) {
		if(isFull()) {
			for(int i = 0; i < chunkSize; i++) {
				super.remove(super.lastKey());
			}
		}
		V r = super.put(key, value);
		return r;
	}
	
	@Override
	public V get(Object key) {
	    return super.get(key);
	}
}

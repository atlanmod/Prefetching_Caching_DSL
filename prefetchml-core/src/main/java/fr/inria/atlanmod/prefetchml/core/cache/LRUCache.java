package fr.inria.atlanmod.prefetchml.core.cache;

import org.apache.commons.collections4.map.LRUMap;

public class LRUCache<K,V> extends LRUMap<K,V> {
	
    private static final long serialVersionUID = 6837684180009510703L;
    
    private int chunkSize = 100;
	
    public LRUCache(int size, int chunkSize) {
		super(size);
		this.chunkSize = chunkSize;
	}
	
	@Override
	public V put(K key, V value) {
		if(isFull()) {
			System.out.println("Map full, removing chunk " + chunkSize);
			for(int i = 0; i < chunkSize; i++) {
				super.remove(super.firstKey());
			}
		}
		V r = super.put(key, value);
		return r;
	}
}

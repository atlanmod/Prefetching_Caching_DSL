package fr.inria.atlanmod.prefetchml.core.cache;

import org.apache.commons.collections.map.LRUMap;

public class LRUCache extends LRUMap {
	private int chunkSize = 100;
	public LRUCache(int size, int chunkSize) {
		super(size);
		this.chunkSize = chunkSize;
	}
	
	@Override
	public Object put(Object key, Object value) {
		if(isFull()) {
			System.out.println("Map full, removing chunk " + chunkSize);
			for(int i = 0; i < chunkSize; i++) {
				super.remove(super.firstKey());
			}
		}
		Object r = super.put(key, value);
		return r;
	}
}

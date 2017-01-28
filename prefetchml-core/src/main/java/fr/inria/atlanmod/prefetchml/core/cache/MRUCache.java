package fr.inria.atlanmod.prefetchml.core.cache;

import org.apache.commons.collections4.map.LRUMap;

public class MRUCache extends LRUMap {
	private int chunkSize = 100;
	public MRUCache(int size, int chunkSize) {
		super(size);
		this.chunkSize = chunkSize;
	}
	
	@Override
	public Object put(Object key, Object value) {
		if(isFull()) {
			for(int i = 0; i < chunkSize; i++) {
				super.remove(super.lastKey());
			}
		}
		Object r = super.put(key, value);
		return r;
	}
}

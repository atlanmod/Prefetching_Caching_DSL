package fr.inria.atlanmod.prefetch.cache;

import java.util.Collections;

import java.util.HashMap;
import java.util.Map;

import org.apache.commons.collections.map.LRUMap;

import sun.misc.LRUCache;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Cache;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheType;
import fr.inria.atlanmod.prefetch.util.PrefetchLogger;

public class CacheFactory {

	public static Map<Object,Object> createCacheInstance(Cache cache) {
		if(cache.getType().equals(CacheType.LRU)) {
//			PrefetchLogger.debug("LRU map created");
//			return Collections.synchronizedMap(new LRUMap(1000000));
//			return new LRUMap(5000);
//			return new MyLRUMap(5000, 1000);
//			return new MyLRUMap(75000,5000);
			return new MyMRUMap(16000, 1);
//			return new MyMRUMap(8000, 1);
//			PrefetchLogger.debug("Large MRU map created");
//			return new MyMRUMap(300000, 1);
//			return new MyMRUMap(150000, 1);
//			PrefetchLogger.debug("Small MRU map created");

		}
		PrefetchLogger.debug("Only standard HashMap caches are handled");
		return new HashMap<Object, Object>();
	}
	
}
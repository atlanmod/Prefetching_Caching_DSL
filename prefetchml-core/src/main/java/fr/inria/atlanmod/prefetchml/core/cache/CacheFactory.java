package fr.inria.atlanmod.prefetchml.core.cache;

import java.util.HashMap;
import java.util.Map;

import fr.inria.atlanmod.prefetchml.core.logging.PrefetchLogger;
import fr.inria.atlanmod.prefetchml.language.metamodel.Cache;
import fr.inria.atlanmod.prefetchml.language.metamodel.CacheType;

public class CacheFactory {

	public static Map<Object,Object> createCacheInstance(Cache cache) {
		if(cache.getType().equals(CacheType.LRU)) {
			PrefetchLogger.info("Creating LRU cache");
			if(cache.getProperties() != null 
					&& cache.getProperties().getSize() != 0) {
				// TODO Handle chunksize
				PrefetchLogger.info("Setting cache size to {0}", cache.getProperties().getSize());
				return new LRUCache(cache.getProperties().getSize(), 1);
			}
			else {
				PrefetchLogger.info("Setting cache size to default");
				return new LRUCache(1000000, 1);
			}
		}
		else if(cache.getType().equals(CacheType.MRU)) {
			PrefetchLogger.info("Creating MRU cache");
			if(cache.getProperties() != null
					&& cache.getProperties().getSize() != 0) {
				// TODO Handle chunksize
				PrefetchLogger.info("Setting cache size to " + cache.getProperties().getSize());
				return new MRUCache(cache.getProperties().getSize(), 1);
			}
			else {
				PrefetchLogger.info("Setting cache size to default");
				return new MRUCache(1000000, 1);
			}
		} else {
			PrefetchLogger.debug("No cache type provided, using regular HashMap");
			return new HashMap<Object, Object>();
		}
	
	}
}

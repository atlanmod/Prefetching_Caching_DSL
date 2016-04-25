package fr.inria.atlanmod.neoemf.graph.prefetch.resources;

import fr.inria.atlanmod.neoemf.graph.blueprints.resources.BlueprintsResourceOptions;

public interface PrefetchResourceOptions extends BlueprintsResourceOptions {

	public static enum EStorePrefetchOption implements StoreOption {
		PREFETCHING
	}
	
}

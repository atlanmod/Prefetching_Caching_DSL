package fr.inria.atlanmod.neoemf.prefetchml.blueprints.option;

import fr.inria.atlanmod.neoemf.data.blueprints.store.DirectWriteBlueprintsCacheManyStore;
import fr.inria.atlanmod.neoemf.data.blueprints.store.DirectWriteBlueprintsStore;
import fr.inria.atlanmod.neoemf.data.store.AutocommitStoreDecorator;
import fr.inria.atlanmod.neoemf.option.PersistentStoreOptions;
import fr.inria.atlanmod.prefetchml.blueprints.store.DirectWritePrefetchMLBlueprintsStore;

/**
 * {@link PersistentStoreOptions} that hold PrefetchML Blueprints related features.
 *
 * @see AutocommitStoreDecorator
 * @see DirectWriteBlueprintsStore
 * @see DirectWriteBlueprintsCacheManyStore
 */
public enum PrefetchMLBlueprintsStoreOptions implements PersistentStoreOptions {

    /**
     * Enables PrefetchML on the created resource.
     * 
     * @see DirectWritePrefetchingBlueprintsStore
     */
    PREFETCHML
    
}

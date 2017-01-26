package fr.inria.atlanmod.neoemf.prefetchml.blueprints;

import static com.google.common.base.Preconditions.checkArgument;

import java.util.List;
import java.util.Map;

import javax.annotation.Nonnull;

import fr.inria.atlanmod.neoemf.data.PersistenceBackend;
import fr.inria.atlanmod.neoemf.data.PersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackend;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.data.store.PersistentStore;
import fr.inria.atlanmod.neoemf.option.PersistentStoreOptions;
import fr.inria.atlanmod.neoemf.prefetchml.blueprints.option.PrefetchMLBlueprintsOptionsBuilder;
import fr.inria.atlanmod.neoemf.prefetchml.blueprints.option.PrefetchMLBlueprintsStoreOptions;
import fr.inria.atlanmod.neoemf.prefetchml.blueprints.store.DirectWritePrefetchMLBlueprintsStore;
import fr.inria.atlanmod.neoemf.resource.PersistentResource;

/**
 * A subclass of {@link BlueprintsPersistenceBackendFactory} that creates a
 * {@link DirectWritePrefetchMLBlueprintsStore} store that supports prefetching
 * operations when the option {@link PrefetchMLBlueprintsStoreOptions#PREFETCHML} is provided.
 * <p>
 * This factory only creates low-level stores, backend creation and
 * initialization is inherited from {@link BlueprintsPersistenceBackendFactory}.
 * 
 * @see BlueprintsPersistenceBackendFactory
 * @see BlueprintsPersistenceBackend
 * @see PrefetchMLBlueprintsOptionsBuilder
 */
public class PrefetchMLBlueprintsPersistenceBackendFactory extends
        BlueprintsPersistenceBackendFactory {

    /**
     * The literal description of the factory.
     */
    public static final String NAME = "prefetch-blueprints";

    /**
     * Constructs a new {@code BlueprintsPrefetchingPersistenceBackendFactory}.
     */
    protected PrefetchMLBlueprintsPersistenceBackendFactory() {
        super();
    }

    /**
     * Returns the instance of this class.
     *
     * @return the instance of this class
     */
    @Nonnull
    public static PersistenceBackendFactory getInstance() {
        return Holder.INSTANCE;
    }

    @Override
    public String getName() {
        return NAME;
    }

    /**
     * Reads the provided options and creates a
     * {@link DirectWritePrefetchMLBlueprintsStore} if the option {@link PrefetchMLBlueprintsStoreOptions#PREFETCHML} is
     * set.
     * 
     * @param resource
     *            the resource
     * @param backend
     *            the back-end
     * @param options
     *            the options
     * 
     * @return the newly created persistent store
     */
    @Override
    public PersistentStore createSpecificPersistentStore(PersistentResource resource,
            PersistenceBackend backend, Map<?, ?> options)
            throws fr.inria.atlanmod.neoemf.data.InvalidDataStoreException {
        checkArgument(backend instanceof BlueprintsPersistenceBackend,
                "Trying to create a Graph-based EStore with an invalid backend");

        List<PersistentStoreOptions> storeOptions = getStoreOptions(options);

        if (storeOptions.contains(PrefetchMLBlueprintsStoreOptions.PREFETCHML)) {
            return (PersistentStore) new DirectWritePrefetchMLBlueprintsStore(resource,
                    (BlueprintsPersistenceBackend) backend);
        }
        return super.createSpecificPersistentStore(resource, backend, options);
    }

    /**
     * The initialization-on-demand holder of the singleton of this class.
     */
    private static class Holder {

        /**
         * The instance of the outer class.
         */
        private static final PersistenceBackendFactory INSTANCE = new PrefetchMLBlueprintsPersistenceBackendFactory();
    }
}

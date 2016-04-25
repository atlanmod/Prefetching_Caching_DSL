package fr.inria.atlanmod.neoemf.graph.prefetch.datastore;

import java.util.ArrayList;
import java.util.Map;

import fr.inria.atlanmod.neoemf.datastore.InvalidDataStoreException;
import fr.inria.atlanmod.neoemf.datastore.PersistenceBackend;
import fr.inria.atlanmod.neoemf.datastore.estores.SearcheableResourceEStore;
import fr.inria.atlanmod.neoemf.graph.blueprints.datastore.BlueprintsPersistenceBackend;
import fr.inria.atlanmod.neoemf.graph.blueprints.datastore.BlueprintsPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.graph.prefetch.datastore.estores.impl.PrefetchingDirectWriteBlueprintsResourceEStoreImpl;
import fr.inria.atlanmod.neoemf.graph.prefetch.resources.PrefetchResourceOptions;
import fr.inria.atlanmod.neoemf.resources.PersistentResource;
import fr.inria.atlanmod.neoemf.resources.PersistentResourceOptions;

public class PrefetchPersistenceBackendFactory extends BlueprintsPersistenceBackendFactory {

	@Override
	protected SearcheableResourceEStore internalCreatePersistentEStore(
			PersistentResource resource, PersistenceBackend backend,
			Map<?, ?> options) throws InvalidDataStoreException {
		assert backend instanceof BlueprintsPersistenceBackend : "Trying to create a Graph-based EStore with an invalid backend";
		@SuppressWarnings("unchecked")
		ArrayList<PersistentResourceOptions.StoreOption> storeOptions = (ArrayList<PersistentResourceOptions.StoreOption>)options.get(PersistentResourceOptions.STORE_OPTIONS);
		if(storeOptions != null && storeOptions.contains(PrefetchResourceOptions.EStorePrefetchOption.PREFETCHING)) {
			return new PrefetchingDirectWriteBlueprintsResourceEStoreImpl(resource, (BlueprintsPersistenceBackend)backend);
		}
		// The PREFETCHING store option is not set, delegate the store creation to the parent
		return super.internalCreatePersistentEStore(resource, backend, options);
	}
	
}

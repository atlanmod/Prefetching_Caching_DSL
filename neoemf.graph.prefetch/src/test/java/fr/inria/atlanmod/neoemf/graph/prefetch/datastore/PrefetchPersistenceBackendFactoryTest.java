package fr.inria.atlanmod.neoemf.graph.prefetch.datastore;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.eclipse.emf.ecore.InternalEObject.EStore;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.tinkerpop.blueprints.impls.tg.TinkerGraph;

import fr.inria.atlanmod.neoemf.datastore.AbstractPersistenceBackendFactory;
import fr.inria.atlanmod.neoemf.datastore.InvalidDataStoreException;
import fr.inria.atlanmod.neoemf.datastore.PersistenceBackend;
import fr.inria.atlanmod.neoemf.datastore.PersistenceBackendFactoryRegistry;
import fr.inria.atlanmod.neoemf.datastore.estores.SearcheableResourceEStore;
import fr.inria.atlanmod.neoemf.graph.blueprints.datastore.BlueprintsPersistenceBackend;
import fr.inria.atlanmod.neoemf.graph.blueprints.datastore.BlueprintsPersistenceBackendFactoryTest;
import fr.inria.atlanmod.neoemf.graph.blueprints.datastore.estores.impl.DirectWriteBlueprintsResourceEStoreImpl;
import fr.inria.atlanmod.neoemf.graph.blueprints.util.NeoBlueprintsURI;
import fr.inria.atlanmod.neoemf.graph.prefetch.datastore.estores.impl.PrefetchingDirectWriteBlueprintsResourceEStoreImpl;
import fr.inria.atlanmod.neoemf.graph.prefetch.resources.PrefetchResourceOptions;
import fr.inria.atlanmod.neoemf.resources.PersistentResourceOptions;

public class PrefetchPersistenceBackendFactoryTest extends BlueprintsPersistenceBackendFactoryTest{

	private static String filePath = "/tmp/prefetchPersistenceBackendFactoryTestFile";
	
	@Before
	public void setUp() {
		// Override the specific setup of the parent test
		persistenceBackendFactory = new PrefetchPersistenceBackendFactory();
		PersistenceBackendFactoryRegistry.getFactories().put(NeoBlueprintsURI.NEO_GRAPH_SCHEME, persistenceBackendFactory);
		testFile = new File(filePath);
		options.put(PersistentResourceOptions.STORE_OPTIONS, storeOptions);
	}
	
	@After
	public void tearDown() {
		super.tearDown();
	}
	
	@Test
	public void testCreatePersistentEStorePrefetchingOption() throws InvalidDataStoreException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		storeOptions.add(PrefetchResourceOptions.EStorePrefetchOption.PREFETCHING);
		PersistenceBackend persistentBackend = persistenceBackendFactory.createPersistentBackend(testFile, Collections.EMPTY_MAP);
		SearcheableResourceEStore eStore = persistenceBackendFactory.createPersistentEStore(null, persistentBackend, options);
		assert eStore instanceof PrefetchingDirectWriteBlueprintsResourceEStoreImpl : "Invalid EStore created";
		PersistenceBackend innerBackend = getInnerBackend(eStore);
		assert innerBackend == persistentBackend : "The backend in the EStore is not the created one";
	}

}

package fr.inria.atlanmod.neoemf.prefetchml.blueprints;

import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackendFactoryTest;

public class PrefetchMLBlueprintsPersistenceBackendFactoryTest extends BlueprintsPersistenceBackendFactoryTest {

//	@Before
//	public void setUp() {
//		// Override the specific setup of the parent test
//		persistenceBackendFactory = new PrefetchPersistenceBackendFactory();
//		PersistenceBackendFactoryRegistry.getFactories().put(NeoBlueprintsURI.NEO_GRAPH_SCHEME, persistenceBackendFactory);
//		testFile = new File(filePath);
//		options.put(PersistentResourceOptions.STORE_OPTIONS, storeOptions);
//	}
//	
//	@After
//	public void tearDown() {
//		super.tearDown();
//	}
//	
//	@Test
//	public void testCreatePersistentEStorePrefetchingOption() throws InvalidDataStoreException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
//		storeOptions.add(PrefetchResourceOptions.EStorePrefetchOption.PREFETCHING);
//		PersistenceBackend persistentBackend = persistenceBackendFactory.createPersistentBackend(testFile, Collections.EMPTY_MAP);
//		SearcheableResourceEStore eStore = persistenceBackendFactory.createPersistentEStore(null, persistentBackend, options);
//		assert eStore instanceof PrefetchingDirectWriteBlueprintsResourceEStoreImpl : "Invalid EStore created";
//		PersistenceBackend innerBackend = getInnerBackend(eStore);
//		assert innerBackend == persistentBackend : "The backend in the EStore is not the created one";
//	}

}

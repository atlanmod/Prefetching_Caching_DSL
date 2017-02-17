/*
 * Copyright (c) 2013-2017 Atlanmod INRIA LINA Mines Nantes.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Atlanmod INRIA LINA Mines Nantes - initial API and implementation
 */

package fr.inria.atlanmod.prefetchml.benchmarks.util;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

import java.io.Closeable;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.file.Path;
import java.text.MessageFormat;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.eclipse.emf.cdo.common.id.CDOID;
import org.eclipse.emf.cdo.common.model.CDOModelUtil;
import org.eclipse.emf.cdo.common.model.CDOType;
import org.eclipse.emf.cdo.common.revision.CDOElementProxy;
import org.eclipse.emf.cdo.common.revision.CDOList;
import org.eclipse.emf.cdo.common.revision.CDORevision;
import org.eclipse.emf.cdo.common.revision.CDORevisionUtil;
import org.eclipse.emf.cdo.common.revision.delta.CDOFeatureDelta;
import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.internal.common.revision.delta.CDOAddFeatureDeltaImpl;
import org.eclipse.emf.cdo.internal.common.revision.delta.CDOClearFeatureDeltaImpl;
import org.eclipse.emf.cdo.internal.common.revision.delta.CDOContainerFeatureDeltaImpl;
import org.eclipse.emf.cdo.internal.common.revision.delta.CDOMoveFeatureDeltaImpl;
import org.eclipse.emf.cdo.internal.common.revision.delta.CDORemoveFeatureDeltaImpl;
import org.eclipse.emf.cdo.internal.common.revision.delta.CDOSetFeatureDeltaImpl;
import org.eclipse.emf.cdo.internal.common.revision.delta.CDOUnsetFeatureDeltaImpl;
import org.eclipse.emf.cdo.net4j.CDONet4jSessionConfiguration;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.server.CDOServerUtil;
import org.eclipse.emf.cdo.server.IRepository;
import org.eclipse.emf.cdo.server.ISession;
import org.eclipse.emf.cdo.server.IStore;
import org.eclipse.emf.cdo.server.db.CDODBUtil;
import org.eclipse.emf.cdo.server.db.mapping.IMappingStrategy;
import org.eclipse.emf.cdo.server.net4j.CDONet4jServerUtil;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.spi.common.revision.InternalCDORevision;
import org.eclipse.emf.cdo.spi.common.revision.InternalCDORevisionManager;
import org.eclipse.emf.cdo.spi.server.ISessionProtocol;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.ObjectNotFoundException;
import org.eclipse.emf.cdo.view.CDOFeatureAnalyzer;
import org.eclipse.emf.cdo.view.CDORevisionPrefetchingPolicy;
import org.eclipse.emf.cdo.view.CDOStaleReferencePolicy;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.util.FeatureMapUtil;
import org.eclipse.emf.internal.cdo.bundle.OM;
import org.eclipse.emf.internal.cdo.view.CDOStateMachine;
import org.eclipse.emf.internal.cdo.view.CDOStoreImpl;
import org.eclipse.emf.spi.cdo.CDOStore;
import org.eclipse.emf.spi.cdo.FSMUtil;
import org.eclipse.emf.spi.cdo.InternalCDOObject;
import org.eclipse.emf.spi.cdo.InternalCDOView;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.acceptor.IAcceptor;
import org.eclipse.net4j.db.DBUtil;
import org.eclipse.net4j.db.IDBAdapter;
import org.eclipse.net4j.db.IDBConnectionProvider;
import org.eclipse.net4j.db.h2.H2Adapter;
import org.eclipse.net4j.jvm.IJVMConnector;
import org.eclipse.net4j.jvm.JVMUtil;
import org.eclipse.net4j.signal.ISignalProtocol;
import org.eclipse.net4j.util.ObjectUtil;
import org.eclipse.net4j.util.container.ContainerEventAdapter;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IContainer;
import org.eclipse.net4j.util.container.IManagedContainer;
import org.eclipse.net4j.util.om.trace.ContextTracer;
import org.h2.jdbcx.JdbcDataSource;

public class CdoBackend {

    public static final String NAME = "cdo";

    private static final String RESOURCE_EXTENSION = "cdo";
    private static final String STORE_EXTENSION = "resource"; // -> cdo.resource

//    private static final Class<?> EPACKAGE_CLASS = org.eclipse.gmt.modisco.java.cdo.impl.JavaPackageImpl.class;

    private EmbeddedCdoServer server;
    private CDOSession session;
    private CDOTransaction transaction;
    private String usedPath;

    public CdoBackend() {
//        super(NAME, RESOURCE_EXTENSION, STORE_EXTENSION, EPACKAGE_CLASS);
    }

    public Resource createResource(File file, ResourceSet resourceSet) throws Exception {
        server = new EmbeddedCdoServer(file.getAbsolutePath());
        usedPath = file.getAbsolutePath();
        server.run();
        session = server.openSession();
        transaction = session.openTransaction();
//        BenchmarkCDOStore store = new BenchmarkCDOStore((InternalCDOView)transaction);
//        Field f = transaction.getClass().getSuperclass().getSuperclass().getDeclaredField("store");
//        f.setAccessible(true);
//        f.set(transaction, store);
//        return session.openView().getRootResource();
        return transaction.getRootResource();
    }
    
    public CDOTransaction getTransaction() {
        return transaction;
    }
    
    /**
     * Creates a new transaction to manipulate the base {@link Resource}.
     * <p>
     * The underlying resource has to be open (see
     * {@link #createResource(File, ResourceSet)} and {@link #load(File)}.
     * 
     * @throws IllegalStateException
     *             if the resource is not already opened
     * @return a {@link Resource} in a new {@link CDOTransaction}
     */
    public Resource loadInNewTransaction() throws IllegalStateException {
        if (isNull(session)) {
            throw new IllegalStateException(
                    "Cannot create a new transaction, the resource has to be opened before");
        }
//        EmbeddedCdoServer newServer = new EmbeddedCdoServer(usedPath);
//        newServer.run();
//        return(newServer.openSession().openView().getRootResource());
//        return(server.openSession().openView().getRootResource());
//        CDOTransaction newTransaction = session.openTransaction();
          return session.openView().getRootResource();
//        return newTransaction.getRootResource();
    }

    public Map<String, Object> getOptions() {
        Map<String, Object> saveOpts = new HashMap<>();
        saveOpts.put(CDOResource.OPTION_SAVE_OVERRIDE_TRANSACTION, transaction);
        return saveOpts;
    }

    public Resource load(File file) throws Exception {
//        initAndGetEPackage();

        Resource resource = createResource(file, new ResourceSetImpl());
        resource.load(getOptions());
        return resource;
    }

    public void unload(Resource resource) {
        if (nonNull(transaction) && !transaction.isClosed()) {
            transaction.close();
        }

        if (nonNull(session) && !session.isClosed()) {
            session.close();
        }

        if (nonNull(server) && !server.isClosed()) {
            server.close();
        }

        if (nonNull(resource) && resource.isLoaded()) {
            resource.unload();
        }
    }

    /**
     * Embedded implementation of CDO server.
     */
    public static class EmbeddedCdoServer implements Closeable {

        private static final Logger log = LogManager.getLogger();

        private static final String DEFAULT_REPOSITORY_NAME = "repo";

        private final String path;

        private final String repositoryName;

        private IJVMConnector connector;

        private IManagedContainer container;

        public EmbeddedCdoServer(String path) {
            this.path = path;
            this.repositoryName = DEFAULT_REPOSITORY_NAME;
        }

        public void run() {
            try {
                JdbcDataSource dataSource = createDataSource("jdbc:h2:" + path + "/" + repositoryName);

                IStore cdoStore = createStore(dataSource);
                IRepository cdoRepository = createRepository(cdoStore);

                container = createContainer();
                CDOServerUtil.addRepository(container, cdoRepository);

                @SuppressWarnings("unused")
                IAcceptor acceptor = JVMUtil.getAcceptor(container, "default");
                connector = JVMUtil.getConnector(container, "default");

                cdoRepository.getSessionManager().addListener(new ContainerEventAdapter<ISession>() {
                    @Override
                    protected void onAdded(IContainer<ISession> container, ISession session) {
                        ISessionProtocol protocol = session.getProtocol();
                        if (protocol instanceof ISignalProtocol) {
                            ISignalProtocol<?> signalProtocol = (ISignalProtocol<?>) protocol;
                            signalProtocol.setTimeout(30L * 1000L);
                        }
                    }
                });
            }
            finally {
                Runtime.getRuntime().addShutdownHook(new Thread(EmbeddedCdoServer.this::close));
            }
        }

        @Override
        public void close() {
            if (nonNull(connector) && !connector.isClosed()) {
                connector.close();
            }
            if (nonNull(container) && container.isActive()) {
                Exception e = container.deactivate();

                if (nonNull(e)) {
                    log.error(e);
                }
            }
        }

        public boolean isClosed() {
            return isNull(connector) || connector.isClosed();
        }

        public CDOSession openSession() {
            CDONet4jSessionConfiguration config = CDONet4jUtil.createNet4jSessionConfiguration();
            config.setConnector(connector);
            config.setRepositoryName(repositoryName);
            return config.openNet4jSession();
        }

        private JdbcDataSource createDataSource(String url) {
            JdbcDataSource dataSource = new JdbcDataSource();
//            dataSource.setURL(url+";MV_STORE=TRUE;MULTI_THREADED=TRUE;MVCC=TRUE");
            dataSource.setURL(url+";MV_STORE=TRUE;LOCK_MODE=0;MVCC=TRUE");
//            dataSource.setURL(url+";MV_STORE=TRUE;MVCC=TRUE");

//              dataSource.setURL(url+";MVCC=TRUE");
//            dataSource.setURL(url);
            return dataSource;
        }

        private IStore createStore(JdbcDataSource dataSource) {
            IMappingStrategy mappingStrategy = CDODBUtil.createHorizontalMappingStrategy(true);
            IDBAdapter dbAdapter = new H2Adapter();
            IDBConnectionProvider dbConnectionProvider = DBUtil.createConnectionProvider(dataSource);
            return CDODBUtil.createStore(mappingStrategy, dbAdapter, dbConnectionProvider);
        }

        private IRepository createRepository(IStore store) {
            Map<String, String> props = new HashMap<>();
            props.put(IRepository.Props.OVERRIDE_UUID, repositoryName);
            props.put(IRepository.Props.SUPPORTING_AUDITS, "false");
            props.put(IRepository.Props.SUPPORTING_BRANCHES, "false");
            return CDOServerUtil.createRepository(repositoryName, store, props);
        }

        private IManagedContainer createContainer() {
            IManagedContainer container = ContainerUtil.createContainer();
            Net4jUtil.prepareContainer(container);
            JVMUtil.prepareContainer(container);
            CDONet4jUtil.prepareContainer(container);
            CDONet4jServerUtil.prepareContainer(container);
            container.activate();
            return container;
        }
    }
}

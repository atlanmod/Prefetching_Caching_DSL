/*******************************************************************************
 * Copyright (c) 2016 Atlanmod INRIA LINA Mines Nantes
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Atlanmod INRIA LINA Mines Nantes - initial API and implementation
 *******************************************************************************/
package fr.inria.atlanmod.prefetchml.blueprints.store;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Vertex;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;
import fr.inria.atlanmod.neoemf.data.blueprints.BlueprintsPersistenceBackend;
import fr.inria.atlanmod.neoemf.data.blueprints.store.DirectWriteBlueprintsStore;
import fr.inria.atlanmod.prefetch.cache.NeoEMFIndexedCacheKey;
import fr.inria.atlanmod.prefetch.core.PrefetchCore;
import fr.inria.atlanmod.prefetch.event.EventAPI;
import fr.inria.atlanmod.prefetch.processor.neoemf.NeoEMFRuleProcessor.VertexWrapper;
import fr.inria.atlanmod.prefetch.processor.neoemf.NeoEMFRuleProcessorFactory;

public class DirectWritePrefetchMLBlueprintsStore extends DirectWriteBlueprintsStore {

	protected PrefetchCore pCore;
    
	/**
	 * Constructs a new {@link DirectWritePrefetchMLBlueprintsStore} between the given {@code resource} and the {@code backend}.
	 * 
	 * @param resource the resource to persist and access
     * @param backend  the persistence back-end used to store the model
	 */
    public DirectWritePrefetchMLBlueprintsStore(Resource.Internal resource,
            BlueprintsPersistenceBackend backend) {
        super(resource, backend);
        pCore = new PrefetchCore(backend, new NeoEMFRuleProcessorFactory());
    }
    
    /**
     * Return the {@link PrefetchCore} instance associated to the store.
     * @return
     */
    public PrefetchCore getPrefetcher() {
    	return pCore;
    }
    
    @Override
    public int size(InternalEObject internalObject, EStructuralFeature feature) {
    	if(feature instanceof EReference) {
    		EReference eReference = (EReference)feature;
	    	final Map<Object,Object> cache = pCore.getActiveCache();
	    	if(!(eReference.getEType() instanceof EClass)) {
	            return super.size(internalObject, feature);
	        }
	    	PersistentEObject object = PersistentEObject.from(internalObject);
            NeoEMFIndexedCacheKey key = new NeoEMFIndexedCacheKey(object.id().toString(), eReference, -2);
            if(cache.containsKey(key)) {
            	pCore.hit();;
            	int cachedSize = (int)cache.get(key);
            	if(cachedSize == -1) {
            		return 0;
            	}
            	else {
            		return cachedSize;
            	}
            }
            else {
            	pCore.miss();;
            	return super.size(object, feature);
            }
    	}
    	return super.size(internalObject, feature);
    }
    
    @Override
    protected boolean isSetReference(PersistentEObject object, EReference reference) {
    	final Map<Object,Object> cache = pCore.getActiveCache();
    	if(!(reference.getEType() instanceof EClass)) {
            return super.isSetReference(object, reference);
        }
        if(!cache.isEmpty()) {
            NeoEMFIndexedCacheKey key = new NeoEMFIndexedCacheKey(object.id().toString(), reference, -2);
            if(cache.containsKey(key)) {
            	pCore.hit();;
            	int theSize = (int)cache.get(key);
            	return theSize > 0;
            }
        }
        pCore.miss();
    	return super.isSetReference(object, reference);
    }
    
    
    @Override
    protected Object getReference(PersistentEObject object, EReference reference, int index) {
    	Map<Object,Object> cache = pCore.getActiveCache();
    	EventAPI eventAPI = pCore.getEventAPI();
        if(!(reference.getEType() instanceof EClass)) {
            Object r = super.getReference(object, reference, index);
            if(r instanceof PersistentEObject) {
            	Vertex v = backend.getVertex(((PersistentEObject)r).id());
            	eventAPI.accessEvent(v,((EObject)r).eClass());
            }
            return r;
        }
        
        if(reference.isMany()) {
        	NeoEMFIndexedCacheKey key = new NeoEMFIndexedCacheKey(object.id().toString(), reference, index);
        	if(cache.containsKey(key)) {
        		pCore.hit();
        		VertexWrapper wrapper = (VertexWrapper)cache.get(key);
        		eventAPI.accessEvent(wrapper.getV(),wrapper.getEClass());
        		return reifyVertex(wrapper);
        	}
        	else {
        		pCore.miss();
        		Vertex vertex = backend.getVertex(object.id());
        		Iterator<Vertex> iterator = vertex.query().labels(reference.getName()).direction(Direction.OUT).has(POSITION, index).vertices().iterator();
                if (iterator.hasNext()) {
                    Vertex referencedVertex = iterator.next();
                    InternalEObject reifiedObject = reifyVertex(referencedVertex);
                    eventAPI.accessEvent(referencedVertex,backend.resolveInstanceOf(referencedVertex));
                    return reifiedObject;
                } else {
                    return null;
                }
        	}
        }
        else {
        	NeoEMFIndexedCacheKey key = new NeoEMFIndexedCacheKey(object.id().toString(), reference, -1);
        	if(cache.containsKey(key)) {
        		pCore.hit();
        		VertexWrapper wrapper = (VertexWrapper)cache.get(key);
        		eventAPI.accessEvent(wrapper.getV(),wrapper.getEClass());
        		return reifyVertex(wrapper);
        	}
        	else {
        		pCore.miss();
        		Vertex vertex = backend.getVertex(object.id());
            	Iterator<Vertex> iterator = vertex.getVertices(Direction.OUT, reference.getName()).iterator();
                if (iterator.hasNext()) {
                    Vertex referencedVertex = iterator.next();
                    eventAPI.accessEvent(referencedVertex,backend.resolveInstanceOf(referencedVertex));
                    InternalEObject reifiedObject = reifyVertex(referencedVertex);
                    return reifiedObject;
                } else {
                    return null;
                }
        	}
        }
    }
    
    /**
     * Creates an {@link InternalEObject} from the given {@link VertexWrapper}.
     *
     * @param vWrapper the {@link VertexWrapper} to reify
     *
     * @return an {@link InternalEObject} build from the provided {@link VertexWrapper}
     */
    protected InternalEObject reifyVertex(VertexWrapper vWrapper) {
    	return reifyVertex(vWrapper.getV(),vWrapper.getEClass());		
	}
    
    @Override
    public EList<EObject> getAllInstances(EClass eClass, boolean strict) {
    	Map<EClass, Iterable<Vertex>> indexHits = backend.getAllInstances(eClass, strict);
		EList<EObject> instances = new PrefetchEventBasicEList<EObject>();
		Set<EClass> mapKeys = indexHits.keySet();
		for(EClass metaClass : mapKeys) {
			Iterable<Vertex> instanceVertices = indexHits.get(metaClass);
			for(Vertex instanceVertex : instanceVertices) {
			    instances.add(reifyVertex(instanceVertex,metaClass));
			}
		}
		return instances;
    }
    
    /**
     * A subclass of {@link BasicEList} that sends events to the PrefetchML framework when an
     * element is accessed.
     * @param <E> the type of the elements in the list
     */
    class PrefetchEventBasicEList<E> extends BasicEList<E> {
    	
		private static final long serialVersionUID = 1L;

		public PrefetchEventBasicEList() {
    		super();
		}
    	
    	@Override
    	public E get(int index) {
    		E res = super.get(index);
    		if(res instanceof PersistentEObject) {
    			pCore.getEventAPI().accessEvent(((PersistentEObject)res).id().toString(), ((PersistentEObject)res).eClass());
    		}
    		return res;
    	}
    	
    }
}

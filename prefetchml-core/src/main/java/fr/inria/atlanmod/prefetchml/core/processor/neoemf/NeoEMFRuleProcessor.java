package fr.inria.atlanmod.prefetchml.core.processor.neoemf;

import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Index;
import com.tinkerpop.blueprints.KeyIndexableGraph;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.util.wrappers.id.IdGraph;

import fr.inria.atlanmod.prefetchml.core.cache.NeoEMFIndexedCacheKey;
import fr.inria.atlanmod.prefetchml.core.logging.PrefetchMLLogger;
import fr.inria.atlanmod.prefetchml.core.processor.RuleProcessor;
import fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule;
import fr.inria.atlanmod.prefetchml.language.metamodel.FeaturePattern;
import fr.inria.atlanmod.prefetchml.language.metamodel.StartingRule;

public class NeoEMFRuleProcessor implements RuleProcessor {

	private Map<Object,Object> cache;
	private IdGraph<KeyIndexableGraph> graph;
	
	public class VertexWrapper {
		private Vertex v;
		private EClass eClass;
		public VertexWrapper(Vertex v, EClass eClass) {
			this.v = v;
			this.eClass = eClass;
		}
		
		public Vertex getV() {
			return v;
		}
		
		public EClass getEClass() {
			return eClass;
		}
	}
	
	/**
	 * Creates a new NeoEMFRuleProcessor with the given cache and graph
	 * @param cache the structure to store the cached objects in
	 * @param graph the graph that contains the model representation
	 */
	public NeoEMFRuleProcessor(Map<Object,Object> cache, IdGraph<KeyIndexableGraph> graph) {
		this.cache = cache;
		this.graph = graph;
	}
	
	/**
	 * @return the cache used to store the elements
	 */
	@Override
	public Object getCache() {
		return cache;
	}

	/**
	 * @param newCache the cache to use to store the elements
	 * @note the previous cache content will be discarded
	 */
	@Override
	public void setCache(Map<Object, Object> newCache) {
		this.cache = newCache;
	}

	/**
	 * @deprecated executes a single starting rule
	 * @see{NeoEMFRuleProcessor.processStartingRules(List<StartingRule>, Object)} instead
	 * @param sRule the @see{StartingRule} to process
	 * @param resourceStore the store that contains the model representation
	 */
	@Override
	public void processStartingRule(StartingRule sRule, Object resourceStore) {
		// TODO Auto-generated method stub
		
	}
	
	/**
	 * Executes the starting rules given as parameters
	 * @param sRules the @see{StartingRule}s to process
	 * @param resourceStore the store that contains the model representation
	 */
	@Override
	public void processStartingRules(List<StartingRule> sRules, Object resourceStore) {
		for(StartingRule sRule : sRules) {
			EClass eClassToFetch = sRule.getTargetPattern().getEClass();
			Iterator<Vertex> eClassInstanceIt = getAllInstancesOfEClass(eClassToFetch);
			while(eClassInstanceIt != null && eClassInstanceIt.hasNext()) {
				Vertex eClassInstance = eClassInstanceIt.next();
				processFeatures(eClassInstance,sRule.getTargetPattern().getFeatures());
			}
		}
	}

	/**
	 * @deprecated executes a single access rule for a given accessed element
	 * @see{NeoEMFRuleProcessor.processAccessRules(List<StartingRule>, Object)} instead
	 * @param source the element which has been accessed
	 * @param aRule the @see{AccessRule} to process
	 */
	@Override
	public void processAccessRule(Object source, AccessRule aRule) {
		// TODO Auto-generated method stub
		
	}

	/**
	 * Executes the access rules for a given accessed element
	 * @param source the element which has been accessed
	 * @param aRules the @see{AccessRule}s to process
	 */
	@Override
	public void processAccessRules(Object source, List<AccessRule> aRules) {
		if(aRules.isEmpty()) {
            return;
        }
        for(AccessRule aRule : aRules) {
            EClass sourceEClass = aRule.getSourcePattern().getEClass();
            EClass targetEClass = aRule.getTargetPattern().getEClass();
            try {
            if(sourceEClass.equals(targetEClass)) {
            	if(source instanceof Vertex) {
            		Vertex v = (Vertex)source;
            		processFeatures(v, aRule.getTargetPattern().getFeatures());
            	}
            	if(source instanceof String) {
            		String id = (String)source;
            		processFeatures(id, aRule.getTargetPattern().getFeatures());
            	}
            }
            else {
            	PrefetchMLLogger.warn("The use of different source and target EClasses is not supported in NeoEMFRuleProcessor");
            }
            } catch(IllegalStateException e) {
            	// DB already closed
            	return;
            } catch(IllegalArgumentException e) {
            	return;
            }
        }
	}
	
	/**
	 * Wrapper for the recursive method @see{processFeatures(String,EList<FeaturePattern>,int)}
	 * @param vId the @see{Vertex} id of the element to process
	 * @param features the @see{FeaturePattern}s to compute for the given vertex id
	 */
	private void processFeatures(String vId, EList<FeaturePattern> features) {
		this.processFeatures(vId, features, 0);
	}
	
	/**
	 * Recursive method that computes the feature at the given index for the input vertex id
	 * @param vId the @see{Vertex} id of the element to process
	 * @param features the @see{FeaturePattern}s list to process
	 * @param idx the index of the features list to compute
	 */
	private void processFeatures(String vId, EList<FeaturePattern> features, int idx) {
		if(vId == null) {
			return;
		}
        if(features == null || idx >= features.size()) {
            return;
        }
        
        EStructuralFeature theFeature = features.get(idx).getFeature();
        String keyId = vId;
        if(theFeature.isMany()) {
        	// Search if the cache contains the size
        	NeoEMFIndexedCacheKey sizeKey = new NeoEMFIndexedCacheKey(keyId, theFeature, -2);
        	Iterator<Edge> links = null;
        	int theSize = -1;
        	Vertex v = null;
        	if(cache.containsKey(sizeKey)) {
        		theSize = (int)cache.get(sizeKey);
        	}
        	else {
        		v = graph.getVertex(vId);
        		links = v.getEdges(Direction.OUT, features.get(idx).getFeature().getName()).iterator();
        		if(links.hasNext()) {
        			theSize = v.getProperty(features.get(idx).getFeature().getName()+":size");
        			cache.put(sizeKey, theSize);
        		}
        		else {
        			// Cache an invalid size
        			cache.put(sizeKey, -1);
        		}
        		
        	}
        	// The size has been cached if necessary
        	if(theSize > -1) {
//        		if(links == null || !links.hasNext()) throw new RuntimeException("Positive size but invalid iterator");
        		if(v == null) {
        			v = graph.getVertex(vId);
        		}
        		for(int i = 0; i < theSize; i++) {
        			NeoEMFIndexedCacheKey key = new NeoEMFIndexedCacheKey(keyId, theFeature, i);
        			if(cache.containsKey(key)) {
        				VertexWrapper wrapper = (VertexWrapper)cache.get(key);
        				processFeatures(wrapper.getV(), features, idx + 1);
        			}
        			else {
        				// Get the links, the size is cached but not the individual item
        				links = v.getEdges(Direction.OUT, features.get(idx).getFeature().getName()).iterator();
	        			while(links.hasNext()) {
	        				// Iterate all the edges (good idea ?)
	        				Edge theEdge = links.next();
		        			// Get the edge position in the list (because edges are not ordered in Neo4j)
		        			int edgeIdx = theEdge.getProperty("position");
		        			Vertex otherEnd = theEdge.getVertex(Direction.IN);
		        			if(otherEnd == v) {
		        				PrefetchMLLogger.error("An Edge links a Vertex with himself");
		        			}
		        			VertexWrapper wrapper = new VertexWrapper(otherEnd, resolveInstanceOf(otherEnd));
		        			key = new NeoEMFIndexedCacheKey(keyId, theFeature, edgeIdx);
		        			if(!cache.containsKey(key)) {
			        			cache.put(key, wrapper);
			        			processFeatures(otherEnd, features, idx + 1);
		        			}
	        			}
        			}
        		}
        	}
        }
        else {
        	NeoEMFIndexedCacheKey key = new NeoEMFIndexedCacheKey(keyId, theFeature, -1);
        	if(cache.containsKey(key)) {
        		VertexWrapper wrapper = (VertexWrapper)cache.get(key);
        		processFeatures(wrapper.getV(), features, idx + 1);
        	}
        	else {
        		Vertex v = graph.getVertex(vId);
        		Iterator<Vertex> otherEndIterator = v.getVertices(Direction.OUT, features.get(idx).getFeature().getName()).iterator();
        		if(otherEndIterator.hasNext()) {
        			Vertex otherEnd = otherEndIterator.next();
        			VertexWrapper wrapper = new VertexWrapper(otherEnd, resolveInstanceOf(otherEnd));
        			cache.put(key, wrapper);
        			processFeatures(otherEnd, features, idx + 1);
        		}
        	}
        }
	}
	
	/**
	 * Wrapper for the recursive method @see{processFeatures(Vertex,EList<FeaturePattern>,int)}
	 * @param v the @see{Vertex} representing the element to process
	 * @param features the @see{FeaturePattern}s to compute for the given vertex id
	 */
	private void processFeatures(Vertex v, EList<FeaturePattern> features) {
		this.processFeatures(v, features, 0);
	}
	
	/**
	 * Recursive method that computes the feature at the given index for the input vertex
	 * @param v the @see{Vertex} representing the element to process
	 * @param features the @see{FeaturePattern}s list to process
	 * @param idx the index of the features list to compute
	 */
	private void processFeatures(Vertex v, EList<FeaturePattern> features, int idx) {
		if(v == null) {
			return;
		}
        if(features == null || idx >= features.size()) {
            return;
        }
        
        EStructuralFeature theFeature = features.get(idx).getFeature();
        String keyId = v.getId().toString();
        
        if(theFeature.isMany()) {
        	// Search if the cache contains the size
        	NeoEMFIndexedCacheKey sizeKey = new NeoEMFIndexedCacheKey(keyId, theFeature, -2);
        	Iterator<Edge> links = null;
        	int theSize = -1;
        	if(cache.containsKey(sizeKey)) {
        		theSize = (int)cache.get(sizeKey);
        	}
        	else {
        		links = v.getEdges(Direction.OUT, features.get(idx).getFeature().getName()).iterator();
        		if(links.hasNext()) {
        			theSize = v.getProperty(features.get(idx).getFeature().getName()+":size");
        			cache.put(sizeKey, theSize);
        		}
        		else {
        			// Cache an invalid size
        			cache.put(sizeKey, -1);
        		}
        		
        	}
        	// The size has been cached if necessary
        	if(theSize > -1) {
//        		if(links == null || !links.hasNext()) throw new RuntimeException("Positive size but invalid iterator");
        		for(int i = 0; i < theSize; i++) {
        			NeoEMFIndexedCacheKey key = new NeoEMFIndexedCacheKey(keyId, theFeature, i);
        			if(cache.containsKey(key)) {
        				VertexWrapper wrapper = (VertexWrapper)cache.get(key);
        				processFeatures(wrapper.getV(), features, idx + 1);
        			}
        			else {
        				// Get the links, the size is cached but not the individual item
        				links = v.getEdges(Direction.OUT, features.get(idx).getFeature().getName()).iterator();
	        			while(links.hasNext()) {
	        				// Iterate all the edges (good idea ?)
	        				Edge theEdge = links.next();
		        			// Get the edge position in the list (because edges are not ordered in Neo4j)
		        			int edgeIdx = theEdge.getProperty("position");
		        			Vertex otherEnd = theEdge.getVertex(Direction.IN);
		        			if(otherEnd == v) {
		        				PrefetchMLLogger.error("An Edge links a Vertex with himself");
		        			}
		        			VertexWrapper wrapper = new VertexWrapper(otherEnd, resolveInstanceOf(otherEnd));
		        			key = new NeoEMFIndexedCacheKey(keyId, theFeature, edgeIdx);
		        			if(!cache.containsKey(key)) {
			        			cache.put(key, wrapper);
			        			processFeatures(otherEnd, features, idx + 1);
		        			}
	        			}
        			}
        		}
        	}
        }
        else {
        	NeoEMFIndexedCacheKey key = new NeoEMFIndexedCacheKey(keyId, theFeature, -1);
        	if(cache.containsKey(key)) {
        		VertexWrapper wrapper = (VertexWrapper)cache.get(key);
        		processFeatures(wrapper.getV(), features, idx + 1);
        	}
        	else {
        		Iterator<Vertex> otherEndIterator = v.getVertices(Direction.OUT, features.get(idx).getFeature().getName()).iterator();
        		if(otherEndIterator.hasNext()) {
        			Vertex otherEnd = otherEndIterator.next();
        			VertexWrapper wrapper = new VertexWrapper(otherEnd, resolveInstanceOf(otherEnd));
        			cache.put(key, wrapper);
        			processFeatures(otherEnd, features, idx + 1);
        		}
        	}
        }
    }
	
	@Override
	public void invalidateCacheValue(Object source, EStructuralFeature feature, int index) {
	    NeoEMFIndexedCacheKey key = null;
	    if(source instanceof Vertex) {
	        key = new NeoEMFIndexedCacheKey((String)((Vertex)source).getId(), feature, index);
	    }
	    else if(source instanceof String) {
	        key = new NeoEMFIndexedCacheKey((String)source, feature, index);
	    }
	    else {
	        PrefetchMLLogger.error("Unknown source to invalidate {0}", source);
	        throw new IllegalArgumentException();
	    }
	    if(index == -2) {
	        int size = (int)cache.get(key);
	        for(int i = 0; i < size; i++) {
	            NeoEMFIndexedCacheKey vKey = null;
	            if(source instanceof Vertex) {
	                vKey = new NeoEMFIndexedCacheKey((String)((Vertex)source).getId(), feature, i);
	            }
	            else if(source instanceof String) {
	                vKey = new NeoEMFIndexedCacheKey((String)source, feature, i);
	            }
	            cache.remove(vKey);
	        }
	    }
	    cache.remove(key);
	}
	
	@Override
	public void updateCacheSize(Object source, EStructuralFeature feature, int sizeDelta) {
	    NeoEMFIndexedCacheKey key = null;
        if(source instanceof Vertex) {
            key = new NeoEMFIndexedCacheKey((String)((Vertex)source).getId(), feature, -2);
        }
        else if(source instanceof String) {
            key = new NeoEMFIndexedCacheKey((String)source, feature, -2);
        }
        else {
            PrefetchMLLogger.error("Unknown source {0}", source);
            throw new IllegalArgumentException();
        }
        int oldSize = (int)cache.get(key);
        cache.put(key, oldSize + sizeDelta);
	}
	
	private Iterator<Vertex> getAllInstancesOfEClass(EClass eClass) {
        Index<Vertex> idx = graph.getIndex("metaclasses", Vertex.class);
        Iterator<Vertex> it = idx.get("name", eClass.getName()).iterator();
        if(it.hasNext()) {
            Vertex metaclassVertex = it.next();
            Iterator<Vertex> metaclassInstances = metaclassVertex.getVertices(Direction.IN, "kyanosInstanceOf").iterator();
            return metaclassInstances;
        }
        else {
            PrefetchMLLogger.warn("Metaclass " + eClass.getName() + " not found");
            return null;
        }
    }
	
	protected static final String ECLASS__NAME = EcorePackage.eINSTANCE.getENamedElement_Name().getName();
	protected static final String EPACKAGE__NSURI = EcorePackage.eINSTANCE.getEPackage_NsURI().getName();

	protected static final String INSTANCE_OF = "kyanosInstanceOf";
	
	private EClass resolveInstanceOf(Vertex vertex) {
		Iterator<Vertex> iterator = vertex.getVertices(Direction.OUT, INSTANCE_OF).iterator();
		if (iterator.hasNext()) {
			Vertex eClassVertex = iterator.next();
			String name = eClassVertex.getProperty(ECLASS__NAME);
			String nsUri = eClassVertex.getProperty(EPACKAGE__NSURI);
			EClass eClass = (EClass) Registry.INSTANCE.getEPackage(nsUri).getEClassifier(name);
			return eClass;
		}
		return null;
	}
	

}

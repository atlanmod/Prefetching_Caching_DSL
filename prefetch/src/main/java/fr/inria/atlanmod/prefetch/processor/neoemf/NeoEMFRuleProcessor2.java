package fr.inria.atlanmod.prefetch.processor.neoemf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.EcorePackage;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Edge;
import com.tinkerpop.blueprints.Index;
import com.tinkerpop.blueprints.KeyIndexableGraph;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.util.wrappers.id.IdGraph;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule;
import fr.inria.atlanmod.prefetch.cache.NeoEMFCacheKey;
import fr.inria.atlanmod.prefetch.cache.NeoEMFIndexedCacheKey;
import fr.inria.atlanmod.prefetch.processor.RuleProcessor;
import fr.inria.atlanmod.prefetch.util.PrefetchLogger;

public class NeoEMFRuleProcessor2 implements RuleProcessor {

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
	
	public NeoEMFRuleProcessor2(Map<Object,Object> cache, IdGraph<KeyIndexableGraph> graph) {
		this.cache = cache;
		this.graph = graph;
	}
	
	public Object getCache() {
		return cache;
	}

	public void setCache(Map<Object, Object> newCache) {
		this.cache = newCache;
	}

	public void processStartingRule(StartingRule sRule, Object resourceStore) {
		// TODO Auto-generated method stub
		
	}

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

	public void processAccessRule(Object source, AccessRule aRule) {
		// TODO Auto-generated method stub
		
	}

	public void processAccessRules(Object source, List<AccessRule> aRules) {
		if(aRules.isEmpty()) {
            return;
        }
//		if(!(source instanceof Vertex)) {
//			PrefetchLogger.error("NeoEMFRuleProcessor can only traverse Vertices");
//			throw new IllegalArgumentException("NeoEMFRuleProcessor can only traverse Vertices");
//		}
//		Vertex v = (Vertex)source;
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
            	PrefetchLogger.warn("The use of different source and target EClasses is not supported in NeoEMFRuleProcessor");
            }
            } catch(IllegalStateException e) {
            	// DB already closed
            	return;
            } catch(IllegalArgumentException e) {
            	return;
            }
        }
	}
	
	private void processFeatures(String vId, EList<FeaturePattern> features) {
		this.processFeatures(vId, features, 0);
	}
	
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
		        				PrefetchLogger.error("An Edge links a Vertex with himself");
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
	
	private void processFeatures(Vertex v, EList<FeaturePattern> features) {
		this.processFeatures(v, features, 0);
	}
	
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
		        				PrefetchLogger.error("An Edge links a Vertex with himself");
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
        
        if(1==1) {
        	return;
        }
        
//		PrefetchLogger.debug("Processing feature " + features.get(idx).getFeature().getName() + " for " + v.toString());
        NeoEMFCacheKey key = new NeoEMFCacheKey(v.getId().toString(), features.get(idx).getFeature());
        if(cache.containsKey(key)) {
        	List<VertexWrapper> cachedVertices = (List<VertexWrapper>)cache.get(key);
			for(VertexWrapper vv : cachedVertices) {
				processFeatures(vv.getV(), features, idx + 1);
			}
        }
        else {
            
            Iterator<Vertex> linkedVertices = v.getVertices(Direction.OUT, features.get(idx).getFeature().getName()).iterator();
            List<VertexWrapper> fetchedVertices = new ArrayList<VertexWrapper>();
            if(linkedVertices.hasNext()) {
            	Object o = v.getProperty(features.get(idx).getFeature().getName()+":size");
            	if(features.get(idx).getFeature().isMany()) {
            		fetchedVertices = Arrays.asList(new VertexWrapper[(Integer)v.getProperty(features.get(idx).getFeature().getName()+":size")]);
            	}
            	else {
            		fetchedVertices = Arrays.asList(new VertexWrapper[1]);
            	}
//                		new ArrayList<Vertex>((Integer)v.getProperty(features.get(idx).getFeature().getName()+":size"));
            }
//            System.out.println("hasNext" + linkedVertices.hasNext());
            if(linkedVertices.hasNext()) {
            	cache.put(key, fetchedVertices);
//            	System.out.println("put key " + key + "in cache");
            }
            else {
            	cache.put(key, Arrays.asList(new VertexWrapper[0]));
//            	System.out.println("size : " + ((List)cache.get(key)).size());
            }
            while(linkedVertices.hasNext()) {
            	Vertex lVertex = linkedVertices.next();
            	if(lVertex != null) {
            		if(features.get(idx).getFeature().isMany()) {
	                	int pos = lVertex.getEdges(Direction.IN, features.get(idx).getFeature().getName())
	                			.iterator().next().
	                			getProperty("position");
	            		fetchedVertices.set(pos,new VertexWrapper(lVertex,resolveInstanceOf(lVertex)));
            		}
            		else {
            			fetchedVertices.set(0, new VertexWrapper(lVertex, resolveInstanceOf(lVertex)));
            		}
            	}
            	processFeatures(lVertex, features, idx+1);
            }
//            cache.put(key, fetchedVertices);
        }
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
            PrefetchLogger.warn("Metaclass " + eClass.getName() + " not found");
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

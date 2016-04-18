package fr.inria.atlanmod.prefetch.processor.neoemf;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.EPackage.Registry;

import com.tinkerpop.blueprints.Direction;
import com.tinkerpop.blueprints.Index;
import com.tinkerpop.blueprints.KeyIndexableGraph;
import com.tinkerpop.blueprints.Vertex;
import com.tinkerpop.blueprints.util.wrappers.id.IdGraph;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule;
import fr.inria.atlanmod.prefetch.cache.NeoEMFCacheKey;
import fr.inria.atlanmod.prefetch.processor.RuleProcessor;
import fr.inria.atlanmod.prefetch.util.PrefetchLogger;

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
	
	public NeoEMFRuleProcessor(Map<Object,Object> cache, IdGraph<KeyIndexableGraph> graph) {
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
		if(!(source instanceof Vertex)) {
			PrefetchLogger.error("NeoEMFRuleProcessor can only traverse Vertices");
		}
		Vertex v = (Vertex)source;
        for(AccessRule aRule : aRules) {
            EClass sourceEClass = aRule.getSourcePattern().getEClass();
            EClass targetEClass = aRule.getTargetPattern().getEClass();
            if(sourceEClass.equals(targetEClass)) {
            	processFeatures(v, aRule.getTargetPattern().getFeatures());
            }
            else {
            	PrefetchLogger.warn("The use of different source and target EClasses is not supported in NeoEMFRuleProcessor");
            }
//            PrefetchLogger.debug("Done (" + aRule.getName() + "," + source + ")");
//            System.out.println(v.getId().toString());
//            NeoEMFCacheKey k = new NeoEMFCacheKey(v.getId().toString(), aRule.getTargetPattern().getFeatures().get(0).getFeature());
//            System.out.println(k);
//            PrefetchLogger.debug(cache.get(k).toString());
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

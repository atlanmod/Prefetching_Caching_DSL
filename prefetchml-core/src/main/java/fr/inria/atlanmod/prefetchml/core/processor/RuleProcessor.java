package fr.inria.atlanmod.prefetchml.core.processor;

import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EStructuralFeature;

import fr.inria.atlanmod.prefetchml.core.cache.monitoring.MonitoredCacheValue;
import fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule;
import fr.inria.atlanmod.prefetchml.language.metamodel.StartingRule;

public interface RuleProcessor {

	public Object getCache();
	public void setCache(Map<Object,MonitoredCacheValue> newCache);
	
	public void processStartingRule(StartingRule sRule, Object resourceStore);
	public void processStartingRules(List<StartingRule> sRules, Object resourceStore);
	public void processAccessRule(Object source, AccessRule aRule);
	public void processAccessRules(Object source, List<AccessRule> aRules);
	
	public void invalidateCacheValue(Object source, EStructuralFeature feature, int index);
	public void updateCacheSize(Object source, EStructuralFeature feature, int sizeDelta);
	
}

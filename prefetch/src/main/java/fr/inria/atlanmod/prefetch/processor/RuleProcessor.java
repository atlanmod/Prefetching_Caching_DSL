package fr.inria.atlanmod.prefetch.processor;

import java.util.List;
import java.util.Map;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.StartingRule;

public interface RuleProcessor {

	public Object getCache();
	public void setCache(Map<Object,Object> newCache);
	
	public void processStartingRule(StartingRule sRule, Object resourceStore);
	public void processStartingRules(List<StartingRule> sRules, Object resourceStore);
	public void processAccessRule(Object source, AccessRule aRule);
	public void processAccessRules(Object source, List<AccessRule> aRules);
	
}

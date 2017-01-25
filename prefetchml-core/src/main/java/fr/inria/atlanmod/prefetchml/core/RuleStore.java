package fr.inria.atlanmod.prefetchml.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;

import fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule;
import fr.inria.atlanmod.prefetchml.language.metamodel.StartingRule;

/**
 * Utility class that stores the PrefetchingRules loaded in Prefetch
 * @author gdaniel
 *
 */
public class RuleStore {
	private Map<String, Map<EClass,List<AccessRule>>> store;
	private Map<String, List<StartingRule>> sRuleStore;
	
	public RuleStore() {
		store = new HashMap<String,Map<EClass,List<AccessRule>>>();
		sRuleStore = new HashMap<String, List<StartingRule>>();
	}
	
	public void putSRule(String planName, StartingRule sRule) {
		if(sRuleStore.containsKey(planName)) {
			List<StartingRule> ruleList = sRuleStore.get(planName);
			if(ruleList.contains(sRule)) {
				return;
			}
			else {
				ruleList.add(sRule);
			}
		}
		else {
			List<StartingRule> ruleList = new ArrayList<StartingRule>();
			ruleList.add(sRule);
			sRuleStore.put(planName, ruleList);
		}
	}
	
	public void putARule(String planName, EClass sourceEClass, AccessRule pRule) {
		if(store.containsKey(planName)) {
			Map<EClass, List<AccessRule>> ruleMap = store.get(planName);
			if(ruleMap.containsKey(sourceEClass)) {
				ruleMap.get(sourceEClass).add(pRule);
			}
			else {
				List<AccessRule> ruleList = new ArrayList<AccessRule>();
				ruleList.add(pRule);
				ruleMap.put(sourceEClass, ruleList);
			}
		}
		else {
			Map<EClass, List<AccessRule>> ruleMap = new HashMap<EClass, List<AccessRule>>();
			List<AccessRule> ruleList = new ArrayList<AccessRule>();
			ruleList.add(pRule);
			ruleMap.put(sourceEClass, ruleList);
			store.put(planName, ruleMap);
		}
	}
	
	public List<StartingRule> getSRuleList() {
		List<StartingRule> sRules = new ArrayList<StartingRule>();
		for(String pKey : sRuleStore.keySet()) {
			List<StartingRule> lRules = sRuleStore.get(pKey);
			if(sRules != null) {
				sRules.addAll(lRules);
			}
		}
		return sRules;
	}
	
	public List<StartingRule> getSRuleList(String planName) {
		return sRuleStore.get(planName) == null ? new ArrayList<StartingRule>() : sRuleStore.get(planName);
	}
	
	/**
	 * Returns all the PrefetchingRules associated to the given EClass, regardless
	 * the plan they belong to
	 * @param sourceEClass the source EClass of the rules
	 * @return a List of PrefetchingRules having the given EClass as their source
	 */
	public List<AccessRule> getARuleList(EClass sourceEClass) {
		List<AccessRule> rules = new ArrayList<AccessRule>();
		for(String pKey : store.keySet()) {
			List<AccessRule> lRules = store.get(pKey).get(sourceEClass);
			if(lRules != null) {
				rules.addAll(lRules);
			}
		}
		return rules;
	}
	
	/**
	 * Returns all the PrefetchingRules in the given plan associated to the given EClass
	 * @param planName the name of the Plan
	 * @param sourceEClass the source EClass of the rules
	 * @return a List of PrefetchingRules contained in the given plan and having the given EClass 
	 * as their source
	 */
	public List<AccessRule> getARuleList(String planName, EClass sourceEClass) {
		return store.get(planName) == null ? new ArrayList<AccessRule>() : store.get(planName).get(sourceEClass);
	}
	
	public void removeSRules(String planName) {
		sRuleStore.remove(planName);
	}
	
	public void removeARules(String planName) {
		removeARules(planName,null);
	}
	
	public void removeARules(String planName, EClass sourceEClass) {
		store.remove(planName);
	}
	
	public void clearSRules() {
		sRuleStore.clear();
	}
	
	public void clearARules() {
		store.clear();
	}
	
	public boolean isEmptyS() {
		return sRuleStore.isEmpty();
	}
	
	public boolean isEmptyA() {
		return store.isEmpty();
	}
	
}

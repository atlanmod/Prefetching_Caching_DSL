package fr.inria.atlanmod.neoemf.validation

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern
import java.util.List
import org.eclipse.emf.ecore.EClass
import org.eclipse.emf.ecore.EObject
import org.eclipse.emf.ecore.EPackage
import org.eclipse.xtext.validation.Check

/**
 * Custom validation rules. 
 *
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
class PrefetchingValidator extends AbstractPrefetchingValidator {

	public static val INVALID_PACKAGE = 'invalidPackage'
	public static val INVALID_TARGET_PATTERN = 'invalidTargetPattern'
	public static val INVALID_PROBABILITY_COUNT = 'invalidProbabilityCount'
	
	@Check
	def checkPlanProbabilityIsValid(Plan plan) {
		val List<PrefetchingRule> pRules = plan.rules
		var int pTot = pRules.map[r | r.probability].reduce[p1, p2 | p1 + p2]
		if(pTot != 100) {
			error('The total probability of top level rules in plan ' + plan.name + ' is not 100',
				PrefetchingPackage.Literals.PLAN__NAME,
				INVALID_PROBABILITY_COUNT)
		}
	}
	
	@Check
	def checkRuleProbabilityIsValid(PrefetchingRule rule) {
		val List<PrefetchingRule> subRules = rule.subRules
		var int pTot = subRules.map[r | r.probability].reduce[p1, p2| p1 + p2]
		if(pTot != 100) {
			error('The total probability of sub-rules in rule is not 100',
				PrefetchingPackage.Literals.PREFETCHING_RULE__PROBABILITY,
				INVALID_PROBABILITY_COUNT)
		}
	}
	
	@Check
	def checkMetamodelNsURIIsRegistered(MetamodelImport metamodelImport) {
		val nsURI = metamodelImport.nsURI;
		if(!EPackage.Registry.INSTANCE.containsKey(nsURI)) {
			error('Package ' + nsURI + ' is not registered',
				PrefetchingPackage.Literals.METAMODEL_IMPORT__NS_URI,
				INVALID_PACKAGE)
		}
	}
	
	@Check
	def checkTargetPatternIsValid(TargetPattern targetPattern) {
		val PrefetchingRule pr = targetPattern.eContainer as PrefetchingRule
		val EPackage ePackage = getImportedEPackage(targetPattern)
		val String[] splittedPattern = targetPattern.pattern.split('\\.')
		if(splittedPattern.length > 0) {
			if(!ePackage.EClassifiers.map[c | c.name].contains(splittedPattern.get(0))) {
				// The first substring in a Target Pattern must be an EClass identifier
				error('EClass ' + "'"+splittedPattern.get(0)+"'" + ' not found in package ' + ePackage.name,
					PrefetchingPackage.Literals.TARGET_PATTERN__PATTERN,
					INVALID_TARGET_PATTERN)
			}
			val EClass targetEClass = ePackage.EClassifiers.filter[c | c instanceof EClass]
				.findFirst[c | (c as EClass).name.equals(splittedPattern.get(0))] as EClass
			if(splittedPattern.length > 1 && !pr.sourcePattern.pattern.equals(splittedPattern.get(0))) {
				// The first part of the Target pattern is not the same as the Source Pattern
				error('EReferences are only accessible from source pattern EClass ' + pr.sourcePattern.pattern,
					PrefetchingPackage.Literals.TARGET_PATTERN__PATTERN,
					INVALID_TARGET_PATTERN)
			}
			for(var i = 1; i < splittedPattern.length; i++) {
				if(!targetEClass.EAllReferences.map[r | r.name].contains(splittedPattern.get(i))) {
					error('EClass ' + "'"+splittedPattern.get(0)+"'" + ' does not have an EReference ' + splittedPattern.get(i),
						PrefetchingPackage.Literals.TARGET_PATTERN__PATTERN,
						INVALID_TARGET_PATTERN)
				}
			}
		}
	}
	
	def EPackage getImportedEPackage(EObject in) {
		val Model prefetchingModel = in.eResource.contents.get(0) as Model
		val metamodelURI = prefetchingModel.metamodel.nsURI
		if(EPackage.Registry.INSTANCE.keySet.contains(metamodelURI)) {
			return EPackage.Registry.INSTANCE.getEPackage(metamodelURI)
		}
		return null;
	}

}

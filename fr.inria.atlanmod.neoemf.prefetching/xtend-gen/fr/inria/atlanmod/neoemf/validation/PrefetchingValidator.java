package fr.inria.atlanmod.neoemf.validation;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Plan;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern;
import fr.inria.atlanmod.neoemf.validation.AbstractPrefetchingValidator;
import java.util.List;
import java.util.Set;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.Functions.Function2;
import org.eclipse.xtext.xbase.lib.IterableExtensions;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class PrefetchingValidator extends AbstractPrefetchingValidator {
  public final static String INVALID_PACKAGE = "invalidPackage";
  
  public final static String INVALID_TARGET_PATTERN = "invalidTargetPattern";
  
  public final static String INVALID_PROBABILITY_COUNT = "invalidProbabilityCount";
  
  @Check
  public void checkPlanProbabilityIsValid(final Plan plan) {
    final List<PrefetchingRule> pRules = plan.getRules();
    final Function1<PrefetchingRule, Integer> _function = new Function1<PrefetchingRule, Integer>() {
      public Integer apply(final PrefetchingRule r) {
        return Integer.valueOf(r.getProbability());
      }
    };
    List<Integer> _map = ListExtensions.<PrefetchingRule, Integer>map(pRules, _function);
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer p1, final Integer p2) {
        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
      }
    };
    int pTot = (int) IterableExtensions.<Integer>reduce(_map, _function_1);
    if ((pTot != 100)) {
      String _name = plan.getName();
      String _plus = ("The total probability of top level rules in plan " + _name);
      String _plus_1 = (_plus + " is not 100");
      this.error(_plus_1, 
        PrefetchingPackage.Literals.PLAN__NAME, 
        PrefetchingValidator.INVALID_PROBABILITY_COUNT);
    }
  }
  
  @Check
  public void checkRuleProbabilityIsValid(final PrefetchingRule rule) {
    final List<PrefetchingRule> subRules = rule.getSubRules();
    final Function1<PrefetchingRule, Integer> _function = new Function1<PrefetchingRule, Integer>() {
      public Integer apply(final PrefetchingRule r) {
        return Integer.valueOf(r.getProbability());
      }
    };
    List<Integer> _map = ListExtensions.<PrefetchingRule, Integer>map(subRules, _function);
    final Function2<Integer, Integer, Integer> _function_1 = new Function2<Integer, Integer, Integer>() {
      public Integer apply(final Integer p1, final Integer p2) {
        return Integer.valueOf(((p1).intValue() + (p2).intValue()));
      }
    };
    int pTot = (int) IterableExtensions.<Integer>reduce(_map, _function_1);
    if ((pTot != 100)) {
      this.error("The total probability of sub-rules in rule is not 100", 
        PrefetchingPackage.Literals.PREFETCHING_RULE__PROBABILITY, 
        PrefetchingValidator.INVALID_PROBABILITY_COUNT);
    }
  }
  
  @Check
  public void checkMetamodelNsURIIsRegistered(final MetamodelImport metamodelImport) {
    final String nsURI = metamodelImport.getNsURI();
    boolean _containsKey = EPackage.Registry.INSTANCE.containsKey(nsURI);
    boolean _not = (!_containsKey);
    if (_not) {
      this.error((("Package " + nsURI) + " is not registered"), 
        PrefetchingPackage.Literals.METAMODEL_IMPORT__NS_URI, 
        PrefetchingValidator.INVALID_PACKAGE);
    }
  }
  
  @Check
  public void checkTargetPatternIsValid(final TargetPattern targetPattern) {
    EObject _eContainer = targetPattern.eContainer();
    final PrefetchingRule pr = ((PrefetchingRule) _eContainer);
    final EPackage ePackage = this.getImportedEPackage(targetPattern);
    String _pattern = targetPattern.getPattern();
    final String[] splittedPattern = _pattern.split("\\.");
    int _length = splittedPattern.length;
    boolean _greaterThan = (_length > 0);
    if (_greaterThan) {
      EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
      final Function1<EClassifier, String> _function = new Function1<EClassifier, String>() {
        public String apply(final EClassifier c) {
          return c.getName();
        }
      };
      List<String> _map = ListExtensions.<EClassifier, String>map(_eClassifiers, _function);
      Object _get = splittedPattern[0];
      boolean _contains = _map.contains(_get);
      boolean _not = (!_contains);
      if (_not) {
        String _get_1 = splittedPattern[0];
        String _plus = (("EClass " + "\'") + _get_1);
        String _plus_1 = (_plus + "\'");
        String _plus_2 = (_plus_1 + " not found in package ");
        String _name = ePackage.getName();
        String _plus_3 = (_plus_2 + _name);
        this.error(_plus_3, 
          PrefetchingPackage.Literals.TARGET_PATTERN__PATTERN, 
          PrefetchingValidator.INVALID_TARGET_PATTERN);
      }
      EList<EClassifier> _eClassifiers_1 = ePackage.getEClassifiers();
      final Function1<EClassifier, Boolean> _function_1 = new Function1<EClassifier, Boolean>() {
        public Boolean apply(final EClassifier c) {
          return Boolean.valueOf((c instanceof EClass));
        }
      };
      Iterable<EClassifier> _filter = IterableExtensions.<EClassifier>filter(_eClassifiers_1, _function_1);
      final Function1<EClassifier, Boolean> _function_2 = new Function1<EClassifier, Boolean>() {
        public Boolean apply(final EClassifier c) {
          String _name = ((EClass) c).getName();
          Object _get = splittedPattern[0];
          return Boolean.valueOf(_name.equals(_get));
        }
      };
      EClassifier _findFirst = IterableExtensions.<EClassifier>findFirst(_filter, _function_2);
      final EClass targetEClass = ((EClass) _findFirst);
      boolean _and = false;
      int _length_1 = splittedPattern.length;
      boolean _greaterThan_1 = (_length_1 > 1);
      if (!_greaterThan_1) {
        _and = false;
      } else {
        SourcePattern _sourcePattern = pr.getSourcePattern();
        String _pattern_1 = _sourcePattern.getPattern();
        Object _get_2 = splittedPattern[0];
        boolean _equals = _pattern_1.equals(_get_2);
        boolean _not_1 = (!_equals);
        _and = _not_1;
      }
      if (_and) {
        SourcePattern _sourcePattern_1 = pr.getSourcePattern();
        String _pattern_2 = _sourcePattern_1.getPattern();
        String _plus_4 = ("EReferences are only accessible from source pattern EClass " + _pattern_2);
        this.error(_plus_4, 
          PrefetchingPackage.Literals.TARGET_PATTERN__PATTERN, 
          PrefetchingValidator.INVALID_TARGET_PATTERN);
      }
      for (int i = 1; (i < splittedPattern.length); i++) {
        EList<EReference> _eAllReferences = targetEClass.getEAllReferences();
        final Function1<EReference, String> _function_3 = new Function1<EReference, String>() {
          public String apply(final EReference r) {
            return r.getName();
          }
        };
        List<String> _map_1 = ListExtensions.<EReference, String>map(_eAllReferences, _function_3);
        Object _get_3 = splittedPattern[i];
        boolean _contains_1 = _map_1.contains(_get_3);
        boolean _not_2 = (!_contains_1);
        if (_not_2) {
          String _get_4 = splittedPattern[0];
          String _plus_5 = (("EClass " + "\'") + _get_4);
          String _plus_6 = (_plus_5 + "\'");
          String _plus_7 = (_plus_6 + " does not have an EReference ");
          String _get_5 = splittedPattern[i];
          String _plus_8 = (_plus_7 + _get_5);
          this.error(_plus_8, 
            PrefetchingPackage.Literals.TARGET_PATTERN__PATTERN, 
            PrefetchingValidator.INVALID_TARGET_PATTERN);
        }
      }
    }
  }
  
  public EPackage getImportedEPackage(final EObject in) {
    Resource _eResource = in.eResource();
    EList<EObject> _contents = _eResource.getContents();
    EObject _get = _contents.get(0);
    final Model prefetchingModel = ((Model) _get);
    MetamodelImport _metamodel = prefetchingModel.getMetamodel();
    final String metamodelURI = _metamodel.getNsURI();
    Set<String> _keySet = EPackage.Registry.INSTANCE.keySet();
    boolean _contains = _keySet.contains(metamodelURI);
    if (_contains) {
      return EPackage.Registry.INSTANCE.getEPackage(metamodelURI);
    }
    return null;
  }
}

package fr.inria.atlanmod.neoemf.validation;

import com.google.common.base.Objects;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.AccessRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.MetamodelImport;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.Model;
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
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtext.validation.Check;
import org.eclipse.xtext.xbase.lib.Functions.Function1;
import org.eclipse.xtext.xbase.lib.InputOutput;
import org.eclipse.xtext.xbase.lib.ListExtensions;

/**
 * Custom validation rules.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#validation
 */
@SuppressWarnings("all")
public class PrefetchingValidator extends AbstractPrefetchingValidator {
  public final static String INVALID_PACKAGE = "invalidPackage";
  
  public final static String INVALID_SOURCE_PATTERN = "invalidSourcePattern";
  
  public final static String INVALID_TARGET_PATTERN = "invalidTargetPattern";
  
  public final static String INVALID_PROBABILITY_COUNT = "invalidProbabilityCount";
  
  @Check
  public void checkSourcePatternIsValid(final SourcePattern sourcePattern) {
    InputOutput.<String>println("check source pattern");
    EClass _eClass = sourcePattern.getEClass();
    boolean _equals = Objects.equal(_eClass, null);
    if (_equals) {
      String _pattern = sourcePattern.getPattern();
      String _plus = ("The source pattern " + _pattern);
      String _plus_1 = (_plus + " does not exist in imported metamodels");
      this.error(_plus_1, 
        PrefetchingPackage.Literals.SOURCE_PATTERN__PATTERN, 
        PrefetchingValidator.INVALID_SOURCE_PATTERN);
    }
    final EPackage ePackage = this.getImportedEPackage(sourcePattern);
    EClass _eClass_1 = sourcePattern.getEClass();
    String _name = _eClass_1.getName();
    String _plus_2 = ("eclass: " + _name);
    InputOutput.<String>println(_plus_2);
    EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
    final Function1<EClassifier, String> _function = new Function1<EClassifier, String>() {
      public String apply(final EClassifier cc) {
        return cc.getName();
      }
    };
    List<String> _map = ListExtensions.<EClassifier, String>map(_eClassifiers, _function);
    EClass _eClass_2 = sourcePattern.getEClass();
    String _name_1 = _eClass_2.getName();
    boolean _contains = _map.contains(_name_1);
    boolean _not = (!_contains);
    if (_not) {
      EClass _eClass_3 = sourcePattern.getEClass();
      String _name_2 = _eClass_3.getName();
      String _plus_3 = ("The source pattern " + _name_2);
      String _plus_4 = (_plus_3 + " does not exist in imported metamodels");
      this.error(_plus_4, 
        PrefetchingPackage.Literals.SOURCE_PATTERN__PATTERN, 
        PrefetchingValidator.INVALID_SOURCE_PATTERN);
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
      boolean _and = false;
      String _get = splittedPattern[0];
      boolean _equals = _get.equals("self");
      boolean _not = (!_equals);
      if (!_not) {
        _and = false;
      } else {
        EList<EClassifier> _eClassifiers = ePackage.getEClassifiers();
        final Function1<EClassifier, String> _function = new Function1<EClassifier, String>() {
          public String apply(final EClassifier c) {
            return c.getName();
          }
        };
        List<String> _map = ListExtensions.<EClassifier, String>map(_eClassifiers, _function);
        Object _get_1 = splittedPattern[0];
        boolean _contains = _map.contains(_get_1);
        boolean _not_1 = (!_contains);
        _and = _not_1;
      }
      if (_and) {
        String _get_2 = splittedPattern[0];
        String _plus = (("EClass " + "\'") + _get_2);
        String _plus_1 = (_plus + "\'");
        String _plus_2 = (_plus_1 + " not found in package ");
        String _name = ePackage.getName();
        String _plus_3 = (_plus_2 + _name);
        this.error(_plus_3, 
          PrefetchingPackage.Literals.TARGET_PATTERN__PATTERN);
      }
      String _get_3 = splittedPattern[0];
      EClassifier _eClassifier = ePackage.getEClassifier(_get_3);
      EClass eClass = ((EClass) _eClassifier);
      String _get_4 = splittedPattern[0];
      boolean _equals_1 = _get_4.equals("self");
      if (_equals_1) {
        InputOutput.<String>println("found self");
        SourcePattern _sourcePattern = ((AccessRule) pr).getSourcePattern();
        String _pattern_1 = _sourcePattern.getPattern();
        EClassifier _eClassifier_1 = ePackage.getEClassifier(_pattern_1);
        eClass = ((EClass) _eClassifier_1);
        String _name_1 = eClass.getName();
        String _plus_4 = ("validated " + _name_1);
        InputOutput.<String>println(_plus_4);
      }
      int _length_1 = splittedPattern.length;
      boolean _greaterThan_1 = (_length_1 > 1);
      if (_greaterThan_1) {
        for (int i = 1; (i < splittedPattern.length); i++) {
          {
            final String currentPattern = splittedPattern[i];
            EStructuralFeature feature = null;
            boolean _endsWith = currentPattern.endsWith("*");
            if (_endsWith) {
              int _length_2 = currentPattern.length();
              int _minus = (_length_2 - 1);
              String _substring = currentPattern.substring(0, _minus);
              String _plus_5 = ((("Pattern " + currentPattern) + " is validated as ") + _substring);
              InputOutput.<String>println(_plus_5);
              int _length_3 = currentPattern.length();
              int _minus_1 = (_length_3 - 1);
              String _substring_1 = currentPattern.substring(0, _minus_1);
              EStructuralFeature _eStructuralFeature = eClass.getEStructuralFeature(_substring_1);
              feature = _eStructuralFeature;
              EClassifier _eType = feature.getEType();
              if ((_eType instanceof EClass)) {
                String _name_2 = eClass.getName();
                String _plus_6 = ("EClass " + _name_2);
                InputOutput.<String>println(_plus_6);
                EClassifier _eType_1 = feature.getEType();
                String _name_3 = _eType_1.getName();
                String _plus_7 = ("EType " + _name_3);
                InputOutput.<String>println(_plus_7);
                EClassifier _eType_2 = feature.getEType();
                boolean _isSuperTypeOf = eClass.isSuperTypeOf(((EClass) _eType_2));
                InputOutput.<Boolean>println(Boolean.valueOf(_isSuperTypeOf));
                EClassifier _eType_3 = feature.getEType();
                boolean _isSuperTypeOf_1 = eClass.isSuperTypeOf(((EClass) _eType_3));
                boolean _not_2 = (!_isSuperTypeOf_1);
                if (_not_2) {
                  String _name_4 = feature.getName();
                  String _plus_8 = ("Transitive closure is not applicable for EReference returning a different type than their containing class (ref: " + _name_4);
                  String _plus_9 = (_plus_8 + ", return: ");
                  EClassifier _eType_4 = feature.getEType();
                  String _name_5 = _eType_4.getName();
                  String _plus_10 = (_plus_9 + _name_5);
                  String _plus_11 = (_plus_10 + ", eclass: ");
                  String _name_6 = eClass.getName();
                  String _plus_12 = (_plus_11 + _name_6);
                  String _plus_13 = (_plus_12 + ")");
                  this.error(_plus_13, 
                    PrefetchingPackage.Literals.TARGET_PATTERN__PATTERN, 
                    PrefetchingValidator.INVALID_TARGET_PATTERN);
                }
              }
            } else {
              EStructuralFeature _eStructuralFeature_1 = eClass.getEStructuralFeature(currentPattern);
              feature = _eStructuralFeature_1;
            }
            boolean _equals_2 = Objects.equal(feature, null);
            if (_equals_2) {
            } else {
              EClassifier _eType_5 = feature.getEType();
              eClass = ((EClass) _eType_5);
            }
          }
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

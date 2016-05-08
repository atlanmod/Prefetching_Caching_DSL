package fr.inria.atlanmod.neoemf.validation;

import fr.inria.atlanmod.neoemf.validation.AbstractPrefetchingValidator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.validation.Check;

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
  public void checkSourcePatternIsValid(final /* SourcePattern */Object sourcePattern) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field PrefetchingPackage is undefined for the type PrefetchingValidator"
      + "\nThe method or field PrefetchingPackage is undefined for the type PrefetchingValidator"
      + "\nEClass cannot be resolved"
      + "\n== cannot be resolved"
      + "\npattern cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nSOURCE_PATTERN__PATTERN cannot be resolved"
      + "\nEClass cannot be resolved"
      + "\nname cannot be resolved"
      + "\nEClass cannot be resolved"
      + "\nname cannot be resolved"
      + "\nEClass cannot be resolved"
      + "\nname cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nSOURCE_PATTERN__PATTERN cannot be resolved");
  }
  
  @Check
  public void checkMetamodelNsURIIsRegistered(final /* MetamodelImport */Object metamodelImport) {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field PrefetchingPackage is undefined for the type PrefetchingValidator"
      + "\nnsURI cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nMETAMODEL_IMPORT__NS_URI cannot be resolved");
  }
  
  @Check
  public void checkTargetPatternIsValid(final /* TargetPattern */Object targetPattern) {
    throw new Error("Unresolved compilation problems:"
      + "\nPrefetchingRule cannot be resolved to a type."
      + "\nPrefetchingRule cannot be resolved to a type."
      + "\nAccessRule cannot be resolved to a type."
      + "\nThe method or field PrefetchingPackage is undefined for the type PrefetchingValidator"
      + "\nThe method or field PrefetchingPackage is undefined for the type PrefetchingValidator"
      + "\neContainer cannot be resolved"
      + "\npattern cannot be resolved"
      + "\nsplit cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nTARGET_PATTERN__PATTERN cannot be resolved"
      + "\nsourcePattern cannot be resolved"
      + "\npattern cannot be resolved"
      + "\nLiterals cannot be resolved"
      + "\nTARGET_PATTERN__PATTERN cannot be resolved");
  }
  
  public EPackage getImportedEPackage(final EObject in) {
    throw new Error("Unresolved compilation problems:"
      + "\nModel cannot be resolved to a type."
      + "\nModel cannot be resolved to a type."
      + "\nmetamodel cannot be resolved"
      + "\nnsURI cannot be resolved");
  }
}

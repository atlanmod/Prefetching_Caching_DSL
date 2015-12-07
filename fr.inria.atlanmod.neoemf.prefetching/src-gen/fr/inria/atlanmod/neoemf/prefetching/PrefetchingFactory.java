/**
 */
package fr.inria.atlanmod.neoemf.prefetching;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage
 * @generated
 */
public interface PrefetchingFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  PrefetchingFactory eINSTANCE = fr.inria.atlanmod.neoemf.prefetching.impl.PrefetchingFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Model</em>'.
   * @generated
   */
  Model createModel();

  /**
   * Returns a new object of class '<em>Metamodel Import</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Metamodel Import</em>'.
   * @generated
   */
  MetamodelImport createMetamodelImport();

  /**
   * Returns a new object of class '<em>Cache</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cache</em>'.
   * @generated
   */
  Cache createCache();

  /**
   * Returns a new object of class '<em>Cache Properties</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Cache Properties</em>'.
   * @generated
   */
  CacheProperties createCacheProperties();

  /**
   * Returns a new object of class '<em>Plan</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Plan</em>'.
   * @generated
   */
  Plan createPlan();

  /**
   * Returns a new object of class '<em>After Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>After Rule</em>'.
   * @generated
   */
  AfterRule createAfterRule();

  /**
   * Returns a new object of class '<em>Rule</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Rule</em>'.
   * @generated
   */
  PrefetchingRule createPrefetchingRule();

  /**
   * Returns a new object of class '<em>Source Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Source Pattern</em>'.
   * @generated
   */
  SourcePattern createSourcePattern();

  /**
   * Returns a new object of class '<em>Filter Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Filter Pattern</em>'.
   * @generated
   */
  FilterPattern createFilterPattern();

  /**
   * Returns a new object of class '<em>Target Pattern</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Target Pattern</em>'.
   * @generated
   */
  TargetPattern createTargetPattern();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  PrefetchingPackage getPrefetchingPackage();

} //PrefetchingFactory

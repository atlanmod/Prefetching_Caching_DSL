/**
 */
package fr.inria.atlanmod.neoemf.prefetching;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Source Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.SourcePattern#getPattern <em>Pattern</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.SourcePattern#getFilter <em>Filter</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getSourcePattern()
 * @model
 * @generated
 */
public interface SourcePattern extends EObject
{
  /**
   * Returns the value of the '<em><b>Pattern</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Pattern</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Pattern</em>' attribute.
   * @see #setPattern(String)
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getSourcePattern_Pattern()
   * @model
   * @generated
   */
  String getPattern();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.SourcePattern#getPattern <em>Pattern</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Pattern</em>' attribute.
   * @see #getPattern()
   * @generated
   */
  void setPattern(String value);

  /**
   * Returns the value of the '<em><b>Filter</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Filter</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Filter</em>' containment reference.
   * @see #setFilter(FilterPattern)
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getSourcePattern_Filter()
   * @model containment="true"
   * @generated
   */
  FilterPattern getFilter();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.SourcePattern#getFilter <em>Filter</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Filter</em>' containment reference.
   * @see #getFilter()
   * @generated
   */
  void setFilter(FilterPattern value);

} // SourcePattern

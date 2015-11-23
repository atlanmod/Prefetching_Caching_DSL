/**
 */
package fr.inria.atlanmod.neoemf.prefetching;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.Model#getCache <em>Cache</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.Model#getPlans <em>Plans</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getModel()
 * @model
 * @generated
 */
public interface Model extends EObject
{
  /**
   * Returns the value of the '<em><b>Cache</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Cache</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Cache</em>' containment reference.
   * @see #setCache(Cache)
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getModel_Cache()
   * @model containment="true"
   * @generated
   */
  Cache getCache();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.Model#getCache <em>Cache</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Cache</em>' containment reference.
   * @see #getCache()
   * @generated
   */
  void setCache(Cache value);

  /**
   * Returns the value of the '<em><b>Plans</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.atlanmod.neoemf.prefetching.Plan}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plans</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plans</em>' containment reference list.
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getModel_Plans()
   * @model containment="true"
   * @generated
   */
  EList<Plan> getPlans();

} // Model

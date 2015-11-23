/**
 */
package fr.inria.atlanmod.neoemf.prefetching;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.AfterRule#getPlanId <em>Plan Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getAfterRule()
 * @model
 * @generated
 */
public interface AfterRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Plan Id</b></em>' reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plan Id</em>' reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plan Id</em>' reference.
   * @see #setPlanId(Plan)
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getAfterRule_PlanId()
   * @model
   * @generated
   */
  Plan getPlanId();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.AfterRule#getPlanId <em>Plan Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plan Id</em>' reference.
   * @see #getPlanId()
   * @generated
   */
  void setPlanId(Plan value);

} // AfterRule

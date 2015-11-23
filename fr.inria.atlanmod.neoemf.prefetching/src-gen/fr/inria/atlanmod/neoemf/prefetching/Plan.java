/**
 */
package fr.inria.atlanmod.neoemf.prefetching;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Plan</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.Plan#getPlanId <em>Plan Id</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.Plan#getAfter <em>After</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.Plan#getRules <em>Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getPlan()
 * @model
 * @generated
 */
public interface Plan extends EObject
{
  /**
   * Returns the value of the '<em><b>Plan Id</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Plan Id</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Plan Id</em>' attribute.
   * @see #setPlanId(String)
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getPlan_PlanId()
   * @model
   * @generated
   */
  String getPlanId();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.Plan#getPlanId <em>Plan Id</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Plan Id</em>' attribute.
   * @see #getPlanId()
   * @generated
   */
  void setPlanId(String value);

  /**
   * Returns the value of the '<em><b>After</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>After</em>' containment reference isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>After</em>' containment reference.
   * @see #setAfter(AfterRule)
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getPlan_After()
   * @model containment="true"
   * @generated
   */
  AfterRule getAfter();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.Plan#getAfter <em>After</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>After</em>' containment reference.
   * @see #getAfter()
   * @generated
   */
  void setAfter(AfterRule value);

  /**
   * Returns the value of the '<em><b>Rules</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Rules</em>' containment reference list.
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getPlan_Rules()
   * @model containment="true"
   * @generated
   */
  EList<PrefetchingRule> getRules();

} // Plan

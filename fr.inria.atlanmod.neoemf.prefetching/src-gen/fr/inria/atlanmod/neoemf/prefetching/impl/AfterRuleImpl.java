/**
 */
package fr.inria.atlanmod.neoemf.prefetching.impl;

import fr.inria.atlanmod.neoemf.prefetching.AfterRule;
import fr.inria.atlanmod.neoemf.prefetching.Plan;
import fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>After Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.impl.AfterRuleImpl#getPlanId <em>Plan Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AfterRuleImpl extends MinimalEObjectImpl.Container implements AfterRule
{
  /**
   * The cached value of the '{@link #getPlanId() <em>Plan Id</em>}' reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getPlanId()
   * @generated
   * @ordered
   */
  protected Plan planId;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected AfterRuleImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return PrefetchingPackage.Literals.AFTER_RULE;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plan getPlanId()
  {
    if (planId != null && planId.eIsProxy())
    {
      InternalEObject oldPlanId = (InternalEObject)planId;
      planId = (Plan)eResolveProxy(oldPlanId);
      if (planId != oldPlanId)
      {
        if (eNotificationRequired())
          eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrefetchingPackage.AFTER_RULE__PLAN_ID, oldPlanId, planId));
      }
    }
    return planId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Plan basicGetPlanId()
  {
    return planId;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void setPlanId(Plan newPlanId)
  {
    Plan oldPlanId = planId;
    planId = newPlanId;
    if (eNotificationRequired())
      eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.AFTER_RULE__PLAN_ID, oldPlanId, planId));
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public Object eGet(int featureID, boolean resolve, boolean coreType)
  {
    switch (featureID)
    {
      case PrefetchingPackage.AFTER_RULE__PLAN_ID:
        if (resolve) return getPlanId();
        return basicGetPlanId();
    }
    return super.eGet(featureID, resolve, coreType);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eSet(int featureID, Object newValue)
  {
    switch (featureID)
    {
      case PrefetchingPackage.AFTER_RULE__PLAN_ID:
        setPlanId((Plan)newValue);
        return;
    }
    super.eSet(featureID, newValue);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public void eUnset(int featureID)
  {
    switch (featureID)
    {
      case PrefetchingPackage.AFTER_RULE__PLAN_ID:
        setPlanId((Plan)null);
        return;
    }
    super.eUnset(featureID);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean eIsSet(int featureID)
  {
    switch (featureID)
    {
      case PrefetchingPackage.AFTER_RULE__PLAN_ID:
        return planId != null;
    }
    return super.eIsSet(featureID);
  }

} //AfterRuleImpl

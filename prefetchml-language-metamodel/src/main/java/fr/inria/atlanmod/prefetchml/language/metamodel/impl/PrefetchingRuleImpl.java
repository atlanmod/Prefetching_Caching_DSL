/**
 */
package fr.inria.atlanmod.prefetchml.language.metamodel.impl;

import fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage;
import fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingRule;
import fr.inria.atlanmod.prefetchml.language.metamodel.TargetPattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.impl.PrefetchingRuleImpl#getTargetPattern <em>Target Pattern</em>}</li>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.impl.PrefetchingRuleImpl#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrefetchingRuleImpl extends MinimalEObjectImpl.Container implements PrefetchingRule {
	/**
	 * The cached value of the '{@link #getTargetPattern() <em>Target Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetPattern()
	 * @generated
	 * @ordered
	 */
	protected TargetPattern targetPattern;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrefetchingRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrefetchingPackage.Literals.PREFETCHING_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TargetPattern getTargetPattern() {
		return targetPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetPattern(TargetPattern newTargetPattern, NotificationChain msgs) {
		TargetPattern oldTargetPattern = targetPattern;
		targetPattern = newTargetPattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN, oldTargetPattern, newTargetPattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetPattern(TargetPattern newTargetPattern) {
		if (newTargetPattern != targetPattern) {
			NotificationChain msgs = null;
			if (targetPattern != null)
				msgs = ((InternalEObject)targetPattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN, null, msgs);
			if (newTargetPattern != null)
				msgs = ((InternalEObject)newTargetPattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN, null, msgs);
			msgs = basicSetTargetPattern(newTargetPattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN, newTargetPattern, newTargetPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.PREFETCHING_RULE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN:
				return basicSetTargetPattern(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN:
				return getTargetPattern();
			case PrefetchingPackage.PREFETCHING_RULE__NAME:
				return getName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN:
				setTargetPattern((TargetPattern)newValue);
				return;
			case PrefetchingPackage.PREFETCHING_RULE__NAME:
				setName((String)newValue);
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
	public void eUnset(int featureID) {
		switch (featureID) {
			case PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN:
				setTargetPattern((TargetPattern)null);
				return;
			case PrefetchingPackage.PREFETCHING_RULE__NAME:
				setName(NAME_EDEFAULT);
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
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN:
				return targetPattern != null;
			case PrefetchingPackage.PREFETCHING_RULE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(')');
		return result.toString();
	}

} //PrefetchingRuleImpl

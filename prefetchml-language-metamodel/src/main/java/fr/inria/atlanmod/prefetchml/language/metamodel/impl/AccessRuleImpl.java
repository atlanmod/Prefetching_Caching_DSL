/**
 */
package fr.inria.atlanmod.prefetchml.language.metamodel.impl;

import fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule;
import fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage;
import fr.inria.atlanmod.prefetchml.language.metamodel.SourcePattern;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Access Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.impl.AccessRuleImpl#getSourcePattern <em>Source Pattern</em>}</li>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.impl.AccessRuleImpl#getRemoveType <em>Remove Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AccessRuleImpl extends PrefetchingRuleImpl implements AccessRule {
	/**
	 * The cached value of the '{@link #getSourcePattern() <em>Source Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourcePattern()
	 * @generated
	 * @ordered
	 */
	protected SourcePattern sourcePattern;

	/**
	 * The default value of the '{@link #getRemoveType() <em>Remove Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveType()
	 * @generated
	 * @ordered
	 */
	protected static final String REMOVE_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRemoveType() <em>Remove Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemoveType()
	 * @generated
	 * @ordered
	 */
	protected String removeType = REMOVE_TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AccessRuleImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrefetchingPackage.Literals.ACCESS_RULE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourcePattern getSourcePattern() {
		return sourcePattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourcePattern(SourcePattern newSourcePattern, NotificationChain msgs) {
		SourcePattern oldSourcePattern = sourcePattern;
		sourcePattern = newSourcePattern;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrefetchingPackage.ACCESS_RULE__SOURCE_PATTERN, oldSourcePattern, newSourcePattern);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourcePattern(SourcePattern newSourcePattern) {
		if (newSourcePattern != sourcePattern) {
			NotificationChain msgs = null;
			if (sourcePattern != null)
				msgs = ((InternalEObject)sourcePattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrefetchingPackage.ACCESS_RULE__SOURCE_PATTERN, null, msgs);
			if (newSourcePattern != null)
				msgs = ((InternalEObject)newSourcePattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrefetchingPackage.ACCESS_RULE__SOURCE_PATTERN, null, msgs);
			msgs = basicSetSourcePattern(newSourcePattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.ACCESS_RULE__SOURCE_PATTERN, newSourcePattern, newSourcePattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRemoveType() {
		return removeType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRemoveType(String newRemoveType) {
		String oldRemoveType = removeType;
		removeType = newRemoveType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.ACCESS_RULE__REMOVE_TYPE, oldRemoveType, removeType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case PrefetchingPackage.ACCESS_RULE__SOURCE_PATTERN:
				return basicSetSourcePattern(null, msgs);
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
			case PrefetchingPackage.ACCESS_RULE__SOURCE_PATTERN:
				return getSourcePattern();
			case PrefetchingPackage.ACCESS_RULE__REMOVE_TYPE:
				return getRemoveType();
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
			case PrefetchingPackage.ACCESS_RULE__SOURCE_PATTERN:
				setSourcePattern((SourcePattern)newValue);
				return;
			case PrefetchingPackage.ACCESS_RULE__REMOVE_TYPE:
				setRemoveType((String)newValue);
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
			case PrefetchingPackage.ACCESS_RULE__SOURCE_PATTERN:
				setSourcePattern((SourcePattern)null);
				return;
			case PrefetchingPackage.ACCESS_RULE__REMOVE_TYPE:
				setRemoveType(REMOVE_TYPE_EDEFAULT);
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
			case PrefetchingPackage.ACCESS_RULE__SOURCE_PATTERN:
				return sourcePattern != null;
			case PrefetchingPackage.ACCESS_RULE__REMOVE_TYPE:
				return REMOVE_TYPE_EDEFAULT == null ? removeType != null : !REMOVE_TYPE_EDEFAULT.equals(removeType);
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
		result.append(" (removeType: ");
		result.append(removeType);
		result.append(')');
		return result.toString();
	}

} //AccessRuleImpl

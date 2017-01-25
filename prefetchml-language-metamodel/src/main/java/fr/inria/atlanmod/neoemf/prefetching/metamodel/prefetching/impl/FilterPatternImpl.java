/**
 */
package fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FilterPattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Filter Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FilterPatternImpl#getStringPattern <em>String Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FilterPatternImpl extends MinimalEObjectImpl.Container implements FilterPattern {
	/**
	 * The default value of the '{@link #getStringPattern() <em>String Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringPattern()
	 * @generated
	 * @ordered
	 */
	protected static final String STRING_PATTERN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStringPattern() <em>String Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStringPattern()
	 * @generated
	 * @ordered
	 */
	protected String stringPattern = STRING_PATTERN_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FilterPatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrefetchingPackage.Literals.FILTER_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStringPattern() {
		return stringPattern;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStringPattern(String newStringPattern) {
		String oldStringPattern = stringPattern;
		stringPattern = newStringPattern;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.FILTER_PATTERN__STRING_PATTERN, oldStringPattern, stringPattern));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrefetchingPackage.FILTER_PATTERN__STRING_PATTERN:
				return getStringPattern();
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
			case PrefetchingPackage.FILTER_PATTERN__STRING_PATTERN:
				setStringPattern((String)newValue);
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
			case PrefetchingPackage.FILTER_PATTERN__STRING_PATTERN:
				setStringPattern(STRING_PATTERN_EDEFAULT);
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
			case PrefetchingPackage.FILTER_PATTERN__STRING_PATTERN:
				return STRING_PATTERN_EDEFAULT == null ? stringPattern != null : !STRING_PATTERN_EDEFAULT.equals(stringPattern);
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
		result.append(" (stringPattern: ");
		result.append(stringPattern);
		result.append(')');
		return result.toString();
	}

} //FilterPatternImpl

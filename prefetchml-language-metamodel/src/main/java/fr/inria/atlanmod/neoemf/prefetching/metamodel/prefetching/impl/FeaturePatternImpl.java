/**
 */
package fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.FeaturePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Feature Pattern</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FeaturePatternImpl#getFeature <em>Feature</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.FeaturePatternImpl#isClosure <em>Closure</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FeaturePatternImpl extends MinimalEObjectImpl.Container implements FeaturePattern {
	/**
	 * The cached value of the '{@link #getFeature() <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFeature()
	 * @generated
	 * @ordered
	 */
	protected EStructuralFeature feature;

	/**
	 * The default value of the '{@link #isClosure() <em>Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosure()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CLOSURE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isClosure() <em>Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isClosure()
	 * @generated
	 * @ordered
	 */
	protected boolean closure = CLOSURE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FeaturePatternImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrefetchingPackage.Literals.FEATURE_PATTERN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature getFeature() {
		if (feature != null && feature.eIsProxy()) {
			InternalEObject oldFeature = (InternalEObject)feature;
			feature = (EStructuralFeature)eResolveProxy(oldFeature);
			if (feature != oldFeature) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, PrefetchingPackage.FEATURE_PATTERN__FEATURE, oldFeature, feature));
			}
		}
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EStructuralFeature basicGetFeature() {
		return feature;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFeature(EStructuralFeature newFeature) {
		EStructuralFeature oldFeature = feature;
		feature = newFeature;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.FEATURE_PATTERN__FEATURE, oldFeature, feature));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isClosure() {
		return closure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClosure(boolean newClosure) {
		boolean oldClosure = closure;
		closure = newClosure;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.FEATURE_PATTERN__CLOSURE, oldClosure, closure));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrefetchingPackage.FEATURE_PATTERN__FEATURE:
				if (resolve) return getFeature();
				return basicGetFeature();
			case PrefetchingPackage.FEATURE_PATTERN__CLOSURE:
				return isClosure();
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
			case PrefetchingPackage.FEATURE_PATTERN__FEATURE:
				setFeature((EStructuralFeature)newValue);
				return;
			case PrefetchingPackage.FEATURE_PATTERN__CLOSURE:
				setClosure((Boolean)newValue);
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
			case PrefetchingPackage.FEATURE_PATTERN__FEATURE:
				setFeature((EStructuralFeature)null);
				return;
			case PrefetchingPackage.FEATURE_PATTERN__CLOSURE:
				setClosure(CLOSURE_EDEFAULT);
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
			case PrefetchingPackage.FEATURE_PATTERN__FEATURE:
				return feature != null;
			case PrefetchingPackage.FEATURE_PATTERN__CLOSURE:
				return closure != CLOSURE_EDEFAULT;
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
		result.append(" (closure: ");
		result.append(closure);
		result.append(')');
		return result.toString();
	}

} //FeaturePatternImpl

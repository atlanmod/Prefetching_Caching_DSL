/**
 */
package fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl;

import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.SourcePattern;
import fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.TargetPattern;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingRuleImpl#getTargetPattern <em>Target Pattern</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingRuleImpl#getProbability <em>Probability</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingRuleImpl#getSubRules <em>Sub Rules</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.impl.PrefetchingRuleImpl#getSourcePattern <em>Source Pattern</em>}</li>
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
	 * The default value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected static final int PROBABILITY_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getProbability() <em>Probability</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProbability()
	 * @generated
	 * @ordered
	 */
	protected int probability = PROBABILITY_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSubRules() <em>Sub Rules</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubRules()
	 * @generated
	 * @ordered
	 */
	protected EList<PrefetchingRule> subRules;

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
	public int getProbability() {
		return probability;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProbability(int newProbability) {
		int oldProbability = probability;
		probability = newProbability;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.PREFETCHING_RULE__PROBABILITY, oldProbability, probability));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PrefetchingRule> getSubRules() {
		if (subRules == null) {
			subRules = new EObjectContainmentEList<PrefetchingRule>(PrefetchingRule.class, this, PrefetchingPackage.PREFETCHING_RULE__SUB_RULES);
		}
		return subRules;
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, PrefetchingPackage.PREFETCHING_RULE__SOURCE_PATTERN, oldSourcePattern, newSourcePattern);
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
				msgs = ((InternalEObject)sourcePattern).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - PrefetchingPackage.PREFETCHING_RULE__SOURCE_PATTERN, null, msgs);
			if (newSourcePattern != null)
				msgs = ((InternalEObject)newSourcePattern).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - PrefetchingPackage.PREFETCHING_RULE__SOURCE_PATTERN, null, msgs);
			msgs = basicSetSourcePattern(newSourcePattern, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.PREFETCHING_RULE__SOURCE_PATTERN, newSourcePattern, newSourcePattern));
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
			case PrefetchingPackage.PREFETCHING_RULE__SUB_RULES:
				return ((InternalEList<?>)getSubRules()).basicRemove(otherEnd, msgs);
			case PrefetchingPackage.PREFETCHING_RULE__SOURCE_PATTERN:
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
			case PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN:
				return getTargetPattern();
			case PrefetchingPackage.PREFETCHING_RULE__PROBABILITY:
				return getProbability();
			case PrefetchingPackage.PREFETCHING_RULE__SUB_RULES:
				return getSubRules();
			case PrefetchingPackage.PREFETCHING_RULE__SOURCE_PATTERN:
				return getSourcePattern();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrefetchingPackage.PREFETCHING_RULE__TARGET_PATTERN:
				setTargetPattern((TargetPattern)newValue);
				return;
			case PrefetchingPackage.PREFETCHING_RULE__PROBABILITY:
				setProbability((Integer)newValue);
				return;
			case PrefetchingPackage.PREFETCHING_RULE__SUB_RULES:
				getSubRules().clear();
				getSubRules().addAll((Collection<? extends PrefetchingRule>)newValue);
				return;
			case PrefetchingPackage.PREFETCHING_RULE__SOURCE_PATTERN:
				setSourcePattern((SourcePattern)newValue);
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
			case PrefetchingPackage.PREFETCHING_RULE__PROBABILITY:
				setProbability(PROBABILITY_EDEFAULT);
				return;
			case PrefetchingPackage.PREFETCHING_RULE__SUB_RULES:
				getSubRules().clear();
				return;
			case PrefetchingPackage.PREFETCHING_RULE__SOURCE_PATTERN:
				setSourcePattern((SourcePattern)null);
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
			case PrefetchingPackage.PREFETCHING_RULE__PROBABILITY:
				return probability != PROBABILITY_EDEFAULT;
			case PrefetchingPackage.PREFETCHING_RULE__SUB_RULES:
				return subRules != null && !subRules.isEmpty();
			case PrefetchingPackage.PREFETCHING_RULE__SOURCE_PATTERN:
				return sourcePattern != null;
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
		result.append(" (probability: ");
		result.append(probability);
		result.append(')');
		return result.toString();
	}

} //PrefetchingRuleImpl

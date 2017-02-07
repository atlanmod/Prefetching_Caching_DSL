/**
 */
package hu.bme.hit.trainbenchmark.railway.impl;

import hu.bme.hit.trainbenchmark.railway.Position;
import hu.bme.hit.trainbenchmark.railway.RailwayPackage;
import hu.bme.hit.trainbenchmark.railway.Switch;
import hu.bme.hit.trainbenchmark.railway.SwitchPosition;
import hu.bme.hit.trainbenchmark.railway.TrackElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SwitchImpl#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SwitchImpl#getPositions <em>Positions</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SwitchImpl#getLeft <em>Left</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SwitchImpl#getRight <em>Right</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SwitchImpl#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchImpl extends TrackElementImpl implements Switch {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwayPackage.Literals.SWITCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getCurrentPosition() {
		return (Position)eGet(RailwayPackage.Literals.SWITCH__CURRENT_POSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCurrentPosition(Position newCurrentPosition) {
		eSet(RailwayPackage.Literals.SWITCH__CURRENT_POSITION, newCurrentPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<SwitchPosition> getPositions() {
		return (EList<SwitchPosition>)eGet(RailwayPackage.Literals.SWITCH__POSITIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement getLeft() {
		return (TrackElement)eGet(RailwayPackage.Literals.SWITCH__LEFT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLeft(TrackElement newLeft) {
		eSet(RailwayPackage.Literals.SWITCH__LEFT, newLeft);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement getRight() {
		return (TrackElement)eGet(RailwayPackage.Literals.SWITCH__RIGHT, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRight(TrackElement newRight) {
		eSet(RailwayPackage.Literals.SWITCH__RIGHT, newRight);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TrackElement getFrom() {
		return (TrackElement)eGet(RailwayPackage.Literals.SWITCH__FROM, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFrom(TrackElement newFrom) {
		eSet(RailwayPackage.Literals.SWITCH__FROM, newFrom);
	}

} //SwitchImpl

/**
 */
package hu.bme.hit.trainbenchmark.railway.impl;

import hu.bme.hit.trainbenchmark.railway.Position;
import hu.bme.hit.trainbenchmark.railway.RailwayPackage;
import hu.bme.hit.trainbenchmark.railway.Route;
import hu.bme.hit.trainbenchmark.railway.Switch;
import hu.bme.hit.trainbenchmark.railway.SwitchPosition;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SwitchPositionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SwitchPositionImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SwitchPositionImpl#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SwitchPositionImpl extends RailwayElementImpl implements SwitchPosition {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SwitchPositionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwayPackage.Literals.SWITCH_POSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Switch getTarget() {
		return (Switch)eGet(RailwayPackage.Literals.SWITCH_POSITION__TARGET, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Switch newTarget) {
		eSet(RailwayPackage.Literals.SWITCH_POSITION__TARGET, newTarget);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Position getPosition() {
		return (Position)eGet(RailwayPackage.Literals.SWITCH_POSITION__POSITION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPosition(Position newPosition) {
		eSet(RailwayPackage.Literals.SWITCH_POSITION__POSITION, newPosition);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Route getRoute() {
		return (Route)eGet(RailwayPackage.Literals.SWITCH_POSITION__ROUTE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRoute(Route newRoute) {
		eSet(RailwayPackage.Literals.SWITCH_POSITION__ROUTE, newRoute);
	}

} //SwitchPositionImpl

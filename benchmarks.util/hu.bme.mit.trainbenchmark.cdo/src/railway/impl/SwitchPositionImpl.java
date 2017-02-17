/**
 */
package railway.impl;

import org.eclipse.emf.ecore.EClass;

import railway.Position;
import railway.RailwayPackage;
import railway.Route;
import railway.Switch;
import railway.SwitchPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Switch Position</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link railway.impl.SwitchPositionImpl#getTarget <em>Target</em>}</li>
 *   <li>{@link railway.impl.SwitchPositionImpl#getPosition <em>Position</em>}</li>
 *   <li>{@link railway.impl.SwitchPositionImpl#getRoute <em>Route</em>}</li>
 * </ul>
 * </p>
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

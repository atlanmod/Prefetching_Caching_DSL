/**
 */
package railway.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import railway.RailwayPackage;
import railway.Route;
import railway.Semaphore;
import railway.Sensor;
import railway.SwitchPosition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link railway.impl.RouteImpl#getEntry <em>Entry</em>}</li>
 *   <li>{@link railway.impl.RouteImpl#getFollows <em>Follows</em>}</li>
 *   <li>{@link railway.impl.RouteImpl#getExit <em>Exit</em>}</li>
 *   <li>{@link railway.impl.RouteImpl#getGathers <em>Gathers</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RouteImpl extends RailwayElementImpl implements Route {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RouteImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RailwayPackage.Literals.ROUTE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Semaphore getEntry() {
        return (Semaphore)eGet(RailwayPackage.Literals.ROUTE__ENTRY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEntry(Semaphore newEntry) {
        eSet(RailwayPackage.Literals.ROUTE__ENTRY, newEntry);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<SwitchPosition> getFollows() {
        return (EList<SwitchPosition>)eGet(RailwayPackage.Literals.ROUTE__FOLLOWS, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Semaphore getExit() {
        return (Semaphore)eGet(RailwayPackage.Literals.ROUTE__EXIT, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExit(Semaphore newExit) {
        eSet(RailwayPackage.Literals.ROUTE__EXIT, newExit);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Sensor> getGathers() {
        return (EList<Sensor>)eGet(RailwayPackage.Literals.ROUTE__GATHERS, true);
    }

} //RouteImpl

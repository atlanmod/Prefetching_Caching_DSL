/**
 */
package railway.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import railway.RailwayPackage;
import railway.Sensor;
import railway.TrackElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link railway.impl.SensorImpl#getMonitors <em>Monitors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SensorImpl extends RailwayElementImpl implements Sensor {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SensorImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RailwayPackage.Literals.SENSOR;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<TrackElement> getMonitors() {
        return (EList<TrackElement>)eGet(RailwayPackage.Literals.SENSOR__MONITORS, true);
    }

} //SensorImpl

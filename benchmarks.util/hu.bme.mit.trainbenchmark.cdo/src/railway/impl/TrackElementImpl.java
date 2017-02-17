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
 * An implementation of the model object '<em><b>Track Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link railway.impl.TrackElementImpl#getMonitoredBy <em>Monitored By</em>}</li>
 *   <li>{@link railway.impl.TrackElementImpl#getConnectsTo <em>Connects To</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class TrackElementImpl extends RailwayElementImpl implements TrackElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected TrackElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RailwayPackage.Literals.TRACK_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Sensor> getMonitoredBy() {
        return (EList<Sensor>)eGet(RailwayPackage.Literals.TRACK_ELEMENT__MONITORED_BY, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<TrackElement> getConnectsTo() {
        return (EList<TrackElement>)eGet(RailwayPackage.Literals.TRACK_ELEMENT__CONNECTS_TO, true);
    }

} //TrackElementImpl

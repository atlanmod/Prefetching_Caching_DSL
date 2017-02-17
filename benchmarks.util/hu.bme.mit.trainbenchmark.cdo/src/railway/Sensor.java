/**
 */
package railway;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link railway.Sensor#getMonitors <em>Monitors</em>}</li>
 * </ul>
 * </p>
 *
 * @see railway.RailwayPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends RailwayElement {
    /**
     * Returns the value of the '<em><b>Monitors</b></em>' reference list.
     * The list contents are of type {@link railway.TrackElement}.
     * It is bidirectional and its opposite is '{@link railway.TrackElement#getMonitoredBy <em>Monitored By</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitors</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitors</em>' reference list.
     * @see railway.RailwayPackage#getSensor_Monitors()
     * @see railway.TrackElement#getMonitoredBy
     * @model opposite="monitoredBy"
     * @generated
     */
    EList<TrackElement> getMonitors();

} // Sensor

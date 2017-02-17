/**
 */
package railway;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Track Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link railway.TrackElement#getMonitoredBy <em>Monitored By</em>}</li>
 *   <li>{@link railway.TrackElement#getConnectsTo <em>Connects To</em>}</li>
 * </ul>
 * </p>
 *
 * @see railway.RailwayPackage#getTrackElement()
 * @model abstract="true"
 * @generated
 */
public interface TrackElement extends RailwayElement {
    /**
     * Returns the value of the '<em><b>Monitored By</b></em>' reference list.
     * The list contents are of type {@link railway.Sensor}.
     * It is bidirectional and its opposite is '{@link railway.Sensor#getMonitors <em>Monitors</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Monitored By</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Monitored By</em>' reference list.
     * @see railway.RailwayPackage#getTrackElement_MonitoredBy()
     * @see railway.Sensor#getMonitors
     * @model opposite="monitors"
     * @generated
     */
    EList<Sensor> getMonitoredBy();

    /**
     * Returns the value of the '<em><b>Connects To</b></em>' reference list.
     * The list contents are of type {@link railway.TrackElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Connects To</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Connects To</em>' reference list.
     * @see railway.RailwayPackage#getTrackElement_ConnectsTo()
     * @model
     * @generated
     */
    EList<TrackElement> getConnectsTo();

} // TrackElement

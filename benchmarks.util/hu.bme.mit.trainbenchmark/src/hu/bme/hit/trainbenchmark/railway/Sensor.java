/**
 */
package hu.bme.hit.trainbenchmark.railway;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sensor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.Sensor#getMonitors <em>Monitors</em>}</li>
 * </ul>
 *
 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getSensor()
 * @model
 * @generated
 */
public interface Sensor extends RailwayElement {
	/**
	 * Returns the value of the '<em><b>Monitors</b></em>' reference list.
	 * The list contents are of type {@link hu.bme.hit.trainbenchmark.railway.TrackElement}.
	 * It is bidirectional and its opposite is '{@link hu.bme.hit.trainbenchmark.railway.TrackElement#getMonitoredBy <em>Monitored By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Monitors</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Monitors</em>' reference list.
	 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getSensor_Monitors()
	 * @see hu.bme.hit.trainbenchmark.railway.TrackElement#getMonitoredBy
	 * @model opposite="monitoredBy"
	 * @generated
	 */
	EList<TrackElement> getMonitors();

} // Sensor

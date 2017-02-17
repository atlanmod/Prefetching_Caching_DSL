/**
 */
package railway;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link railway.Region#getElements <em>Elements</em>}</li>
 *   <li>{@link railway.Region#getSensors <em>Sensors</em>}</li>
 * </ul>
 * </p>
 *
 * @see railway.RailwayPackage#getRegion()
 * @model
 * @generated
 */
public interface Region extends RailwayElement {
    /**
     * Returns the value of the '<em><b>Elements</b></em>' containment reference list.
     * The list contents are of type {@link railway.TrackElement}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Elements</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Elements</em>' containment reference list.
     * @see railway.RailwayPackage#getRegion_Elements()
     * @model containment="true"
     * @generated
     */
    EList<TrackElement> getElements();

    /**
     * Returns the value of the '<em><b>Sensors</b></em>' containment reference list.
     * The list contents are of type {@link railway.Sensor}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Sensors</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Sensors</em>' containment reference list.
     * @see railway.RailwayPackage#getRegion_Sensors()
     * @model containment="true"
     * @generated
     */
    EList<Sensor> getSensors();

} // Region

/**
 */
package railway;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Route</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link railway.Route#getEntry <em>Entry</em>}</li>
 *   <li>{@link railway.Route#getFollows <em>Follows</em>}</li>
 *   <li>{@link railway.Route#getExit <em>Exit</em>}</li>
 *   <li>{@link railway.Route#getGathers <em>Gathers</em>}</li>
 * </ul>
 * </p>
 *
 * @see railway.RailwayPackage#getRoute()
 * @model
 * @generated
 */
public interface Route extends RailwayElement {
    /**
     * Returns the value of the '<em><b>Entry</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Entry</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Entry</em>' reference.
     * @see #setEntry(Semaphore)
     * @see railway.RailwayPackage#getRoute_Entry()
     * @model required="true"
     * @generated
     */
    Semaphore getEntry();

    /**
     * Sets the value of the '{@link railway.Route#getEntry <em>Entry</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Entry</em>' reference.
     * @see #getEntry()
     * @generated
     */
    void setEntry(Semaphore value);

    /**
     * Returns the value of the '<em><b>Follows</b></em>' containment reference list.
     * The list contents are of type {@link railway.SwitchPosition}.
     * It is bidirectional and its opposite is '{@link railway.SwitchPosition#getRoute <em>Route</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Follows</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Follows</em>' containment reference list.
     * @see railway.RailwayPackage#getRoute_Follows()
     * @see railway.SwitchPosition#getRoute
     * @model opposite="route" containment="true"
     * @generated
     */
    EList<SwitchPosition> getFollows();

    /**
     * Returns the value of the '<em><b>Exit</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Exit</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Exit</em>' reference.
     * @see #setExit(Semaphore)
     * @see railway.RailwayPackage#getRoute_Exit()
     * @model required="true"
     * @generated
     */
    Semaphore getExit();

    /**
     * Sets the value of the '{@link railway.Route#getExit <em>Exit</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Exit</em>' reference.
     * @see #getExit()
     * @generated
     */
    void setExit(Semaphore value);

    /**
     * Returns the value of the '<em><b>Gathers</b></em>' reference list.
     * The list contents are of type {@link railway.Sensor}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Gathers</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Gathers</em>' reference list.
     * @see railway.RailwayPackage#getRoute_Gathers()
     * @model lower="2"
     * @generated
     */
    EList<Sensor> getGathers();

} // Route

/**
 */
package hu.bme.hit.trainbenchmark.railway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.SwitchPosition#getTarget <em>Target</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.SwitchPosition#getPosition <em>Position</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.SwitchPosition#getRoute <em>Route</em>}</li>
 * </ul>
 *
 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getSwitchPosition()
 * @model
 * @generated
 */
public interface SwitchPosition extends RailwayElement {
	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.hit.trainbenchmark.railway.Switch#getPositions <em>Positions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Switch)
	 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getSwitchPosition_Target()
	 * @see hu.bme.hit.trainbenchmark.railway.Switch#getPositions
	 * @model opposite="positions" required="true"
	 * @generated
	 */
	Switch getTarget();

	/**
	 * Sets the value of the '{@link hu.bme.hit.trainbenchmark.railway.SwitchPosition#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Switch value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The literals are from the enumeration {@link hu.bme.hit.trainbenchmark.railway.Position}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see hu.bme.hit.trainbenchmark.railway.Position
	 * @see #setPosition(Position)
	 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getSwitchPosition_Position()
	 * @model required="true"
	 * @generated
	 */
	Position getPosition();

	/**
	 * Sets the value of the '{@link hu.bme.hit.trainbenchmark.railway.SwitchPosition#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see hu.bme.hit.trainbenchmark.railway.Position
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(Position value);

	/**
	 * Returns the value of the '<em><b>Route</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link hu.bme.hit.trainbenchmark.railway.Route#getFollows <em>Follows</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route</em>' container reference.
	 * @see #setRoute(Route)
	 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getSwitchPosition_Route()
	 * @see hu.bme.hit.trainbenchmark.railway.Route#getFollows
	 * @model opposite="follows" required="true" transient="false"
	 * @generated
	 */
	Route getRoute();

	/**
	 * Sets the value of the '{@link hu.bme.hit.trainbenchmark.railway.SwitchPosition#getRoute <em>Route</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Route</em>' container reference.
	 * @see #getRoute()
	 * @generated
	 */
	void setRoute(Route value);

} // SwitchPosition

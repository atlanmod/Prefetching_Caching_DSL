/**
 */
package hu.bme.hit.trainbenchmark.railway;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.RailwayElement#get_id <em>id</em>}</li>
 * </ul>
 *
 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getRailwayElement()
 * @model abstract="true"
 * @extends PersistentEObject
 * @generated
 */
public interface RailwayElement extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>id</em>' attribute.
	 * @see #set_id(int)
	 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getRailwayElement__id()
	 * @model
	 * @generated
	 */
	int get_id();

	/**
	 * Sets the value of the '{@link hu.bme.hit.trainbenchmark.railway.RailwayElement#get_id <em>id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>id</em>' attribute.
	 * @see #get_id()
	 * @generated
	 */
	void set_id(int value);

} // RailwayElement

/**
 */
package hu.bme.hit.trainbenchmark.railway;

import fr.inria.atlanmod.neoemf.core.PersistentEObject;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.RailwayContainer#getRoutes <em>Routes</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.RailwayContainer#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getRailwayContainer()
 * @model
 * @extends PersistentEObject
 * @generated
 */
public interface RailwayContainer extends PersistentEObject {
	/**
	 * Returns the value of the '<em><b>Routes</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.hit.trainbenchmark.railway.Route}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Routes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Routes</em>' containment reference list.
	 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getRailwayContainer_Routes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Route> getRoutes();

	/**
	 * Returns the value of the '<em><b>Regions</b></em>' containment reference list.
	 * The list contents are of type {@link hu.bme.hit.trainbenchmark.railway.Region}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Regions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Regions</em>' containment reference list.
	 * @see hu.bme.hit.trainbenchmark.railway.RailwayPackage#getRailwayContainer_Regions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Region> getRegions();

} // RailwayContainer

/**
 */
package hu.bme.hit.trainbenchmark.railway.impl;

import hu.bme.hit.trainbenchmark.railway.RailwayPackage;
import hu.bme.hit.trainbenchmark.railway.Region;
import hu.bme.hit.trainbenchmark.railway.Sensor;
import hu.bme.hit.trainbenchmark.railway.TrackElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Region</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.RegionImpl#getElements <em>Elements</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.RegionImpl#getSensors <em>Sensors</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegionImpl extends RailwayElementImpl implements Region {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwayPackage.Literals.REGION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<TrackElement> getElements() {
		return (EList<TrackElement>)eGet(RailwayPackage.Literals.REGION__ELEMENTS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Sensor> getSensors() {
		return (EList<Sensor>)eGet(RailwayPackage.Literals.REGION__SENSORS, true);
	}

} //RegionImpl

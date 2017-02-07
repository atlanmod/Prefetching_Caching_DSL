/**
 */
package hu.bme.hit.trainbenchmark.railway.impl;

import fr.inria.atlanmod.neoemf.core.DefaultPersistentEObject;

import hu.bme.hit.trainbenchmark.railway.RailwayContainer;
import hu.bme.hit.trainbenchmark.railway.RailwayPackage;
import hu.bme.hit.trainbenchmark.railway.Region;
import hu.bme.hit.trainbenchmark.railway.Route;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.RailwayContainerImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.RailwayContainerImpl#getRegions <em>Regions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RailwayContainerImpl extends DefaultPersistentEObject implements RailwayContainer {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RailwayContainerImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RailwayPackage.Literals.RAILWAY_CONTAINER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Route> getRoutes() {
		return (EList<Route>)eGet(RailwayPackage.Literals.RAILWAY_CONTAINER__ROUTES, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Region> getRegions() {
		return (EList<Region>)eGet(RailwayPackage.Literals.RAILWAY_CONTAINER__REGIONS, true);
	}

} //RailwayContainerImpl

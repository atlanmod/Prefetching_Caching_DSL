/**
 */
package railway.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import railway.RailwayContainer;
import railway.RailwayPackage;
import railway.Region;
import railway.Route;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Container</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link railway.impl.RailwayContainerImpl#getRoutes <em>Routes</em>}</li>
 *   <li>{@link railway.impl.RailwayContainerImpl#getRegions <em>Regions</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RailwayContainerImpl extends CDOObjectImpl implements RailwayContainer {
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

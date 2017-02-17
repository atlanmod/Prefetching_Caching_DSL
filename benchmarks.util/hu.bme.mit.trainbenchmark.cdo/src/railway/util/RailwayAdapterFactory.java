/**
 */
package railway.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import railway.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see railway.RailwayPackage
 * @generated
 */
public class RailwayAdapterFactory extends AdapterFactoryImpl {
    /**
     * The cached model package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected static RailwayPackage modelPackage;

    /**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RailwayAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = RailwayPackage.eINSTANCE;
        }
    }

    /**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
     * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
     * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
    @Override
    public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

    /**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RailwaySwitch<Adapter> modelSwitch =
        new RailwaySwitch<Adapter>() {
            @Override
            public Adapter caseSegment(Segment object) {
                return createSegmentAdapter();
            }
            @Override
            public Adapter caseTrackElement(TrackElement object) {
                return createTrackElementAdapter();
            }
            @Override
            public Adapter caseSwitch(Switch object) {
                return createSwitchAdapter();
            }
            @Override
            public Adapter caseRoute(Route object) {
                return createRouteAdapter();
            }
            @Override
            public Adapter caseSemaphore(Semaphore object) {
                return createSemaphoreAdapter();
            }
            @Override
            public Adapter caseSwitchPosition(SwitchPosition object) {
                return createSwitchPositionAdapter();
            }
            @Override
            public Adapter caseRailwayElement(RailwayElement object) {
                return createRailwayElementAdapter();
            }
            @Override
            public Adapter caseSensor(Sensor object) {
                return createSensorAdapter();
            }
            @Override
            public Adapter caseRailwayContainer(RailwayContainer object) {
                return createRailwayContainerAdapter();
            }
            @Override
            public Adapter caseRegion(Region object) {
                return createRegionAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

    /**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
    @Override
    public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


    /**
     * Creates a new adapter for an object of class '{@link railway.Segment <em>Segment</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see railway.Segment
     * @generated
     */
    public Adapter createSegmentAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link railway.TrackElement <em>Track Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see railway.TrackElement
     * @generated
     */
    public Adapter createTrackElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link railway.Switch <em>Switch</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see railway.Switch
     * @generated
     */
    public Adapter createSwitchAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link railway.Route <em>Route</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see railway.Route
     * @generated
     */
    public Adapter createRouteAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link railway.Semaphore <em>Semaphore</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see railway.Semaphore
     * @generated
     */
    public Adapter createSemaphoreAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link railway.SwitchPosition <em>Switch Position</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see railway.SwitchPosition
     * @generated
     */
    public Adapter createSwitchPositionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link railway.RailwayElement <em>Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see railway.RailwayElement
     * @generated
     */
    public Adapter createRailwayElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link railway.Sensor <em>Sensor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see railway.Sensor
     * @generated
     */
    public Adapter createSensorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link railway.RailwayContainer <em>Container</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see railway.RailwayContainer
     * @generated
     */
    public Adapter createRailwayContainerAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link railway.Region <em>Region</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see railway.Region
     * @generated
     */
    public Adapter createRegionAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
     * This default implementation returns null.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
    public Adapter createEObjectAdapter() {
        return null;
    }

} //RailwayAdapterFactory

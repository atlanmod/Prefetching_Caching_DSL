/**
 */
package railway.impl;

import org.eclipse.emf.ecore.EClass;

import railway.RailwayPackage;
import railway.Semaphore;
import railway.Signal;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link railway.impl.SemaphoreImpl#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SemaphoreImpl extends RailwayElementImpl implements Semaphore {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SemaphoreImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RailwayPackage.Literals.SEMAPHORE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Signal getSignal() {
        return (Signal)eGet(RailwayPackage.Literals.SEMAPHORE__SIGNAL, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSignal(Signal newSignal) {
        eSet(RailwayPackage.Literals.SEMAPHORE__SIGNAL, newSignal);
    }

} //SemaphoreImpl

/**
 */
package railway.impl;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import railway.RailwayPackage;
import railway.Segment;
import railway.Semaphore;
import railway.TrackElement;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link railway.impl.SegmentImpl#getLength <em>Length</em>}</li>
 *   <li>{@link railway.impl.SegmentImpl#getSemaphores <em>Semaphores</em>}</li>
 *   <li>{@link railway.impl.SegmentImpl#getNeighbors <em>Neighbors</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class SegmentImpl extends TrackElementImpl implements Segment {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected SegmentImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RailwayPackage.Literals.SEGMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getLength() {
        return (Integer)eGet(RailwayPackage.Literals.SEGMENT__LENGTH, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setLength(int newLength) {
        eSet(RailwayPackage.Literals.SEGMENT__LENGTH, newLength);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<Semaphore> getSemaphores() {
        return (EList<Semaphore>)eGet(RailwayPackage.Literals.SEGMENT__SEMAPHORES, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    public EList<TrackElement> getNeighbors() {
        return (EList<TrackElement>)eGet(RailwayPackage.Literals.SEGMENT__NEIGHBORS, true);
    }

} //SegmentImpl

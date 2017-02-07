/**
 */
package hu.bme.hit.trainbenchmark.railway.impl;

import hu.bme.hit.trainbenchmark.railway.RailwayPackage;
import hu.bme.hit.trainbenchmark.railway.Segment;
import hu.bme.hit.trainbenchmark.railway.Semaphore;
import hu.bme.hit.trainbenchmark.railway.TrackElement;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SegmentImpl#getLength <em>Length</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SegmentImpl#getSemaphores <em>Semaphores</em>}</li>
 *   <li>{@link hu.bme.hit.trainbenchmark.railway.impl.SegmentImpl#getNeighbors <em>Neighbors</em>}</li>
 * </ul>
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

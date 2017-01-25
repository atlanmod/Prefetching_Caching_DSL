/**
 */
package fr.inria.atlanmod.prefetchml.language.metamodel.impl;

import fr.inria.atlanmod.prefetchml.language.metamodel.CacheProperties;
import fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Cache Properties</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.impl.CachePropertiesImpl#getSize <em>Size</em>}</li>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.impl.CachePropertiesImpl#getChunk <em>Chunk</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CachePropertiesImpl extends MinimalEObjectImpl.Container implements CacheProperties {
	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getChunk() <em>Chunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunk()
	 * @generated
	 * @ordered
	 */
	protected static final int CHUNK_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getChunk() <em>Chunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChunk()
	 * @generated
	 * @ordered
	 */
	protected int chunk = CHUNK_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CachePropertiesImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PrefetchingPackage.Literals.CACHE_PROPERTIES;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.CACHE_PROPERTIES__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getChunk() {
		return chunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChunk(int newChunk) {
		int oldChunk = chunk;
		chunk = newChunk;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PrefetchingPackage.CACHE_PROPERTIES__CHUNK, oldChunk, chunk));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PrefetchingPackage.CACHE_PROPERTIES__SIZE:
				return getSize();
			case PrefetchingPackage.CACHE_PROPERTIES__CHUNK:
				return getChunk();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PrefetchingPackage.CACHE_PROPERTIES__SIZE:
				setSize((Integer)newValue);
				return;
			case PrefetchingPackage.CACHE_PROPERTIES__CHUNK:
				setChunk((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PrefetchingPackage.CACHE_PROPERTIES__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case PrefetchingPackage.CACHE_PROPERTIES__CHUNK:
				setChunk(CHUNK_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PrefetchingPackage.CACHE_PROPERTIES__SIZE:
				return size != SIZE_EDEFAULT;
			case PrefetchingPackage.CACHE_PROPERTIES__CHUNK:
				return chunk != CHUNK_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (size: ");
		result.append(size);
		result.append(", chunk: ");
		result.append(chunk);
		result.append(')');
		return result.toString();
	}

} //CachePropertiesImpl

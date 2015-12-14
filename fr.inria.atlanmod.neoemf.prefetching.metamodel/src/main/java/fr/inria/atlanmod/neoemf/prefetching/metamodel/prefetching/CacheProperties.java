/**
 */
package fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage#getCacheProperties()
 * @model
 * @generated
 */
public interface CacheProperties extends EObject {
	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(int)
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage#getCacheProperties_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.CacheProperties#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

} // CacheProperties

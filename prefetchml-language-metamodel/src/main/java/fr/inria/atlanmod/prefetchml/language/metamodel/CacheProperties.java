/**
 */
package fr.inria.atlanmod.prefetchml.language.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.CacheProperties#getSize <em>Size</em>}</li>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.CacheProperties#getChunk <em>Chunk</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getCacheProperties()
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
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getCacheProperties_Size()
	 * @model
	 * @generated
	 */
	int getSize();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.CacheProperties#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(int value);

	/**
	 * Returns the value of the '<em><b>Chunk</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Chunk</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Chunk</em>' attribute.
	 * @see #setChunk(int)
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getCacheProperties_Chunk()
	 * @model
	 * @generated
	 */
	int getChunk();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.CacheProperties#getChunk <em>Chunk</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Chunk</em>' attribute.
	 * @see #getChunk()
	 * @generated
	 */
	void setChunk(int value);

} // CacheProperties

/**
 */
package fr.inria.atlanmod.prefetchml.language.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.Cache#getType <em>Type</em>}</li>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.Cache#getProperties <em>Properties</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getCache()
 * @model
 * @generated
 */
public interface Cache extends EObject {
	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link fr.inria.atlanmod.prefetchml.language.metamodel.CacheType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.CacheType
	 * @see #setType(CacheType)
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getCache_Type()
	 * @model
	 * @generated
	 */
	CacheType getType();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.Cache#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.CacheType
	 * @see #getType()
	 * @generated
	 */
	void setType(CacheType value);

	/**
	 * Returns the value of the '<em><b>Properties</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Properties</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Properties</em>' containment reference.
	 * @see #setProperties(CacheProperties)
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getCache_Properties()
	 * @model containment="true"
	 * @generated
	 */
	CacheProperties getProperties();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.Cache#getProperties <em>Properties</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Properties</em>' containment reference.
	 * @see #getProperties()
	 * @generated
	 */
	void setProperties(CacheProperties value);

} // Cache

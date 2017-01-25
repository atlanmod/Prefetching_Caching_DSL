/**
 */
package fr.inria.atlanmod.prefetchml.language.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Metamodel Import</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.MetamodelImport#getNsURI <em>Ns URI</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getMetamodelImport()
 * @model
 * @generated
 */
public interface MetamodelImport extends EObject {
	/**
	 * Returns the value of the '<em><b>Ns URI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ns URI</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ns URI</em>' attribute.
	 * @see #setNsURI(String)
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getMetamodelImport_NsURI()
	 * @model
	 * @generated
	 */
	String getNsURI();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.MetamodelImport#getNsURI <em>Ns URI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ns URI</em>' attribute.
	 * @see #getNsURI()
	 * @generated
	 */
	void setNsURI(String value);

} // MetamodelImport

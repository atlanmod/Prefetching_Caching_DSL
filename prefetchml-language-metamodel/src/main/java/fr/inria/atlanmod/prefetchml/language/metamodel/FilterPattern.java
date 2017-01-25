/**
 */
package fr.inria.atlanmod.prefetchml.language.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Filter Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.FilterPattern#getStringPattern <em>String Pattern</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getFilterPattern()
 * @model
 * @generated
 */
public interface FilterPattern extends EObject {
	/**
	 * Returns the value of the '<em><b>String Pattern</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>String Pattern</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>String Pattern</em>' attribute.
	 * @see #setStringPattern(String)
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getFilterPattern_StringPattern()
	 * @model
	 * @generated
	 */
	String getStringPattern();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.FilterPattern#getStringPattern <em>String Pattern</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>String Pattern</em>' attribute.
	 * @see #getStringPattern()
	 * @generated
	 */
	void setStringPattern(String value);

} // FilterPattern

/**
 */
package fr.inria.atlanmod.prefetchml.language.metamodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Access Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule#getSourcePattern <em>Source Pattern</em>}</li>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule#getRemoveType <em>Remove Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getAccessRule()
 * @model
 * @generated
 */
public interface AccessRule extends PrefetchingRule {
	/**
	 * Returns the value of the '<em><b>Source Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Pattern</em>' containment reference.
	 * @see #setSourcePattern(SourcePattern)
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getAccessRule_SourcePattern()
	 * @model containment="true"
	 * @generated
	 */
	SourcePattern getSourcePattern();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule#getSourcePattern <em>Source Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Pattern</em>' containment reference.
	 * @see #getSourcePattern()
	 * @generated
	 */
	void setSourcePattern(SourcePattern value);

	/**
	 * Returns the value of the '<em><b>Remove Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remove Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remove Type</em>' attribute.
	 * @see #setRemoveType(String)
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getAccessRule_RemoveType()
	 * @model
	 * @generated
	 */
	String getRemoveType();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.AccessRule#getRemoveType <em>Remove Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Remove Type</em>' attribute.
	 * @see #getRemoveType()
	 * @generated
	 */
	void setRemoveType(String value);

} // AccessRule

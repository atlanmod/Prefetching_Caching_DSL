/**
 */
package fr.inria.atlanmod.prefetchml.language.metamodel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>After Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.AfterClause#getPlan <em>Plan</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getAfterClause()
 * @model
 * @generated
 */
public interface AfterClause extends EObject {
	/**
	 * Returns the value of the '<em><b>Plan</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan</em>' reference.
	 * @see #setPlan(Plan)
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getAfterClause_Plan()
	 * @model
	 * @generated
	 */
	Plan getPlan();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.AfterClause#getPlan <em>Plan</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Plan</em>' reference.
	 * @see #getPlan()
	 * @generated
	 */
	void setPlan(Plan value);

} // AfterClause

/**
 */
package fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule#getTargetPattern <em>Target Pattern</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule#getName <em>Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage#getPrefetchingRule()
 * @model
 * @generated
 */
public interface PrefetchingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>Target Pattern</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Target Pattern</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target Pattern</em>' containment reference.
	 * @see #setTargetPattern(TargetPattern)
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage#getPrefetchingRule_TargetPattern()
	 * @model containment="true"
	 * @generated
	 */
	TargetPattern getTargetPattern();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule#getTargetPattern <em>Target Pattern</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target Pattern</em>' containment reference.
	 * @see #getTargetPattern()
	 * @generated
	 */
	void setTargetPattern(TargetPattern value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingPackage#getPrefetchingRule_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.metamodel.prefetching.PrefetchingRule#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // PrefetchingRule

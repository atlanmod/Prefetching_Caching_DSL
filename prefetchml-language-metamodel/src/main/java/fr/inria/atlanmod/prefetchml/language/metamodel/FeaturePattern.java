/**
 */
package fr.inria.atlanmod.prefetchml.language.metamodel;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Feature Pattern</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.FeaturePattern#getFeature <em>Feature</em>}</li>
 *   <li>{@link fr.inria.atlanmod.prefetchml.language.metamodel.FeaturePattern#isClosure <em>Closure</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getFeaturePattern()
 * @model
 * @generated
 */
public interface FeaturePattern extends EObject {
	/**
	 * Returns the value of the '<em><b>Feature</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Feature</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Feature</em>' reference.
	 * @see #setFeature(EStructuralFeature)
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getFeaturePattern_Feature()
	 * @model
	 * @generated
	 */
	EStructuralFeature getFeature();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.FeaturePattern#getFeature <em>Feature</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Feature</em>' reference.
	 * @see #getFeature()
	 * @generated
	 */
	void setFeature(EStructuralFeature value);

	/**
	 * Returns the value of the '<em><b>Closure</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Closure</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Closure</em>' attribute.
	 * @see #setClosure(boolean)
	 * @see fr.inria.atlanmod.prefetchml.language.metamodel.PrefetchingPackage#getFeaturePattern_Closure()
	 * @model default="false"
	 * @generated
	 */
	boolean isClosure();

	/**
	 * Sets the value of the '{@link fr.inria.atlanmod.prefetchml.language.metamodel.FeaturePattern#isClosure <em>Closure</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Closure</em>' attribute.
	 * @see #isClosure()
	 * @generated
	 */
	void setClosure(boolean value);

} // FeaturePattern

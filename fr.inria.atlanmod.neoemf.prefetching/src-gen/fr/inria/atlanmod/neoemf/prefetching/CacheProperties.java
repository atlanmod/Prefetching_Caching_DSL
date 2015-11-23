/**
 */
package fr.inria.atlanmod.neoemf.prefetching;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Cache Properties</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.CacheProperties#getRefType <em>Ref Type</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.CacheProperties#getSize <em>Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getCacheProperties()
 * @model
 * @generated
 */
public interface CacheProperties extends EObject
{
  /**
   * Returns the value of the '<em><b>Ref Type</b></em>' attribute.
   * The literals are from the enumeration {@link fr.inria.atlanmod.neoemf.prefetching.RefType}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Ref Type</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Ref Type</em>' attribute.
   * @see fr.inria.atlanmod.neoemf.prefetching.RefType
   * @see #setRefType(RefType)
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getCacheProperties_RefType()
   * @model
   * @generated
   */
  RefType getRefType();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.CacheProperties#getRefType <em>Ref Type</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Ref Type</em>' attribute.
   * @see fr.inria.atlanmod.neoemf.prefetching.RefType
   * @see #getRefType()
   * @generated
   */
  void setRefType(RefType value);

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
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getCacheProperties_Size()
   * @model
   * @generated
   */
  int getSize();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.CacheProperties#getSize <em>Size</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Size</em>' attribute.
   * @see #getSize()
   * @generated
   */
  void setSize(int value);

} // CacheProperties

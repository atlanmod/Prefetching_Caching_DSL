/**
 */
package fr.inria.atlanmod.neoemf.prefetching;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getMoment <em>Moment</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getSourcePattern <em>Source Pattern</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getTargetPattern <em>Target Pattern</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getProbability <em>Probability</em>}</li>
 *   <li>{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getSubRules <em>Sub Rules</em>}</li>
 * </ul>
 * </p>
 *
 * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getPrefetchingRule()
 * @model
 * @generated
 */
public interface PrefetchingRule extends EObject
{
  /**
   * Returns the value of the '<em><b>Moment</b></em>' attribute.
   * The literals are from the enumeration {@link fr.inria.atlanmod.neoemf.prefetching.Moment}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Moment</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Moment</em>' attribute.
   * @see fr.inria.atlanmod.neoemf.prefetching.Moment
   * @see #setMoment(Moment)
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getPrefetchingRule_Moment()
   * @model
   * @generated
   */
  Moment getMoment();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getMoment <em>Moment</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Moment</em>' attribute.
   * @see fr.inria.atlanmod.neoemf.prefetching.Moment
   * @see #getMoment()
   * @generated
   */
  void setMoment(Moment value);

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
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getPrefetchingRule_SourcePattern()
   * @model containment="true"
   * @generated
   */
  SourcePattern getSourcePattern();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getSourcePattern <em>Source Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Source Pattern</em>' containment reference.
   * @see #getSourcePattern()
   * @generated
   */
  void setSourcePattern(SourcePattern value);

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
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getPrefetchingRule_TargetPattern()
   * @model containment="true"
   * @generated
   */
  TargetPattern getTargetPattern();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getTargetPattern <em>Target Pattern</em>}' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Target Pattern</em>' containment reference.
   * @see #getTargetPattern()
   * @generated
   */
  void setTargetPattern(TargetPattern value);

  /**
   * Returns the value of the '<em><b>Probability</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Probability</em>' attribute isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Probability</em>' attribute.
   * @see #setProbability(int)
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getPrefetchingRule_Probability()
   * @model
   * @generated
   */
  int getProbability();

  /**
   * Sets the value of the '{@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule#getProbability <em>Probability</em>}' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param value the new value of the '<em>Probability</em>' attribute.
   * @see #getProbability()
   * @generated
   */
  void setProbability(int value);

  /**
   * Returns the value of the '<em><b>Sub Rules</b></em>' containment reference list.
   * The list contents are of type {@link fr.inria.atlanmod.neoemf.prefetching.PrefetchingRule}.
   * <!-- begin-user-doc -->
   * <p>
   * If the meaning of the '<em>Sub Rules</em>' containment reference list isn't clear,
   * there really should be more of a description here...
   * </p>
   * <!-- end-user-doc -->
   * @return the value of the '<em>Sub Rules</em>' containment reference list.
   * @see fr.inria.atlanmod.neoemf.prefetching.PrefetchingPackage#getPrefetchingRule_SubRules()
   * @model containment="true"
   * @generated
   */
  EList<PrefetchingRule> getSubRules();

} // PrefetchingRule

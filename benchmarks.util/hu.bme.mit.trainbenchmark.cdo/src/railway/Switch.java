/**
 */
package railway;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link railway.Switch#getCurrentPosition <em>Current Position</em>}</li>
 *   <li>{@link railway.Switch#getPositions <em>Positions</em>}</li>
 *   <li>{@link railway.Switch#getLeft <em>Left</em>}</li>
 *   <li>{@link railway.Switch#getRight <em>Right</em>}</li>
 *   <li>{@link railway.Switch#getFrom <em>From</em>}</li>
 * </ul>
 * </p>
 *
 * @see railway.RailwayPackage#getSwitch()
 * @model
 * @generated
 */
public interface Switch extends TrackElement {
    /**
     * Returns the value of the '<em><b>Current Position</b></em>' attribute.
     * The literals are from the enumeration {@link railway.Position}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Current Position</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Current Position</em>' attribute.
     * @see railway.Position
     * @see #setCurrentPosition(Position)
     * @see railway.RailwayPackage#getSwitch_CurrentPosition()
     * @model required="true"
     * @generated
     */
    Position getCurrentPosition();

    /**
     * Sets the value of the '{@link railway.Switch#getCurrentPosition <em>Current Position</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Current Position</em>' attribute.
     * @see railway.Position
     * @see #getCurrentPosition()
     * @generated
     */
    void setCurrentPosition(Position value);

    /**
     * Returns the value of the '<em><b>Positions</b></em>' reference list.
     * The list contents are of type {@link railway.SwitchPosition}.
     * It is bidirectional and its opposite is '{@link railway.SwitchPosition#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Positions</em>' reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Positions</em>' reference list.
     * @see railway.RailwayPackage#getSwitch_Positions()
     * @see railway.SwitchPosition#getTarget
     * @model opposite="target"
     * @generated
     */
    EList<SwitchPosition> getPositions();

    /**
     * Returns the value of the '<em><b>Left</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Left</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Left</em>' reference.
     * @see #setLeft(TrackElement)
     * @see railway.RailwayPackage#getSwitch_Left()
     * @model required="true"
     * @generated
     */
    TrackElement getLeft();

    /**
     * Sets the value of the '{@link railway.Switch#getLeft <em>Left</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Left</em>' reference.
     * @see #getLeft()
     * @generated
     */
    void setLeft(TrackElement value);

    /**
     * Returns the value of the '<em><b>Right</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Right</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Right</em>' reference.
     * @see #setRight(TrackElement)
     * @see railway.RailwayPackage#getSwitch_Right()
     * @model required="true"
     * @generated
     */
    TrackElement getRight();

    /**
     * Sets the value of the '{@link railway.Switch#getRight <em>Right</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Right</em>' reference.
     * @see #getRight()
     * @generated
     */
    void setRight(TrackElement value);

    /**
     * Returns the value of the '<em><b>From</b></em>' reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>From</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>From</em>' reference.
     * @see #setFrom(TrackElement)
     * @see railway.RailwayPackage#getSwitch_From()
     * @model required="true"
     * @generated
     */
    TrackElement getFrom();

    /**
     * Sets the value of the '{@link railway.Switch#getFrom <em>From</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>From</em>' reference.
     * @see #getFrom()
     * @generated
     */
    void setFrom(TrackElement value);

} // Switch

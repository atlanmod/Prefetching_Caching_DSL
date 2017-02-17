/**
 */
package railway;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semaphore</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link railway.Semaphore#getSignal <em>Signal</em>}</li>
 * </ul>
 * </p>
 *
 * @see railway.RailwayPackage#getSemaphore()
 * @model
 * @generated
 */
public interface Semaphore extends RailwayElement {
    /**
     * Returns the value of the '<em><b>Signal</b></em>' attribute.
     * The literals are from the enumeration {@link railway.Signal}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Signal</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Signal</em>' attribute.
     * @see railway.Signal
     * @see #setSignal(Signal)
     * @see railway.RailwayPackage#getSemaphore_Signal()
     * @model required="true"
     * @generated
     */
    Signal getSignal();

    /**
     * Sets the value of the '{@link railway.Semaphore#getSignal <em>Signal</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Signal</em>' attribute.
     * @see railway.Signal
     * @see #getSignal()
     * @generated
     */
    void setSignal(Signal value);

} // Semaphore

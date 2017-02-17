/**
 */
package railway.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.internal.cdo.CDOObjectImpl;

import railway.RailwayElement;
import railway.RailwayPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link railway.impl.RailwayElementImpl#get_id <em>id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class RailwayElementImpl extends CDOObjectImpl implements RailwayElement {
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RailwayElementImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return RailwayPackage.Literals.RAILWAY_ELEMENT;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected int eStaticFeatureCount() {
        return 0;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int get_id() {
        return (Integer)eGet(RailwayPackage.Literals.RAILWAY_ELEMENT__ID, true);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void set_id(int new_id) {
        eSet(RailwayPackage.Literals.RAILWAY_ELEMENT__ID, new_id);
    }

} //RailwayElementImpl

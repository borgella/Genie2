/**
 */
package inf5153emf.impl;

import inf5153emf.Inf5153emfPackage;
import inf5153emf.PortePersonnaliser;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Porte Personnaliser</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.PortePersonnaliserImpl#isCircuitValide <em>Circuit Valide</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PortePersonnaliserImpl extends PorteImpl implements PortePersonnaliser {
	/**
	 * The default value of the '{@link #isCircuitValide() <em>Circuit Valide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCircuitValide()
	 * @generated
	 * @ordered
	 */
	protected static final boolean CIRCUIT_VALIDE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isCircuitValide() <em>Circuit Valide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isCircuitValide()
	 * @generated
	 * @ordered
	 */
	protected boolean circuitValide = CIRCUIT_VALIDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PortePersonnaliserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inf5153emfPackage.Literals.PORTE_PERSONNALISER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isCircuitValide() {
		return circuitValide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitValide(boolean newCircuitValide) {
		boolean oldCircuitValide = circuitValide;
		circuitValide = newCircuitValide;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE_PERSONNALISER__CIRCUIT_VALIDE, oldCircuitValide, circuitValide));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Inf5153emfPackage.PORTE_PERSONNALISER__CIRCUIT_VALIDE:
				return isCircuitValide();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Inf5153emfPackage.PORTE_PERSONNALISER__CIRCUIT_VALIDE:
				setCircuitValide((Boolean)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Inf5153emfPackage.PORTE_PERSONNALISER__CIRCUIT_VALIDE:
				setCircuitValide(CIRCUIT_VALIDE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Inf5153emfPackage.PORTE_PERSONNALISER__CIRCUIT_VALIDE:
				return circuitValide != CIRCUIT_VALIDE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (circuitValide: ");
		result.append(circuitValide);
		result.append(')');
		return result.toString();
	}

} //PortePersonnaliserImpl

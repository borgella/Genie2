/**
 */
package inf5153emf.impl;

import inf5153emf.CircuitLogic;
import inf5153emf.Inf5153emfPackage;
import inf5153emf.Observeur;
import inf5153emf.TableVCircuit;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table VCircuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.TableVCircuitImpl#getNotify <em>Notify</em>}</li>
 *   <li>{@link inf5153emf.impl.TableVCircuitImpl#getCircuitlogic <em>Circuitlogic</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableVCircuitImpl extends MinimalEObjectImpl.Container implements TableVCircuit {
	/**
	 * The cached value of the '{@link #getNotify() <em>Notify</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNotify()
	 * @generated
	 * @ordered
	 */
	protected Observeur notify;

	/**
	 * The cached value of the '{@link #getCircuitlogic() <em>Circuitlogic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitlogic()
	 * @generated
	 * @ordered
	 */
	protected CircuitLogic circuitlogic;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableVCircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inf5153emfPackage.Literals.TABLE_VCIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observeur getNotify() {
		if (notify != null && notify.eIsProxy()) {
			InternalEObject oldNotify = (InternalEObject)notify;
			notify = (Observeur)eResolveProxy(oldNotify);
			if (notify != oldNotify) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.TABLE_VCIRCUIT__NOTIFY, oldNotify, notify));
			}
		}
		return notify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Observeur basicGetNotify() {
		return notify;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNotify(Observeur newNotify) {
		Observeur oldNotify = notify;
		notify = newNotify;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.TABLE_VCIRCUIT__NOTIFY, oldNotify, notify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitLogic getCircuitlogic() {
		if (circuitlogic != null && circuitlogic.eIsProxy()) {
			InternalEObject oldCircuitlogic = (InternalEObject)circuitlogic;
			circuitlogic = (CircuitLogic)eResolveProxy(oldCircuitlogic);
			if (circuitlogic != oldCircuitlogic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC, oldCircuitlogic, circuitlogic));
			}
		}
		return circuitlogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitLogic basicGetCircuitlogic() {
		return circuitlogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuitlogic(CircuitLogic newCircuitlogic, NotificationChain msgs) {
		CircuitLogic oldCircuitlogic = circuitlogic;
		circuitlogic = newCircuitlogic;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC, oldCircuitlogic, newCircuitlogic);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitlogic(CircuitLogic newCircuitlogic) {
		if (newCircuitlogic != circuitlogic) {
			NotificationChain msgs = null;
			if (circuitlogic != null)
				msgs = ((InternalEObject)circuitlogic).eInverseRemove(this, Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT, CircuitLogic.class, msgs);
			if (newCircuitlogic != null)
				msgs = ((InternalEObject)newCircuitlogic).eInverseAdd(this, Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT, CircuitLogic.class, msgs);
			msgs = basicSetCircuitlogic(newCircuitlogic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC, newCircuitlogic, newCircuitlogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void update() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void afficher() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void calculer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void enregistrer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void desenregistrer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC:
				if (circuitlogic != null)
					msgs = ((InternalEObject)circuitlogic).eInverseRemove(this, Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT, CircuitLogic.class, msgs);
				return basicSetCircuitlogic((CircuitLogic)otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC:
				return basicSetCircuitlogic(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Inf5153emfPackage.TABLE_VCIRCUIT__NOTIFY:
				if (resolve) return getNotify();
				return basicGetNotify();
			case Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC:
				if (resolve) return getCircuitlogic();
				return basicGetCircuitlogic();
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
			case Inf5153emfPackage.TABLE_VCIRCUIT__NOTIFY:
				setNotify((Observeur)newValue);
				return;
			case Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC:
				setCircuitlogic((CircuitLogic)newValue);
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
			case Inf5153emfPackage.TABLE_VCIRCUIT__NOTIFY:
				setNotify((Observeur)null);
				return;
			case Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC:
				setCircuitlogic((CircuitLogic)null);
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
			case Inf5153emfPackage.TABLE_VCIRCUIT__NOTIFY:
				return notify != null;
			case Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC:
				return circuitlogic != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case Inf5153emfPackage.TABLE_VCIRCUIT___UPDATE:
				update();
				return null;
			case Inf5153emfPackage.TABLE_VCIRCUIT___AFFICHER:
				afficher();
				return null;
			case Inf5153emfPackage.TABLE_VCIRCUIT___CALCULER:
				calculer();
				return null;
			case Inf5153emfPackage.TABLE_VCIRCUIT___ENREGISTRER:
				enregistrer();
				return null;
			case Inf5153emfPackage.TABLE_VCIRCUIT___DESENREGISTRER:
				desenregistrer();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableVCircuitImpl

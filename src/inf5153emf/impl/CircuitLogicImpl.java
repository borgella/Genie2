/**
 */
package inf5153emf.impl;

import inf5153emf.Circuit;
import inf5153emf.CircuitLogic;
import inf5153emf.Inf5153emfPackage;
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
 * An implementation of the model object '<em><b>Circuit Logic</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.CircuitLogicImpl#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link inf5153emf.impl.CircuitLogicImpl#getTablevcircuit <em>Tablevcircuit</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CircuitLogicImpl extends MinimalEObjectImpl.Container implements CircuitLogic {
	/**
	 * The cached value of the '{@link #getCircuit() <em>Circuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuit()
	 * @generated
	 * @ordered
	 */
	protected Circuit circuit;

	/**
	 * The cached value of the '{@link #getTablevcircuit() <em>Tablevcircuit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablevcircuit()
	 * @generated
	 * @ordered
	 */
	protected TableVCircuit tablevcircuit;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CircuitLogicImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inf5153emfPackage.Literals.CIRCUIT_LOGIC;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit getCircuit() {
		return circuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuit(Circuit newCircuit, NotificationChain msgs) {
		Circuit oldCircuit = circuit;
		circuit = newCircuit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT, oldCircuit, newCircuit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuit(Circuit newCircuit) {
		if (newCircuit != circuit) {
			NotificationChain msgs = null;
			if (circuit != null)
				msgs = ((InternalEObject)circuit).eInverseRemove(this, Inf5153emfPackage.CIRCUIT__CIRCUITLOGIC, Circuit.class, msgs);
			if (newCircuit != null)
				msgs = ((InternalEObject)newCircuit).eInverseAdd(this, Inf5153emfPackage.CIRCUIT__CIRCUITLOGIC, Circuit.class, msgs);
			msgs = basicSetCircuit(newCircuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT, newCircuit, newCircuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVCircuit getTablevcircuit() {
		if (tablevcircuit != null && tablevcircuit.eIsProxy()) {
			InternalEObject oldTablevcircuit = (InternalEObject)tablevcircuit;
			tablevcircuit = (TableVCircuit)eResolveProxy(oldTablevcircuit);
			if (tablevcircuit != oldTablevcircuit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT, oldTablevcircuit, tablevcircuit));
			}
		}
		return tablevcircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVCircuit basicGetTablevcircuit() {
		return tablevcircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTablevcircuit(TableVCircuit newTablevcircuit, NotificationChain msgs) {
		TableVCircuit oldTablevcircuit = tablevcircuit;
		tablevcircuit = newTablevcircuit;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT, oldTablevcircuit, newTablevcircuit);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablevcircuit(TableVCircuit newTablevcircuit) {
		if (newTablevcircuit != tablevcircuit) {
			NotificationChain msgs = null;
			if (tablevcircuit != null)
				msgs = ((InternalEObject)tablevcircuit).eInverseRemove(this, Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC, TableVCircuit.class, msgs);
			if (newTablevcircuit != null)
				msgs = ((InternalEObject)newTablevcircuit).eInverseAdd(this, Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC, TableVCircuit.class, msgs);
			msgs = basicSetTablevcircuit(newTablevcircuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT, newTablevcircuit, newTablevcircuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void charger() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void sauvegarder() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void definir() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void genererTV() {
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
			case Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT:
				if (circuit != null)
					msgs = ((InternalEObject)circuit).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT, null, msgs);
				return basicSetCircuit((Circuit)otherEnd, msgs);
			case Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT:
				if (tablevcircuit != null)
					msgs = ((InternalEObject)tablevcircuit).eInverseRemove(this, Inf5153emfPackage.TABLE_VCIRCUIT__CIRCUITLOGIC, TableVCircuit.class, msgs);
				return basicSetTablevcircuit((TableVCircuit)otherEnd, msgs);
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
			case Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT:
				return basicSetCircuit(null, msgs);
			case Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT:
				return basicSetTablevcircuit(null, msgs);
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
			case Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT:
				return getCircuit();
			case Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT:
				if (resolve) return getTablevcircuit();
				return basicGetTablevcircuit();
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
			case Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT:
				setCircuit((Circuit)newValue);
				return;
			case Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT:
				setTablevcircuit((TableVCircuit)newValue);
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
			case Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT:
				setCircuit((Circuit)null);
				return;
			case Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT:
				setTablevcircuit((TableVCircuit)null);
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
			case Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT:
				return circuit != null;
			case Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVCIRCUIT:
				return tablevcircuit != null;
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
			case Inf5153emfPackage.CIRCUIT_LOGIC___CHARGER:
				charger();
				return null;
			case Inf5153emfPackage.CIRCUIT_LOGIC___SAUVEGARDER:
				sauvegarder();
				return null;
			case Inf5153emfPackage.CIRCUIT_LOGIC___DEFINIR:
				definir();
				return null;
			case Inf5153emfPackage.CIRCUIT_LOGIC___GENERER_TV:
				genererTV();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CircuitLogicImpl

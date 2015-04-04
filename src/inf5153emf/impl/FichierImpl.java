/**
 */
package inf5153emf.impl;

import inf5153emf.Circuit;
import inf5153emf.Dossier;
import inf5153emf.Fichier;
import inf5153emf.Inf5153emfPackage;

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
 * An implementation of the model object '<em><b>Fichier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.FichierImpl#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link inf5153emf.impl.FichierImpl#getDossier <em>Dossier</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FichierImpl extends MinimalEObjectImpl.Container implements Fichier {
	/**
	 * The cached value of the '{@link #getCircuit() <em>Circuit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuit()
	 * @generated
	 * @ordered
	 */
	protected Circuit circuit;

	/**
	 * The cached value of the '{@link #getDossier() <em>Dossier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDossier()
	 * @generated
	 * @ordered
	 */
	protected Dossier dossier;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FichierImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inf5153emfPackage.Literals.FICHIER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit getCircuit() {
		if (circuit != null && circuit.eIsProxy()) {
			InternalEObject oldCircuit = (InternalEObject)circuit;
			circuit = (Circuit)eResolveProxy(oldCircuit);
			if (circuit != oldCircuit) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.FICHIER__CIRCUIT, oldCircuit, circuit));
			}
		}
		return circuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Circuit basicGetCircuit() {
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.FICHIER__CIRCUIT, oldCircuit, newCircuit);
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
				msgs = ((InternalEObject)circuit).eInverseRemove(this, Inf5153emfPackage.CIRCUIT__FICHIER, Circuit.class, msgs);
			if (newCircuit != null)
				msgs = ((InternalEObject)newCircuit).eInverseAdd(this, Inf5153emfPackage.CIRCUIT__FICHIER, Circuit.class, msgs);
			msgs = basicSetCircuit(newCircuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.FICHIER__CIRCUIT, newCircuit, newCircuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dossier getDossier() {
		if (dossier != null && dossier.eIsProxy()) {
			InternalEObject oldDossier = (InternalEObject)dossier;
			dossier = (Dossier)eResolveProxy(oldDossier);
			if (dossier != oldDossier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.FICHIER__DOSSIER, oldDossier, dossier));
			}
		}
		return dossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dossier basicGetDossier() {
		return dossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDossier(Dossier newDossier, NotificationChain msgs) {
		Dossier oldDossier = dossier;
		dossier = newDossier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.FICHIER__DOSSIER, oldDossier, newDossier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDossier(Dossier newDossier) {
		if (newDossier != dossier) {
			NotificationChain msgs = null;
			if (dossier != null)
				msgs = ((InternalEObject)dossier).eInverseRemove(this, Inf5153emfPackage.DOSSIER__FICHIER, Dossier.class, msgs);
			if (newDossier != null)
				msgs = ((InternalEObject)newDossier).eInverseAdd(this, Inf5153emfPackage.DOSSIER__FICHIER, Dossier.class, msgs);
			msgs = basicSetDossier(newDossier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.FICHIER__DOSSIER, newDossier, newDossier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getNom() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom() {
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
			case Inf5153emfPackage.FICHIER__CIRCUIT:
				if (circuit != null)
					msgs = ((InternalEObject)circuit).eInverseRemove(this, Inf5153emfPackage.CIRCUIT__FICHIER, Circuit.class, msgs);
				return basicSetCircuit((Circuit)otherEnd, msgs);
			case Inf5153emfPackage.FICHIER__DOSSIER:
				if (dossier != null)
					msgs = ((InternalEObject)dossier).eInverseRemove(this, Inf5153emfPackage.DOSSIER__FICHIER, Dossier.class, msgs);
				return basicSetDossier((Dossier)otherEnd, msgs);
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
			case Inf5153emfPackage.FICHIER__CIRCUIT:
				return basicSetCircuit(null, msgs);
			case Inf5153emfPackage.FICHIER__DOSSIER:
				return basicSetDossier(null, msgs);
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
			case Inf5153emfPackage.FICHIER__CIRCUIT:
				if (resolve) return getCircuit();
				return basicGetCircuit();
			case Inf5153emfPackage.FICHIER__DOSSIER:
				if (resolve) return getDossier();
				return basicGetDossier();
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
			case Inf5153emfPackage.FICHIER__CIRCUIT:
				setCircuit((Circuit)newValue);
				return;
			case Inf5153emfPackage.FICHIER__DOSSIER:
				setDossier((Dossier)newValue);
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
			case Inf5153emfPackage.FICHIER__CIRCUIT:
				setCircuit((Circuit)null);
				return;
			case Inf5153emfPackage.FICHIER__DOSSIER:
				setDossier((Dossier)null);
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
			case Inf5153emfPackage.FICHIER__CIRCUIT:
				return circuit != null;
			case Inf5153emfPackage.FICHIER__DOSSIER:
				return dossier != null;
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
			case Inf5153emfPackage.FICHIER___GET_NOM:
				getNom();
				return null;
			case Inf5153emfPackage.FICHIER___SET_NOM:
				setNom();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //FichierImpl

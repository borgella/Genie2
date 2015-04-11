/**
 */
package inf5153emf.impl;

import inf5153emf.Commande;
import inf5153emf.Inf5153emfPackage;
import inf5153emf.Memento;

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
 * An implementation of the model object '<em><b>Memento</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.MementoImpl#getCommande <em>Commande</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MementoImpl extends MinimalEObjectImpl.Container implements Memento {
	/**
	 * The cached value of the '{@link #getCommande() <em>Commande</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommande()
	 * @generated
	 * @ordered
	 */
	protected Commande commande;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MementoImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inf5153emfPackage.Literals.MEMENTO;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commande getCommande() {
		if (commande != null && commande.eIsProxy()) {
			InternalEObject oldCommande = (InternalEObject)commande;
			commande = (Commande)eResolveProxy(oldCommande);
			if (commande != oldCommande) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.MEMENTO__COMMANDE, oldCommande, commande));
			}
		}
		return commande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Commande basicGetCommande() {
		return commande;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCommande(Commande newCommande, NotificationChain msgs) {
		Commande oldCommande = commande;
		commande = newCommande;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.MEMENTO__COMMANDE, oldCommande, newCommande);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCommande(Commande newCommande) {
		if (newCommande != commande) {
			NotificationChain msgs = null;
			if (commande != null)
				msgs = ((InternalEObject)commande).eInverseRemove(this, Inf5153emfPackage.COMMANDE__MEMENTO, Commande.class, msgs);
			if (newCommande != null)
				msgs = ((InternalEObject)newCommande).eInverseAdd(this, Inf5153emfPackage.COMMANDE__MEMENTO, Commande.class, msgs);
			msgs = basicSetCommande(newCommande, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.MEMENTO__COMMANDE, newCommande, newCommande));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void getState() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setState() {
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
			case Inf5153emfPackage.MEMENTO__COMMANDE:
				if (commande != null)
					msgs = ((InternalEObject)commande).eInverseRemove(this, Inf5153emfPackage.COMMANDE__MEMENTO, Commande.class, msgs);
				return basicSetCommande((Commande)otherEnd, msgs);
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
			case Inf5153emfPackage.MEMENTO__COMMANDE:
				return basicSetCommande(null, msgs);
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
			case Inf5153emfPackage.MEMENTO__COMMANDE:
				if (resolve) return getCommande();
				return basicGetCommande();
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
			case Inf5153emfPackage.MEMENTO__COMMANDE:
				setCommande((Commande)newValue);
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
			case Inf5153emfPackage.MEMENTO__COMMANDE:
				setCommande((Commande)null);
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
			case Inf5153emfPackage.MEMENTO__COMMANDE:
				return commande != null;
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
			case Inf5153emfPackage.MEMENTO___GET_STATE:
				getState();
				return null;
			case Inf5153emfPackage.MEMENTO___SET_STATE:
				setState();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //MementoImpl

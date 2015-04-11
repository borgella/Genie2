/**
 */
package inf5153emf.impl;

import inf5153emf.Inf5153emfPackage;
import inf5153emf.Observeur;
import inf5153emf.Porte;
import inf5153emf.TableVPorte;

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
 * An implementation of the model object '<em><b>Table VPorte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.TableVPorteImpl#getNotify <em>Notify</em>}</li>
 *   <li>{@link inf5153emf.impl.TableVPorteImpl#getPorte <em>Porte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableVPorteImpl extends MinimalEObjectImpl.Container implements TableVPorte {
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
	 * The cached value of the '{@link #getPorte() <em>Porte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPorte()
	 * @generated
	 * @ordered
	 */
	protected Porte porte;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TableVPorteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inf5153emfPackage.Literals.TABLE_VPORTE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.TABLE_VPORTE__NOTIFY, oldNotify, notify));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.TABLE_VPORTE__NOTIFY, oldNotify, notify));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Porte getPorte() {
		if (porte != null && porte.eIsProxy()) {
			InternalEObject oldPorte = (InternalEObject)porte;
			porte = (Porte)eResolveProxy(oldPorte);
			if (porte != oldPorte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.TABLE_VPORTE__PORTE, oldPorte, porte));
			}
		}
		return porte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Porte basicGetPorte() {
		return porte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPorte(Porte newPorte, NotificationChain msgs) {
		Porte oldPorte = porte;
		porte = newPorte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.TABLE_VPORTE__PORTE, oldPorte, newPorte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPorte(Porte newPorte) {
		if (newPorte != porte) {
			NotificationChain msgs = null;
			if (porte != null)
				msgs = ((InternalEObject)porte).eInverseRemove(this, Inf5153emfPackage.PORTE__TABLEVPORTE, Porte.class, msgs);
			if (newPorte != null)
				msgs = ((InternalEObject)newPorte).eInverseAdd(this, Inf5153emfPackage.PORTE__TABLEVPORTE, Porte.class, msgs);
			msgs = basicSetPorte(newPorte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.TABLE_VPORTE__PORTE, newPorte, newPorte));
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
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				if (porte != null)
					msgs = ((InternalEObject)porte).eInverseRemove(this, Inf5153emfPackage.PORTE__TABLEVPORTE, Porte.class, msgs);
				return basicSetPorte((Porte)otherEnd, msgs);
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
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				return basicSetPorte(null, msgs);
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
			case Inf5153emfPackage.TABLE_VPORTE__NOTIFY:
				if (resolve) return getNotify();
				return basicGetNotify();
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				if (resolve) return getPorte();
				return basicGetPorte();
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
			case Inf5153emfPackage.TABLE_VPORTE__NOTIFY:
				setNotify((Observeur)newValue);
				return;
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				setPorte((Porte)newValue);
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
			case Inf5153emfPackage.TABLE_VPORTE__NOTIFY:
				setNotify((Observeur)null);
				return;
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				setPorte((Porte)null);
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
			case Inf5153emfPackage.TABLE_VPORTE__NOTIFY:
				return notify != null;
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				return porte != null;
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
			case Inf5153emfPackage.TABLE_VPORTE___UPDATE:
				update();
				return null;
			case Inf5153emfPackage.TABLE_VPORTE___AFFICHER:
				afficher();
				return null;
			case Inf5153emfPackage.TABLE_VPORTE___CALCULER:
				calculer();
				return null;
			case Inf5153emfPackage.TABLE_VPORTE___ENREGISTRER:
				enregistrer();
				return null;
			case Inf5153emfPackage.TABLE_VPORTE___DESENREGISTRER:
				desenregistrer();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //TableVPorteImpl

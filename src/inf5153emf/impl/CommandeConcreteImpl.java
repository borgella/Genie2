/**
 */
package inf5153emf.impl;

import inf5153emf.Circuit;
import inf5153emf.CommandeConcrete;
import inf5153emf.Inf5153emfPackage;
import inf5153emf.Memento;
import inf5153emf.Utilisateur;
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
 * An implementation of the model object '<em><b>Commande Concrete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.CommandeConcreteImpl#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link inf5153emf.impl.CommandeConcreteImpl#getUtilisateur <em>Utilisateur</em>}</li>
 *   <li>{@link inf5153emf.impl.CommandeConcreteImpl#getMemento <em>Memento</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandeConcreteImpl extends MinimalEObjectImpl.Container implements CommandeConcrete {
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
	 * The cached value of the '{@link #getUtilisateur() <em>Utilisateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUtilisateur()
	 * @generated
	 * @ordered
	 */
	protected Utilisateur utilisateur;

	/**
	 * The cached value of the '{@link #getMemento() <em>Memento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemento()
	 * @generated
	 * @ordered
	 */
	protected Memento memento;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CommandeConcreteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inf5153emfPackage.Literals.COMMANDE_CONCRETE;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.COMMANDE_CONCRETE__CIRCUIT, oldCircuit, circuit));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.COMMANDE_CONCRETE__CIRCUIT, oldCircuit, newCircuit);
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
				msgs = ((InternalEObject)circuit).eInverseRemove(this, Inf5153emfPackage.CIRCUIT__COMMANDE, Circuit.class, msgs);
			if (newCircuit != null)
				msgs = ((InternalEObject)newCircuit).eInverseAdd(this, Inf5153emfPackage.CIRCUIT__COMMANDE, Circuit.class, msgs);
			msgs = basicSetCircuit(newCircuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.COMMANDE_CONCRETE__CIRCUIT, newCircuit, newCircuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilisateur getUtilisateur() {
		if (utilisateur != null && utilisateur.eIsProxy()) {
			InternalEObject oldUtilisateur = (InternalEObject)utilisateur;
			utilisateur = (Utilisateur)eResolveProxy(oldUtilisateur);
			if (utilisateur != oldUtilisateur) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.COMMANDE_CONCRETE__UTILISATEUR, oldUtilisateur, utilisateur));
			}
		}
		return utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Utilisateur basicGetUtilisateur() {
		return utilisateur;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUtilisateur(Utilisateur newUtilisateur, NotificationChain msgs) {
		Utilisateur oldUtilisateur = utilisateur;
		utilisateur = newUtilisateur;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.COMMANDE_CONCRETE__UTILISATEUR, oldUtilisateur, newUtilisateur);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUtilisateur(Utilisateur newUtilisateur) {
		if (newUtilisateur != utilisateur) {
			NotificationChain msgs = null;
			if (utilisateur != null)
				msgs = ((InternalEObject)utilisateur).eInverseRemove(this, Inf5153emfPackage.UTILISATEUR__COMMANDE, Utilisateur.class, msgs);
			if (newUtilisateur != null)
				msgs = ((InternalEObject)newUtilisateur).eInverseAdd(this, Inf5153emfPackage.UTILISATEUR__COMMANDE, Utilisateur.class, msgs);
			msgs = basicSetUtilisateur(newUtilisateur, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.COMMANDE_CONCRETE__UTILISATEUR, newUtilisateur, newUtilisateur));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memento getMemento() {
		if (memento != null && memento.eIsProxy()) {
			InternalEObject oldMemento = (InternalEObject)memento;
			memento = (Memento)eResolveProxy(oldMemento);
			if (memento != oldMemento) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.COMMANDE_CONCRETE__MEMENTO, oldMemento, memento));
			}
		}
		return memento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memento basicGetMemento() {
		return memento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetMemento(Memento newMemento, NotificationChain msgs) {
		Memento oldMemento = memento;
		memento = newMemento;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.COMMANDE_CONCRETE__MEMENTO, oldMemento, newMemento);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMemento(Memento newMemento) {
		if (newMemento != memento) {
			NotificationChain msgs = null;
			if (memento != null)
				msgs = ((InternalEObject)memento).eInverseRemove(this, Inf5153emfPackage.MEMENTO__COMMANDE, Memento.class, msgs);
			if (newMemento != null)
				msgs = ((InternalEObject)newMemento).eInverseAdd(this, Inf5153emfPackage.MEMENTO__COMMANDE, Memento.class, msgs);
			msgs = basicSetMemento(newMemento, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.COMMANDE_CONCRETE__MEMENTO, newMemento, newMemento));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void excute() {
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
			case Inf5153emfPackage.COMMANDE_CONCRETE__CIRCUIT:
				if (circuit != null)
					msgs = ((InternalEObject)circuit).eInverseRemove(this, Inf5153emfPackage.CIRCUIT__COMMANDE, Circuit.class, msgs);
				return basicSetCircuit((Circuit)otherEnd, msgs);
			case Inf5153emfPackage.COMMANDE_CONCRETE__UTILISATEUR:
				if (utilisateur != null)
					msgs = ((InternalEObject)utilisateur).eInverseRemove(this, Inf5153emfPackage.UTILISATEUR__COMMANDE, Utilisateur.class, msgs);
				return basicSetUtilisateur((Utilisateur)otherEnd, msgs);
			case Inf5153emfPackage.COMMANDE_CONCRETE__MEMENTO:
				if (memento != null)
					msgs = ((InternalEObject)memento).eInverseRemove(this, Inf5153emfPackage.MEMENTO__COMMANDE, Memento.class, msgs);
				return basicSetMemento((Memento)otherEnd, msgs);
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
			case Inf5153emfPackage.COMMANDE_CONCRETE__CIRCUIT:
				return basicSetCircuit(null, msgs);
			case Inf5153emfPackage.COMMANDE_CONCRETE__UTILISATEUR:
				return basicSetUtilisateur(null, msgs);
			case Inf5153emfPackage.COMMANDE_CONCRETE__MEMENTO:
				return basicSetMemento(null, msgs);
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
			case Inf5153emfPackage.COMMANDE_CONCRETE__CIRCUIT:
				if (resolve) return getCircuit();
				return basicGetCircuit();
			case Inf5153emfPackage.COMMANDE_CONCRETE__UTILISATEUR:
				if (resolve) return getUtilisateur();
				return basicGetUtilisateur();
			case Inf5153emfPackage.COMMANDE_CONCRETE__MEMENTO:
				if (resolve) return getMemento();
				return basicGetMemento();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	//@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Inf5153emfPackage.COMMANDE_CONCRETE__CIRCUIT:
				setCircuit((Circuit)newValue);
				return;
			case Inf5153emfPackage.COMMANDE_CONCRETE__UTILISATEUR:
				setUtilisateur((Utilisateur)newValue);
				return;
			case Inf5153emfPackage.COMMANDE_CONCRETE__MEMENTO:
				setMemento((Memento)newValue);
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
			case Inf5153emfPackage.COMMANDE_CONCRETE__CIRCUIT:
				setCircuit((Circuit)null);
				return;
			case Inf5153emfPackage.COMMANDE_CONCRETE__UTILISATEUR:
				setUtilisateur((Utilisateur)null);
				return;
			case Inf5153emfPackage.COMMANDE_CONCRETE__MEMENTO:
				setMemento((Memento)null);
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
			case Inf5153emfPackage.COMMANDE_CONCRETE__CIRCUIT:
				return circuit != null;
			case Inf5153emfPackage.COMMANDE_CONCRETE__UTILISATEUR:
				return utilisateur != null;
			case Inf5153emfPackage.COMMANDE_CONCRETE__MEMENTO:
				return memento != null;
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
			case Inf5153emfPackage.COMMANDE_CONCRETE___EXCUTE:
				excute();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CommandeConcreteImpl

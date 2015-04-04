/**
 */
package inf5153emf.impl;

import inf5153emf.Circuit;
import inf5153emf.EntreeCircuit;
import inf5153emf.Inf5153emfPackage;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entree Circuit</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.EntreeCircuitImpl#getContient <em>Contient</em>}</li>
 *   <li>{@link inf5153emf.impl.EntreeCircuitImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link inf5153emf.impl.EntreeCircuitImpl#getEtat <em>Etat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntreeCircuitImpl extends MinimalEObjectImpl.Container implements EntreeCircuit {
	/**
	 * The cached value of the '{@link #getContient() <em>Contient</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContient()
	 * @generated
	 * @ordered
	 */
	protected EList<Circuit> contient;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected static final String ETAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected String etat = ETAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntreeCircuitImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inf5153emfPackage.Literals.ENTREE_CIRCUIT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Circuit> getContient() {
		if (contient == null) {
			contient = new EObjectResolvingEList<Circuit>(Circuit.class, this, Inf5153emfPackage.ENTREE_CIRCUIT__CONTIENT);
		}
		return contient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.ENTREE_CIRCUIT__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getEtat() {
		return etat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtat(String newEtat) {
		String oldEtat = etat;
		etat = newEtat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.ENTREE_CIRCUIT__ETAT, oldEtat, etat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void ajouter() {
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
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Inf5153emfPackage.ENTREE_CIRCUIT__CONTIENT:
				return getContient();
			case Inf5153emfPackage.ENTREE_CIRCUIT__NOM:
				return getNom();
			case Inf5153emfPackage.ENTREE_CIRCUIT__ETAT:
				return getEtat();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Inf5153emfPackage.ENTREE_CIRCUIT__CONTIENT:
				getContient().clear();
				getContient().addAll((Collection<? extends Circuit>)newValue);
				return;
			case Inf5153emfPackage.ENTREE_CIRCUIT__NOM:
				setNom((String)newValue);
				return;
			case Inf5153emfPackage.ENTREE_CIRCUIT__ETAT:
				setEtat((String)newValue);
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
			case Inf5153emfPackage.ENTREE_CIRCUIT__CONTIENT:
				getContient().clear();
				return;
			case Inf5153emfPackage.ENTREE_CIRCUIT__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case Inf5153emfPackage.ENTREE_CIRCUIT__ETAT:
				setEtat(ETAT_EDEFAULT);
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
			case Inf5153emfPackage.ENTREE_CIRCUIT__CONTIENT:
				return contient != null && !contient.isEmpty();
			case Inf5153emfPackage.ENTREE_CIRCUIT__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case Inf5153emfPackage.ENTREE_CIRCUIT__ETAT:
				return ETAT_EDEFAULT == null ? etat != null : !ETAT_EDEFAULT.equals(etat);
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
			case Inf5153emfPackage.ENTREE_CIRCUIT___AJOUTER:
				ajouter();
				return null;
			case Inf5153emfPackage.ENTREE_CIRCUIT___DEFINIR:
				definir();
				return null;
		}
		return super.eInvoke(operationID, arguments);
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
		result.append(" (Nom: ");
		result.append(nom);
		result.append(", Etat: ");
		result.append(etat);
		result.append(')');
		return result.toString();
	}

} //EntreeCircuitImpl

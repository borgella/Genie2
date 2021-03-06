/**
 */
package inf5153emf.impl;

import inf5153emf.EntreePorte;
import inf5153emf.Inf5153emfPackage;
import inf5153emf.Porte;
import inf5153emf.SortiePorte;

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
 * An implementation of the model object '<em><b>Entree Porte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.EntreePorteImpl#getContient <em>Contient</em>}</li>
 *   <li>{@link inf5153emf.impl.EntreePorteImpl#getSortieporte <em>Sortieporte</em>}</li>
 *   <li>{@link inf5153emf.impl.EntreePorteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link inf5153emf.impl.EntreePorteImpl#getEtat <em>Etat</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class EntreePorteImpl extends MinimalEObjectImpl.Container implements EntreePorte {
	/**
	 * The cached value of the '{@link #getContient() <em>Contient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContient()
	 * @generated
	 * @ordered
	 */
	protected Porte contient;

	/**
	 * The cached value of the '{@link #getSortieporte() <em>Sortieporte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortieporte()
	 * @generated
	 * @ordered
	 */
	protected SortiePorte sortieporte;

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
	protected static final int ETAT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEtat() <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtat()
	 * @generated
	 * @ordered
	 */
	protected int etat = ETAT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntreePorteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inf5153emfPackage.Literals.ENTREE_PORTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Porte getContient() {
		if (contient != null && contient.eIsProxy()) {
			InternalEObject oldContient = (InternalEObject)contient;
			contient = (Porte)eResolveProxy(oldContient);
			if (contient != oldContient) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.ENTREE_PORTE__CONTIENT, oldContient, contient));
			}
		}
		return contient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Porte basicGetContient() {
		return contient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setContient(Porte newContient) {
		Porte oldContient = contient;
		contient = newContient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.ENTREE_PORTE__CONTIENT, oldContient, contient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortiePorte getSortieporte() {
		if (sortieporte != null && sortieporte.eIsProxy()) {
			InternalEObject oldSortieporte = (InternalEObject)sortieporte;
			sortieporte = (SortiePorte)eResolveProxy(oldSortieporte);
			if (sortieporte != oldSortieporte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.ENTREE_PORTE__SORTIEPORTE, oldSortieporte, sortieporte));
			}
		}
		return sortieporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortiePorte basicGetSortieporte() {
		return sortieporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSortieporte(SortiePorte newSortieporte, NotificationChain msgs) {
		SortiePorte oldSortieporte = sortieporte;
		sortieporte = newSortieporte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.ENTREE_PORTE__SORTIEPORTE, oldSortieporte, newSortieporte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortieporte(SortiePorte newSortieporte) {
		if (newSortieporte != sortieporte) {
			NotificationChain msgs = null;
			if (sortieporte != null)
				msgs = ((InternalEObject)sortieporte).eInverseRemove(this, Inf5153emfPackage.SORTIE_PORTE__ENTREEPORTE, SortiePorte.class, msgs);
			if (newSortieporte != null)
				msgs = ((InternalEObject)newSortieporte).eInverseAdd(this, Inf5153emfPackage.SORTIE_PORTE__ENTREEPORTE, SortiePorte.class, msgs);
			msgs = basicSetSortieporte(newSortieporte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.ENTREE_PORTE__SORTIEPORTE, newSortieporte, newSortieporte));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.ENTREE_PORTE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEtat() {
		return etat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEtat(int newEtat) {
		int oldEtat = etat;
		etat = newEtat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.ENTREE_PORTE__ETAT, oldEtat, etat));
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
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Inf5153emfPackage.ENTREE_PORTE__SORTIEPORTE:
				if (sortieporte != null)
					msgs = ((InternalEObject)sortieporte).eInverseRemove(this, Inf5153emfPackage.SORTIE_PORTE__ENTREEPORTE, SortiePorte.class, msgs);
				return basicSetSortieporte((SortiePorte)otherEnd, msgs);
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
			case Inf5153emfPackage.ENTREE_PORTE__SORTIEPORTE:
				return basicSetSortieporte(null, msgs);
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
			case Inf5153emfPackage.ENTREE_PORTE__CONTIENT:
				if (resolve) return getContient();
				return basicGetContient();
			case Inf5153emfPackage.ENTREE_PORTE__SORTIEPORTE:
				if (resolve) return getSortieporte();
				return basicGetSortieporte();
			case Inf5153emfPackage.ENTREE_PORTE__NOM:
				return getNom();
			case Inf5153emfPackage.ENTREE_PORTE__ETAT:
				return getEtat();
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
			case Inf5153emfPackage.ENTREE_PORTE__CONTIENT:
				setContient((Porte)newValue);
				return;
			case Inf5153emfPackage.ENTREE_PORTE__SORTIEPORTE:
				setSortieporte((SortiePorte)newValue);
				return;
			case Inf5153emfPackage.ENTREE_PORTE__NOM:
				setNom((String)newValue);
				return;
			case Inf5153emfPackage.ENTREE_PORTE__ETAT:
				setEtat((Integer)newValue);
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
			case Inf5153emfPackage.ENTREE_PORTE__CONTIENT:
				setContient((Porte)null);
				return;
			case Inf5153emfPackage.ENTREE_PORTE__SORTIEPORTE:
				setSortieporte((SortiePorte)null);
				return;
			case Inf5153emfPackage.ENTREE_PORTE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case Inf5153emfPackage.ENTREE_PORTE__ETAT:
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
			case Inf5153emfPackage.ENTREE_PORTE__CONTIENT:
				return contient != null;
			case Inf5153emfPackage.ENTREE_PORTE__SORTIEPORTE:
				return sortieporte != null;
			case Inf5153emfPackage.ENTREE_PORTE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case Inf5153emfPackage.ENTREE_PORTE__ETAT:
				return etat != ETAT_EDEFAULT;
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
			case Inf5153emfPackage.ENTREE_PORTE___AJOUTER:
				ajouter();
				return null;
			case Inf5153emfPackage.ENTREE_PORTE___DEFINIR:
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
		result.append(", etat: ");
		result.append(etat);
		result.append(')');
		return result.toString();
	}

} //EntreePorteImpl

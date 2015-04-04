/**
 */
package inf5153emf.impl;

import inf5153emf.CircuitLogic;
import inf5153emf.Fichier;
import inf5153emf.Inf5153emfPackage;
import inf5153emf.Porte;
import inf5153emf.TableVerite;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Porte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.PorteImpl#getCircuitlogic <em>Circuitlogic</em>}</li>
 *   <li>{@link inf5153emf.impl.PorteImpl#getFichier <em>Fichier</em>}</li>
 *   <li>{@link inf5153emf.impl.PorteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link inf5153emf.impl.PorteImpl#getNbreEntree <em>Nbre Entree</em>}</li>
 *   <li>{@link inf5153emf.impl.PorteImpl#getNbreSortie <em>Nbre Sortie</em>}</li>
 *   <li>{@link inf5153emf.impl.PorteImpl#getTableverite <em>Tableverite</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PorteImpl extends MinimalEObjectImpl.Container implements Porte {
	/**
	 * The cached value of the '{@link #getFichier() <em>Fichier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFichier()
	 * @generated
	 * @ordered
	 */
	protected Fichier fichier;

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
	 * The default value of the '{@link #getNbreEntree() <em>Nbre Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbreEntree()
	 * @generated
	 * @ordered
	 */
	protected static final int NBRE_ENTREE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbreEntree() <em>Nbre Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbreEntree()
	 * @generated
	 * @ordered
	 */
	protected int nbreEntree = NBRE_ENTREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNbreSortie() <em>Nbre Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbreSortie()
	 * @generated
	 * @ordered
	 */
	protected static final int NBRE_SORTIE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNbreSortie() <em>Nbre Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNbreSortie()
	 * @generated
	 * @ordered
	 */
	protected int nbreSortie = NBRE_SORTIE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTableverite() <em>Tableverite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTableverite()
	 * @generated
	 * @ordered
	 */
	protected TableVerite tableverite;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PorteImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Inf5153emfPackage.Literals.PORTE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitLogic getCircuitlogic() {
		if (eContainerFeatureID() != Inf5153emfPackage.PORTE__CIRCUITLOGIC) return null;
		return (CircuitLogic)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuitlogic(CircuitLogic newCircuitlogic, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCircuitlogic, Inf5153emfPackage.PORTE__CIRCUITLOGIC, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuitlogic(CircuitLogic newCircuitlogic) {
		if (newCircuitlogic != eInternalContainer() || (eContainerFeatureID() != Inf5153emfPackage.PORTE__CIRCUITLOGIC && newCircuitlogic != null)) {
			if (EcoreUtil.isAncestor(this, newCircuitlogic))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCircuitlogic != null)
				msgs = ((InternalEObject)newCircuitlogic).eInverseAdd(this, Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT, CircuitLogic.class, msgs);
			msgs = basicSetCircuitlogic(newCircuitlogic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__CIRCUITLOGIC, newCircuitlogic, newCircuitlogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fichier getFichier() {
		if (fichier != null && fichier.eIsProxy()) {
			InternalEObject oldFichier = (InternalEObject)fichier;
			fichier = (Fichier)eResolveProxy(oldFichier);
			if (fichier != oldFichier) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.PORTE__FICHIER, oldFichier, fichier));
			}
		}
		return fichier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fichier basicGetFichier() {
		return fichier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFichier(Fichier newFichier, NotificationChain msgs) {
		Fichier oldFichier = fichier;
		fichier = newFichier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__FICHIER, oldFichier, newFichier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFichier(Fichier newFichier) {
		if (newFichier != fichier) {
			NotificationChain msgs = null;
			if (fichier != null)
				msgs = ((InternalEObject)fichier).eInverseRemove(this, Inf5153emfPackage.FICHIER__CIRCUIT, Fichier.class, msgs);
			if (newFichier != null)
				msgs = ((InternalEObject)newFichier).eInverseAdd(this, Inf5153emfPackage.FICHIER__CIRCUIT, Fichier.class, msgs);
			msgs = basicSetFichier(newFichier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__FICHIER, newFichier, newFichier));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbreEntree() {
		return nbreEntree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbreEntree(int newNbreEntree) {
		int oldNbreEntree = nbreEntree;
		nbreEntree = newNbreEntree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__NBRE_ENTREE, oldNbreEntree, nbreEntree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNbreSortie() {
		return nbreSortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNbreSortie(int newNbreSortie) {
		int oldNbreSortie = nbreSortie;
		nbreSortie = newNbreSortie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__NBRE_SORTIE, oldNbreSortie, nbreSortie));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVerite getTableverite() {
		if (tableverite != null && tableverite.eIsProxy()) {
			InternalEObject oldTableverite = (InternalEObject)tableverite;
			tableverite = (TableVerite)eResolveProxy(oldTableverite);
			if (tableverite != oldTableverite) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.PORTE__TABLEVERITE, oldTableverite, tableverite));
			}
		}
		return tableverite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVerite basicGetTableverite() {
		return tableverite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTableverite(TableVerite newTableverite, NotificationChain msgs) {
		TableVerite oldTableverite = tableverite;
		tableverite = newTableverite;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__TABLEVERITE, oldTableverite, newTableverite);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTableverite(TableVerite newTableverite) {
		if (newTableverite != tableverite) {
			NotificationChain msgs = null;
			if (tableverite != null)
				msgs = ((InternalEObject)tableverite).eInverseRemove(this, Inf5153emfPackage.TABLE_VERITE__PORTE, TableVerite.class, msgs);
			if (newTableverite != null)
				msgs = ((InternalEObject)newTableverite).eInverseAdd(this, Inf5153emfPackage.TABLE_VERITE__PORTE, TableVerite.class, msgs);
			msgs = basicSetTableverite(newTableverite, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__TABLEVERITE, newTableverite, newTableverite));
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
	public void supprimer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void relierSortie() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void relierEntree() {
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
	public void creer() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Inf5153emfPackage.PORTE__CIRCUITLOGIC:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCircuitlogic((CircuitLogic)otherEnd, msgs);
			case Inf5153emfPackage.PORTE__FICHIER:
				if (fichier != null)
					msgs = ((InternalEObject)fichier).eInverseRemove(this, Inf5153emfPackage.FICHIER__CIRCUIT, Fichier.class, msgs);
				return basicSetFichier((Fichier)otherEnd, msgs);
			case Inf5153emfPackage.PORTE__TABLEVERITE:
				if (tableverite != null)
					msgs = ((InternalEObject)tableverite).eInverseRemove(this, Inf5153emfPackage.TABLE_VERITE__PORTE, TableVerite.class, msgs);
				return basicSetTableverite((TableVerite)otherEnd, msgs);
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
			case Inf5153emfPackage.PORTE__CIRCUITLOGIC:
				return basicSetCircuitlogic(null, msgs);
			case Inf5153emfPackage.PORTE__FICHIER:
				return basicSetFichier(null, msgs);
			case Inf5153emfPackage.PORTE__TABLEVERITE:
				return basicSetTableverite(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case Inf5153emfPackage.PORTE__CIRCUITLOGIC:
				return eInternalContainer().eInverseRemove(this, Inf5153emfPackage.CIRCUIT_LOGIC__CIRCUIT, CircuitLogic.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Inf5153emfPackage.PORTE__CIRCUITLOGIC:
				return getCircuitlogic();
			case Inf5153emfPackage.PORTE__FICHIER:
				if (resolve) return getFichier();
				return basicGetFichier();
			case Inf5153emfPackage.PORTE__NOM:
				return getNom();
			case Inf5153emfPackage.PORTE__NBRE_ENTREE:
				return getNbreEntree();
			case Inf5153emfPackage.PORTE__NBRE_SORTIE:
				return getNbreSortie();
			case Inf5153emfPackage.PORTE__TABLEVERITE:
				if (resolve) return getTableverite();
				return basicGetTableverite();
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
			case Inf5153emfPackage.PORTE__CIRCUITLOGIC:
				setCircuitlogic((CircuitLogic)newValue);
				return;
			case Inf5153emfPackage.PORTE__FICHIER:
				setFichier((Fichier)newValue);
				return;
			case Inf5153emfPackage.PORTE__NOM:
				setNom((String)newValue);
				return;
			case Inf5153emfPackage.PORTE__NBRE_ENTREE:
				setNbreEntree((Integer)newValue);
				return;
			case Inf5153emfPackage.PORTE__NBRE_SORTIE:
				setNbreSortie((Integer)newValue);
				return;
			case Inf5153emfPackage.PORTE__TABLEVERITE:
				setTableverite((TableVerite)newValue);
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
			case Inf5153emfPackage.PORTE__CIRCUITLOGIC:
				setCircuitlogic((CircuitLogic)null);
				return;
			case Inf5153emfPackage.PORTE__FICHIER:
				setFichier((Fichier)null);
				return;
			case Inf5153emfPackage.PORTE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case Inf5153emfPackage.PORTE__NBRE_ENTREE:
				setNbreEntree(NBRE_ENTREE_EDEFAULT);
				return;
			case Inf5153emfPackage.PORTE__NBRE_SORTIE:
				setNbreSortie(NBRE_SORTIE_EDEFAULT);
				return;
			case Inf5153emfPackage.PORTE__TABLEVERITE:
				setTableverite((TableVerite)null);
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
			case Inf5153emfPackage.PORTE__CIRCUITLOGIC:
				return getCircuitlogic() != null;
			case Inf5153emfPackage.PORTE__FICHIER:
				return fichier != null;
			case Inf5153emfPackage.PORTE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case Inf5153emfPackage.PORTE__NBRE_ENTREE:
				return nbreEntree != NBRE_ENTREE_EDEFAULT;
			case Inf5153emfPackage.PORTE__NBRE_SORTIE:
				return nbreSortie != NBRE_SORTIE_EDEFAULT;
			case Inf5153emfPackage.PORTE__TABLEVERITE:
				return tableverite != null;
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
			case Inf5153emfPackage.PORTE___AJOUTER:
				ajouter();
				return null;
			case Inf5153emfPackage.PORTE___SUPPRIMER:
				supprimer();
				return null;
			case Inf5153emfPackage.PORTE___RELIER_SORTIE:
				relierSortie();
				return null;
			case Inf5153emfPackage.PORTE___RELIER_ENTREE:
				relierEntree();
				return null;
			case Inf5153emfPackage.PORTE___GENERER_TV:
				genererTV();
				return null;
			case Inf5153emfPackage.PORTE___CREER:
				creer();
				return null;
			case Inf5153emfPackage.PORTE___CHARGER:
				charger();
				return null;
			case Inf5153emfPackage.PORTE___SAUVEGARDER:
				sauvegarder();
				return null;
			case Inf5153emfPackage.PORTE___DEFINIR:
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
		result.append(", nbreEntree: ");
		result.append(nbreEntree);
		result.append(", nbreSortie: ");
		result.append(nbreSortie);
		result.append(')');
		return result.toString();
	}

} //PorteImpl

/**
 */
package inf5153emf.impl;

import inf5153emf.Circuit;
import inf5153emf.Inf5153emfPackage;
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
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Porte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.PorteImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link inf5153emf.impl.PorteImpl#getNbreEntree <em>Nbre Entree</em>}</li>
 *   <li>{@link inf5153emf.impl.PorteImpl#getNbreSortie <em>Nbre Sortie</em>}</li>
 *   <li>{@link inf5153emf.impl.PorteImpl#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link inf5153emf.impl.PorteImpl#getTablevporte <em>Tablevporte</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PorteImpl extends MinimalEObjectImpl.Container implements Porte {
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
	 * The cached value of the '{@link #getTablevporte() <em>Tablevporte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTablevporte()
	 * @generated
	 * @ordered
	 */
	protected TableVPorte tablevporte;

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
	public Circuit getCircuit() {
		if (eContainerFeatureID() != Inf5153emfPackage.PORTE__CIRCUIT) return null;
		return (Circuit)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCircuit(Circuit newCircuit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newCircuit, Inf5153emfPackage.PORTE__CIRCUIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCircuit(Circuit newCircuit) {
		if (newCircuit != eInternalContainer() || (eContainerFeatureID() != Inf5153emfPackage.PORTE__CIRCUIT && newCircuit != null)) {
			if (EcoreUtil.isAncestor(this, newCircuit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newCircuit != null)
				msgs = ((InternalEObject)newCircuit).eInverseAdd(this, Inf5153emfPackage.CIRCUIT__PORTE, Circuit.class, msgs);
			msgs = basicSetCircuit(newCircuit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__CIRCUIT, newCircuit, newCircuit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVPorte getTablevporte() {
		if (tablevporte != null && tablevporte.eIsProxy()) {
			InternalEObject oldTablevporte = (InternalEObject)tablevporte;
			tablevporte = (TableVPorte)eResolveProxy(oldTablevporte);
			if (tablevporte != oldTablevporte) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.PORTE__TABLEVPORTE, oldTablevporte, tablevporte));
			}
		}
		return tablevporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVPorte basicGetTablevporte() {
		return tablevporte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTablevporte(TableVPorte newTablevporte, NotificationChain msgs) {
		TableVPorte oldTablevporte = tablevporte;
		tablevporte = newTablevporte;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__TABLEVPORTE, oldTablevporte, newTablevporte);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTablevporte(TableVPorte newTablevporte) {
		if (newTablevporte != tablevporte) {
			NotificationChain msgs = null;
			if (tablevporte != null)
				msgs = ((InternalEObject)tablevporte).eInverseRemove(this, Inf5153emfPackage.TABLE_VPORTE__PORTE, TableVPorte.class, msgs);
			if (newTablevporte != null)
				msgs = ((InternalEObject)newTablevporte).eInverseAdd(this, Inf5153emfPackage.TABLE_VPORTE__PORTE, TableVPorte.class, msgs);
			msgs = basicSetTablevporte(newTablevporte, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.PORTE__TABLEVPORTE, newTablevporte, newTablevporte));
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Inf5153emfPackage.PORTE__CIRCUIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetCircuit((Circuit)otherEnd, msgs);
			case Inf5153emfPackage.PORTE__TABLEVPORTE:
				if (tablevporte != null)
					msgs = ((InternalEObject)tablevporte).eInverseRemove(this, Inf5153emfPackage.TABLE_VPORTE__PORTE, TableVPorte.class, msgs);
				return basicSetTablevporte((TableVPorte)otherEnd, msgs);
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
			case Inf5153emfPackage.PORTE__CIRCUIT:
				return basicSetCircuit(null, msgs);
			case Inf5153emfPackage.PORTE__TABLEVPORTE:
				return basicSetTablevporte(null, msgs);
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
			case Inf5153emfPackage.PORTE__CIRCUIT:
				return eInternalContainer().eInverseRemove(this, Inf5153emfPackage.CIRCUIT__PORTE, Circuit.class, msgs);
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
			case Inf5153emfPackage.PORTE__NOM:
				return getNom();
			case Inf5153emfPackage.PORTE__NBRE_ENTREE:
				return getNbreEntree();
			case Inf5153emfPackage.PORTE__NBRE_SORTIE:
				return getNbreSortie();
			case Inf5153emfPackage.PORTE__CIRCUIT:
				return getCircuit();
			case Inf5153emfPackage.PORTE__TABLEVPORTE:
				if (resolve) return getTablevporte();
				return basicGetTablevporte();
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
			case Inf5153emfPackage.PORTE__NOM:
				setNom((String)newValue);
				return;
			case Inf5153emfPackage.PORTE__NBRE_ENTREE:
				setNbreEntree((Integer)newValue);
				return;
			case Inf5153emfPackage.PORTE__NBRE_SORTIE:
				setNbreSortie((Integer)newValue);
				return;
			case Inf5153emfPackage.PORTE__CIRCUIT:
				setCircuit((Circuit)newValue);
				return;
			case Inf5153emfPackage.PORTE__TABLEVPORTE:
				setTablevporte((TableVPorte)newValue);
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
			case Inf5153emfPackage.PORTE__NOM:
				setNom(NOM_EDEFAULT);
				return;
			case Inf5153emfPackage.PORTE__NBRE_ENTREE:
				setNbreEntree(NBRE_ENTREE_EDEFAULT);
				return;
			case Inf5153emfPackage.PORTE__NBRE_SORTIE:
				setNbreSortie(NBRE_SORTIE_EDEFAULT);
				return;
			case Inf5153emfPackage.PORTE__CIRCUIT:
				setCircuit((Circuit)null);
				return;
			case Inf5153emfPackage.PORTE__TABLEVPORTE:
				setTablevporte((TableVPorte)null);
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
			case Inf5153emfPackage.PORTE__NOM:
				return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
			case Inf5153emfPackage.PORTE__NBRE_ENTREE:
				return nbreEntree != NBRE_ENTREE_EDEFAULT;
			case Inf5153emfPackage.PORTE__NBRE_SORTIE:
				return nbreSortie != NBRE_SORTIE_EDEFAULT;
			case Inf5153emfPackage.PORTE__CIRCUIT:
				return getCircuit() != null;
			case Inf5153emfPackage.PORTE__TABLEVPORTE:
				return tablevporte != null;
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
			case Inf5153emfPackage.PORTE___RELIER_SORTIE:
				relierSortie();
				return null;
			case Inf5153emfPackage.PORTE___RELIER_ENTREE:
				relierEntree();
				return null;
			case Inf5153emfPackage.PORTE___GENERER_TV:
				genererTV();
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

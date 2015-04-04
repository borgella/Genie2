/**
 */
package inf5153emf.impl;

import inf5153emf.CircuitLogic;
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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Table VPorte</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.TableVPorteImpl#getPorte <em>Porte</em>}</li>
 *   <li>{@link inf5153emf.impl.TableVPorteImpl#getCircuitlogic <em>Circuitlogic</em>}</li>
 *   <li>{@link inf5153emf.impl.TableVPorteImpl#getEntree <em>Entree</em>}</li>
 *   <li>{@link inf5153emf.impl.TableVPorteImpl#getSortie <em>Sortie</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TableVPorteImpl extends MinimalEObjectImpl.Container implements TableVPorte {
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
	 * The cached value of the '{@link #getCircuitlogic() <em>Circuitlogic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCircuitlogic()
	 * @generated
	 * @ordered
	 */
	protected CircuitLogic circuitlogic;

	/**
	 * The default value of the '{@link #getEntree() <em>Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected static final int ENTREE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getEntree() <em>Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntree()
	 * @generated
	 * @ordered
	 */
	protected int entree = ENTREE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSortie() <em>Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortie()
	 * @generated
	 * @ordered
	 */
	protected static final int SORTIE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSortie() <em>Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSortie()
	 * @generated
	 * @ordered
	 */
	protected int sortie = SORTIE_EDEFAULT;

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
				msgs = ((InternalEObject)porte).eInverseRemove(this, Inf5153emfPackage.PORTE__TABLEVERITE, Porte.class, msgs);
			if (newPorte != null)
				msgs = ((InternalEObject)newPorte).eInverseAdd(this, Inf5153emfPackage.PORTE__TABLEVERITE, Porte.class, msgs);
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
	public CircuitLogic getCircuitlogic() {
		if (circuitlogic != null && circuitlogic.eIsProxy()) {
			InternalEObject oldCircuitlogic = (InternalEObject)circuitlogic;
			circuitlogic = (CircuitLogic)eResolveProxy(oldCircuitlogic);
			if (circuitlogic != oldCircuitlogic) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Inf5153emfPackage.TABLE_VPORTE__CIRCUITLOGIC, oldCircuitlogic, circuitlogic));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.TABLE_VPORTE__CIRCUITLOGIC, oldCircuitlogic, newCircuitlogic);
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
				msgs = ((InternalEObject)circuitlogic).eInverseRemove(this, Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVERITE, CircuitLogic.class, msgs);
			if (newCircuitlogic != null)
				msgs = ((InternalEObject)newCircuitlogic).eInverseAdd(this, Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVERITE, CircuitLogic.class, msgs);
			msgs = basicSetCircuitlogic(newCircuitlogic, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.TABLE_VPORTE__CIRCUITLOGIC, newCircuitlogic, newCircuitlogic));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEntree() {
		return entree;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEntree(int newEntree) {
		int oldEntree = entree;
		entree = newEntree;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.TABLE_VPORTE__ENTREE, oldEntree, entree));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSortie() {
		return sortie;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSortie(int newSortie) {
		int oldSortie = sortie;
		sortie = newSortie;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Inf5153emfPackage.TABLE_VPORTE__SORTIE, oldSortie, sortie));
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
	public void affiche() {
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
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				if (porte != null)
					msgs = ((InternalEObject)porte).eInverseRemove(this, Inf5153emfPackage.PORTE__TABLEVERITE, Porte.class, msgs);
				return basicSetPorte((Porte)otherEnd, msgs);
			case Inf5153emfPackage.TABLE_VPORTE__CIRCUITLOGIC:
				if (circuitlogic != null)
					msgs = ((InternalEObject)circuitlogic).eInverseRemove(this, Inf5153emfPackage.CIRCUIT_LOGIC__TABLEVERITE, CircuitLogic.class, msgs);
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
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				return basicSetPorte(null, msgs);
			case Inf5153emfPackage.TABLE_VPORTE__CIRCUITLOGIC:
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
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				if (resolve) return getPorte();
				return basicGetPorte();
			case Inf5153emfPackage.TABLE_VPORTE__CIRCUITLOGIC:
				if (resolve) return getCircuitlogic();
				return basicGetCircuitlogic();
			case Inf5153emfPackage.TABLE_VPORTE__ENTREE:
				return getEntree();
			case Inf5153emfPackage.TABLE_VPORTE__SORTIE:
				return getSortie();
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
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				setPorte((Porte)newValue);
				return;
			case Inf5153emfPackage.TABLE_VPORTE__CIRCUITLOGIC:
				setCircuitlogic((CircuitLogic)newValue);
				return;
			case Inf5153emfPackage.TABLE_VPORTE__ENTREE:
				setEntree((Integer)newValue);
				return;
			case Inf5153emfPackage.TABLE_VPORTE__SORTIE:
				setSortie((Integer)newValue);
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
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				setPorte((Porte)null);
				return;
			case Inf5153emfPackage.TABLE_VPORTE__CIRCUITLOGIC:
				setCircuitlogic((CircuitLogic)null);
				return;
			case Inf5153emfPackage.TABLE_VPORTE__ENTREE:
				setEntree(ENTREE_EDEFAULT);
				return;
			case Inf5153emfPackage.TABLE_VPORTE__SORTIE:
				setSortie(SORTIE_EDEFAULT);
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
			case Inf5153emfPackage.TABLE_VPORTE__PORTE:
				return porte != null;
			case Inf5153emfPackage.TABLE_VPORTE__CIRCUITLOGIC:
				return circuitlogic != null;
			case Inf5153emfPackage.TABLE_VPORTE__ENTREE:
				return entree != ENTREE_EDEFAULT;
			case Inf5153emfPackage.TABLE_VPORTE__SORTIE:
				return sortie != SORTIE_EDEFAULT;
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
			case Inf5153emfPackage.TABLE_VPORTE___AFFICHE:
				affiche();
				return null;
			case Inf5153emfPackage.TABLE_VPORTE___CALCULER:
				calculer();
				return null;
			case Inf5153emfPackage.TABLE_VPORTE___AFFICHER:
				afficher();
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
		result.append(" (Entree: ");
		result.append(entree);
		result.append(", Sortie: ");
		result.append(sortie);
		result.append(')');
		return result.toString();
	}

} //TableVPorteImpl

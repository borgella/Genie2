/**
 */
package inf5153emf.impl;

import inf5153emf.Circuit;
import inf5153emf.CommandeConcrete;
import inf5153emf.Inf5153emfPackage;
import inf5153emf.Memento;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Commande Concrete</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link inf5153emf.impl.CommandeConcreteImpl#getExecutes <em>Executes</em>}</li>
 *   <li>{@link inf5153emf.impl.CommandeConcreteImpl#getExecute <em>Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CommandeConcreteImpl extends MinimalEObjectImpl.Container implements CommandeConcrete {
	/**
	 * The cached value of the '{@link #getExecutes() <em>Executes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutes()
	 * @generated
	 * @ordered
	 */
	protected EList<Circuit> executes;

	/**
	 * The cached value of the '{@link #getExecute() <em>Execute</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecute()
	 * @generated
	 * @ordered
	 */
	protected EList<Memento> execute;

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
	public EList<Circuit> getExecutes() {
		if (executes == null) {
			executes = new EObjectResolvingEList<Circuit>(Circuit.class, this, Inf5153emfPackage.COMMANDE_CONCRETE__EXECUTES);
		}
		return executes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Memento> getExecute() {
		if (execute == null) {
			execute = new EObjectResolvingEList<Memento>(Memento.class, this, Inf5153emfPackage.COMMANDE_CONCRETE__EXECUTE);
		}
		return execute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void execute() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
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
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Inf5153emfPackage.COMMANDE_CONCRETE__EXECUTES:
				return getExecutes();
			case Inf5153emfPackage.COMMANDE_CONCRETE__EXECUTE:
				return getExecute();
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
			case Inf5153emfPackage.COMMANDE_CONCRETE__EXECUTES:
				getExecutes().clear();
				getExecutes().addAll((Collection<? extends Circuit>)newValue);
				return;
			case Inf5153emfPackage.COMMANDE_CONCRETE__EXECUTE:
				getExecute().clear();
				getExecute().addAll((Collection<? extends Memento>)newValue);
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
			case Inf5153emfPackage.COMMANDE_CONCRETE__EXECUTES:
				getExecutes().clear();
				return;
			case Inf5153emfPackage.COMMANDE_CONCRETE__EXECUTE:
				getExecute().clear();
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
			case Inf5153emfPackage.COMMANDE_CONCRETE__EXECUTES:
				return executes != null && !executes.isEmpty();
			case Inf5153emfPackage.COMMANDE_CONCRETE__EXECUTE:
				return execute != null && !execute.isEmpty();
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
			case Inf5153emfPackage.COMMANDE_CONCRETE___EXECUTE:
				execute();
				return null;
			case Inf5153emfPackage.COMMANDE_CONCRETE___EXCUTE:
				excute();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //CommandeConcreteImpl

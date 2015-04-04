/**
 */
package inf5153emf;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commande Concrete</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.CommandeConcrete#getExecutes <em>Executes</em>}</li>
 *   <li>{@link inf5153emf.CommandeConcrete#getExecute <em>Execute</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getCommandeConcrete()
 * @model
 * @generated
 */
public interface CommandeConcrete extends Commande {
	/**
	 * Returns the value of the '<em><b>Executes</b></em>' reference list.
	 * The list contents are of type {@link inf5153emf.Circuit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Executes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executes</em>' reference list.
	 * @see inf5153emf.Inf5153emfPackage#getCommandeConcrete_Executes()
	 * @model required="true"
	 * @generated
	 */
	EList<Circuit> getExecutes();

	/**
	 * Returns the value of the '<em><b>Execute</b></em>' reference list.
	 * The list contents are of type {@link inf5153emf.Memento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execute</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execute</em>' reference list.
	 * @see inf5153emf.Inf5153emfPackage#getCommandeConcrete_Execute()
	 * @model required="true"
	 * @generated
	 */
	EList<Memento> getExecute();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void execute();

} // CommandeConcrete

/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Memento</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.Memento#getCommande <em>Commande</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getMemento()
 * @model
 * @generated
 */
public interface Memento extends EObject {
	/**
	 * Returns the value of the '<em><b>Commande</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Commande#getMemento <em>Memento</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Commande</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Commande</em>' reference.
	 * @see #setCommande(Commande)
	 * @see inf5153emf.Inf5153emfPackage#getMemento_Commande()
	 * @see inf5153emf.Commande#getMemento
	 * @model opposite="memento"
	 * @generated
	 */
	Commande getCommande();

	/**
	 * Sets the value of the '{@link inf5153emf.Memento#getCommande <em>Commande</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Commande</em>' reference.
	 * @see #getCommande()
	 * @generated
	 */
	void setCommande(Commande value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getState();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setState();

} // Memento

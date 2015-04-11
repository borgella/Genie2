/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Commande</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.Commande#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link inf5153emf.Commande#getUtilisateur <em>Utilisateur</em>}</li>
 *   <li>{@link inf5153emf.Commande#getMemento <em>Memento</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getCommande()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Commande extends EObject {
	/**
	 * Returns the value of the '<em><b>Circuit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Circuit#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit</em>' reference.
	 * @see #setCircuit(Circuit)
	 * @see inf5153emf.Inf5153emfPackage#getCommande_Circuit()
	 * @see inf5153emf.Circuit#getCommande
	 * @model opposite="commande"
	 * @generated
	 */
	Circuit getCircuit();

	/**
	 * Sets the value of the '{@link inf5153emf.Commande#getCircuit <em>Circuit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit</em>' reference.
	 * @see #getCircuit()
	 * @generated
	 */
	void setCircuit(Circuit value);

	/**
	 * Returns the value of the '<em><b>Utilisateur</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Utilisateur#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Utilisateur</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Utilisateur</em>' reference.
	 * @see #setUtilisateur(Utilisateur)
	 * @see inf5153emf.Inf5153emfPackage#getCommande_Utilisateur()
	 * @see inf5153emf.Utilisateur#getCommande
	 * @model opposite="commande"
	 * @generated
	 */
	Utilisateur getUtilisateur();

	/**
	 * Sets the value of the '{@link inf5153emf.Commande#getUtilisateur <em>Utilisateur</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Utilisateur</em>' reference.
	 * @see #getUtilisateur()
	 * @generated
	 */
	void setUtilisateur(Utilisateur value);

	/**
	 * Returns the value of the '<em><b>Memento</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Memento#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memento</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memento</em>' reference.
	 * @see #setMemento(Memento)
	 * @see inf5153emf.Inf5153emfPackage#getCommande_Memento()
	 * @see inf5153emf.Memento#getCommande
	 * @model opposite="commande"
	 * @generated
	 */
	Memento getMemento();

	/**
	 * Sets the value of the '{@link inf5153emf.Commande#getMemento <em>Memento</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Memento</em>' reference.
	 * @see #getMemento()
	 * @generated
	 */
	void setMemento(Memento value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void excute();

} // Commande

/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Utilisateur</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.Utilisateur#getInvokes <em>Invokes</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getUtilisateur()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Utilisateur extends EObject {
	/**
	 * Returns the value of the '<em><b>Invokes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Invokes</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invokes</em>' reference.
	 * @see #setInvokes(Commande)
	 * @see inf5153emf.Inf5153emfPackage#getUtilisateur_Invokes()
	 * @model
	 * @generated
	 */
	Commande getInvokes();

	/**
	 * Sets the value of the '{@link inf5153emf.Utilisateur#getInvokes <em>Invokes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invokes</em>' reference.
	 * @see #getInvokes()
	 * @generated
	 */
	void setInvokes(Commande value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void invoke();

} // Utilisateur

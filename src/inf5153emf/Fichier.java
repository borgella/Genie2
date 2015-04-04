/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fichier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.Fichier#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link inf5153emf.Fichier#getDossier <em>Dossier</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getFichier()
 * @model
 * @generated
 */
public interface Fichier extends EObject {
	/**
	 * Returns the value of the '<em><b>Circuit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Circuit#getFichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit</em>' reference.
	 * @see #setCircuit(Circuit)
	 * @see inf5153emf.Inf5153emfPackage#getFichier_Circuit()
	 * @see inf5153emf.Circuit#getFichier
	 * @model opposite="fichier"
	 * @generated
	 */
	Circuit getCircuit();

	/**
	 * Sets the value of the '{@link inf5153emf.Fichier#getCircuit <em>Circuit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit</em>' reference.
	 * @see #getCircuit()
	 * @generated
	 */
	void setCircuit(Circuit value);

	/**
	 * Returns the value of the '<em><b>Dossier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Dossier#getFichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dossier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dossier</em>' reference.
	 * @see #setDossier(Dossier)
	 * @see inf5153emf.Inf5153emfPackage#getFichier_Dossier()
	 * @see inf5153emf.Dossier#getFichier
	 * @model opposite="fichier"
	 * @generated
	 */
	Dossier getDossier();

	/**
	 * Sets the value of the '{@link inf5153emf.Fichier#getDossier <em>Dossier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dossier</em>' reference.
	 * @see #getDossier()
	 * @generated
	 */
	void setDossier(Dossier value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation"
	 * @generated
	 */
	void getNom();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setNom();

} // Fichier

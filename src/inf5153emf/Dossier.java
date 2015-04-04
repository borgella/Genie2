/**
 */
package inf5153emf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Dossier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.Dossier#getFichier <em>Fichier</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getDossier()
 * @model
 * @generated
 */
public interface Dossier extends EObject {
	/**
	 * Returns the value of the '<em><b>Fichier</b></em>' reference list.
	 * The list contents are of type {@link inf5153emf.Fichier}.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Fichier#getDossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fichier</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fichier</em>' reference list.
	 * @see inf5153emf.Inf5153emfPackage#getDossier_Fichier()
	 * @see inf5153emf.Fichier#getDossier
	 * @model opposite="dossier" required="true"
	 * @generated
	 */
	EList<Fichier> getFichier();

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

} // Dossier

/**
 */
package inf5153emf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.EntreeCircuit#getContient <em>Contient</em>}</li>
 *   <li>{@link inf5153emf.EntreeCircuit#getNom <em>Nom</em>}</li>
 *   <li>{@link inf5153emf.EntreeCircuit#getEtat <em>Etat</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getEntreeCircuit()
 * @model
 * @generated
 */
public interface EntreeCircuit extends EObject {
	/**
	 * Returns the value of the '<em><b>Contient</b></em>' reference list.
	 * The list contents are of type {@link inf5153emf.Circuit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contient</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contient</em>' reference list.
	 * @see inf5153emf.Inf5153emfPackage#getEntreeCircuit_Contient()
	 * @model required="true"
	 * @generated
	 */
	EList<Circuit> getContient();

	/**
	 * Returns the value of the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nom</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nom</em>' attribute.
	 * @see #setNom(String)
	 * @see inf5153emf.Inf5153emfPackage#getEntreeCircuit_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link inf5153emf.EntreeCircuit#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Etat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Etat</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Etat</em>' attribute.
	 * @see #setEtat(String)
	 * @see inf5153emf.Inf5153emfPackage#getEntreeCircuit_Etat()
	 * @model
	 * @generated
	 */
	String getEtat();

	/**
	 * Sets the value of the '{@link inf5153emf.EntreeCircuit#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat</em>' attribute.
	 * @see #getEtat()
	 * @generated
	 */
	void setEtat(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void ajouter();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void definir();

} // EntreeCircuit

/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sorctie Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.SorctieCircuit#getContient <em>Contient</em>}</li>
 *   <li>{@link inf5153emf.SorctieCircuit#getSortieporte <em>Sortieporte</em>}</li>
 *   <li>{@link inf5153emf.SorctieCircuit#getNom <em>Nom</em>}</li>
 *   <li>{@link inf5153emf.SorctieCircuit#getEtat <em>Etat</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getSorctieCircuit()
 * @model
 * @generated
 */
public interface SorctieCircuit extends EObject {
	/**
	 * Returns the value of the '<em><b>Contient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contient</em>' reference.
	 * @see #setContient(Circuit)
	 * @see inf5153emf.Inf5153emfPackage#getSorctieCircuit_Contient()
	 * @model
	 * @generated
	 */
	Circuit getContient();

	/**
	 * Sets the value of the '{@link inf5153emf.SorctieCircuit#getContient <em>Contient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contient</em>' reference.
	 * @see #getContient()
	 * @generated
	 */
	void setContient(Circuit value);

	/**
	 * Returns the value of the '<em><b>Sortieporte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.SortiePorte#getSorctiecircuit <em>Sorctiecircuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortieporte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortieporte</em>' reference.
	 * @see #setSortieporte(SortiePorte)
	 * @see inf5153emf.Inf5153emfPackage#getSorctieCircuit_Sortieporte()
	 * @see inf5153emf.SortiePorte#getSorctiecircuit
	 * @model opposite="sorctiecircuit"
	 * @generated
	 */
	SortiePorte getSortieporte();

	/**
	 * Sets the value of the '{@link inf5153emf.SorctieCircuit#getSortieporte <em>Sortieporte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortieporte</em>' reference.
	 * @see #getSortieporte()
	 * @generated
	 */
	void setSortieporte(SortiePorte value);

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
	 * @see inf5153emf.Inf5153emfPackage#getSorctieCircuit_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link inf5153emf.SorctieCircuit#getNom <em>Nom</em>}' attribute.
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
	 * @see #setEtat(int)
	 * @see inf5153emf.Inf5153emfPackage#getSorctieCircuit_Etat()
	 * @model
	 * @generated
	 */
	int getEtat();

	/**
	 * Sets the value of the '{@link inf5153emf.SorctieCircuit#getEtat <em>Etat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Etat</em>' attribute.
	 * @see #getEtat()
	 * @generated
	 */
	void setEtat(int value);

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
	void supprimer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void definir();

} // SorctieCircuit

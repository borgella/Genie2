/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Entree Porte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.EntreePorte#getContient <em>Contient</em>}</li>
 *   <li>{@link inf5153emf.EntreePorte#getSortieporte <em>Sortieporte</em>}</li>
 *   <li>{@link inf5153emf.EntreePorte#getNom <em>Nom</em>}</li>
 *   <li>{@link inf5153emf.EntreePorte#getEtat <em>Etat</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getEntreePorte()
 * @model
 * @generated
 */
public interface EntreePorte extends EObject {
	/**
	 * Returns the value of the '<em><b>Contient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Contient</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contient</em>' reference.
	 * @see #setContient(Porte)
	 * @see inf5153emf.Inf5153emfPackage#getEntreePorte_Contient()
	 * @model
	 * @generated
	 */
	Porte getContient();

	/**
	 * Sets the value of the '{@link inf5153emf.EntreePorte#getContient <em>Contient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contient</em>' reference.
	 * @see #getContient()
	 * @generated
	 */
	void setContient(Porte value);

	/**
	 * Returns the value of the '<em><b>Sortieporte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.SortiePorte#getEntreeporte <em>Entreeporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortieporte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortieporte</em>' reference.
	 * @see #setSortieporte(SortiePorte)
	 * @see inf5153emf.Inf5153emfPackage#getEntreePorte_Sortieporte()
	 * @see inf5153emf.SortiePorte#getEntreeporte
	 * @model opposite="entreeporte"
	 * @generated
	 */
	SortiePorte getSortieporte();

	/**
	 * Sets the value of the '{@link inf5153emf.EntreePorte#getSortieporte <em>Sortieporte</em>}' reference.
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
	 * @see inf5153emf.Inf5153emfPackage#getEntreePorte_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link inf5153emf.EntreePorte#getNom <em>Nom</em>}' attribute.
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
	 * @see inf5153emf.Inf5153emfPackage#getEntreePorte_Etat()
	 * @model
	 * @generated
	 */
	int getEtat();

	/**
	 * Sets the value of the '{@link inf5153emf.EntreePorte#getEtat <em>Etat</em>}' attribute.
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
	void definir();

} // EntreePorte

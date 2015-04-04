/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sortie Porte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.SortiePorte#getContient <em>Contient</em>}</li>
 *   <li>{@link inf5153emf.SortiePorte#getEntreeporte <em>Entreeporte</em>}</li>
 *   <li>{@link inf5153emf.SortiePorte#getSorctiecircuit <em>Sorctiecircuit</em>}</li>
 *   <li>{@link inf5153emf.SortiePorte#getNom <em>Nom</em>}</li>
 *   <li>{@link inf5153emf.SortiePorte#getEtat <em>Etat</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getSortiePorte()
 * @model
 * @generated
 */
public interface SortiePorte extends EObject {
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
	 * @see inf5153emf.Inf5153emfPackage#getSortiePorte_Contient()
	 * @model
	 * @generated
	 */
	Porte getContient();

	/**
	 * Sets the value of the '{@link inf5153emf.SortiePorte#getContient <em>Contient</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Contient</em>' reference.
	 * @see #getContient()
	 * @generated
	 */
	void setContient(Porte value);

	/**
	 * Returns the value of the '<em><b>Entreeporte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.EntreePorte#getSortieporte <em>Sortieporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entreeporte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entreeporte</em>' reference.
	 * @see #setEntreeporte(EntreePorte)
	 * @see inf5153emf.Inf5153emfPackage#getSortiePorte_Entreeporte()
	 * @see inf5153emf.EntreePorte#getSortieporte
	 * @model opposite="sortieporte"
	 * @generated
	 */
	EntreePorte getEntreeporte();

	/**
	 * Sets the value of the '{@link inf5153emf.SortiePorte#getEntreeporte <em>Entreeporte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entreeporte</em>' reference.
	 * @see #getEntreeporte()
	 * @generated
	 */
	void setEntreeporte(EntreePorte value);

	/**
	 * Returns the value of the '<em><b>Sorctiecircuit</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.SorctieCircuit#getSortieporte <em>Sortieporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sorctiecircuit</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sorctiecircuit</em>' reference.
	 * @see #setSorctiecircuit(SorctieCircuit)
	 * @see inf5153emf.Inf5153emfPackage#getSortiePorte_Sorctiecircuit()
	 * @see inf5153emf.SorctieCircuit#getSortieporte
	 * @model opposite="sortieporte"
	 * @generated
	 */
	SorctieCircuit getSorctiecircuit();

	/**
	 * Sets the value of the '{@link inf5153emf.SortiePorte#getSorctiecircuit <em>Sorctiecircuit</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sorctiecircuit</em>' reference.
	 * @see #getSorctiecircuit()
	 * @generated
	 */
	void setSorctiecircuit(SorctieCircuit value);

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
	 * @see inf5153emf.Inf5153emfPackage#getSortiePorte_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link inf5153emf.SortiePorte#getNom <em>Nom</em>}' attribute.
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
	 * @see inf5153emf.Inf5153emfPackage#getSortiePorte_Etat()
	 * @model
	 * @generated
	 */
	int getEtat();

	/**
	 * Sets the value of the '{@link inf5153emf.SortiePorte#getEtat <em>Etat</em>}' attribute.
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

} // SortiePorte

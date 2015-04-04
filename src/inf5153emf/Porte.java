/**
 */
package inf5153emf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Porte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.Porte#getNom <em>Nom</em>}</li>
 *   <li>{@link inf5153emf.Porte#getNbreEntree <em>Nbre Entree</em>}</li>
 *   <li>{@link inf5153emf.Porte#getNbreSortie <em>Nbre Sortie</em>}</li>
 *   <li>{@link inf5153emf.Porte#getTableverite <em>Tableverite</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getPorte()
 * @model
 * @generated
 */
public interface Porte extends Circuit {
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
	 * @see inf5153emf.Inf5153emfPackage#getPorte_Nom()
	 * @model
	 * @generated
	 */
	String getNom();

	/**
	 * Sets the value of the '{@link inf5153emf.Porte#getNom <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nom</em>' attribute.
	 * @see #getNom()
	 * @generated
	 */
	void setNom(String value);

	/**
	 * Returns the value of the '<em><b>Nbre Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbre Entree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbre Entree</em>' attribute.
	 * @see #setNbreEntree(int)
	 * @see inf5153emf.Inf5153emfPackage#getPorte_NbreEntree()
	 * @model
	 * @generated
	 */
	int getNbreEntree();

	/**
	 * Sets the value of the '{@link inf5153emf.Porte#getNbreEntree <em>Nbre Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbre Entree</em>' attribute.
	 * @see #getNbreEntree()
	 * @generated
	 */
	void setNbreEntree(int value);

	/**
	 * Returns the value of the '<em><b>Nbre Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Nbre Sortie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nbre Sortie</em>' attribute.
	 * @see #setNbreSortie(int)
	 * @see inf5153emf.Inf5153emfPackage#getPorte_NbreSortie()
	 * @model
	 * @generated
	 */
	int getNbreSortie();

	/**
	 * Sets the value of the '{@link inf5153emf.Porte#getNbreSortie <em>Nbre Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nbre Sortie</em>' attribute.
	 * @see #getNbreSortie()
	 * @generated
	 */
	void setNbreSortie(int value);

	/**
	 * Returns the value of the '<em><b>Tableverite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.TableVerite#getPorte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tableverite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tableverite</em>' reference.
	 * @see #setTableverite(TableVerite)
	 * @see inf5153emf.Inf5153emfPackage#getPorte_Tableverite()
	 * @see inf5153emf.TableVerite#getPorte
	 * @model opposite="porte"
	 * @generated
	 */
	TableVerite getTableverite();

	/**
	 * Sets the value of the '{@link inf5153emf.Porte#getTableverite <em>Tableverite</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tableverite</em>' reference.
	 * @see #getTableverite()
	 * @generated
	 */
	void setTableverite(TableVerite value);

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
	void relierSortie();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void relierEntree();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void genererTV();

} // Porte

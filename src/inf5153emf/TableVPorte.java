/**
 */
package inf5153emf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table VPorte</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.TableVPorte#getPorte <em>Porte</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getTableVPorte()
 * @model
 * @generated
 */
public interface TableVPorte extends SubjectTV {
	/**
	 * Returns the value of the '<em><b>Porte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Porte#getTablevporte <em>Tablevporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porte</em>' reference.
	 * @see #setPorte(Porte)
	 * @see inf5153emf.Inf5153emfPackage#getTableVPorte_Porte()
	 * @see inf5153emf.Porte#getTablevporte
	 * @model opposite="tablevporte"
	 * @generated
	 */
	Porte getPorte();

	/**
	 * Sets the value of the '{@link inf5153emf.TableVPorte#getPorte <em>Porte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porte</em>' reference.
	 * @see #getPorte()
	 * @generated
	 */
	void setPorte(Porte value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void update();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void afficher();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void calculer();

} // TableVPorte

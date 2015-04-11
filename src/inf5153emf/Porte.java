/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;


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
 *   <li>{@link inf5153emf.Porte#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link inf5153emf.Porte#getTablevporte <em>Tablevporte</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getPorte()
 * @model
 * @generated
 */
public interface Porte extends EObject {
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
	 * Returns the value of the '<em><b>Circuit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Circuit#getPorte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit</em>' container reference.
	 * @see #setCircuit(Circuit)
	 * @see inf5153emf.Inf5153emfPackage#getPorte_Circuit()
	 * @see inf5153emf.Circuit#getPorte
	 * @model opposite="porte" transient="false"
	 * @generated
	 */
	Circuit getCircuit();

	/**
	 * Sets the value of the '{@link inf5153emf.Porte#getCircuit <em>Circuit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit</em>' container reference.
	 * @see #getCircuit()
	 * @generated
	 */
	void setCircuit(Circuit value);

	/**
	 * Returns the value of the '<em><b>Tablevporte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.TableVPorte#getPorte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tablevporte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tablevporte</em>' reference.
	 * @see #setTablevporte(TableVPorte)
	 * @see inf5153emf.Inf5153emfPackage#getPorte_Tablevporte()
	 * @see inf5153emf.TableVPorte#getPorte
	 * @model opposite="porte"
	 * @generated
	 */
	TableVPorte getTablevporte();

	/**
	 * Sets the value of the '{@link inf5153emf.Porte#getTablevporte <em>Tablevporte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Tablevporte</em>' reference.
	 * @see #getTablevporte()
	 * @generated
	 */
	void setTablevporte(TableVPorte value);

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

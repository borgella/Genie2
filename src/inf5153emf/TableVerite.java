/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table Verite</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.TableVerite#getPorte <em>Porte</em>}</li>
 *   <li>{@link inf5153emf.TableVerite#getCircuitlogic <em>Circuitlogic</em>}</li>
 *   <li>{@link inf5153emf.TableVerite#getEntree <em>Entree</em>}</li>
 *   <li>{@link inf5153emf.TableVerite#getSortie <em>Sortie</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getTableVerite()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface TableVerite extends EObject {
	/**
	 * Returns the value of the '<em><b>Porte</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Porte#getTableverite <em>Tableverite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Porte</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Porte</em>' reference.
	 * @see #setPorte(Porte)
	 * @see inf5153emf.Inf5153emfPackage#getTableVerite_Porte()
	 * @see inf5153emf.Porte#getTableverite
	 * @model opposite="tableverite" required="true"
	 * @generated
	 */
	Porte getPorte();

	/**
	 * Sets the value of the '{@link inf5153emf.TableVerite#getPorte <em>Porte</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Porte</em>' reference.
	 * @see #getPorte()
	 * @generated
	 */
	void setPorte(Porte value);

	/**
	 * Returns the value of the '<em><b>Circuitlogic</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.CircuitLogic#getTableverite <em>Tableverite</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuitlogic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuitlogic</em>' reference.
	 * @see #setCircuitlogic(CircuitLogic)
	 * @see inf5153emf.Inf5153emfPackage#getTableVerite_Circuitlogic()
	 * @see inf5153emf.CircuitLogic#getTableverite
	 * @model opposite="tableverite" required="true"
	 * @generated
	 */
	CircuitLogic getCircuitlogic();

	/**
	 * Sets the value of the '{@link inf5153emf.TableVerite#getCircuitlogic <em>Circuitlogic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuitlogic</em>' reference.
	 * @see #getCircuitlogic()
	 * @generated
	 */
	void setCircuitlogic(CircuitLogic value);

	/**
	 * Returns the value of the '<em><b>Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entree</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entree</em>' attribute.
	 * @see #setEntree(int)
	 * @see inf5153emf.Inf5153emfPackage#getTableVerite_Entree()
	 * @model
	 * @generated
	 */
	int getEntree();

	/**
	 * Sets the value of the '{@link inf5153emf.TableVerite#getEntree <em>Entree</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entree</em>' attribute.
	 * @see #getEntree()
	 * @generated
	 */
	void setEntree(int value);

	/**
	 * Returns the value of the '<em><b>Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sortie</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sortie</em>' attribute.
	 * @see #setSortie(int)
	 * @see inf5153emf.Inf5153emfPackage#getTableVerite_Sortie()
	 * @model
	 * @generated
	 */
	int getSortie();

	/**
	 * Sets the value of the '{@link inf5153emf.TableVerite#getSortie <em>Sortie</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sortie</em>' attribute.
	 * @see #getSortie()
	 * @generated
	 */
	void setSortie(int value);

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

} // TableVerite

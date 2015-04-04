/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit Logic</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.CircuitLogic#getCircuit <em>Circuit</em>}</li>
 *   <li>{@link inf5153emf.CircuitLogic#getTableverite <em>Tableverite</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getCircuitLogic()
 * @model
 * @generated
 */
public interface CircuitLogic extends EObject {
	/**
	 * Returns the value of the '<em><b>Circuit</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Circuit#getCircuitlogic <em>Circuitlogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit</em>' containment reference.
	 * @see #setCircuit(Circuit)
	 * @see inf5153emf.Inf5153emfPackage#getCircuitLogic_Circuit()
	 * @see inf5153emf.Circuit#getCircuitlogic
	 * @model opposite="circuitlogic" containment="true"
	 * @generated
	 */
	Circuit getCircuit();

	/**
	 * Sets the value of the '{@link inf5153emf.CircuitLogic#getCircuit <em>Circuit</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit</em>' containment reference.
	 * @see #getCircuit()
	 * @generated
	 */
	void setCircuit(Circuit value);

	/**
	 * Returns the value of the '<em><b>Tableverite</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.TableVerite#getCircuitlogic <em>Circuitlogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tableverite</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tableverite</em>' reference.
	 * @see #setTableverite(TableVerite)
	 * @see inf5153emf.Inf5153emfPackage#getCircuitLogic_Tableverite()
	 * @see inf5153emf.TableVerite#getCircuitlogic
	 * @model opposite="circuitlogic"
	 * @generated
	 */
	TableVerite getTableverite();

	/**
	 * Sets the value of the '{@link inf5153emf.CircuitLogic#getTableverite <em>Tableverite</em>}' reference.
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
	void creer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void charger();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void sauvegarder();

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

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void genererTV();

} // CircuitLogic

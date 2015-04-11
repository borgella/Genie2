/**
 */
package inf5153emf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Table VCircuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.TableVCircuit#getCircuitlogic <em>Circuitlogic</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getTableVCircuit()
 * @model
 * @generated
 */
public interface TableVCircuit extends SubjectTV {
	/**
	 * Returns the value of the '<em><b>Circuitlogic</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.CircuitLogic#getTablevcircuit <em>Tablevcircuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuitlogic</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuitlogic</em>' reference.
	 * @see #setCircuitlogic(CircuitLogic)
	 * @see inf5153emf.Inf5153emfPackage#getTableVCircuit_Circuitlogic()
	 * @see inf5153emf.CircuitLogic#getTablevcircuit
	 * @model opposite="tablevcircuit"
	 * @generated
	 */
	CircuitLogic getCircuitlogic();

	/**
	 * Sets the value of the '{@link inf5153emf.TableVCircuit#getCircuitlogic <em>Circuitlogic</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuitlogic</em>' reference.
	 * @see #getCircuitlogic()
	 * @generated
	 */
	void setCircuitlogic(CircuitLogic value);

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

} // TableVCircuit

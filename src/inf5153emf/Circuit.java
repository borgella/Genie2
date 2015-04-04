/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Circuit</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.Circuit#getCircuitlogic <em>Circuitlogic</em>}</li>
 *   <li>{@link inf5153emf.Circuit#getFichier <em>Fichier</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getCircuit()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Circuit extends EObject {
	/**
	 * Returns the value of the '<em><b>Circuitlogic</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.CircuitLogic#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuitlogic</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuitlogic</em>' container reference.
	 * @see #setCircuitlogic(CircuitLogic)
	 * @see inf5153emf.Inf5153emfPackage#getCircuit_Circuitlogic()
	 * @see inf5153emf.CircuitLogic#getCircuit
	 * @model opposite="circuit" transient="false"
	 * @generated
	 */
	CircuitLogic getCircuitlogic();

	/**
	 * Sets the value of the '{@link inf5153emf.Circuit#getCircuitlogic <em>Circuitlogic</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuitlogic</em>' container reference.
	 * @see #getCircuitlogic()
	 * @generated
	 */
	void setCircuitlogic(CircuitLogic value);

	/**
	 * Returns the value of the '<em><b>Fichier</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Fichier#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fichier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fichier</em>' reference.
	 * @see #setFichier(Fichier)
	 * @see inf5153emf.Inf5153emfPackage#getCircuit_Fichier()
	 * @see inf5153emf.Fichier#getCircuit
	 * @model opposite="circuit" required="true"
	 * @generated
	 */
	Fichier getFichier();

	/**
	 * Sets the value of the '{@link inf5153emf.Circuit#getFichier <em>Fichier</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fichier</em>' reference.
	 * @see #getFichier()
	 * @generated
	 */
	void setFichier(Fichier value);

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

} // Circuit

/**
 */
package inf5153emf;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Porte Personnaliser</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.PortePersonnaliser#isCircuitValide <em>Circuit Valide</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getPortePersonnaliser()
 * @model
 * @generated
 */
public interface PortePersonnaliser extends Porte {
	/**
	 * Returns the value of the '<em><b>Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Circuit Valide</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Circuit Valide</em>' attribute.
	 * @see #setCircuitValide(boolean)
	 * @see inf5153emf.Inf5153emfPackage#getPortePersonnaliser_CircuitValide()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isCircuitValide();

	/**
	 * Sets the value of the '{@link inf5153emf.PortePersonnaliser#isCircuitValide <em>Circuit Valide</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Circuit Valide</em>' attribute.
	 * @see #isCircuitValide()
	 * @generated
	 */
	void setCircuitValide(boolean value);

} // PortePersonnaliser

/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Subject</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.Subject#getNotify <em>Notify</em>}</li>
 *   <li>{@link inf5153emf.Subject#getUse <em>Use</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getSubject()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface Subject extends EObject {
	/**
	 * Returns the value of the '<em><b>Notify</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Notify</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Notify</em>' reference.
	 * @see #setNotify(Observeur)
	 * @see inf5153emf.Inf5153emfPackage#getSubject_Notify()
	 * @model
	 * @generated
	 */
	Observeur getNotify();

	/**
	 * Sets the value of the '{@link inf5153emf.Subject#getNotify <em>Notify</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Notify</em>' reference.
	 * @see #getNotify()
	 * @generated
	 */
	void setNotify(Observeur value);

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference.
	 * @see #setUse(TableVerite)
	 * @see inf5153emf.Inf5153emfPackage#getSubject_Use()
	 * @model
	 * @generated
	 */
	TableVerite getUse();

	/**
	 * Sets the value of the '{@link inf5153emf.Subject#getUse <em>Use</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use</em>' reference.
	 * @see #getUse()
	 * @generated
	 */
	void setUse(TableVerite value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void enregistrer();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void desenregistrer();

} // Subject

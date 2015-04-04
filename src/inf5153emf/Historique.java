/**
 */
package inf5153emf;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Historique</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link inf5153emf.Historique#getMemento <em>Memento</em>}</li>
 *   <li>{@link inf5153emf.Historique#getMessage <em>Message</em>}</li>
 *   <li>{@link inf5153emf.Historique#getState <em>State</em>}</li>
 * </ul>
 * </p>
 *
 * @see inf5153emf.Inf5153emfPackage#getHistorique()
 * @model
 * @generated
 */
public interface Historique extends EObject {
	/**
	 * Returns the value of the '<em><b>Memento</b></em>' containment reference list.
	 * The list contents are of type {@link inf5153emf.Memento}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memento</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memento</em>' containment reference list.
	 * @see inf5153emf.Inf5153emfPackage#getHistorique_Memento()
	 * @model containment="true"
	 * @generated
	 */
	EList<Memento> getMemento();

	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link inf5153emf.Message#getHistorique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Message</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(Message)
	 * @see inf5153emf.Inf5153emfPackage#getHistorique_Message()
	 * @see inf5153emf.Message#getHistorique
	 * @model opposite="historique"
	 * @generated
	 */
	Message getMessage();

	/**
	 * Sets the value of the '{@link inf5153emf.Historique#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(Message value);

	/**
	 * Returns the value of the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State</em>' attribute.
	 * @see #setState(String)
	 * @see inf5153emf.Inf5153emfPackage#getHistorique_State()
	 * @model
	 * @generated
	 */
	String getState();

	/**
	 * Sets the value of the '{@link inf5153emf.Historique#getState <em>State</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State</em>' attribute.
	 * @see #getState()
	 * @generated
	 */
	void setState(String value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void setMemento(Memento memento);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void undo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void redo();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model
	 * @generated
	 */
	void createMemento();

} // Historique

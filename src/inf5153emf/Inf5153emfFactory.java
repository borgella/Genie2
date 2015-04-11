/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see inf5153emf.Inf5153emfPackage
 * @generated
 */
public interface Inf5153emfFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Inf5153emfFactory eINSTANCE = inf5153emf.impl.Inf5153emfFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Circuit Logic</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Circuit Logic</em>'.
	 * @generated
	 */
	CircuitLogic createCircuitLogic();

	/**
	 * Returns a new object of class '<em>Entree Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entree Circuit</em>'.
	 * @generated
	 */
	EntreeCircuit createEntreeCircuit();

	/**
	 * Returns a new object of class '<em>Porte Personnaliser</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte Personnaliser</em>'.
	 * @generated
	 */
	PortePersonnaliser createPortePersonnaliser();

	/**
	 * Returns a new object of class '<em>Porte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte</em>'.
	 * @generated
	 */
	Porte createPorte();

	/**
	 * Returns a new object of class '<em>Sorctie Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sorctie Circuit</em>'.
	 * @generated
	 */
	SorctieCircuit createSorctieCircuit();

	/**
	 * Returns a new object of class '<em>Porte De Base</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Porte De Base</em>'.
	 * @generated
	 */
	PorteDeBase createPorteDeBase();

	/**
	 * Returns a new object of class '<em>Sortie Porte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sortie Porte</em>'.
	 * @generated
	 */
	SortiePorte createSortiePorte();

	/**
	 * Returns a new object of class '<em>Entree Porte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Entree Porte</em>'.
	 * @generated
	 */
	EntreePorte createEntreePorte();

	/**
	 * Returns a new object of class '<em>Dossier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Dossier</em>'.
	 * @generated
	 */
	Dossier createDossier();

	/**
	 * Returns a new object of class '<em>Fichier</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Fichier</em>'.
	 * @generated
	 */
	Fichier createFichier();

	/**
	 * Returns a new object of class '<em>Commande Concrete</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Commande Concrete</em>'.
	 * @generated
	 */
	CommandeConcrete createCommandeConcrete();

	/**
	 * Returns a new object of class '<em>Memento</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Memento</em>'.
	 * @generated
	 */
	Memento createMemento();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns a new object of class '<em>Historique</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Historique</em>'.
	 * @generated
	 */
	Historique createHistorique();

	/**
	 * Returns a new object of class '<em>Table VPorte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table VPorte</em>'.
	 * @generated
	 */
	TableVPorte createTableVPorte();

	/**
	 * Returns a new object of class '<em>Table VCircuit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Table VCircuit</em>'.
	 * @generated
	 */
	TableVCircuit createTableVCircuit();

	/**
	 * Returns a new object of class '<em>Obs Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obs Circuit</em>'.
	 * @generated
	 */
	ObsCircuit createObsCircuit();

	/**
	 * Returns a new object of class '<em>Obs Porte</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Obs Porte</em>'.
	 * @generated
	 */
	ObsPorte createObsPorte();

	/**
	 * Returns a new object of class '<em>User C</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User C</em>'.
	 * @generated
	 */
	UserC createUserC();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	Inf5153emfPackage getInf5153emfPackage();

} //Inf5153emfFactory

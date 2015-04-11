/**
 */
package inf5153emf;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see inf5153emf.Inf5153emfFactory
 * @model kind="package"
 *        extendedMetaData="qualified='false'"
 * @generated
 */
public interface Inf5153emfPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "inf5153emf";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/inf5153emf";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "inf5153emf";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	Inf5153emfPackage eINSTANCE = inf5153emf.impl.Inf5153emfPackageImpl.init();

	/**
	 * The meta object id for the '{@link inf5153emf.Circuit <em>Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.Circuit
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getCircuit()
	 * @generated
	 */
	int CIRCUIT = 0;

	/**
	 * The feature id for the '<em><b>Circuitlogic</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__CIRCUITLOGIC = 0;

	/**
	 * The feature id for the '<em><b>Fichier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__FICHIER = 1;

	/**
	 * The feature id for the '<em><b>Porte</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__PORTE = 2;

	/**
	 * The feature id for the '<em><b>Commande</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT__COMMANDE = 3;

	/**
	 * The number of structural features of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___CREER = 0;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___AJOUTER = 1;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___DEFINIR = 2;

	/**
	 * The operation id for the '<em>Supprimer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___SUPPRIMER = 3;

	/**
	 * The number of operations of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.CircuitLogicImpl <em>Circuit Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.CircuitLogicImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getCircuitLogic()
	 * @generated
	 */
	int CIRCUIT_LOGIC = 1;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC__CIRCUIT = 0;

	/**
	 * The feature id for the '<em><b>Tablevcircuit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC__TABLEVCIRCUIT = 1;

	/**
	 * The number of structural features of the '<em>Circuit Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Charger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC___CHARGER = 0;

	/**
	 * The operation id for the '<em>Sauvegarder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC___SAUVEGARDER = 1;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC___DEFINIR = 2;

	/**
	 * The operation id for the '<em>Generer TV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC___GENERER_TV = 3;

	/**
	 * The number of operations of the '<em>Circuit Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.EntreeCircuitImpl <em>Entree Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.EntreeCircuitImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getEntreeCircuit()
	 * @generated
	 */
	int ENTREE_CIRCUIT = 2;

	/**
	 * The feature id for the '<em><b>Contient</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_CIRCUIT__CONTIENT = 0;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_CIRCUIT__NOM = 1;

	/**
	 * The feature id for the '<em><b>Etat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_CIRCUIT__ETAT = 2;

	/**
	 * The number of structural features of the '<em>Entree Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_CIRCUIT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Entree Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_CIRCUIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.PorteImpl <em>Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.PorteImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getPorte()
	 * @generated
	 */
	int PORTE = 4;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__NOM = 0;

	/**
	 * The feature id for the '<em><b>Nbre Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__NBRE_ENTREE = 1;

	/**
	 * The feature id for the '<em><b>Nbre Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__NBRE_SORTIE = 2;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__CIRCUIT = 3;

	/**
	 * The feature id for the '<em><b>Tablevporte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__TABLEVPORTE = 4;

	/**
	 * The number of structural features of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Relier Sortie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___RELIER_SORTIE = 0;

	/**
	 * The operation id for the '<em>Relier Entree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___RELIER_ENTREE = 1;

	/**
	 * The operation id for the '<em>Generer TV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___GENERER_TV = 2;

	/**
	 * The number of operations of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.PortePersonnaliserImpl <em>Porte Personnaliser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.PortePersonnaliserImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getPortePersonnaliser()
	 * @generated
	 */
	int PORTE_PERSONNALISER = 3;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER__NOM = PORTE__NOM;

	/**
	 * The feature id for the '<em><b>Nbre Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER__NBRE_ENTREE = PORTE__NBRE_ENTREE;

	/**
	 * The feature id for the '<em><b>Nbre Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER__NBRE_SORTIE = PORTE__NBRE_SORTIE;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER__CIRCUIT = PORTE__CIRCUIT;

	/**
	 * The feature id for the '<em><b>Tablevporte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER__TABLEVPORTE = PORTE__TABLEVPORTE;

	/**
	 * The feature id for the '<em><b>Circuit Valide</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER__CIRCUIT_VALIDE = PORTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Porte Personnaliser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER_FEATURE_COUNT = PORTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Relier Sortie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER___RELIER_SORTIE = PORTE___RELIER_SORTIE;

	/**
	 * The operation id for the '<em>Relier Entree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER___RELIER_ENTREE = PORTE___RELIER_ENTREE;

	/**
	 * The operation id for the '<em>Generer TV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER___GENERER_TV = PORTE___GENERER_TV;

	/**
	 * The number of operations of the '<em>Porte Personnaliser</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER_OPERATION_COUNT = PORTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.SorctieCircuitImpl <em>Sorctie Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.SorctieCircuitImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getSorctieCircuit()
	 * @generated
	 */
	int SORCTIE_CIRCUIT = 5;

	/**
	 * The feature id for the '<em><b>Contient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCTIE_CIRCUIT__CONTIENT = 0;

	/**
	 * The feature id for the '<em><b>Sortieporte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCTIE_CIRCUIT__SORTIEPORTE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCTIE_CIRCUIT__NOM = 2;

	/**
	 * The feature id for the '<em><b>Etat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCTIE_CIRCUIT__ETAT = 3;

	/**
	 * The number of structural features of the '<em>Sorctie Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCTIE_CIRCUIT_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Sorctie Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCTIE_CIRCUIT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.PorteDeBaseImpl <em>Porte De Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.PorteDeBaseImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getPorteDeBase()
	 * @generated
	 */
	int PORTE_DE_BASE = 6;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE__NOM = PORTE__NOM;

	/**
	 * The feature id for the '<em><b>Nbre Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE__NBRE_ENTREE = PORTE__NBRE_ENTREE;

	/**
	 * The feature id for the '<em><b>Nbre Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE__NBRE_SORTIE = PORTE__NBRE_SORTIE;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE__CIRCUIT = PORTE__CIRCUIT;

	/**
	 * The feature id for the '<em><b>Tablevporte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE__TABLEVPORTE = PORTE__TABLEVPORTE;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE__TYPE = PORTE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Porte De Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE_FEATURE_COUNT = PORTE_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Relier Sortie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE___RELIER_SORTIE = PORTE___RELIER_SORTIE;

	/**
	 * The operation id for the '<em>Relier Entree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE___RELIER_ENTREE = PORTE___RELIER_ENTREE;

	/**
	 * The operation id for the '<em>Generer TV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE___GENERER_TV = PORTE___GENERER_TV;

	/**
	 * The number of operations of the '<em>Porte De Base</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE_OPERATION_COUNT = PORTE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.SortiePorteImpl <em>Sortie Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.SortiePorteImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getSortiePorte()
	 * @generated
	 */
	int SORTIE_PORTE = 7;

	/**
	 * The feature id for the '<em><b>Contient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE__CONTIENT = 0;

	/**
	 * The feature id for the '<em><b>Entreeporte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE__ENTREEPORTE = 1;

	/**
	 * The feature id for the '<em><b>Sorctiecircuit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE__SORCTIECIRCUIT = 2;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE__NOM = 3;

	/**
	 * The feature id for the '<em><b>Etat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE__ETAT = 4;

	/**
	 * The number of structural features of the '<em>Sortie Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE_FEATURE_COUNT = 5;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE___AJOUTER = 0;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE___DEFINIR = 1;

	/**
	 * The number of operations of the '<em>Sortie Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.EntreePorteImpl <em>Entree Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.EntreePorteImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getEntreePorte()
	 * @generated
	 */
	int ENTREE_PORTE = 8;

	/**
	 * The feature id for the '<em><b>Contient</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_PORTE__CONTIENT = 0;

	/**
	 * The feature id for the '<em><b>Sortieporte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_PORTE__SORTIEPORTE = 1;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_PORTE__NOM = 2;

	/**
	 * The feature id for the '<em><b>Etat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_PORTE__ETAT = 3;

	/**
	 * The number of structural features of the '<em>Entree Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_PORTE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_PORTE___AJOUTER = 0;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_PORTE___DEFINIR = 1;

	/**
	 * The number of operations of the '<em>Entree Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_PORTE_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.DossierImpl <em>Dossier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.DossierImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getDossier()
	 * @generated
	 */
	int DOSSIER = 9;

	/**
	 * The feature id for the '<em><b>Fichier</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER__FICHIER = 0;

	/**
	 * The number of structural features of the '<em>Dossier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Nom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER___GET_NOM = 0;

	/**
	 * The operation id for the '<em>Set Nom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER___SET_NOM = 1;

	/**
	 * The number of operations of the '<em>Dossier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOSSIER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.FichierImpl <em>Fichier</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.FichierImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getFichier()
	 * @generated
	 */
	int FICHIER = 10;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__CIRCUIT = 0;

	/**
	 * The feature id for the '<em><b>Dossier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER__DOSSIER = 1;

	/**
	 * The number of structural features of the '<em>Fichier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Nom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER___GET_NOM = 0;

	/**
	 * The operation id for the '<em>Set Nom</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER___SET_NOM = 1;

	/**
	 * The number of operations of the '<em>Fichier</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FICHIER_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link inf5153emf.Utilisateur <em>Utilisateur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.Utilisateur
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getUtilisateur()
	 * @generated
	 */
	int UTILISATEUR = 11;

	/**
	 * The feature id for the '<em><b>Commande</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__COMMANDE = 0;

	/**
	 * The number of structural features of the '<em>Utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR___INVOKE = 0;

	/**
	 * The number of operations of the '<em>Utilisateur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link inf5153emf.Commande <em>Commande</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.Commande
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getCommande()
	 * @generated
	 */
	int COMMANDE = 12;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__CIRCUIT = 0;

	/**
	 * The feature id for the '<em><b>Utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__UTILISATEUR = 1;

	/**
	 * The feature id for the '<em><b>Memento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE__MEMENTO = 2;

	/**
	 * The number of structural features of the '<em>Commande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Excute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE___EXCUTE = 0;

	/**
	 * The number of operations of the '<em>Commande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.CommandeConcreteImpl <em>Commande Concrete</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.CommandeConcreteImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getCommandeConcrete()
	 * @generated
	 */
	int COMMANDE_CONCRETE = 13;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE__CIRCUIT = COMMANDE__CIRCUIT;

	/**
	 * The feature id for the '<em><b>Utilisateur</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE__UTILISATEUR = COMMANDE__UTILISATEUR;

	/**
	 * The feature id for the '<em><b>Memento</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE__MEMENTO = COMMANDE__MEMENTO;

	/**
	 * The number of structural features of the '<em>Commande Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE_FEATURE_COUNT = COMMANDE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Excute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE___EXCUTE = COMMANDE___EXCUTE;

	/**
	 * The number of operations of the '<em>Commande Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE_OPERATION_COUNT = COMMANDE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.MementoImpl <em>Memento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.MementoImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getMemento()
	 * @generated
	 */
	int MEMENTO = 14;

	/**
	 * The feature id for the '<em><b>Commande</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMENTO__COMMANDE = 0;

	/**
	 * The number of structural features of the '<em>Memento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMENTO_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMENTO___GET_STATE = 0;

	/**
	 * The operation id for the '<em>Set State</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMENTO___SET_STATE = 1;

	/**
	 * The number of operations of the '<em>Memento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMENTO_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.MessageImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 15;

	/**
	 * The feature id for the '<em><b>Historique</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__HISTORIQUE = 0;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Get Contenue</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE___GET_CONTENUE = 0;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.HistoriqueImpl <em>Historique</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.HistoriqueImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getHistorique()
	 * @generated
	 */
	int HISTORIQUE = 16;

	/**
	 * The feature id for the '<em><b>Memento</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE__MEMENTO = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE__MESSAGE = 1;

	/**
	 * The feature id for the '<em><b>State</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE__STATE = 2;

	/**
	 * The number of structural features of the '<em>Historique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_FEATURE_COUNT = 3;

	/**
	 * The operation id for the '<em>Set Memento</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE___SET_MEMENTO__MEMENTO = 0;

	/**
	 * The operation id for the '<em>Undo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE___UNDO = 1;

	/**
	 * The operation id for the '<em>Redo</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE___REDO = 2;

	/**
	 * The operation id for the '<em>Create Memento</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE___CREATE_MEMENTO = 3;

	/**
	 * The number of operations of the '<em>Historique</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORIQUE_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link inf5153emf.SubjectTV <em>Subject TV</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.SubjectTV
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getSubjectTV()
	 * @generated
	 */
	int SUBJECT_TV = 19;

	/**
	 * The feature id for the '<em><b>Notify</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TV__NOTIFY = 0;

	/**
	 * The number of structural features of the '<em>Subject TV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TV_FEATURE_COUNT = 1;

	/**
	 * The operation id for the '<em>Enregistrer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TV___ENREGISTRER = 0;

	/**
	 * The operation id for the '<em>Desenregistrer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TV___DESENREGISTRER = 1;

	/**
	 * The number of operations of the '<em>Subject TV</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_TV_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.TableVPorteImpl <em>Table VPorte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.TableVPorteImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getTableVPorte()
	 * @generated
	 */
	int TABLE_VPORTE = 17;

	/**
	 * The feature id for the '<em><b>Notify</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE__NOTIFY = SUBJECT_TV__NOTIFY;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.TableVCircuitImpl <em>Table VCircuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.TableVCircuitImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getTableVCircuit()
	 * @generated
	 */
	int TABLE_VCIRCUIT = 18;

	/**
	 * The feature id for the '<em><b>Porte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE__PORTE = SUBJECT_TV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table VPorte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE_FEATURE_COUNT = SUBJECT_TV_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enregistrer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE___ENREGISTRER = SUBJECT_TV___ENREGISTRER;

	/**
	 * The operation id for the '<em>Desenregistrer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE___DESENREGISTRER = SUBJECT_TV___DESENREGISTRER;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE___UPDATE = SUBJECT_TV_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE___AFFICHER = SUBJECT_TV_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE___CALCULER = SUBJECT_TV_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table VPorte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE_OPERATION_COUNT = SUBJECT_TV_OPERATION_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Notify</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT__NOTIFY = SUBJECT_TV__NOTIFY;

	/**
	 * The feature id for the '<em><b>Circuitlogic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT__CIRCUITLOGIC = SUBJECT_TV_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Table VCircuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT_FEATURE_COUNT = SUBJECT_TV_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Enregistrer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT___ENREGISTRER = SUBJECT_TV___ENREGISTRER;

	/**
	 * The operation id for the '<em>Desenregistrer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT___DESENREGISTRER = SUBJECT_TV___DESENREGISTRER;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT___UPDATE = SUBJECT_TV_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT___AFFICHER = SUBJECT_TV_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT___CALCULER = SUBJECT_TV_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table VCircuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT_OPERATION_COUNT = SUBJECT_TV_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link inf5153emf.Observeur <em>Observeur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.Observeur
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getObserveur()
	 * @generated
	 */
	int OBSERVEUR = 20;

	/**
	 * The number of structural features of the '<em>Observeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVEUR_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVEUR___UPDATE = 0;

	/**
	 * The number of operations of the '<em>Observeur</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBSERVEUR_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.ObsCircuitImpl <em>Obs Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.ObsCircuitImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getObsCircuit()
	 * @generated
	 */
	int OBS_CIRCUIT = 21;

	/**
	 * The number of structural features of the '<em>Obs Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBS_CIRCUIT_FEATURE_COUNT = OBSERVEUR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBS_CIRCUIT___UPDATE = OBSERVEUR___UPDATE;

	/**
	 * The number of operations of the '<em>Obs Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBS_CIRCUIT_OPERATION_COUNT = OBSERVEUR_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.ObsPorteImpl <em>Obs Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.ObsPorteImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getObsPorte()
	 * @generated
	 */
	int OBS_PORTE = 22;

	/**
	 * The number of structural features of the '<em>Obs Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBS_PORTE_FEATURE_COUNT = OBSERVEUR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBS_PORTE___UPDATE = OBSERVEUR___UPDATE;

	/**
	 * The number of operations of the '<em>Obs Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBS_PORTE_OPERATION_COUNT = OBSERVEUR_OPERATION_COUNT + 0;


	/**
	 * The meta object id for the '{@link inf5153emf.impl.UserCImpl <em>User C</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.UserCImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getUserC()
	 * @generated
	 */
	int USER_C = 23;

	/**
	 * The feature id for the '<em><b>Commande</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_C__COMMANDE = UTILISATEUR__COMMANDE;

	/**
	 * The number of structural features of the '<em>User C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_C_FEATURE_COUNT = UTILISATEUR_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Invoke</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_C___INVOKE = UTILISATEUR___INVOKE;

	/**
	 * The number of operations of the '<em>User C</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_C_OPERATION_COUNT = UTILISATEUR_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link inf5153emf.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit</em>'.
	 * @see inf5153emf.Circuit
	 * @generated
	 */
	EClass getCircuit();

	/**
	 * Returns the meta object for the container reference '{@link inf5153emf.Circuit#getCircuitlogic <em>Circuitlogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Circuitlogic</em>'.
	 * @see inf5153emf.Circuit#getCircuitlogic()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Circuitlogic();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Circuit#getFichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Fichier</em>'.
	 * @see inf5153emf.Circuit#getFichier()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Fichier();

	/**
	 * Returns the meta object for the containment reference '{@link inf5153emf.Circuit#getPorte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Porte</em>'.
	 * @see inf5153emf.Circuit#getPorte()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Porte();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Circuit#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commande</em>'.
	 * @see inf5153emf.Circuit#getCommande()
	 * @see #getCircuit()
	 * @generated
	 */
	EReference getCircuit_Commande();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Circuit#creer() <em>Creer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creer</em>' operation.
	 * @see inf5153emf.Circuit#creer()
	 * @generated
	 */
	EOperation getCircuit__Creer();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Circuit#ajouter() <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see inf5153emf.Circuit#ajouter()
	 * @generated
	 */
	EOperation getCircuit__Ajouter();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Circuit#definir() <em>Definir</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Definir</em>' operation.
	 * @see inf5153emf.Circuit#definir()
	 * @generated
	 */
	EOperation getCircuit__Definir();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Circuit#supprimer() <em>Supprimer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer</em>' operation.
	 * @see inf5153emf.Circuit#supprimer()
	 * @generated
	 */
	EOperation getCircuit__Supprimer();

	/**
	 * Returns the meta object for class '{@link inf5153emf.CircuitLogic <em>Circuit Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Circuit Logic</em>'.
	 * @see inf5153emf.CircuitLogic
	 * @generated
	 */
	EClass getCircuitLogic();

	/**
	 * Returns the meta object for the containment reference '{@link inf5153emf.CircuitLogic#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Circuit</em>'.
	 * @see inf5153emf.CircuitLogic#getCircuit()
	 * @see #getCircuitLogic()
	 * @generated
	 */
	EReference getCircuitLogic_Circuit();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.CircuitLogic#getTablevcircuit <em>Tablevcircuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tablevcircuit</em>'.
	 * @see inf5153emf.CircuitLogic#getTablevcircuit()
	 * @see #getCircuitLogic()
	 * @generated
	 */
	EReference getCircuitLogic_Tablevcircuit();

	/**
	 * Returns the meta object for the '{@link inf5153emf.CircuitLogic#charger() <em>Charger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Charger</em>' operation.
	 * @see inf5153emf.CircuitLogic#charger()
	 * @generated
	 */
	EOperation getCircuitLogic__Charger();

	/**
	 * Returns the meta object for the '{@link inf5153emf.CircuitLogic#sauvegarder() <em>Sauvegarder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sauvegarder</em>' operation.
	 * @see inf5153emf.CircuitLogic#sauvegarder()
	 * @generated
	 */
	EOperation getCircuitLogic__Sauvegarder();

	/**
	 * Returns the meta object for the '{@link inf5153emf.CircuitLogic#definir() <em>Definir</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Definir</em>' operation.
	 * @see inf5153emf.CircuitLogic#definir()
	 * @generated
	 */
	EOperation getCircuitLogic__Definir();

	/**
	 * Returns the meta object for the '{@link inf5153emf.CircuitLogic#genererTV() <em>Generer TV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generer TV</em>' operation.
	 * @see inf5153emf.CircuitLogic#genererTV()
	 * @generated
	 */
	EOperation getCircuitLogic__GenererTV();

	/**
	 * Returns the meta object for class '{@link inf5153emf.EntreeCircuit <em>Entree Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree Circuit</em>'.
	 * @see inf5153emf.EntreeCircuit
	 * @generated
	 */
	EClass getEntreeCircuit();

	/**
	 * Returns the meta object for the reference list '{@link inf5153emf.EntreeCircuit#getContient <em>Contient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Contient</em>'.
	 * @see inf5153emf.EntreeCircuit#getContient()
	 * @see #getEntreeCircuit()
	 * @generated
	 */
	EReference getEntreeCircuit_Contient();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.EntreeCircuit#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see inf5153emf.EntreeCircuit#getNom()
	 * @see #getEntreeCircuit()
	 * @generated
	 */
	EAttribute getEntreeCircuit_Nom();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.EntreeCircuit#getEtat <em>Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etat</em>'.
	 * @see inf5153emf.EntreeCircuit#getEtat()
	 * @see #getEntreeCircuit()
	 * @generated
	 */
	EAttribute getEntreeCircuit_Etat();

	/**
	 * Returns the meta object for class '{@link inf5153emf.PortePersonnaliser <em>Porte Personnaliser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte Personnaliser</em>'.
	 * @see inf5153emf.PortePersonnaliser
	 * @generated
	 */
	EClass getPortePersonnaliser();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.PortePersonnaliser#isCircuitValide <em>Circuit Valide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Circuit Valide</em>'.
	 * @see inf5153emf.PortePersonnaliser#isCircuitValide()
	 * @see #getPortePersonnaliser()
	 * @generated
	 */
	EAttribute getPortePersonnaliser_CircuitValide();

	/**
	 * Returns the meta object for class '{@link inf5153emf.Porte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte</em>'.
	 * @see inf5153emf.Porte
	 * @generated
	 */
	EClass getPorte();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.Porte#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see inf5153emf.Porte#getNom()
	 * @see #getPorte()
	 * @generated
	 */
	EAttribute getPorte_Nom();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.Porte#getNbreEntree <em>Nbre Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbre Entree</em>'.
	 * @see inf5153emf.Porte#getNbreEntree()
	 * @see #getPorte()
	 * @generated
	 */
	EAttribute getPorte_NbreEntree();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.Porte#getNbreSortie <em>Nbre Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nbre Sortie</em>'.
	 * @see inf5153emf.Porte#getNbreSortie()
	 * @see #getPorte()
	 * @generated
	 */
	EAttribute getPorte_NbreSortie();

	/**
	 * Returns the meta object for the container reference '{@link inf5153emf.Porte#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Circuit</em>'.
	 * @see inf5153emf.Porte#getCircuit()
	 * @see #getPorte()
	 * @generated
	 */
	EReference getPorte_Circuit();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Porte#getTablevporte <em>Tablevporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tablevporte</em>'.
	 * @see inf5153emf.Porte#getTablevporte()
	 * @see #getPorte()
	 * @generated
	 */
	EReference getPorte_Tablevporte();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Porte#relierSortie() <em>Relier Sortie</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relier Sortie</em>' operation.
	 * @see inf5153emf.Porte#relierSortie()
	 * @generated
	 */
	EOperation getPorte__RelierSortie();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Porte#relierEntree() <em>Relier Entree</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Relier Entree</em>' operation.
	 * @see inf5153emf.Porte#relierEntree()
	 * @generated
	 */
	EOperation getPorte__RelierEntree();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Porte#genererTV() <em>Generer TV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generer TV</em>' operation.
	 * @see inf5153emf.Porte#genererTV()
	 * @generated
	 */
	EOperation getPorte__GenererTV();

	/**
	 * Returns the meta object for class '{@link inf5153emf.SorctieCircuit <em>Sorctie Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sorctie Circuit</em>'.
	 * @see inf5153emf.SorctieCircuit
	 * @generated
	 */
	EClass getSorctieCircuit();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.SorctieCircuit#getContient <em>Contient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contient</em>'.
	 * @see inf5153emf.SorctieCircuit#getContient()
	 * @see #getSorctieCircuit()
	 * @generated
	 */
	EReference getSorctieCircuit_Contient();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.SorctieCircuit#getSortieporte <em>Sortieporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sortieporte</em>'.
	 * @see inf5153emf.SorctieCircuit#getSortieporte()
	 * @see #getSorctieCircuit()
	 * @generated
	 */
	EReference getSorctieCircuit_Sortieporte();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.SorctieCircuit#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see inf5153emf.SorctieCircuit#getNom()
	 * @see #getSorctieCircuit()
	 * @generated
	 */
	EAttribute getSorctieCircuit_Nom();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.SorctieCircuit#getEtat <em>Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etat</em>'.
	 * @see inf5153emf.SorctieCircuit#getEtat()
	 * @see #getSorctieCircuit()
	 * @generated
	 */
	EAttribute getSorctieCircuit_Etat();

	/**
	 * Returns the meta object for class '{@link inf5153emf.PorteDeBase <em>Porte De Base</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Porte De Base</em>'.
	 * @see inf5153emf.PorteDeBase
	 * @generated
	 */
	EClass getPorteDeBase();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.PorteDeBase#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see inf5153emf.PorteDeBase#getType()
	 * @see #getPorteDeBase()
	 * @generated
	 */
	EAttribute getPorteDeBase_Type();

	/**
	 * Returns the meta object for class '{@link inf5153emf.SortiePorte <em>Sortie Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sortie Porte</em>'.
	 * @see inf5153emf.SortiePorte
	 * @generated
	 */
	EClass getSortiePorte();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.SortiePorte#getContient <em>Contient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contient</em>'.
	 * @see inf5153emf.SortiePorte#getContient()
	 * @see #getSortiePorte()
	 * @generated
	 */
	EReference getSortiePorte_Contient();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.SortiePorte#getEntreeporte <em>Entreeporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Entreeporte</em>'.
	 * @see inf5153emf.SortiePorte#getEntreeporte()
	 * @see #getSortiePorte()
	 * @generated
	 */
	EReference getSortiePorte_Entreeporte();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.SortiePorte#getSorctiecircuit <em>Sorctiecircuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sorctiecircuit</em>'.
	 * @see inf5153emf.SortiePorte#getSorctiecircuit()
	 * @see #getSortiePorte()
	 * @generated
	 */
	EReference getSortiePorte_Sorctiecircuit();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.SortiePorte#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see inf5153emf.SortiePorte#getNom()
	 * @see #getSortiePorte()
	 * @generated
	 */
	EAttribute getSortiePorte_Nom();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.SortiePorte#getEtat <em>Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etat</em>'.
	 * @see inf5153emf.SortiePorte#getEtat()
	 * @see #getSortiePorte()
	 * @generated
	 */
	EAttribute getSortiePorte_Etat();

	/**
	 * Returns the meta object for the '{@link inf5153emf.SortiePorte#ajouter() <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see inf5153emf.SortiePorte#ajouter()
	 * @generated
	 */
	EOperation getSortiePorte__Ajouter();

	/**
	 * Returns the meta object for the '{@link inf5153emf.SortiePorte#definir() <em>Definir</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Definir</em>' operation.
	 * @see inf5153emf.SortiePorte#definir()
	 * @generated
	 */
	EOperation getSortiePorte__Definir();

	/**
	 * Returns the meta object for class '{@link inf5153emf.EntreePorte <em>Entree Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Entree Porte</em>'.
	 * @see inf5153emf.EntreePorte
	 * @generated
	 */
	EClass getEntreePorte();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.EntreePorte#getContient <em>Contient</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Contient</em>'.
	 * @see inf5153emf.EntreePorte#getContient()
	 * @see #getEntreePorte()
	 * @generated
	 */
	EReference getEntreePorte_Contient();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.EntreePorte#getSortieporte <em>Sortieporte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sortieporte</em>'.
	 * @see inf5153emf.EntreePorte#getSortieporte()
	 * @see #getEntreePorte()
	 * @generated
	 */
	EReference getEntreePorte_Sortieporte();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.EntreePorte#getNom <em>Nom</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Nom</em>'.
	 * @see inf5153emf.EntreePorte#getNom()
	 * @see #getEntreePorte()
	 * @generated
	 */
	EAttribute getEntreePorte_Nom();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.EntreePorte#getEtat <em>Etat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Etat</em>'.
	 * @see inf5153emf.EntreePorte#getEtat()
	 * @see #getEntreePorte()
	 * @generated
	 */
	EAttribute getEntreePorte_Etat();

	/**
	 * Returns the meta object for the '{@link inf5153emf.EntreePorte#ajouter() <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see inf5153emf.EntreePorte#ajouter()
	 * @generated
	 */
	EOperation getEntreePorte__Ajouter();

	/**
	 * Returns the meta object for the '{@link inf5153emf.EntreePorte#definir() <em>Definir</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Definir</em>' operation.
	 * @see inf5153emf.EntreePorte#definir()
	 * @generated
	 */
	EOperation getEntreePorte__Definir();

	/**
	 * Returns the meta object for class '{@link inf5153emf.Dossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dossier</em>'.
	 * @see inf5153emf.Dossier
	 * @generated
	 */
	EClass getDossier();

	/**
	 * Returns the meta object for the reference list '{@link inf5153emf.Dossier#getFichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Fichier</em>'.
	 * @see inf5153emf.Dossier#getFichier()
	 * @see #getDossier()
	 * @generated
	 */
	EReference getDossier_Fichier();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Dossier#getNom() <em>Get Nom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nom</em>' operation.
	 * @see inf5153emf.Dossier#getNom()
	 * @generated
	 */
	EOperation getDossier__GetNom();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Dossier#setNom() <em>Set Nom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Nom</em>' operation.
	 * @see inf5153emf.Dossier#setNom()
	 * @generated
	 */
	EOperation getDossier__SetNom();

	/**
	 * Returns the meta object for class '{@link inf5153emf.Fichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Fichier</em>'.
	 * @see inf5153emf.Fichier
	 * @generated
	 */
	EClass getFichier();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Fichier#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Circuit</em>'.
	 * @see inf5153emf.Fichier#getCircuit()
	 * @see #getFichier()
	 * @generated
	 */
	EReference getFichier_Circuit();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Fichier#getDossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dossier</em>'.
	 * @see inf5153emf.Fichier#getDossier()
	 * @see #getFichier()
	 * @generated
	 */
	EReference getFichier_Dossier();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Fichier#getNom() <em>Get Nom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Nom</em>' operation.
	 * @see inf5153emf.Fichier#getNom()
	 * @generated
	 */
	EOperation getFichier__GetNom();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Fichier#setNom() <em>Set Nom</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Nom</em>' operation.
	 * @see inf5153emf.Fichier#setNom()
	 * @generated
	 */
	EOperation getFichier__SetNom();

	/**
	 * Returns the meta object for class '{@link inf5153emf.Utilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Utilisateur</em>'.
	 * @see inf5153emf.Utilisateur
	 * @generated
	 */
	EClass getUtilisateur();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Utilisateur#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commande</em>'.
	 * @see inf5153emf.Utilisateur#getCommande()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EReference getUtilisateur_Commande();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Utilisateur#invoke() <em>Invoke</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Invoke</em>' operation.
	 * @see inf5153emf.Utilisateur#invoke()
	 * @generated
	 */
	EOperation getUtilisateur__Invoke();

	/**
	 * Returns the meta object for class '{@link inf5153emf.Commande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commande</em>'.
	 * @see inf5153emf.Commande
	 * @generated
	 */
	EClass getCommande();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Commande#getCircuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Circuit</em>'.
	 * @see inf5153emf.Commande#getCircuit()
	 * @see #getCommande()
	 * @generated
	 */
	EReference getCommande_Circuit();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Commande#getUtilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Utilisateur</em>'.
	 * @see inf5153emf.Commande#getUtilisateur()
	 * @see #getCommande()
	 * @generated
	 */
	EReference getCommande_Utilisateur();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Commande#getMemento <em>Memento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Memento</em>'.
	 * @see inf5153emf.Commande#getMemento()
	 * @see #getCommande()
	 * @generated
	 */
	EReference getCommande_Memento();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Commande#excute() <em>Excute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Excute</em>' operation.
	 * @see inf5153emf.Commande#excute()
	 * @generated
	 */
	EOperation getCommande__Excute();

	/**
	 * Returns the meta object for class '{@link inf5153emf.CommandeConcrete <em>Commande Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Commande Concrete</em>'.
	 * @see inf5153emf.CommandeConcrete
	 * @generated
	 */
	EClass getCommandeConcrete();

	/**
	 * Returns the meta object for class '{@link inf5153emf.Memento <em>Memento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Memento</em>'.
	 * @see inf5153emf.Memento
	 * @generated
	 */
	EClass getMemento();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Memento#getCommande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Commande</em>'.
	 * @see inf5153emf.Memento#getCommande()
	 * @see #getMemento()
	 * @generated
	 */
	EReference getMemento_Commande();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Memento#getState() <em>Get State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get State</em>' operation.
	 * @see inf5153emf.Memento#getState()
	 * @generated
	 */
	EOperation getMemento__GetState();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Memento#setState() <em>Set State</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set State</em>' operation.
	 * @see inf5153emf.Memento#setState()
	 * @generated
	 */
	EOperation getMemento__SetState();

	/**
	 * Returns the meta object for class '{@link inf5153emf.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see inf5153emf.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Message#getHistorique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Historique</em>'.
	 * @see inf5153emf.Message#getHistorique()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Historique();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Message#getContenue() <em>Get Contenue</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Contenue</em>' operation.
	 * @see inf5153emf.Message#getContenue()
	 * @generated
	 */
	EOperation getMessage__GetContenue();

	/**
	 * Returns the meta object for class '{@link inf5153emf.Historique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Historique</em>'.
	 * @see inf5153emf.Historique
	 * @generated
	 */
	EClass getHistorique();

	/**
	 * Returns the meta object for the containment reference list '{@link inf5153emf.Historique#getMemento <em>Memento</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Memento</em>'.
	 * @see inf5153emf.Historique#getMemento()
	 * @see #getHistorique()
	 * @generated
	 */
	EReference getHistorique_Memento();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Historique#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Message</em>'.
	 * @see inf5153emf.Historique#getMessage()
	 * @see #getHistorique()
	 * @generated
	 */
	EReference getHistorique_Message();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.Historique#getState <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>State</em>'.
	 * @see inf5153emf.Historique#getState()
	 * @see #getHistorique()
	 * @generated
	 */
	EAttribute getHistorique_State();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Historique#setMemento(inf5153emf.Memento) <em>Set Memento</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Set Memento</em>' operation.
	 * @see inf5153emf.Historique#setMemento(inf5153emf.Memento)
	 * @generated
	 */
	EOperation getHistorique__SetMemento__Memento();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Historique#undo() <em>Undo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Undo</em>' operation.
	 * @see inf5153emf.Historique#undo()
	 * @generated
	 */
	EOperation getHistorique__Undo();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Historique#redo() <em>Redo</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Redo</em>' operation.
	 * @see inf5153emf.Historique#redo()
	 * @generated
	 */
	EOperation getHistorique__Redo();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Historique#createMemento() <em>Create Memento</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Memento</em>' operation.
	 * @see inf5153emf.Historique#createMemento()
	 * @generated
	 */
	EOperation getHistorique__CreateMemento();

	/**
	 * Returns the meta object for class '{@link inf5153emf.TableVPorte <em>Table VPorte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table VPorte</em>'.
	 * @see inf5153emf.TableVPorte
	 * @generated
	 */
	EClass getTableVPorte();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.TableVPorte#getPorte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Porte</em>'.
	 * @see inf5153emf.TableVPorte#getPorte()
	 * @see #getTableVPorte()
	 * @generated
	 */
	EReference getTableVPorte_Porte();

	/**
	 * Returns the meta object for the '{@link inf5153emf.TableVPorte#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see inf5153emf.TableVPorte#update()
	 * @generated
	 */
	EOperation getTableVPorte__Update();

	/**
	 * Returns the meta object for the '{@link inf5153emf.TableVPorte#afficher() <em>Afficher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Afficher</em>' operation.
	 * @see inf5153emf.TableVPorte#afficher()
	 * @generated
	 */
	EOperation getTableVPorte__Afficher();

	/**
	 * Returns the meta object for the '{@link inf5153emf.TableVPorte#calculer() <em>Calculer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculer</em>' operation.
	 * @see inf5153emf.TableVPorte#calculer()
	 * @generated
	 */
	EOperation getTableVPorte__Calculer();

	/**
	 * Returns the meta object for class '{@link inf5153emf.TableVCircuit <em>Table VCircuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table VCircuit</em>'.
	 * @see inf5153emf.TableVCircuit
	 * @generated
	 */
	EClass getTableVCircuit();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.TableVCircuit#getCircuitlogic <em>Circuitlogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Circuitlogic</em>'.
	 * @see inf5153emf.TableVCircuit#getCircuitlogic()
	 * @see #getTableVCircuit()
	 * @generated
	 */
	EReference getTableVCircuit_Circuitlogic();

	/**
	 * Returns the meta object for the '{@link inf5153emf.TableVCircuit#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see inf5153emf.TableVCircuit#update()
	 * @generated
	 */
	EOperation getTableVCircuit__Update();

	/**
	 * Returns the meta object for the '{@link inf5153emf.TableVCircuit#afficher() <em>Afficher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Afficher</em>' operation.
	 * @see inf5153emf.TableVCircuit#afficher()
	 * @generated
	 */
	EOperation getTableVCircuit__Afficher();

	/**
	 * Returns the meta object for the '{@link inf5153emf.TableVCircuit#calculer() <em>Calculer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculer</em>' operation.
	 * @see inf5153emf.TableVCircuit#calculer()
	 * @generated
	 */
	EOperation getTableVCircuit__Calculer();

	/**
	 * Returns the meta object for class '{@link inf5153emf.SubjectTV <em>Subject TV</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject TV</em>'.
	 * @see inf5153emf.SubjectTV
	 * @generated
	 */
	EClass getSubjectTV();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.SubjectTV#getNotify <em>Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notify</em>'.
	 * @see inf5153emf.SubjectTV#getNotify()
	 * @see #getSubjectTV()
	 * @generated
	 */
	EReference getSubjectTV_Notify();

	/**
	 * Returns the meta object for the '{@link inf5153emf.SubjectTV#enregistrer() <em>Enregistrer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enregistrer</em>' operation.
	 * @see inf5153emf.SubjectTV#enregistrer()
	 * @generated
	 */
	EOperation getSubjectTV__Enregistrer();

	/**
	 * Returns the meta object for the '{@link inf5153emf.SubjectTV#desenregistrer() <em>Desenregistrer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desenregistrer</em>' operation.
	 * @see inf5153emf.SubjectTV#desenregistrer()
	 * @generated
	 */
	EOperation getSubjectTV__Desenregistrer();

	/**
	 * Returns the meta object for class '{@link inf5153emf.Observeur <em>Observeur</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Observeur</em>'.
	 * @see inf5153emf.Observeur
	 * @generated
	 */
	EClass getObserveur();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Observeur#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see inf5153emf.Observeur#update()
	 * @generated
	 */
	EOperation getObserveur__Update();

	/**
	 * Returns the meta object for class '{@link inf5153emf.ObsCircuit <em>Obs Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obs Circuit</em>'.
	 * @see inf5153emf.ObsCircuit
	 * @generated
	 */
	EClass getObsCircuit();

	/**
	 * Returns the meta object for class '{@link inf5153emf.ObsPorte <em>Obs Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Obs Porte</em>'.
	 * @see inf5153emf.ObsPorte
	 * @generated
	 */
	EClass getObsPorte();

	/**
	 * Returns the meta object for class '{@link inf5153emf.UserC <em>User C</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User C</em>'.
	 * @see inf5153emf.UserC
	 * @generated
	 */
	EClass getUserC();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	Inf5153emfFactory getInf5153emfFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link inf5153emf.Circuit <em>Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.Circuit
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getCircuit()
		 * @generated
		 */
		EClass CIRCUIT = eINSTANCE.getCircuit();

		/**
		 * The meta object literal for the '<em><b>Circuitlogic</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__CIRCUITLOGIC = eINSTANCE.getCircuit_Circuitlogic();

		/**
		 * The meta object literal for the '<em><b>Fichier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__FICHIER = eINSTANCE.getCircuit_Fichier();

		/**
		 * The meta object literal for the '<em><b>Porte</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__PORTE = eINSTANCE.getCircuit_Porte();

		/**
		 * The meta object literal for the '<em><b>Commande</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT__COMMANDE = eINSTANCE.getCircuit_Commande();

		/**
		 * The meta object literal for the '<em><b>Creer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___CREER = eINSTANCE.getCircuit__Creer();

		/**
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___AJOUTER = eINSTANCE.getCircuit__Ajouter();

		/**
		 * The meta object literal for the '<em><b>Definir</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___DEFINIR = eINSTANCE.getCircuit__Definir();

		/**
		 * The meta object literal for the '<em><b>Supprimer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___SUPPRIMER = eINSTANCE.getCircuit__Supprimer();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.CircuitLogicImpl <em>Circuit Logic</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.CircuitLogicImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getCircuitLogic()
		 * @generated
		 */
		EClass CIRCUIT_LOGIC = eINSTANCE.getCircuitLogic();

		/**
		 * The meta object literal for the '<em><b>Circuit</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_LOGIC__CIRCUIT = eINSTANCE.getCircuitLogic_Circuit();

		/**
		 * The meta object literal for the '<em><b>Tablevcircuit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_LOGIC__TABLEVCIRCUIT = eINSTANCE.getCircuitLogic_Tablevcircuit();

		/**
		 * The meta object literal for the '<em><b>Charger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_LOGIC___CHARGER = eINSTANCE.getCircuitLogic__Charger();

		/**
		 * The meta object literal for the '<em><b>Sauvegarder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_LOGIC___SAUVEGARDER = eINSTANCE.getCircuitLogic__Sauvegarder();

		/**
		 * The meta object literal for the '<em><b>Definir</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_LOGIC___DEFINIR = eINSTANCE.getCircuitLogic__Definir();

		/**
		 * The meta object literal for the '<em><b>Generer TV</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_LOGIC___GENERER_TV = eINSTANCE.getCircuitLogic__GenererTV();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.EntreeCircuitImpl <em>Entree Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.EntreeCircuitImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getEntreeCircuit()
		 * @generated
		 */
		EClass ENTREE_CIRCUIT = eINSTANCE.getEntreeCircuit();

		/**
		 * The meta object literal for the '<em><b>Contient</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE_CIRCUIT__CONTIENT = eINSTANCE.getEntreeCircuit_Contient();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE_CIRCUIT__NOM = eINSTANCE.getEntreeCircuit_Nom();

		/**
		 * The meta object literal for the '<em><b>Etat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE_CIRCUIT__ETAT = eINSTANCE.getEntreeCircuit_Etat();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.PortePersonnaliserImpl <em>Porte Personnaliser</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.PortePersonnaliserImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getPortePersonnaliser()
		 * @generated
		 */
		EClass PORTE_PERSONNALISER = eINSTANCE.getPortePersonnaliser();

		/**
		 * The meta object literal for the '<em><b>Circuit Valide</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_PERSONNALISER__CIRCUIT_VALIDE = eINSTANCE.getPortePersonnaliser_CircuitValide();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.PorteImpl <em>Porte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.PorteImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getPorte()
		 * @generated
		 */
		EClass PORTE = eINSTANCE.getPorte();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE__NOM = eINSTANCE.getPorte_Nom();

		/**
		 * The meta object literal for the '<em><b>Nbre Entree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE__NBRE_ENTREE = eINSTANCE.getPorte_NbreEntree();

		/**
		 * The meta object literal for the '<em><b>Nbre Sortie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE__NBRE_SORTIE = eINSTANCE.getPorte_NbreSortie();

		/**
		 * The meta object literal for the '<em><b>Circuit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTE__CIRCUIT = eINSTANCE.getPorte_Circuit();

		/**
		 * The meta object literal for the '<em><b>Tablevporte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTE__TABLEVPORTE = eINSTANCE.getPorte_Tablevporte();

		/**
		 * The meta object literal for the '<em><b>Relier Sortie</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORTE___RELIER_SORTIE = eINSTANCE.getPorte__RelierSortie();

		/**
		 * The meta object literal for the '<em><b>Relier Entree</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORTE___RELIER_ENTREE = eINSTANCE.getPorte__RelierEntree();

		/**
		 * The meta object literal for the '<em><b>Generer TV</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORTE___GENERER_TV = eINSTANCE.getPorte__GenererTV();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.SorctieCircuitImpl <em>Sorctie Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.SorctieCircuitImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getSorctieCircuit()
		 * @generated
		 */
		EClass SORCTIE_CIRCUIT = eINSTANCE.getSorctieCircuit();

		/**
		 * The meta object literal for the '<em><b>Contient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORCTIE_CIRCUIT__CONTIENT = eINSTANCE.getSorctieCircuit_Contient();

		/**
		 * The meta object literal for the '<em><b>Sortieporte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORCTIE_CIRCUIT__SORTIEPORTE = eINSTANCE.getSorctieCircuit_Sortieporte();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORCTIE_CIRCUIT__NOM = eINSTANCE.getSorctieCircuit_Nom();

		/**
		 * The meta object literal for the '<em><b>Etat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORCTIE_CIRCUIT__ETAT = eINSTANCE.getSorctieCircuit_Etat();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.PorteDeBaseImpl <em>Porte De Base</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.PorteDeBaseImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getPorteDeBase()
		 * @generated
		 */
		EClass PORTE_DE_BASE = eINSTANCE.getPorteDeBase();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORTE_DE_BASE__TYPE = eINSTANCE.getPorteDeBase_Type();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.SortiePorteImpl <em>Sortie Porte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.SortiePorteImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getSortiePorte()
		 * @generated
		 */
		EClass SORTIE_PORTE = eINSTANCE.getSortiePorte();

		/**
		 * The meta object literal for the '<em><b>Contient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE_PORTE__CONTIENT = eINSTANCE.getSortiePorte_Contient();

		/**
		 * The meta object literal for the '<em><b>Entreeporte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE_PORTE__ENTREEPORTE = eINSTANCE.getSortiePorte_Entreeporte();

		/**
		 * The meta object literal for the '<em><b>Sorctiecircuit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SORTIE_PORTE__SORCTIECIRCUIT = eINSTANCE.getSortiePorte_Sorctiecircuit();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTIE_PORTE__NOM = eINSTANCE.getSortiePorte_Nom();

		/**
		 * The meta object literal for the '<em><b>Etat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SORTIE_PORTE__ETAT = eINSTANCE.getSortiePorte_Etat();

		/**
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTIE_PORTE___AJOUTER = eINSTANCE.getSortiePorte__Ajouter();

		/**
		 * The meta object literal for the '<em><b>Definir</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTIE_PORTE___DEFINIR = eINSTANCE.getSortiePorte__Definir();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.EntreePorteImpl <em>Entree Porte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.EntreePorteImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getEntreePorte()
		 * @generated
		 */
		EClass ENTREE_PORTE = eINSTANCE.getEntreePorte();

		/**
		 * The meta object literal for the '<em><b>Contient</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE_PORTE__CONTIENT = eINSTANCE.getEntreePorte_Contient();

		/**
		 * The meta object literal for the '<em><b>Sortieporte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ENTREE_PORTE__SORTIEPORTE = eINSTANCE.getEntreePorte_Sortieporte();

		/**
		 * The meta object literal for the '<em><b>Nom</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE_PORTE__NOM = eINSTANCE.getEntreePorte_Nom();

		/**
		 * The meta object literal for the '<em><b>Etat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ENTREE_PORTE__ETAT = eINSTANCE.getEntreePorte_Etat();

		/**
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTREE_PORTE___AJOUTER = eINSTANCE.getEntreePorte__Ajouter();

		/**
		 * The meta object literal for the '<em><b>Definir</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTREE_PORTE___DEFINIR = eINSTANCE.getEntreePorte__Definir();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.DossierImpl <em>Dossier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.DossierImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getDossier()
		 * @generated
		 */
		EClass DOSSIER = eINSTANCE.getDossier();

		/**
		 * The meta object literal for the '<em><b>Fichier</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOSSIER__FICHIER = eINSTANCE.getDossier_Fichier();

		/**
		 * The meta object literal for the '<em><b>Get Nom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOSSIER___GET_NOM = eINSTANCE.getDossier__GetNom();

		/**
		 * The meta object literal for the '<em><b>Set Nom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation DOSSIER___SET_NOM = eINSTANCE.getDossier__SetNom();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.FichierImpl <em>Fichier</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.FichierImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getFichier()
		 * @generated
		 */
		EClass FICHIER = eINSTANCE.getFichier();

		/**
		 * The meta object literal for the '<em><b>Circuit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FICHIER__CIRCUIT = eINSTANCE.getFichier_Circuit();

		/**
		 * The meta object literal for the '<em><b>Dossier</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FICHIER__DOSSIER = eINSTANCE.getFichier_Dossier();

		/**
		 * The meta object literal for the '<em><b>Get Nom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FICHIER___GET_NOM = eINSTANCE.getFichier__GetNom();

		/**
		 * The meta object literal for the '<em><b>Set Nom</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation FICHIER___SET_NOM = eINSTANCE.getFichier__SetNom();

		/**
		 * The meta object literal for the '{@link inf5153emf.Utilisateur <em>Utilisateur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.Utilisateur
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getUtilisateur()
		 * @generated
		 */
		EClass UTILISATEUR = eINSTANCE.getUtilisateur();

		/**
		 * The meta object literal for the '<em><b>Commande</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILISATEUR__COMMANDE = eINSTANCE.getUtilisateur_Commande();

		/**
		 * The meta object literal for the '<em><b>Invoke</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation UTILISATEUR___INVOKE = eINSTANCE.getUtilisateur__Invoke();

		/**
		 * The meta object literal for the '{@link inf5153emf.Commande <em>Commande</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.Commande
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getCommande()
		 * @generated
		 */
		EClass COMMANDE = eINSTANCE.getCommande();

		/**
		 * The meta object literal for the '<em><b>Circuit</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE__CIRCUIT = eINSTANCE.getCommande_Circuit();

		/**
		 * The meta object literal for the '<em><b>Utilisateur</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE__UTILISATEUR = eINSTANCE.getCommande_Utilisateur();

		/**
		 * The meta object literal for the '<em><b>Memento</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE__MEMENTO = eINSTANCE.getCommande_Memento();

		/**
		 * The meta object literal for the '<em><b>Excute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMANDE___EXCUTE = eINSTANCE.getCommande__Excute();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.CommandeConcreteImpl <em>Commande Concrete</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.CommandeConcreteImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getCommandeConcrete()
		 * @generated
		 */
		EClass COMMANDE_CONCRETE = eINSTANCE.getCommandeConcrete();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.MementoImpl <em>Memento</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.MementoImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getMemento()
		 * @generated
		 */
		EClass MEMENTO = eINSTANCE.getMemento();

		/**
		 * The meta object literal for the '<em><b>Commande</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MEMENTO__COMMANDE = eINSTANCE.getMemento_Commande();

		/**
		 * The meta object literal for the '<em><b>Get State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEMENTO___GET_STATE = eINSTANCE.getMemento__GetState();

		/**
		 * The meta object literal for the '<em><b>Set State</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MEMENTO___SET_STATE = eINSTANCE.getMemento__SetState();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.MessageImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Historique</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__HISTORIQUE = eINSTANCE.getMessage_Historique();

		/**
		 * The meta object literal for the '<em><b>Get Contenue</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation MESSAGE___GET_CONTENUE = eINSTANCE.getMessage__GetContenue();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.HistoriqueImpl <em>Historique</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.HistoriqueImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getHistorique()
		 * @generated
		 */
		EClass HISTORIQUE = eINSTANCE.getHistorique();

		/**
		 * The meta object literal for the '<em><b>Memento</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORIQUE__MEMENTO = eINSTANCE.getHistorique_Memento();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HISTORIQUE__MESSAGE = eINSTANCE.getHistorique_Message();

		/**
		 * The meta object literal for the '<em><b>State</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HISTORIQUE__STATE = eINSTANCE.getHistorique_State();

		/**
		 * The meta object literal for the '<em><b>Set Memento</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORIQUE___SET_MEMENTO__MEMENTO = eINSTANCE.getHistorique__SetMemento__Memento();

		/**
		 * The meta object literal for the '<em><b>Undo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORIQUE___UNDO = eINSTANCE.getHistorique__Undo();

		/**
		 * The meta object literal for the '<em><b>Redo</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORIQUE___REDO = eINSTANCE.getHistorique__Redo();

		/**
		 * The meta object literal for the '<em><b>Create Memento</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation HISTORIQUE___CREATE_MEMENTO = eINSTANCE.getHistorique__CreateMemento();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.TableVPorteImpl <em>Table VPorte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.TableVPorteImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getTableVPorte()
		 * @generated
		 */
		EClass TABLE_VPORTE = eINSTANCE.getTableVPorte();

		/**
		 * The meta object literal for the '<em><b>Porte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VPORTE__PORTE = eINSTANCE.getTableVPorte_Porte();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VPORTE___UPDATE = eINSTANCE.getTableVPorte__Update();

		/**
		 * The meta object literal for the '<em><b>Afficher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VPORTE___AFFICHER = eINSTANCE.getTableVPorte__Afficher();

		/**
		 * The meta object literal for the '<em><b>Calculer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VPORTE___CALCULER = eINSTANCE.getTableVPorte__Calculer();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.TableVCircuitImpl <em>Table VCircuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.TableVCircuitImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getTableVCircuit()
		 * @generated
		 */
		EClass TABLE_VCIRCUIT = eINSTANCE.getTableVCircuit();

		/**
		 * The meta object literal for the '<em><b>Circuitlogic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VCIRCUIT__CIRCUITLOGIC = eINSTANCE.getTableVCircuit_Circuitlogic();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VCIRCUIT___UPDATE = eINSTANCE.getTableVCircuit__Update();

		/**
		 * The meta object literal for the '<em><b>Afficher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VCIRCUIT___AFFICHER = eINSTANCE.getTableVCircuit__Afficher();

		/**
		 * The meta object literal for the '<em><b>Calculer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VCIRCUIT___CALCULER = eINSTANCE.getTableVCircuit__Calculer();

		/**
		 * The meta object literal for the '{@link inf5153emf.SubjectTV <em>Subject TV</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.SubjectTV
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getSubjectTV()
		 * @generated
		 */
		EClass SUBJECT_TV = eINSTANCE.getSubjectTV();

		/**
		 * The meta object literal for the '<em><b>Notify</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT_TV__NOTIFY = eINSTANCE.getSubjectTV_Notify();

		/**
		 * The meta object literal for the '<em><b>Enregistrer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBJECT_TV___ENREGISTRER = eINSTANCE.getSubjectTV__Enregistrer();

		/**
		 * The meta object literal for the '<em><b>Desenregistrer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBJECT_TV___DESENREGISTRER = eINSTANCE.getSubjectTV__Desenregistrer();

		/**
		 * The meta object literal for the '{@link inf5153emf.Observeur <em>Observeur</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.Observeur
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getObserveur()
		 * @generated
		 */
		EClass OBSERVEUR = eINSTANCE.getObserveur();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBSERVEUR___UPDATE = eINSTANCE.getObserveur__Update();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.ObsCircuitImpl <em>Obs Circuit</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.ObsCircuitImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getObsCircuit()
		 * @generated
		 */
		EClass OBS_CIRCUIT = eINSTANCE.getObsCircuit();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.ObsPorteImpl <em>Obs Porte</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.ObsPorteImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getObsPorte()
		 * @generated
		 */
		EClass OBS_PORTE = eINSTANCE.getObsPorte();

		/**
		 * The meta object literal for the '{@link inf5153emf.impl.UserCImpl <em>User C</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.UserCImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getUserC()
		 * @generated
		 */
		EClass USER_C = eINSTANCE.getUserC();

	}

} //Inf5153emfPackage

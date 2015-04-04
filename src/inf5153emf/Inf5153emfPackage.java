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
	 * The number of structural features of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___CREER = 0;

	/**
	 * The operation id for the '<em>Charger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___CHARGER = 1;

	/**
	 * The operation id for the '<em>Sauvegarder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___SAUVEGARDER = 2;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___AJOUTER = 3;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___DEFINIR = 4;

	/**
	 * The operation id for the '<em>Generer TV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT___GENERER_TV = 5;

	/**
	 * The number of operations of the '<em>Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link inf5153emf.TableVerite <em>Table Verite</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.TableVerite
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getTableVerite()
	 * @generated
	 */
	int TABLE_VERITE = 1;

	/**
	 * The feature id for the '<em><b>Porte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE__PORTE = 0;

	/**
	 * The feature id for the '<em><b>Circuitlogic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE__CIRCUITLOGIC = 1;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE__ENTREE = 2;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE__SORTIE = 3;

	/**
	 * The number of structural features of the '<em>Table Verite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE_FEATURE_COUNT = 4;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE___UPDATE = 0;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE___AFFICHER = 1;

	/**
	 * The operation id for the '<em>Calculer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE___CALCULER = 2;

	/**
	 * The number of operations of the '<em>Table Verite</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VERITE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.CircuitLogicImpl <em>Circuit Logic</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.CircuitLogicImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getCircuitLogic()
	 * @generated
	 */
	int CIRCUIT_LOGIC = 2;

	/**
	 * The feature id for the '<em><b>Circuit</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC__CIRCUIT = 0;

	/**
	 * The feature id for the '<em><b>Tableverite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC__TABLEVERITE = 1;

	/**
	 * The number of structural features of the '<em>Circuit Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC___CREER = 0;

	/**
	 * The operation id for the '<em>Charger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC___CHARGER = 1;

	/**
	 * The operation id for the '<em>Sauvegarder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC___SAUVEGARDER = 2;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC___AJOUTER = 3;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC___DEFINIR = 4;

	/**
	 * The operation id for the '<em>Generer TV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC___GENERER_TV = 5;

	/**
	 * The number of operations of the '<em>Circuit Logic</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CIRCUIT_LOGIC_OPERATION_COUNT = 6;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.EntreeCircuitImpl <em>Entree Circuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.EntreeCircuitImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getEntreeCircuit()
	 * @generated
	 */
	int ENTREE_CIRCUIT = 3;

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
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_CIRCUIT___AJOUTER = 0;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_CIRCUIT___DEFINIR = 1;

	/**
	 * The number of operations of the '<em>Entree Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENTREE_CIRCUIT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.PorteImpl <em>Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.PorteImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getPorte()
	 * @generated
	 */
	int PORTE = 5;

	/**
	 * The feature id for the '<em><b>Circuitlogic</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__CIRCUITLOGIC = CIRCUIT__CIRCUITLOGIC;

	/**
	 * The feature id for the '<em><b>Fichier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__FICHIER = CIRCUIT__FICHIER;

	/**
	 * The feature id for the '<em><b>Nom</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__NOM = CIRCUIT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Nbre Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__NBRE_ENTREE = CIRCUIT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Nbre Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__NBRE_SORTIE = CIRCUIT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Tableverite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE__TABLEVERITE = CIRCUIT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_FEATURE_COUNT = CIRCUIT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___CREER = CIRCUIT___CREER;

	/**
	 * The operation id for the '<em>Charger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___CHARGER = CIRCUIT___CHARGER;

	/**
	 * The operation id for the '<em>Sauvegarder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___SAUVEGARDER = CIRCUIT___SAUVEGARDER;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___DEFINIR = CIRCUIT___DEFINIR;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___AJOUTER = CIRCUIT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Supprimer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___SUPPRIMER = CIRCUIT_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Relier Sortie</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___RELIER_SORTIE = CIRCUIT_OPERATION_COUNT + 2;

	/**
	 * The operation id for the '<em>Relier Entree</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___RELIER_ENTREE = CIRCUIT_OPERATION_COUNT + 3;

	/**
	 * The operation id for the '<em>Generer TV</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE___GENERER_TV = CIRCUIT_OPERATION_COUNT + 4;

	/**
	 * The number of operations of the '<em>Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_OPERATION_COUNT = CIRCUIT_OPERATION_COUNT + 5;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.PortePersonnaliserImpl <em>Porte Personnaliser</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.PortePersonnaliserImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getPortePersonnaliser()
	 * @generated
	 */
	int PORTE_PERSONNALISER = 4;

	/**
	 * The feature id for the '<em><b>Circuitlogic</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER__CIRCUITLOGIC = PORTE__CIRCUITLOGIC;

	/**
	 * The feature id for the '<em><b>Fichier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER__FICHIER = PORTE__FICHIER;

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
	 * The feature id for the '<em><b>Tableverite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER__TABLEVERITE = PORTE__TABLEVERITE;

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
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER___CREER = PORTE___CREER;

	/**
	 * The operation id for the '<em>Charger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER___CHARGER = PORTE___CHARGER;

	/**
	 * The operation id for the '<em>Sauvegarder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER___SAUVEGARDER = PORTE___SAUVEGARDER;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER___DEFINIR = PORTE___DEFINIR;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER___AJOUTER = PORTE___AJOUTER;

	/**
	 * The operation id for the '<em>Supprimer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_PERSONNALISER___SUPPRIMER = PORTE___SUPPRIMER;

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
	int SORCTIE_CIRCUIT = 6;

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
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCTIE_CIRCUIT___AJOUTER = 0;

	/**
	 * The operation id for the '<em>Supprimer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCTIE_CIRCUIT___SUPPRIMER = 1;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCTIE_CIRCUIT___DEFINIR = 2;

	/**
	 * The number of operations of the '<em>Sorctie Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORCTIE_CIRCUIT_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.PorteDeBaseImpl <em>Porte De Base</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.PorteDeBaseImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getPorteDeBase()
	 * @generated
	 */
	int PORTE_DE_BASE = 7;

	/**
	 * The feature id for the '<em><b>Circuitlogic</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE__CIRCUITLOGIC = PORTE__CIRCUITLOGIC;

	/**
	 * The feature id for the '<em><b>Fichier</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE__FICHIER = PORTE__FICHIER;

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
	 * The feature id for the '<em><b>Tableverite</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE__TABLEVERITE = PORTE__TABLEVERITE;

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
	 * The operation id for the '<em>Creer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE___CREER = PORTE___CREER;

	/**
	 * The operation id for the '<em>Charger</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE___CHARGER = PORTE___CHARGER;

	/**
	 * The operation id for the '<em>Sauvegarder</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE___SAUVEGARDER = PORTE___SAUVEGARDER;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE___DEFINIR = PORTE___DEFINIR;

	/**
	 * The operation id for the '<em>Ajouter</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE___AJOUTER = PORTE___AJOUTER;

	/**
	 * The operation id for the '<em>Supprimer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORTE_DE_BASE___SUPPRIMER = PORTE___SUPPRIMER;

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
	int SORTIE_PORTE = 8;

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
	 * The operation id for the '<em>Supprimer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE___SUPPRIMER = 1;

	/**
	 * The operation id for the '<em>Definir</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE___DEFINIR = 2;

	/**
	 * The number of operations of the '<em>Sortie Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SORTIE_PORTE_OPERATION_COUNT = 3;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.EntreePorteImpl <em>Entree Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.EntreePorteImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getEntreePorte()
	 * @generated
	 */
	int ENTREE_PORTE = 9;

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
	int DOSSIER = 10;

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
	int FICHIER = 11;

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
	int UTILISATEUR = 12;

	/**
	 * The feature id for the '<em><b>Invokes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UTILISATEUR__INVOKES = 0;

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
	int COMMANDE = 13;

	/**
	 * The number of structural features of the '<em>Commande</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_FEATURE_COUNT = 0;

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
	int COMMANDE_CONCRETE = 14;

	/**
	 * The feature id for the '<em><b>Executes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE__EXECUTES = COMMANDE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Execute</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE__EXECUTE = COMMANDE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Commande Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE_FEATURE_COUNT = COMMANDE_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Excute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE___EXCUTE = COMMANDE___EXCUTE;

	/**
	 * The operation id for the '<em>Execute</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE___EXECUTE = COMMANDE_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Commande Concrete</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMANDE_CONCRETE_OPERATION_COUNT = COMMANDE_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.MementoImpl <em>Memento</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.MementoImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getMemento()
	 * @generated
	 */
	int MEMENTO = 15;

	/**
	 * The number of structural features of the '<em>Memento</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEMENTO_FEATURE_COUNT = 0;

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
	int MESSAGE = 16;

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
	int HISTORIQUE = 17;

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
	 * The meta object id for the '{@link inf5153emf.impl.TableVPorteImpl <em>Table VPorte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.TableVPorteImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getTableVPorte()
	 * @generated
	 */
	int TABLE_VPORTE = 18;

	/**
	 * The feature id for the '<em><b>Porte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE__PORTE = TABLE_VERITE__PORTE;

	/**
	 * The feature id for the '<em><b>Circuitlogic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE__CIRCUITLOGIC = TABLE_VERITE__CIRCUITLOGIC;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE__ENTREE = TABLE_VERITE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE__SORTIE = TABLE_VERITE__SORTIE;

	/**
	 * The number of structural features of the '<em>Table VPorte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE_FEATURE_COUNT = TABLE_VERITE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE___AFFICHER = TABLE_VERITE___AFFICHER;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE___UPDATE = TABLE_VERITE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Affiche</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE___AFFICHE = TABLE_VERITE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE___CALCULER = TABLE_VERITE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table VPorte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VPORTE_OPERATION_COUNT = TABLE_VERITE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.TableVCircuitImpl <em>Table VCircuit</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.TableVCircuitImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getTableVCircuit()
	 * @generated
	 */
	int TABLE_VCIRCUIT = 19;

	/**
	 * The feature id for the '<em><b>Porte</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT__PORTE = TABLE_VERITE__PORTE;

	/**
	 * The feature id for the '<em><b>Circuitlogic</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT__CIRCUITLOGIC = TABLE_VERITE__CIRCUITLOGIC;

	/**
	 * The feature id for the '<em><b>Entree</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT__ENTREE = TABLE_VERITE__ENTREE;

	/**
	 * The feature id for the '<em><b>Sortie</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT__SORTIE = TABLE_VERITE__SORTIE;

	/**
	 * The number of structural features of the '<em>Table VCircuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT_FEATURE_COUNT = TABLE_VERITE_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Update</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT___UPDATE = TABLE_VERITE_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Afficher</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT___AFFICHER = TABLE_VERITE_OPERATION_COUNT + 1;

	/**
	 * The operation id for the '<em>Calculer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT___CALCULER = TABLE_VERITE_OPERATION_COUNT + 2;

	/**
	 * The number of operations of the '<em>Table VCircuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_VCIRCUIT_OPERATION_COUNT = TABLE_VERITE_OPERATION_COUNT + 3;

	/**
	 * The meta object id for the '{@link inf5153emf.Subject <em>Subject</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.Subject
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getSubject()
	 * @generated
	 */
	int SUBJECT = 21;

	/**
	 * The feature id for the '<em><b>Notify</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__NOTIFY = 0;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT__USE = 1;

	/**
	 * The number of structural features of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Enregistrer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT___ENREGISTRER = 0;

	/**
	 * The operation id for the '<em>Desenregistrer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT___DESENREGISTRER = 1;

	/**
	 * The number of operations of the '<em>Subject</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_OPERATION_COUNT = 2;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.SubjectConcretImpl <em>Subject Concret</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.SubjectConcretImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getSubjectConcret()
	 * @generated
	 */
	int SUBJECT_CONCRET = 20;

	/**
	 * The feature id for the '<em><b>Notify</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_CONCRET__NOTIFY = SUBJECT__NOTIFY;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_CONCRET__USE = SUBJECT__USE;

	/**
	 * The number of structural features of the '<em>Subject Concret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_CONCRET_FEATURE_COUNT = SUBJECT_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Enregistrer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_CONCRET___ENREGISTRER = SUBJECT_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Desenregistrer</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_CONCRET___DESENREGISTRER = SUBJECT_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Subject Concret</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUBJECT_CONCRET_OPERATION_COUNT = SUBJECT_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link inf5153emf.Observeur <em>Observeur</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.Observeur
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getObserveur()
	 * @generated
	 */
	int OBSERVEUR = 22;

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
	int OBS_CIRCUIT = 23;

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
	int OBS_CIRCUIT___UPDATE = OBSERVEUR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Obs Circuit</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBS_CIRCUIT_OPERATION_COUNT = OBSERVEUR_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link inf5153emf.impl.ObsPorteImpl <em>Obs Porte</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see inf5153emf.impl.ObsPorteImpl
	 * @see inf5153emf.impl.Inf5153emfPackageImpl#getObsPorte()
	 * @generated
	 */
	int OBS_PORTE = 24;

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
	int OBS_PORTE___UPDATE = OBSERVEUR_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Obs Porte</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OBS_PORTE_OPERATION_COUNT = OBSERVEUR_OPERATION_COUNT + 1;


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
	 * Returns the meta object for the '{@link inf5153emf.Circuit#creer() <em>Creer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creer</em>' operation.
	 * @see inf5153emf.Circuit#creer()
	 * @generated
	 */
	EOperation getCircuit__Creer();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Circuit#charger() <em>Charger</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Charger</em>' operation.
	 * @see inf5153emf.Circuit#charger()
	 * @generated
	 */
	EOperation getCircuit__Charger();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Circuit#sauvegarder() <em>Sauvegarder</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Sauvegarder</em>' operation.
	 * @see inf5153emf.Circuit#sauvegarder()
	 * @generated
	 */
	EOperation getCircuit__Sauvegarder();

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
	 * Returns the meta object for the '{@link inf5153emf.Circuit#genererTV() <em>Generer TV</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Generer TV</em>' operation.
	 * @see inf5153emf.Circuit#genererTV()
	 * @generated
	 */
	EOperation getCircuit__GenererTV();

	/**
	 * Returns the meta object for class '{@link inf5153emf.TableVerite <em>Table Verite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table Verite</em>'.
	 * @see inf5153emf.TableVerite
	 * @generated
	 */
	EClass getTableVerite();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.TableVerite#getPorte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Porte</em>'.
	 * @see inf5153emf.TableVerite#getPorte()
	 * @see #getTableVerite()
	 * @generated
	 */
	EReference getTableVerite_Porte();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.TableVerite#getCircuitlogic <em>Circuitlogic</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Circuitlogic</em>'.
	 * @see inf5153emf.TableVerite#getCircuitlogic()
	 * @see #getTableVerite()
	 * @generated
	 */
	EReference getTableVerite_Circuitlogic();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.TableVerite#getEntree <em>Entree</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Entree</em>'.
	 * @see inf5153emf.TableVerite#getEntree()
	 * @see #getTableVerite()
	 * @generated
	 */
	EAttribute getTableVerite_Entree();

	/**
	 * Returns the meta object for the attribute '{@link inf5153emf.TableVerite#getSortie <em>Sortie</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Sortie</em>'.
	 * @see inf5153emf.TableVerite#getSortie()
	 * @see #getTableVerite()
	 * @generated
	 */
	EAttribute getTableVerite_Sortie();

	/**
	 * Returns the meta object for the '{@link inf5153emf.TableVerite#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see inf5153emf.TableVerite#update()
	 * @generated
	 */
	EOperation getTableVerite__Update();

	/**
	 * Returns the meta object for the '{@link inf5153emf.TableVerite#afficher() <em>Afficher</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Afficher</em>' operation.
	 * @see inf5153emf.TableVerite#afficher()
	 * @generated
	 */
	EOperation getTableVerite__Afficher();

	/**
	 * Returns the meta object for the '{@link inf5153emf.TableVerite#calculer() <em>Calculer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Calculer</em>' operation.
	 * @see inf5153emf.TableVerite#calculer()
	 * @generated
	 */
	EOperation getTableVerite__Calculer();

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
	 * Returns the meta object for the reference '{@link inf5153emf.CircuitLogic#getTableverite <em>Tableverite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tableverite</em>'.
	 * @see inf5153emf.CircuitLogic#getTableverite()
	 * @see #getCircuitLogic()
	 * @generated
	 */
	EReference getCircuitLogic_Tableverite();

	/**
	 * Returns the meta object for the '{@link inf5153emf.CircuitLogic#creer() <em>Creer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Creer</em>' operation.
	 * @see inf5153emf.CircuitLogic#creer()
	 * @generated
	 */
	EOperation getCircuitLogic__Creer();

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
	 * Returns the meta object for the '{@link inf5153emf.CircuitLogic#ajouter() <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see inf5153emf.CircuitLogic#ajouter()
	 * @generated
	 */
	EOperation getCircuitLogic__Ajouter();

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
	 * Returns the meta object for the '{@link inf5153emf.EntreeCircuit#ajouter() <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see inf5153emf.EntreeCircuit#ajouter()
	 * @generated
	 */
	EOperation getEntreeCircuit__Ajouter();

	/**
	 * Returns the meta object for the '{@link inf5153emf.EntreeCircuit#definir() <em>Definir</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Definir</em>' operation.
	 * @see inf5153emf.EntreeCircuit#definir()
	 * @generated
	 */
	EOperation getEntreeCircuit__Definir();

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
	 * Returns the meta object for the reference '{@link inf5153emf.Porte#getTableverite <em>Tableverite</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Tableverite</em>'.
	 * @see inf5153emf.Porte#getTableverite()
	 * @see #getPorte()
	 * @generated
	 */
	EReference getPorte_Tableverite();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Porte#ajouter() <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see inf5153emf.Porte#ajouter()
	 * @generated
	 */
	EOperation getPorte__Ajouter();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Porte#supprimer() <em>Supprimer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer</em>' operation.
	 * @see inf5153emf.Porte#supprimer()
	 * @generated
	 */
	EOperation getPorte__Supprimer();

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
	 * Returns the meta object for the '{@link inf5153emf.SorctieCircuit#ajouter() <em>Ajouter</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Ajouter</em>' operation.
	 * @see inf5153emf.SorctieCircuit#ajouter()
	 * @generated
	 */
	EOperation getSorctieCircuit__Ajouter();

	/**
	 * Returns the meta object for the '{@link inf5153emf.SorctieCircuit#supprimer() <em>Supprimer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer</em>' operation.
	 * @see inf5153emf.SorctieCircuit#supprimer()
	 * @generated
	 */
	EOperation getSorctieCircuit__Supprimer();

	/**
	 * Returns the meta object for the '{@link inf5153emf.SorctieCircuit#definir() <em>Definir</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Definir</em>' operation.
	 * @see inf5153emf.SorctieCircuit#definir()
	 * @generated
	 */
	EOperation getSorctieCircuit__Definir();

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
	 * Returns the meta object for the '{@link inf5153emf.SortiePorte#supprimer() <em>Supprimer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Supprimer</em>' operation.
	 * @see inf5153emf.SortiePorte#supprimer()
	 * @generated
	 */
	EOperation getSortiePorte__Supprimer();

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
	 * Returns the meta object for the reference '{@link inf5153emf.Utilisateur#getInvokes <em>Invokes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Invokes</em>'.
	 * @see inf5153emf.Utilisateur#getInvokes()
	 * @see #getUtilisateur()
	 * @generated
	 */
	EReference getUtilisateur_Invokes();

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
	 * Returns the meta object for the reference list '{@link inf5153emf.CommandeConcrete#getExecutes <em>Executes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Executes</em>'.
	 * @see inf5153emf.CommandeConcrete#getExecutes()
	 * @see #getCommandeConcrete()
	 * @generated
	 */
	EReference getCommandeConcrete_Executes();

	/**
	 * Returns the meta object for the reference list '{@link inf5153emf.CommandeConcrete#getExecute <em>Execute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Execute</em>'.
	 * @see inf5153emf.CommandeConcrete#getExecute()
	 * @see #getCommandeConcrete()
	 * @generated
	 */
	EReference getCommandeConcrete_Execute();

	/**
	 * Returns the meta object for the '{@link inf5153emf.CommandeConcrete#execute() <em>Execute</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Execute</em>' operation.
	 * @see inf5153emf.CommandeConcrete#execute()
	 * @generated
	 */
	EOperation getCommandeConcrete__Execute();

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
	 * Returns the meta object for the '{@link inf5153emf.TableVPorte#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see inf5153emf.TableVPorte#update()
	 * @generated
	 */
	EOperation getTableVPorte__Update();

	/**
	 * Returns the meta object for the '{@link inf5153emf.TableVPorte#affiche() <em>Affiche</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Affiche</em>' operation.
	 * @see inf5153emf.TableVPorte#affiche()
	 * @generated
	 */
	EOperation getTableVPorte__Affiche();

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
	 * Returns the meta object for class '{@link inf5153emf.SubjectConcret <em>Subject Concret</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject Concret</em>'.
	 * @see inf5153emf.SubjectConcret
	 * @generated
	 */
	EClass getSubjectConcret();

	/**
	 * Returns the meta object for the '{@link inf5153emf.SubjectConcret#enregistrer() <em>Enregistrer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enregistrer</em>' operation.
	 * @see inf5153emf.SubjectConcret#enregistrer()
	 * @generated
	 */
	EOperation getSubjectConcret__Enregistrer();

	/**
	 * Returns the meta object for the '{@link inf5153emf.SubjectConcret#desenregistrer() <em>Desenregistrer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desenregistrer</em>' operation.
	 * @see inf5153emf.SubjectConcret#desenregistrer()
	 * @generated
	 */
	EOperation getSubjectConcret__Desenregistrer();

	/**
	 * Returns the meta object for class '{@link inf5153emf.Subject <em>Subject</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Subject</em>'.
	 * @see inf5153emf.Subject
	 * @generated
	 */
	EClass getSubject();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Subject#getNotify <em>Notify</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Notify</em>'.
	 * @see inf5153emf.Subject#getNotify()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_Notify();

	/**
	 * Returns the meta object for the reference '{@link inf5153emf.Subject#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Use</em>'.
	 * @see inf5153emf.Subject#getUse()
	 * @see #getSubject()
	 * @generated
	 */
	EReference getSubject_Use();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Subject#enregistrer() <em>Enregistrer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Enregistrer</em>' operation.
	 * @see inf5153emf.Subject#enregistrer()
	 * @generated
	 */
	EOperation getSubject__Enregistrer();

	/**
	 * Returns the meta object for the '{@link inf5153emf.Subject#desenregistrer() <em>Desenregistrer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Desenregistrer</em>' operation.
	 * @see inf5153emf.Subject#desenregistrer()
	 * @generated
	 */
	EOperation getSubject__Desenregistrer();

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
	 * Returns the meta object for the '{@link inf5153emf.ObsCircuit#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see inf5153emf.ObsCircuit#update()
	 * @generated
	 */
	EOperation getObsCircuit__Update();

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
	 * Returns the meta object for the '{@link inf5153emf.ObsPorte#update() <em>Update</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Update</em>' operation.
	 * @see inf5153emf.ObsPorte#update()
	 * @generated
	 */
	EOperation getObsPorte__Update();

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
		 * The meta object literal for the '<em><b>Creer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___CREER = eINSTANCE.getCircuit__Creer();

		/**
		 * The meta object literal for the '<em><b>Charger</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___CHARGER = eINSTANCE.getCircuit__Charger();

		/**
		 * The meta object literal for the '<em><b>Sauvegarder</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___SAUVEGARDER = eINSTANCE.getCircuit__Sauvegarder();

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
		 * The meta object literal for the '<em><b>Generer TV</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT___GENERER_TV = eINSTANCE.getCircuit__GenererTV();

		/**
		 * The meta object literal for the '{@link inf5153emf.TableVerite <em>Table Verite</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.TableVerite
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getTableVerite()
		 * @generated
		 */
		EClass TABLE_VERITE = eINSTANCE.getTableVerite();

		/**
		 * The meta object literal for the '<em><b>Porte</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VERITE__PORTE = eINSTANCE.getTableVerite_Porte();

		/**
		 * The meta object literal for the '<em><b>Circuitlogic</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE_VERITE__CIRCUITLOGIC = eINSTANCE.getTableVerite_Circuitlogic();

		/**
		 * The meta object literal for the '<em><b>Entree</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_VERITE__ENTREE = eINSTANCE.getTableVerite_Entree();

		/**
		 * The meta object literal for the '<em><b>Sortie</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE_VERITE__SORTIE = eINSTANCE.getTableVerite_Sortie();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VERITE___UPDATE = eINSTANCE.getTableVerite__Update();

		/**
		 * The meta object literal for the '<em><b>Afficher</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VERITE___AFFICHER = eINSTANCE.getTableVerite__Afficher();

		/**
		 * The meta object literal for the '<em><b>Calculer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VERITE___CALCULER = eINSTANCE.getTableVerite__Calculer();

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
		 * The meta object literal for the '<em><b>Tableverite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CIRCUIT_LOGIC__TABLEVERITE = eINSTANCE.getCircuitLogic_Tableverite();

		/**
		 * The meta object literal for the '<em><b>Creer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_LOGIC___CREER = eINSTANCE.getCircuitLogic__Creer();

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
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation CIRCUIT_LOGIC___AJOUTER = eINSTANCE.getCircuitLogic__Ajouter();

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
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTREE_CIRCUIT___AJOUTER = eINSTANCE.getEntreeCircuit__Ajouter();

		/**
		 * The meta object literal for the '<em><b>Definir</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation ENTREE_CIRCUIT___DEFINIR = eINSTANCE.getEntreeCircuit__Definir();

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
		 * The meta object literal for the '<em><b>Tableverite</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORTE__TABLEVERITE = eINSTANCE.getPorte_Tableverite();

		/**
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORTE___AJOUTER = eINSTANCE.getPorte__Ajouter();

		/**
		 * The meta object literal for the '<em><b>Supprimer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation PORTE___SUPPRIMER = eINSTANCE.getPorte__Supprimer();

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
		 * The meta object literal for the '<em><b>Ajouter</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORCTIE_CIRCUIT___AJOUTER = eINSTANCE.getSorctieCircuit__Ajouter();

		/**
		 * The meta object literal for the '<em><b>Supprimer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORCTIE_CIRCUIT___SUPPRIMER = eINSTANCE.getSorctieCircuit__Supprimer();

		/**
		 * The meta object literal for the '<em><b>Definir</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORCTIE_CIRCUIT___DEFINIR = eINSTANCE.getSorctieCircuit__Definir();

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
		 * The meta object literal for the '<em><b>Supprimer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SORTIE_PORTE___SUPPRIMER = eINSTANCE.getSortiePorte__Supprimer();

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
		 * The meta object literal for the '<em><b>Invokes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UTILISATEUR__INVOKES = eINSTANCE.getUtilisateur_Invokes();

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
		 * The meta object literal for the '<em><b>Executes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE_CONCRETE__EXECUTES = eINSTANCE.getCommandeConcrete_Executes();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMANDE_CONCRETE__EXECUTE = eINSTANCE.getCommandeConcrete_Execute();

		/**
		 * The meta object literal for the '<em><b>Execute</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMANDE_CONCRETE___EXECUTE = eINSTANCE.getCommandeConcrete__Execute();

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
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VPORTE___UPDATE = eINSTANCE.getTableVPorte__Update();

		/**
		 * The meta object literal for the '<em><b>Affiche</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TABLE_VPORTE___AFFICHE = eINSTANCE.getTableVPorte__Affiche();

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
		 * The meta object literal for the '{@link inf5153emf.impl.SubjectConcretImpl <em>Subject Concret</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.impl.SubjectConcretImpl
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getSubjectConcret()
		 * @generated
		 */
		EClass SUBJECT_CONCRET = eINSTANCE.getSubjectConcret();

		/**
		 * The meta object literal for the '<em><b>Enregistrer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBJECT_CONCRET___ENREGISTRER = eINSTANCE.getSubjectConcret__Enregistrer();

		/**
		 * The meta object literal for the '<em><b>Desenregistrer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBJECT_CONCRET___DESENREGISTRER = eINSTANCE.getSubjectConcret__Desenregistrer();

		/**
		 * The meta object literal for the '{@link inf5153emf.Subject <em>Subject</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see inf5153emf.Subject
		 * @see inf5153emf.impl.Inf5153emfPackageImpl#getSubject()
		 * @generated
		 */
		EClass SUBJECT = eINSTANCE.getSubject();

		/**
		 * The meta object literal for the '<em><b>Notify</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__NOTIFY = eINSTANCE.getSubject_Notify();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUBJECT__USE = eINSTANCE.getSubject_Use();

		/**
		 * The meta object literal for the '<em><b>Enregistrer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBJECT___ENREGISTRER = eINSTANCE.getSubject__Enregistrer();

		/**
		 * The meta object literal for the '<em><b>Desenregistrer</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation SUBJECT___DESENREGISTRER = eINSTANCE.getSubject__Desenregistrer();

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
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBS_CIRCUIT___UPDATE = eINSTANCE.getObsCircuit__Update();

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
		 * The meta object literal for the '<em><b>Update</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation OBS_PORTE___UPDATE = eINSTANCE.getObsPorte__Update();

	}

} //Inf5153emfPackage

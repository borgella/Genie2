/**
 */
package inf5153emf.impl;

import inf5153emf.Circuit;
import inf5153emf.CircuitLogic;
import inf5153emf.Commande;
import inf5153emf.CommandeConcrete;
import inf5153emf.Dossier;
import inf5153emf.EntreeCircuit;
import inf5153emf.EntreePorte;
import inf5153emf.Fichier;
import inf5153emf.Historique;
import inf5153emf.Inf5153emfFactory;
import inf5153emf.Inf5153emfPackage;
import inf5153emf.Memento;
import inf5153emf.Message;
import inf5153emf.ObsCircuit;
import inf5153emf.ObsPorte;
import inf5153emf.Observeur;
import inf5153emf.Porte;
import inf5153emf.PorteDeBase;
import inf5153emf.PortePersonnaliser;
import inf5153emf.SorctieCircuit;
import inf5153emf.SortiePorte;
import inf5153emf.SubjectTV;
import inf5153emf.TableVCircuit;
import inf5153emf.TableVPorte;
import inf5153emf.UserC;
import inf5153emf.Utilisateur;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Inf5153emfPackageImpl extends EPackageImpl implements Inf5153emfPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass circuitLogicEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreeCircuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass portePersonnaliserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sorctieCircuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass porteDeBaseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sortiePorteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass entreePorteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass dossierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fichierEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass utilisateurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass commandeConcreteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mementoEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historiqueEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableVPorteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tableVCircuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass subjectTVEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass observeurEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obsCircuitEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass obsPorteEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userCEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see inf5153emf.Inf5153emfPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private Inf5153emfPackageImpl() {
		super(eNS_URI, Inf5153emfFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link Inf5153emfPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static Inf5153emfPackage init() {
		if (isInited) return (Inf5153emfPackage)EPackage.Registry.INSTANCE.getEPackage(Inf5153emfPackage.eNS_URI);

		// Obtain or create and register package
		Inf5153emfPackageImpl theInf5153emfPackage = (Inf5153emfPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof Inf5153emfPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new Inf5153emfPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theInf5153emfPackage.createPackageContents();

		// Initialize created meta-data
		theInf5153emfPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theInf5153emfPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(Inf5153emfPackage.eNS_URI, theInf5153emfPackage);
		return theInf5153emfPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuit() {
		return circuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuit_Circuitlogic() {
		return (EReference)circuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuit_Fichier() {
		return (EReference)circuitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuit_Porte() {
		return (EReference)circuitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuit_Commande() {
		return (EReference)circuitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Creer() {
		return circuitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Ajouter() {
		return circuitEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Definir() {
		return circuitEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuit__Supprimer() {
		return circuitEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCircuitLogic() {
		return circuitLogicEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuitLogic_Circuit() {
		return (EReference)circuitLogicEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCircuitLogic_Tablevcircuit() {
		return (EReference)circuitLogicEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitLogic__Charger() {
		return circuitLogicEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitLogic__Sauvegarder() {
		return circuitLogicEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitLogic__Definir() {
		return circuitLogicEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCircuitLogic__GenererTV() {
		return circuitLogicEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntreeCircuit() {
		return entreeCircuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntreeCircuit_Contient() {
		return (EReference)entreeCircuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntreeCircuit_Nom() {
		return (EAttribute)entreeCircuitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntreeCircuit_Etat() {
		return (EAttribute)entreeCircuitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPortePersonnaliser() {
		return portePersonnaliserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPortePersonnaliser_CircuitValide() {
		return (EAttribute)portePersonnaliserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorte() {
		return porteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_Nom() {
		return (EAttribute)porteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_NbreEntree() {
		return (EAttribute)porteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorte_NbreSortie() {
		return (EAttribute)porteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPorte_Circuit() {
		return (EReference)porteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPorte_Tablevporte() {
		return (EReference)porteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPorte__RelierSortie() {
		return porteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPorte__RelierEntree() {
		return porteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getPorte__GenererTV() {
		return porteEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSorctieCircuit() {
		return sorctieCircuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSorctieCircuit_Contient() {
		return (EReference)sorctieCircuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSorctieCircuit_Sortieporte() {
		return (EReference)sorctieCircuitEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSorctieCircuit_Nom() {
		return (EAttribute)sorctieCircuitEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSorctieCircuit_Etat() {
		return (EAttribute)sorctieCircuitEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPorteDeBase() {
		return porteDeBaseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPorteDeBase_Type() {
		return (EAttribute)porteDeBaseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSortiePorte() {
		return sortiePorteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortiePorte_Contient() {
		return (EReference)sortiePorteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortiePorte_Entreeporte() {
		return (EReference)sortiePorteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSortiePorte_Sorctiecircuit() {
		return (EReference)sortiePorteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortiePorte_Nom() {
		return (EAttribute)sortiePorteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSortiePorte_Etat() {
		return (EAttribute)sortiePorteEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSortiePorte__Ajouter() {
		return sortiePorteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSortiePorte__Definir() {
		return sortiePorteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEntreePorte() {
		return entreePorteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntreePorte_Contient() {
		return (EReference)entreePorteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getEntreePorte_Sortieporte() {
		return (EReference)entreePorteEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntreePorte_Nom() {
		return (EAttribute)entreePorteEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getEntreePorte_Etat() {
		return (EAttribute)entreePorteEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntreePorte__Ajouter() {
		return entreePorteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getEntreePorte__Definir() {
		return entreePorteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDossier() {
		return dossierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDossier_Fichier() {
		return (EReference)dossierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDossier__GetNom() {
		return dossierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getDossier__SetNom() {
		return dossierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFichier() {
		return fichierEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFichier_Circuit() {
		return (EReference)fichierEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFichier_Dossier() {
		return (EReference)fichierEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFichier__GetNom() {
		return fichierEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getFichier__SetNom() {
		return fichierEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUtilisateur() {
		return utilisateurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUtilisateur_Commande() {
		return (EReference)utilisateurEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUtilisateur__Invoke() {
		return utilisateurEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommande() {
		return commandeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommande_Circuit() {
		return (EReference)commandeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommande_Utilisateur() {
		return (EReference)commandeEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCommande_Memento() {
		return (EReference)commandeEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getCommande__Excute() {
		return commandeEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCommandeConcrete() {
		return commandeConcreteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMemento() {
		return mementoEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMemento_Commande() {
		return (EReference)mementoEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemento__GetState() {
		return mementoEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMemento__SetState() {
		return mementoEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Historique() {
		return (EReference)messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getMessage__GetContenue() {
		return messageEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistorique() {
		return historiqueEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistorique_Memento() {
		return (EReference)historiqueEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getHistorique_Message() {
		return (EReference)historiqueEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getHistorique_State() {
		return (EAttribute)historiqueEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistorique__SetMemento__Memento() {
		return historiqueEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistorique__Undo() {
		return historiqueEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistorique__Redo() {
		return historiqueEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getHistorique__CreateMemento() {
		return historiqueEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableVPorte() {
		return tableVPorteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableVPorte_Porte() {
		return (EReference)tableVPorteEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableVPorte__Update() {
		return tableVPorteEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableVPorte__Afficher() {
		return tableVPorteEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableVPorte__Calculer() {
		return tableVPorteEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTableVCircuit() {
		return tableVCircuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTableVCircuit_Circuitlogic() {
		return (EReference)tableVCircuitEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableVCircuit__Update() {
		return tableVCircuitEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableVCircuit__Afficher() {
		return tableVCircuitEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getTableVCircuit__Calculer() {
		return tableVCircuitEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSubjectTV() {
		return subjectTVEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSubjectTV_Notify() {
		return (EReference)subjectTVEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubjectTV__Enregistrer() {
		return subjectTVEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getSubjectTV__Desenregistrer() {
		return subjectTVEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObserveur() {
		return observeurEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getObserveur__Update() {
		return observeurEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObsCircuit() {
		return obsCircuitEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getObsPorte() {
		return obsPorteEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserC() {
		return userCEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inf5153emfFactory getInf5153emfFactory() {
		return (Inf5153emfFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		circuitEClass = createEClass(CIRCUIT);
		createEReference(circuitEClass, CIRCUIT__CIRCUITLOGIC);
		createEReference(circuitEClass, CIRCUIT__FICHIER);
		createEReference(circuitEClass, CIRCUIT__PORTE);
		createEReference(circuitEClass, CIRCUIT__COMMANDE);
		createEOperation(circuitEClass, CIRCUIT___CREER);
		createEOperation(circuitEClass, CIRCUIT___AJOUTER);
		createEOperation(circuitEClass, CIRCUIT___DEFINIR);
		createEOperation(circuitEClass, CIRCUIT___SUPPRIMER);

		circuitLogicEClass = createEClass(CIRCUIT_LOGIC);
		createEReference(circuitLogicEClass, CIRCUIT_LOGIC__CIRCUIT);
		createEReference(circuitLogicEClass, CIRCUIT_LOGIC__TABLEVCIRCUIT);
		createEOperation(circuitLogicEClass, CIRCUIT_LOGIC___CHARGER);
		createEOperation(circuitLogicEClass, CIRCUIT_LOGIC___SAUVEGARDER);
		createEOperation(circuitLogicEClass, CIRCUIT_LOGIC___DEFINIR);
		createEOperation(circuitLogicEClass, CIRCUIT_LOGIC___GENERER_TV);

		entreeCircuitEClass = createEClass(ENTREE_CIRCUIT);
		createEReference(entreeCircuitEClass, ENTREE_CIRCUIT__CONTIENT);
		createEAttribute(entreeCircuitEClass, ENTREE_CIRCUIT__NOM);
		createEAttribute(entreeCircuitEClass, ENTREE_CIRCUIT__ETAT);

		portePersonnaliserEClass = createEClass(PORTE_PERSONNALISER);
		createEAttribute(portePersonnaliserEClass, PORTE_PERSONNALISER__CIRCUIT_VALIDE);

		porteEClass = createEClass(PORTE);
		createEAttribute(porteEClass, PORTE__NOM);
		createEAttribute(porteEClass, PORTE__NBRE_ENTREE);
		createEAttribute(porteEClass, PORTE__NBRE_SORTIE);
		createEReference(porteEClass, PORTE__CIRCUIT);
		createEReference(porteEClass, PORTE__TABLEVPORTE);
		createEOperation(porteEClass, PORTE___RELIER_SORTIE);
		createEOperation(porteEClass, PORTE___RELIER_ENTREE);
		createEOperation(porteEClass, PORTE___GENERER_TV);

		sorctieCircuitEClass = createEClass(SORCTIE_CIRCUIT);
		createEReference(sorctieCircuitEClass, SORCTIE_CIRCUIT__CONTIENT);
		createEReference(sorctieCircuitEClass, SORCTIE_CIRCUIT__SORTIEPORTE);
		createEAttribute(sorctieCircuitEClass, SORCTIE_CIRCUIT__NOM);
		createEAttribute(sorctieCircuitEClass, SORCTIE_CIRCUIT__ETAT);

		porteDeBaseEClass = createEClass(PORTE_DE_BASE);
		createEAttribute(porteDeBaseEClass, PORTE_DE_BASE__TYPE);

		sortiePorteEClass = createEClass(SORTIE_PORTE);
		createEReference(sortiePorteEClass, SORTIE_PORTE__CONTIENT);
		createEReference(sortiePorteEClass, SORTIE_PORTE__ENTREEPORTE);
		createEReference(sortiePorteEClass, SORTIE_PORTE__SORCTIECIRCUIT);
		createEAttribute(sortiePorteEClass, SORTIE_PORTE__NOM);
		createEAttribute(sortiePorteEClass, SORTIE_PORTE__ETAT);
		createEOperation(sortiePorteEClass, SORTIE_PORTE___AJOUTER);
		createEOperation(sortiePorteEClass, SORTIE_PORTE___DEFINIR);

		entreePorteEClass = createEClass(ENTREE_PORTE);
		createEReference(entreePorteEClass, ENTREE_PORTE__CONTIENT);
		createEReference(entreePorteEClass, ENTREE_PORTE__SORTIEPORTE);
		createEAttribute(entreePorteEClass, ENTREE_PORTE__NOM);
		createEAttribute(entreePorteEClass, ENTREE_PORTE__ETAT);
		createEOperation(entreePorteEClass, ENTREE_PORTE___AJOUTER);
		createEOperation(entreePorteEClass, ENTREE_PORTE___DEFINIR);

		dossierEClass = createEClass(DOSSIER);
		createEReference(dossierEClass, DOSSIER__FICHIER);
		createEOperation(dossierEClass, DOSSIER___GET_NOM);
		createEOperation(dossierEClass, DOSSIER___SET_NOM);

		fichierEClass = createEClass(FICHIER);
		createEReference(fichierEClass, FICHIER__CIRCUIT);
		createEReference(fichierEClass, FICHIER__DOSSIER);
		createEOperation(fichierEClass, FICHIER___GET_NOM);
		createEOperation(fichierEClass, FICHIER___SET_NOM);

		utilisateurEClass = createEClass(UTILISATEUR);
		createEReference(utilisateurEClass, UTILISATEUR__COMMANDE);
		createEOperation(utilisateurEClass, UTILISATEUR___INVOKE);

		commandeEClass = createEClass(COMMANDE);
		createEReference(commandeEClass, COMMANDE__CIRCUIT);
		createEReference(commandeEClass, COMMANDE__UTILISATEUR);
		createEReference(commandeEClass, COMMANDE__MEMENTO);
		createEOperation(commandeEClass, COMMANDE___EXCUTE);

		commandeConcreteEClass = createEClass(COMMANDE_CONCRETE);

		mementoEClass = createEClass(MEMENTO);
		createEReference(mementoEClass, MEMENTO__COMMANDE);
		createEOperation(mementoEClass, MEMENTO___GET_STATE);
		createEOperation(mementoEClass, MEMENTO___SET_STATE);

		messageEClass = createEClass(MESSAGE);
		createEReference(messageEClass, MESSAGE__HISTORIQUE);
		createEOperation(messageEClass, MESSAGE___GET_CONTENUE);

		historiqueEClass = createEClass(HISTORIQUE);
		createEReference(historiqueEClass, HISTORIQUE__MEMENTO);
		createEReference(historiqueEClass, HISTORIQUE__MESSAGE);
		createEAttribute(historiqueEClass, HISTORIQUE__STATE);
		createEOperation(historiqueEClass, HISTORIQUE___SET_MEMENTO__MEMENTO);
		createEOperation(historiqueEClass, HISTORIQUE___UNDO);
		createEOperation(historiqueEClass, HISTORIQUE___REDO);
		createEOperation(historiqueEClass, HISTORIQUE___CREATE_MEMENTO);

		tableVPorteEClass = createEClass(TABLE_VPORTE);
		createEReference(tableVPorteEClass, TABLE_VPORTE__PORTE);
		createEOperation(tableVPorteEClass, TABLE_VPORTE___UPDATE);
		createEOperation(tableVPorteEClass, TABLE_VPORTE___AFFICHER);
		createEOperation(tableVPorteEClass, TABLE_VPORTE___CALCULER);

		tableVCircuitEClass = createEClass(TABLE_VCIRCUIT);
		createEReference(tableVCircuitEClass, TABLE_VCIRCUIT__CIRCUITLOGIC);
		createEOperation(tableVCircuitEClass, TABLE_VCIRCUIT___UPDATE);
		createEOperation(tableVCircuitEClass, TABLE_VCIRCUIT___AFFICHER);
		createEOperation(tableVCircuitEClass, TABLE_VCIRCUIT___CALCULER);

		subjectTVEClass = createEClass(SUBJECT_TV);
		createEReference(subjectTVEClass, SUBJECT_TV__NOTIFY);
		createEOperation(subjectTVEClass, SUBJECT_TV___ENREGISTRER);
		createEOperation(subjectTVEClass, SUBJECT_TV___DESENREGISTRER);

		observeurEClass = createEClass(OBSERVEUR);
		createEOperation(observeurEClass, OBSERVEUR___UPDATE);

		obsCircuitEClass = createEClass(OBS_CIRCUIT);

		obsPorteEClass = createEClass(OBS_PORTE);

		userCEClass = createEClass(USER_C);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		portePersonnaliserEClass.getESuperTypes().add(this.getPorte());
		porteDeBaseEClass.getESuperTypes().add(this.getPorte());
		commandeConcreteEClass.getESuperTypes().add(this.getCommande());
		tableVPorteEClass.getESuperTypes().add(this.getSubjectTV());
		tableVCircuitEClass.getESuperTypes().add(this.getSubjectTV());
		obsCircuitEClass.getESuperTypes().add(this.getObserveur());
		obsPorteEClass.getESuperTypes().add(this.getObserveur());
		userCEClass.getESuperTypes().add(this.getUtilisateur());

		// Initialize classes, features, and operations; add parameters
		initEClass(circuitEClass, Circuit.class, "Circuit", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircuit_Circuitlogic(), this.getCircuitLogic(), this.getCircuitLogic_Circuit(), "circuitlogic", null, 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircuit_Fichier(), this.getFichier(), this.getFichier_Circuit(), "fichier", null, 1, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircuit_Porte(), this.getPorte(), this.getPorte_Circuit(), "porte", null, 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircuit_Commande(), this.getCommande(), this.getCommande_Circuit(), "commande", null, 0, 1, Circuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCircuit__Creer(), null, "creer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuit__Ajouter(), null, "ajouter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuit__Definir(), null, "definir", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuit__Supprimer(), null, "supprimer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(circuitLogicEClass, CircuitLogic.class, "CircuitLogic", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCircuitLogic_Circuit(), this.getCircuit(), this.getCircuit_Circuitlogic(), "circuit", null, 0, 1, CircuitLogic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCircuitLogic_Tablevcircuit(), this.getTableVCircuit(), this.getTableVCircuit_Circuitlogic(), "tablevcircuit", null, 0, 1, CircuitLogic.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCircuitLogic__Charger(), null, "charger", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuitLogic__Sauvegarder(), null, "sauvegarder", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuitLogic__Definir(), null, "definir", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getCircuitLogic__GenererTV(), null, "genererTV", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entreeCircuitEClass, EntreeCircuit.class, "EntreeCircuit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntreeCircuit_Contient(), this.getCircuit(), null, "contient", null, 1, -1, EntreeCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntreeCircuit_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, EntreeCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntreeCircuit_Etat(), ecorePackage.getEString(), "Etat", null, 0, 1, EntreeCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(portePersonnaliserEClass, PortePersonnaliser.class, "PortePersonnaliser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPortePersonnaliser_CircuitValide(), theXMLTypePackage.getBoolean(), "circuitValide", null, 0, 1, PortePersonnaliser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(porteEClass, Porte.class, "Porte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPorte_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, Porte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPorte_NbreEntree(), ecorePackage.getEInt(), "nbreEntree", null, 0, 1, Porte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getPorte_NbreSortie(), ecorePackage.getEInt(), "nbreSortie", null, 0, 1, Porte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPorte_Circuit(), this.getCircuit(), this.getCircuit_Porte(), "circuit", null, 0, 1, Porte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getPorte_Tablevporte(), this.getTableVPorte(), this.getTableVPorte_Porte(), "tablevporte", null, 0, 1, Porte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getPorte__RelierSortie(), null, "relierSortie", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPorte__RelierEntree(), null, "relierEntree", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getPorte__GenererTV(), null, "genererTV", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(sorctieCircuitEClass, SorctieCircuit.class, "SorctieCircuit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSorctieCircuit_Contient(), this.getCircuit(), null, "contient", null, 0, 1, SorctieCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSorctieCircuit_Sortieporte(), this.getSortiePorte(), this.getSortiePorte_Sorctiecircuit(), "sortieporte", null, 0, 1, SorctieCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSorctieCircuit_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, SorctieCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSorctieCircuit_Etat(), ecorePackage.getEInt(), "Etat", null, 0, 1, SorctieCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(porteDeBaseEClass, PorteDeBase.class, "PorteDeBase", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPorteDeBase_Type(), ecorePackage.getEString(), "type", null, 0, 1, PorteDeBase.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sortiePorteEClass, SortiePorte.class, "SortiePorte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSortiePorte_Contient(), this.getPorte(), null, "contient", null, 0, 1, SortiePorte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortiePorte_Entreeporte(), this.getEntreePorte(), this.getEntreePorte_Sortieporte(), "entreeporte", null, 0, 1, SortiePorte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSortiePorte_Sorctiecircuit(), this.getSorctieCircuit(), this.getSorctieCircuit_Sortieporte(), "sorctiecircuit", null, 0, 1, SortiePorte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortiePorte_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, SortiePorte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSortiePorte_Etat(), ecorePackage.getEInt(), "etat", null, 0, 1, SortiePorte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSortiePorte__Ajouter(), null, "ajouter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSortiePorte__Definir(), null, "definir", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(entreePorteEClass, EntreePorte.class, "EntreePorte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getEntreePorte_Contient(), this.getPorte(), null, "contient", null, 0, 1, EntreePorte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getEntreePorte_Sortieporte(), this.getSortiePorte(), this.getSortiePorte_Entreeporte(), "sortieporte", null, 0, 1, EntreePorte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntreePorte_Nom(), ecorePackage.getEString(), "Nom", null, 0, 1, EntreePorte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getEntreePorte_Etat(), ecorePackage.getEInt(), "etat", null, 0, 1, EntreePorte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getEntreePorte__Ajouter(), null, "ajouter", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getEntreePorte__Definir(), null, "definir", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(dossierEClass, Dossier.class, "Dossier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getDossier_Fichier(), this.getFichier(), this.getFichier_Dossier(), "fichier", null, 1, -1, Dossier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getDossier__GetNom(), null, "getNom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getDossier__SetNom(), null, "setNom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(fichierEClass, Fichier.class, "Fichier", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFichier_Circuit(), this.getCircuit(), this.getCircuit_Fichier(), "circuit", null, 0, 1, Fichier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFichier_Dossier(), this.getDossier(), this.getDossier_Fichier(), "dossier", null, 0, 1, Fichier.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getFichier__GetNom(), null, "getNom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getFichier__SetNom(), null, "setNom", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(utilisateurEClass, Utilisateur.class, "Utilisateur", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getUtilisateur_Commande(), this.getCommande(), this.getCommande_Utilisateur(), "commande", null, 0, 1, Utilisateur.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getUtilisateur__Invoke(), null, "invoke", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandeEClass, Commande.class, "Commande", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCommande_Circuit(), this.getCircuit(), this.getCircuit_Commande(), "circuit", null, 0, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommande_Utilisateur(), this.getUtilisateur(), this.getUtilisateur_Commande(), "utilisateur", null, 0, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommande_Memento(), this.getMemento(), this.getMemento_Commande(), "memento", null, 0, 1, Commande.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCommande__Excute(), null, "excute", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(commandeConcreteEClass, CommandeConcrete.class, "CommandeConcrete", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mementoEClass, Memento.class, "Memento", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMemento_Commande(), this.getCommande(), this.getCommande_Memento(), "commande", null, 0, 1, Memento.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMemento__GetState(), null, "getState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getMemento__SetState(), null, "setState", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMessage_Historique(), this.getHistorique(), this.getHistorique_Message(), "historique", null, 0, 1, Message.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getMessage__GetContenue(), null, "getContenue", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(historiqueEClass, Historique.class, "Historique", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getHistorique_Memento(), this.getMemento(), null, "memento", null, 0, -1, Historique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getHistorique_Message(), this.getMessage(), this.getMessage_Historique(), "message", null, 0, 1, Historique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getHistorique_State(), ecorePackage.getEString(), "State", null, 0, 1, Historique.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		EOperation op = initEOperation(getHistorique__SetMemento__Memento(), null, "setMemento", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getMemento(), "memento", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHistorique__Undo(), null, "undo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHistorique__Redo(), null, "redo", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getHistorique__CreateMemento(), null, "createMemento", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableVPorteEClass, TableVPorte.class, "TableVPorte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableVPorte_Porte(), this.getPorte(), this.getPorte_Tablevporte(), "porte", null, 0, 1, TableVPorte.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTableVPorte__Update(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTableVPorte__Afficher(), null, "afficher", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTableVPorte__Calculer(), null, "calculer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(tableVCircuitEClass, TableVCircuit.class, "TableVCircuit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTableVCircuit_Circuitlogic(), this.getCircuitLogic(), this.getCircuitLogic_Tablevcircuit(), "circuitlogic", null, 0, 1, TableVCircuit.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTableVCircuit__Update(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTableVCircuit__Afficher(), null, "afficher", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getTableVCircuit__Calculer(), null, "calculer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(subjectTVEClass, SubjectTV.class, "SubjectTV", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSubjectTV_Notify(), this.getObserveur(), null, "notify", null, 0, 1, SubjectTV.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getSubjectTV__Enregistrer(), null, "enregistrer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getSubjectTV__Desenregistrer(), null, "desenregistrer", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(observeurEClass, Observeur.class, "Observeur", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getObserveur__Update(), null, "update", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(obsCircuitEClass, ObsCircuit.class, "ObsCircuit", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(obsPorteEClass, ObsPorte.class, "ObsPorte", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userCEClass, UserC.class, "UserC", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";	
		addAnnotation
		  (this, 
		   source, 
		   new String[] {
			 "qualified", "false"
		   });
	}

} //Inf5153emfPackageImpl

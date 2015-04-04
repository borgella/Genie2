/**
 */
package inf5153emf.impl;

import inf5153emf.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class Inf5153emfFactoryImpl extends EFactoryImpl implements Inf5153emfFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Inf5153emfFactory init() {
		try {
			Inf5153emfFactory theInf5153emfFactory = (Inf5153emfFactory)EPackage.Registry.INSTANCE.getEFactory(Inf5153emfPackage.eNS_URI);
			if (theInf5153emfFactory != null) {
				return theInf5153emfFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new Inf5153emfFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inf5153emfFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case Inf5153emfPackage.CIRCUIT_LOGIC: return createCircuitLogic();
			case Inf5153emfPackage.ENTREE_CIRCUIT: return createEntreeCircuit();
			case Inf5153emfPackage.PORTE_PERSONNALISER: return createPortePersonnaliser();
			case Inf5153emfPackage.PORTE: return createPorte();
			case Inf5153emfPackage.SORCTIE_CIRCUIT: return createSorctieCircuit();
			case Inf5153emfPackage.PORTE_DE_BASE: return createPorteDeBase();
			case Inf5153emfPackage.SORTIE_PORTE: return createSortiePorte();
			case Inf5153emfPackage.ENTREE_PORTE: return createEntreePorte();
			case Inf5153emfPackage.DOSSIER: return createDossier();
			case Inf5153emfPackage.FICHIER: return createFichier();
			case Inf5153emfPackage.COMMANDE_CONCRETE: return createCommandeConcrete();
			case Inf5153emfPackage.MEMENTO: return createMemento();
			case Inf5153emfPackage.MESSAGE: return createMessage();
			case Inf5153emfPackage.HISTORIQUE: return createHistorique();
			case Inf5153emfPackage.TABLE_VPORTE: return createTableVPorte();
			case Inf5153emfPackage.TABLE_VCIRCUIT: return createTableVCircuit();
			case Inf5153emfPackage.SUBJECT_CONCRET: return createSubjectConcret();
			case Inf5153emfPackage.OBS_CIRCUIT: return createObsCircuit();
			case Inf5153emfPackage.OBS_PORTE: return createObsPorte();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CircuitLogic createCircuitLogic() {
		CircuitLogicImpl circuitLogic = new CircuitLogicImpl();
		return circuitLogic;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntreeCircuit createEntreeCircuit() {
		EntreeCircuitImpl entreeCircuit = new EntreeCircuitImpl();
		return entreeCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortePersonnaliser createPortePersonnaliser() {
		PortePersonnaliserImpl portePersonnaliser = new PortePersonnaliserImpl();
		return portePersonnaliser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Porte createPorte() {
		PorteImpl porte = new PorteImpl();
		return porte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SorctieCircuit createSorctieCircuit() {
		SorctieCircuitImpl sorctieCircuit = new SorctieCircuitImpl();
		return sorctieCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PorteDeBase createPorteDeBase() {
		PorteDeBaseImpl porteDeBase = new PorteDeBaseImpl();
		return porteDeBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SortiePorte createSortiePorte() {
		SortiePorteImpl sortiePorte = new SortiePorteImpl();
		return sortiePorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntreePorte createEntreePorte() {
		EntreePorteImpl entreePorte = new EntreePorteImpl();
		return entreePorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Dossier createDossier() {
		DossierImpl dossier = new DossierImpl();
		return dossier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Fichier createFichier() {
		FichierImpl fichier = new FichierImpl();
		return fichier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommandeConcrete createCommandeConcrete() {
		CommandeConcreteImpl commandeConcrete = new CommandeConcreteImpl();
		return commandeConcrete;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Memento createMemento() {
		MementoImpl memento = new MementoImpl();
		return memento;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Historique createHistorique() {
		HistoriqueImpl historique = new HistoriqueImpl();
		return historique;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVPorte createTableVPorte() {
		TableVPorteImpl tableVPorte = new TableVPorteImpl();
		return tableVPorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TableVCircuit createTableVCircuit() {
		TableVCircuitImpl tableVCircuit = new TableVCircuitImpl();
		return tableVCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubjectConcret createSubjectConcret() {
		SubjectConcretImpl subjectConcret = new SubjectConcretImpl();
		return subjectConcret;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObsCircuit createObsCircuit() {
		ObsCircuitImpl obsCircuit = new ObsCircuitImpl();
		return obsCircuit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ObsPorte createObsPorte() {
		ObsPorteImpl obsPorte = new ObsPorteImpl();
		return obsPorte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inf5153emfPackage getInf5153emfPackage() {
		return (Inf5153emfPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static Inf5153emfPackage getPackage() {
		return Inf5153emfPackage.eINSTANCE;
	}

} //Inf5153emfFactoryImpl

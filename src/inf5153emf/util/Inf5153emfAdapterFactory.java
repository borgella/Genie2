/**
 */
package inf5153emf.util;

import inf5153emf.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see inf5153emf.Inf5153emfPackage
 * @generated
 */
public class Inf5153emfAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Inf5153emfPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inf5153emfAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Inf5153emfPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Inf5153emfSwitch<Adapter> modelSwitch =
		new Inf5153emfSwitch<Adapter>() {
			@Override
			public Adapter caseCircuit(Circuit object) {
				return createCircuitAdapter();
			}
			@Override
			public Adapter caseCircuitLogic(CircuitLogic object) {
				return createCircuitLogicAdapter();
			}
			@Override
			public Adapter caseEntreeCircuit(EntreeCircuit object) {
				return createEntreeCircuitAdapter();
			}
			@Override
			public Adapter casePortePersonnaliser(PortePersonnaliser object) {
				return createPortePersonnaliserAdapter();
			}
			@Override
			public Adapter casePorte(Porte object) {
				return createPorteAdapter();
			}
			@Override
			public Adapter caseSorctieCircuit(SorctieCircuit object) {
				return createSorctieCircuitAdapter();
			}
			@Override
			public Adapter casePorteDeBase(PorteDeBase object) {
				return createPorteDeBaseAdapter();
			}
			@Override
			public Adapter caseSortiePorte(SortiePorte object) {
				return createSortiePorteAdapter();
			}
			@Override
			public Adapter caseEntreePorte(EntreePorte object) {
				return createEntreePorteAdapter();
			}
			@Override
			public Adapter caseDossier(Dossier object) {
				return createDossierAdapter();
			}
			@Override
			public Adapter caseFichier(Fichier object) {
				return createFichierAdapter();
			}
			@Override
			public Adapter caseUtilisateur(Utilisateur object) {
				return createUtilisateurAdapter();
			}
			@Override
			public Adapter caseCommande(Commande object) {
				return createCommandeAdapter();
			}
			@Override
			public Adapter caseCommandeConcrete(CommandeConcrete object) {
				return createCommandeConcreteAdapter();
			}
			@Override
			public Adapter caseMemento(Memento object) {
				return createMementoAdapter();
			}
			@Override
			public Adapter caseMessage(Message object) {
				return createMessageAdapter();
			}
			@Override
			public Adapter caseHistorique(Historique object) {
				return createHistoriqueAdapter();
			}
			@Override
			public Adapter caseTableVPorte(TableVPorte object) {
				return createTableVPorteAdapter();
			}
			@Override
			public Adapter caseTableVCircuit(TableVCircuit object) {
				return createTableVCircuitAdapter();
			}
			@Override
			public Adapter caseSubjectTV(SubjectTV object) {
				return createSubjectTVAdapter();
			}
			@Override
			public Adapter caseObserveur(Observeur object) {
				return createObserveurAdapter();
			}
			@Override
			public Adapter caseObsCircuit(ObsCircuit object) {
				return createObsCircuitAdapter();
			}
			@Override
			public Adapter caseObsPorte(ObsPorte object) {
				return createObsPorteAdapter();
			}
			@Override
			public Adapter caseUserC(UserC object) {
				return createUserCAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.Circuit <em>Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.Circuit
	 * @generated
	 */
	public Adapter createCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.CircuitLogic <em>Circuit Logic</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.CircuitLogic
	 * @generated
	 */
	public Adapter createCircuitLogicAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.EntreeCircuit <em>Entree Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.EntreeCircuit
	 * @generated
	 */
	public Adapter createEntreeCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.PortePersonnaliser <em>Porte Personnaliser</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.PortePersonnaliser
	 * @generated
	 */
	public Adapter createPortePersonnaliserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.Porte <em>Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.Porte
	 * @generated
	 */
	public Adapter createPorteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.SorctieCircuit <em>Sorctie Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.SorctieCircuit
	 * @generated
	 */
	public Adapter createSorctieCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.PorteDeBase <em>Porte De Base</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.PorteDeBase
	 * @generated
	 */
	public Adapter createPorteDeBaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.SortiePorte <em>Sortie Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.SortiePorte
	 * @generated
	 */
	public Adapter createSortiePorteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.EntreePorte <em>Entree Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.EntreePorte
	 * @generated
	 */
	public Adapter createEntreePorteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.Dossier <em>Dossier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.Dossier
	 * @generated
	 */
	public Adapter createDossierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.Fichier <em>Fichier</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.Fichier
	 * @generated
	 */
	public Adapter createFichierAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.Utilisateur <em>Utilisateur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.Utilisateur
	 * @generated
	 */
	public Adapter createUtilisateurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.Commande <em>Commande</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.Commande
	 * @generated
	 */
	public Adapter createCommandeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.CommandeConcrete <em>Commande Concrete</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.CommandeConcrete
	 * @generated
	 */
	public Adapter createCommandeConcreteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.Memento <em>Memento</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.Memento
	 * @generated
	 */
	public Adapter createMementoAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.Historique <em>Historique</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.Historique
	 * @generated
	 */
	public Adapter createHistoriqueAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.TableVPorte <em>Table VPorte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.TableVPorte
	 * @generated
	 */
	public Adapter createTableVPorteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.TableVCircuit <em>Table VCircuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.TableVCircuit
	 * @generated
	 */
	public Adapter createTableVCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.SubjectTV <em>Subject TV</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.SubjectTV
	 * @generated
	 */
	public Adapter createSubjectTVAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.Observeur <em>Observeur</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.Observeur
	 * @generated
	 */
	public Adapter createObserveurAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.ObsCircuit <em>Obs Circuit</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.ObsCircuit
	 * @generated
	 */
	public Adapter createObsCircuitAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.ObsPorte <em>Obs Porte</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.ObsPorte
	 * @generated
	 */
	public Adapter createObsPorteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link inf5153emf.UserC <em>User C</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see inf5153emf.UserC
	 * @generated
	 */
	public Adapter createUserCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Inf5153emfAdapterFactory

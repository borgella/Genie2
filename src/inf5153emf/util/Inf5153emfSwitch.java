/**
 */
package inf5153emf.util;

import inf5153emf.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see inf5153emf.Inf5153emfPackage
 * @generated
 */
public class Inf5153emfSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Inf5153emfPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Inf5153emfSwitch() {
		if (modelPackage == null) {
			modelPackage = Inf5153emfPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @parameter ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case Inf5153emfPackage.CIRCUIT: {
				Circuit circuit = (Circuit)theEObject;
				T result = caseCircuit(circuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.TABLE_VERITE: {
				TableVerite tableVerite = (TableVerite)theEObject;
				T result = caseTableVerite(tableVerite);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.CIRCUIT_LOGIC: {
				CircuitLogic circuitLogic = (CircuitLogic)theEObject;
				T result = caseCircuitLogic(circuitLogic);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.ENTREE_CIRCUIT: {
				EntreeCircuit entreeCircuit = (EntreeCircuit)theEObject;
				T result = caseEntreeCircuit(entreeCircuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.PORTE_PERSONNALISER: {
				PortePersonnaliser portePersonnaliser = (PortePersonnaliser)theEObject;
				T result = casePortePersonnaliser(portePersonnaliser);
				if (result == null) result = casePorte(portePersonnaliser);
				if (result == null) result = caseCircuit(portePersonnaliser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.PORTE: {
				Porte porte = (Porte)theEObject;
				T result = casePorte(porte);
				if (result == null) result = caseCircuit(porte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.SORCTIE_CIRCUIT: {
				SorctieCircuit sorctieCircuit = (SorctieCircuit)theEObject;
				T result = caseSorctieCircuit(sorctieCircuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.PORTE_DE_BASE: {
				PorteDeBase porteDeBase = (PorteDeBase)theEObject;
				T result = casePorteDeBase(porteDeBase);
				if (result == null) result = casePorte(porteDeBase);
				if (result == null) result = caseCircuit(porteDeBase);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.SORTIE_PORTE: {
				SortiePorte sortiePorte = (SortiePorte)theEObject;
				T result = caseSortiePorte(sortiePorte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.ENTREE_PORTE: {
				EntreePorte entreePorte = (EntreePorte)theEObject;
				T result = caseEntreePorte(entreePorte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.DOSSIER: {
				Dossier dossier = (Dossier)theEObject;
				T result = caseDossier(dossier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.FICHIER: {
				Fichier fichier = (Fichier)theEObject;
				T result = caseFichier(fichier);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.UTILISATEUR: {
				Utilisateur utilisateur = (Utilisateur)theEObject;
				T result = caseUtilisateur(utilisateur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.COMMANDE: {
				Commande commande = (Commande)theEObject;
				T result = caseCommande(commande);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.COMMANDE_CONCRETE: {
				CommandeConcrete commandeConcrete = (CommandeConcrete)theEObject;
				T result = caseCommandeConcrete(commandeConcrete);
				if (result == null) result = caseCommande(commandeConcrete);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.MEMENTO: {
				Memento memento = (Memento)theEObject;
				T result = caseMemento(memento);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.MESSAGE: {
				Message message = (Message)theEObject;
				T result = caseMessage(message);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.HISTORIQUE: {
				Historique historique = (Historique)theEObject;
				T result = caseHistorique(historique);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.TABLE_VPORTE: {
				TableVPorte tableVPorte = (TableVPorte)theEObject;
				T result = caseTableVPorte(tableVPorte);
				if (result == null) result = caseTableVerite(tableVPorte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.TABLE_VCIRCUIT: {
				TableVCircuit tableVCircuit = (TableVCircuit)theEObject;
				T result = caseTableVCircuit(tableVCircuit);
				if (result == null) result = caseTableVerite(tableVCircuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.SUBJECT_CONCRET: {
				SubjectConcret subjectConcret = (SubjectConcret)theEObject;
				T result = caseSubjectConcret(subjectConcret);
				if (result == null) result = caseSubject(subjectConcret);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.SUBJECT: {
				Subject subject = (Subject)theEObject;
				T result = caseSubject(subject);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.OBSERVEUR: {
				Observeur observeur = (Observeur)theEObject;
				T result = caseObserveur(observeur);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.OBS_CIRCUIT: {
				ObsCircuit obsCircuit = (ObsCircuit)theEObject;
				T result = caseObsCircuit(obsCircuit);
				if (result == null) result = caseObserveur(obsCircuit);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case Inf5153emfPackage.OBS_PORTE: {
				ObsPorte obsPorte = (ObsPorte)theEObject;
				T result = caseObsPorte(obsPorte);
				if (result == null) result = caseObserveur(obsPorte);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuit(Circuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table Verite</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table Verite</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableVerite(TableVerite object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Circuit Logic</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Circuit Logic</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCircuitLogic(CircuitLogic object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entree Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entree Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntreeCircuit(EntreeCircuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte Personnaliser</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte Personnaliser</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortePersonnaliser(PortePersonnaliser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorte(Porte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sorctie Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sorctie Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSorctieCircuit(SorctieCircuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Porte De Base</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Porte De Base</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePorteDeBase(PorteDeBase object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sortie Porte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sortie Porte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSortiePorte(SortiePorte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Entree Porte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Entree Porte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEntreePorte(EntreePorte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Dossier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Dossier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDossier(Dossier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Fichier</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Fichier</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFichier(Fichier object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Utilisateur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Utilisateur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUtilisateur(Utilisateur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commande</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commande</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommande(Commande object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Commande Concrete</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Commande Concrete</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCommandeConcrete(CommandeConcrete object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Memento</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Memento</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMemento(Memento object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Message</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMessage(Message object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Historique</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Historique</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistorique(Historique object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table VPorte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table VPorte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableVPorte(TableVPorte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Table VCircuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Table VCircuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTableVCircuit(TableVCircuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject Concret</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject Concret</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubjectConcret(SubjectConcret object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Subject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubject(Subject object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Observeur</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Observeur</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObserveur(Observeur object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obs Circuit</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obs Circuit</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObsCircuit(ObsCircuit object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Obs Porte</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Obs Porte</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseObsPorte(ObsPorte object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Inf5153emfSwitch

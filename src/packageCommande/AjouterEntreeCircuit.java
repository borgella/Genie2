package packageCommande;

import inf5153emf.Circuit;

public class AjouterEntreeCircuit implements Commande {
	String nom;
	Circuit circuit;
	public AjouterEntreeCircuit(String nom,Circuit circuit){
		this.nom = nom;
		this.circuit = circuit;
	}

	@Override
	public void execute() {
		boolean ok = estValiderNom(nom);
		if(ok)
			circuit.ajouter();
	}

	public boolean estValiderNom(String nom2){
		return false;
	}

}

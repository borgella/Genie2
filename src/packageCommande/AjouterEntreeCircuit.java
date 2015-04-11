package packageCommande;

import inf5153emf.Circuit;

public class AjouterEntreeCircuit implements Commande {
	String nom;
	Circuit circuit;
	public AjouterEntreeCircuit(String nom){
		this.nom = nom;
		System.out.print("Le nom est:"+nom);
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

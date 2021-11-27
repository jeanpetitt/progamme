package fr.exercice6.question2;

import fr.exercice6.question1.Compte;

public class CompteEpargne extends Compte {

	public CompteEpargne(String numero, String proprietaire, int solde) {
		super(numero, proprietaire, solde);
		// TODO Auto-generated constructor stub
	}
	public void augmenterSolde(double taux) {
		double interet;
		interet = this.solde* taux;
		this.solde = (int) (this.solde + interet);
		System.out.println("le solde de votre compte vient de subir une augmentation de "+taux+"%");
		System.out.println("le solde du compte est desormais de "+this.solde+"$");
	}

}

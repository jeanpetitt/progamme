package fr.exercice6.question1;

import fr.exercice6.question3.CompteSecurise;

public class Compte implements CompteSecurise {
	private String numero;
	private String proprietaire;
	protected int solde;
	
	// constructeur
	public Compte(String numero, String proprietaire, int solde) {
		this.numero = numero;
		this.proprietaire = proprietaire;
		this.solde= solde;
	}
	// scanner s = new scanner(system.in)
	// methode pour enregistrer un depot
	public void depot(int montant) {
		this.solde += montant;
		System.out.println("Depot effectuer avec succes!! \nle solde de votre compte est de "+this.solde+"$");
		
	}
	// methode pour enregistrer le solde
	@Override
	public void retrait(int montant) {
		if(montant > this.solde) {
			System.out.println("votre solde est insuffisant");
		}
		else {
			this.solde -= montant;
			System.out.println("Retrait effectue avec succes \nle solde de votre compte est de "+this.solde+"$");
		}
		
		
	}
	
	
}

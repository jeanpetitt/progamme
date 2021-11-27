package fr.exercice4.question2;

import fr.exercice4.question1.Affichable;

public class Entier extends Affichable {
	int nombre;
	public Entier(int nombre) {
		this.nombre = nombre;
	}
	public void afficher() {
		System.out.println("je suis un entier de valeur "+this.nombre);
	}
}

package fr.exercice4.question2;

import fr.exercice4.question1.Affichable;

public class Flottant extends Affichable {
	double nombre;
	public Flottant(double nombre) {
		this.nombre = nombre;
	}
	public void afficher() {
		System.out.println("je suis un flottant de valeur "+this.nombre);
	}

}

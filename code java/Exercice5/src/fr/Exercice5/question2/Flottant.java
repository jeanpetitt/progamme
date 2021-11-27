package fr.Exercice5.question2;

import fr.Exercice5.question1.Affichable;

public class Flottant implements Affichable {
	double nombre;
	public Flottant(double nombre) {
		this.nombre = nombre;
	}

	@Override
	public void afficher() {
		System.out.println("je suis un flottant de valeur "+this.nombre);

	}

}

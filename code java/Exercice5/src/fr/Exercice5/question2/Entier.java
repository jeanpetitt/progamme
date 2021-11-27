package fr.Exercice5.question2;

import fr.Exercice5.question1.Affichable;

public class Entier implements Affichable {
	int nombre;
	public Entier(int nombre) {
		this.nombre = nombre;
	}
	@Override
	public void afficher() {
		System.out.println("je suis un entier de valeur "+this.nombre);

	}

}

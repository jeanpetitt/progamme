import fr.exercice4.question1.*;
import fr.exercice4.question2.*;

public class DemoExercice4 {

	public static void main(String[] args) {

		Affichable[] affiche;
		Affichable[] tableau;
		affiche = new Affichable[2];
		
		affiche[0] = new Flottant(1.25);
		affiche[1] = new Entier(25);
		for(int i = 0; i<affiche.length; i++) {
//			if(affiche[i] instanceof Entier) {
//				((Entier)affiche[i]).afficher();
//			}
//			else if(affiche[i] instanceof Flottant) {
//				((Flottant)affiche[i]).afficher();
//			}
			affiche[i].afficher();
		}	

	}

}

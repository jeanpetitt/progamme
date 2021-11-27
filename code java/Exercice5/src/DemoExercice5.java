import fr.Exercice5.question1.Affichable;
import fr.Exercice5.question2.*;

public class DemoExercice5 {

	public static void main(String[] args) {
		Affichable[] affiche;
		affiche = new Affichable[2];
		
		affiche[0] = new Flottant(1.25);
		affiche[1] = new Entier(25);
		for(int i = 0; i<affiche.length; i++) {
			affiche[i].afficher();
		}

	}

}

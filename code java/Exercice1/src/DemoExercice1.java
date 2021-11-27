import fr.Exercice1.question.*;

public class DemoExercice1 {

	public static void main(String[] args) {
		
		Point point = new Point(0, 0);
		
		// initialiser les coordonnees du point
		point.initialiser();
		System.out.println("\n");
		
		// modifier les coordonnees du point
		point.deplacer(4, 5);
		System.out.println("\n");
		
		// afficher les coordonnees du point
		point.afficher();

	}

}

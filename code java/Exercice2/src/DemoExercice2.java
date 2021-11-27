import fr.Exercice2.questions.*;

public class DemoExercice2 {

	public static void main(String[] args) {
		
		
		PointCol pointcol = new PointCol(0, 0, (byte) 1);
		// initialiser un point
		pointcol.initialiser();
		System.out.println("\n");
		
		// modifier les cordonnees d'un point
		pointcol.deplacer(19, 20);
		System.out.println("\n");
		
		// appel la methode affiche de la classe point pour afficher les coordonnees d'un point
		pointcol.afficher();
		System.out.println("\n");
		
		// methode colorer pour colorer un point
		pointcol.colorer((byte) 50);
		System.out.println("\n");
		
		// affiche les coordonnees d'un point et sa couleur
		
		pointcol.afficheCol();

	}

}

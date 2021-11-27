import fr.exercice6.question2.CompteEpargne;


public class DemoExercice6 {

	public static void main(String[] args) {
		
		// creation d'une instance compteEpargne car elle herite de Compte
		
		CompteEpargne compte = new CompteEpargne("110", "propr", 0);
		
		
		
		// l'utilsateur effectue un depot de 10000
		compte.depot(10000);
		System.out.println("\n");// son solde est donc desormais de 10000
		
		// il veut effectuer un retrait de 15000 or sold= 1000
		compte.retrait(15000);
		System.out.println("\n"); // oups solde insuffisant
		
		// il veut effectuer un retait de 8000
		compte.retrait(8000);
		System.out.println("\n"); // retrait reussi
		
		// aumenter le solde de l'utilisateur en fonction d'un certain taux
		compte.augmenterSolde(1.5);

	}

}

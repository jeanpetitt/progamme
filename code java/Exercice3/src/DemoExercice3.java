import fr.Exercice3.questions.*;

public class DemoExercice3 {

	public static void main(String[] args) {
		// on vas creer un tableau heterogene qui comporte les elements Point et PointCol
		Point[] tableau;
		
		tableau = new Point[2];
		tableau[0] = new Point(0, (byte) 0);
		tableau[1] = new PointCol(0, 0, (byte) 2);
		
		for(int i = 0; i <2; i++) {
			tableau[i].identifie();
		}

	}

}

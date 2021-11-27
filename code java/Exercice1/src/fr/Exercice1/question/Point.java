package fr.Exercice1.question;

public class Point {
	private int x;
	private int y;
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	// les getteurs de la classe 
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	
	//fonction initialiser
	public void initialiser() {
		this.x = 0;
		this.y = 0;
		System.out.println("je suis un point initialise a "+ this.x+" "+this.y);
		
	}
	// fonction deplacer pour modifier les coordonnees d'un point
	public void deplacer(int a, int b) {
		this.x += a;
		this.y += b;
		System.out.println("le point c'est deplacer en x ="+this.x+" et en y ="+this.y);
	}
	
	// fonction afficher un point
	public void afficher() {
		System.out.println("je suis un point de coordonnees "+this.x+" "+this.y);
		
	}

}

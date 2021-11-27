package fr.Exercice3.questions;

public class Point {
	protected int x;
	protected int y;
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
		System.out.println("je suis point initialise a "+ this.x+" "+this.y);
		
	}
	// fonction deplacer pour modifier les coordonnees d'un point
	public void deplacer(int a, int b) {
		this.x += a;
		this.y += b;
		System.out.println("le point c'est deplacer en x ="+this.x+" et en y ="+this.y);
	}
	
	// fonction afficher un point
	public void affiche() {
		System.out.println("je suis un point de coordonnees "+this.x+" "+this.y);
		
	}
	public void identifie() {
		System.out.println("je suis un point");
	}

}

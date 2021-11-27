package fr.Exercice3.questions;

public class PointCol extends Point {
	private byte couleur;

	public PointCol(int x, int y, byte couleur) {
		super(x, y);
		this.couleur = couleur;
		
	}
	// getteur 
	public byte getCouleur() {
		return this.couleur;
	}
	
	public void colorer(byte col) {
		this.couleur = col;
		
		System.out.println("je suis un point de couleur "+ this.couleur);
	}
	public void identifie() {
		System.out.println("je suis un point colorer de couleur "+this.couleur);
		
	}
	
}

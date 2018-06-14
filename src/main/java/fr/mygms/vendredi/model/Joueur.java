package fr.mygms.vendredi.model;

public class Joueur {

	private String nom;
	private int sante = 20;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public int getSante() {
		return sante;
	}
	public void setSante(int sante) {
		this.sante = sante;
	}
}

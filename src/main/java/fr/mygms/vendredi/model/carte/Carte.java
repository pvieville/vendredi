package fr.mygms.vendredi.model.carte;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import fr.mygms.vendredi.model.carte.pouvoir.Pouvoir;

@Component
@Scope("prototype")
public class Carte {

	private Pouvoir pouvoir;
	private String libelle;
	private int force;
	private int poids;
	
	public Pouvoir getPouvoir() {
		return pouvoir;
	}
	public void setPouvoir(Pouvoir pouvoir) {
		this.pouvoir = pouvoir;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public int getForce() {
		return force;
	}
	public void setForce(int force) {
		this.force = force;
	}
	public int getPoids() {
		return poids;
	}
	public void setPoids(int penalite) {
		this.poids = penalite;
	}
	
	@Override
	public String toString() {
		return "Carte [libelle=" + libelle + ", force=" + force + ", pouvoir=" + pouvoir + "]";
	}
}

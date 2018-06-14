package fr.mygms.vendredi.danger;

import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import fr.mygms.vendredi.model.carte.Carte;

@Component
@Scope("prototype")
public class Danger {

	private Map<Difficulte, Integer> puissance;
	private String libelle;
	private Carte carte;
	private int nbCartesGratuites;
	
	public Map<Difficulte, Integer> getPuissance() {
		return puissance;
	}
	public void setPuissance(Map<Difficulte, Integer> puissance) {
		this.puissance = puissance;
	}
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	public Carte getCarte() {
		return carte;
	}
	public void setCarte(Carte carte) {
		this.carte = carte;
	}
	public int getNbCartesGratuites() {
		return nbCartesGratuites;
	}
	public void setNbCartesGratuites(int nbCartesGratuites) {
		this.nbCartesGratuites = nbCartesGratuites;
	}
	
	@Override
	public String toString() {
		return "Danger [libelle=" + libelle + ", vie=" + puissance + ", carte=" + carte + "]";
	}
}

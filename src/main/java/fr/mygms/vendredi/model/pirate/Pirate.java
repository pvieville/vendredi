package fr.mygms.vendredi.model.pirate;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Pirate {

	private int vie;
	private int nbCartesGratuites;
	
	
	public int getVie() {
		return vie;
	}
	public void setVie(int vie) {
		this.vie = vie;
	}
	public int getNbCartesGratuites() {
		return nbCartesGratuites;
	}
	public void setNbCartesGratuites(int nbCartesGratuites) {
		this.nbCartesGratuites = nbCartesGratuites;
	}
}

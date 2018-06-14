package fr.mygms.vendredi.model.carte.pouvoir;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PouvoirNourriture extends PouvoirAbstract {

	private int nourriture;
	
	public int getNourriture() {
		return nourriture;
	}
	public void setNourriture(int nourriture) {
		this.nourriture = nourriture;
	}

	public void effet() {
		
	}
}

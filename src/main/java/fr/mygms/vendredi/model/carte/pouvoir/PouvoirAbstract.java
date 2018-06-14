package fr.mygms.vendredi.model.carte.pouvoir;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public abstract class PouvoirAbstract implements Pouvoir {

	protected String libelle;
	
	public String getLibelle() {
		return libelle;
	}
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public abstract void effet();
}

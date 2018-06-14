package fr.mygms.vendredi.builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.mygms.vendredi.model.carte.Carte;
import fr.mygms.vendredi.model.carte.pouvoir.Pouvoir;


@Service
@Scope("singleton")
public class CarteBuilder {
	
	@Autowired
    private ApplicationContext context;

	public Carte createCarte(String libelle, int force, int poids, Pouvoir pouvoir) {
		Carte carte = context.getBean(Carte.class);
		carte.setLibelle(libelle);
		carte.setForce(force);
		carte.setPouvoir(pouvoir);
		carte.setPoids(poids);
		return carte;
	}
	
	public Carte createCarte(String libelle, int force, Pouvoir pouvoir) {
		Carte carte = context.getBean(Carte.class);
		carte.setLibelle(libelle);
		carte.setForce(force);
		carte.setPouvoir(pouvoir);
		carte.setPoids(1);
		return carte;
	}
	
	public Carte createCarte(String libelle, Pouvoir pouvoir) {
		Carte carte = context.getBean(Carte.class);
		carte.setLibelle(libelle);
		carte.setForce(0);
		carte.setPouvoir(pouvoir);
		carte.setPoids(1);
		return carte;
	}
	
	public Carte createCarte(String libelle, int force) {
		Carte carte = context.getBean(Carte.class);
		carte.setLibelle(libelle);
		carte.setForce(force);
		carte.setPouvoir(null);
		carte.setPoids(1);
		return carte;
	}
	
	public Carte createCarte(String libelle) {
		Carte carte = context.getBean(Carte.class);
		carte.setLibelle(libelle);
		carte.setForce(0);
		carte.setPouvoir(null);
		carte.setPoids(1);
		return carte;
	}
}

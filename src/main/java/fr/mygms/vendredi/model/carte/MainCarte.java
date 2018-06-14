package fr.mygms.vendredi.model.carte;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class MainCarte {

	private List<Carte> listeCarte;

	public List<Carte> getListeCarte() {
		return listeCarte;
	}
	public void setListeCarte(List<Carte> listeCarte) {
		this.listeCarte = listeCarte;
	}
}

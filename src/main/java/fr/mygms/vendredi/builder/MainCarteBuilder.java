package fr.mygms.vendredi.builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.mygms.vendredi.model.carte.Carte;
import fr.mygms.vendredi.model.carte.MainCarte;
import fr.mygms.vendredi.model.carte.pouvoir.PouvoirAbstract;


@Service
@Scope("singleton")
public class MainCarteBuilder {
	
	@Autowired
    private ApplicationContext context;
	
	@Autowired
    private CarteBuilder carteBuilder;
	
	public MainCarte createMainBase(String libelle, int force, PouvoirAbstract pouvoir) {
		MainCarte mainCarte = context.getBean(MainCarte.class);
		mainCarte.setListeCarte(createMainBase());
		return mainCarte;
	}
	
	private List<Carte> createMainBase() {
		
		List<Carte> listeCartes = new ArrayList<>();
		// carte a 0
		listeCartes.add(carteBuilder.createCarte("Faible"));
		listeCartes.add(carteBuilder.createCarte("Faible"));
		listeCartes.add(carteBuilder.createCarte("Faible"));
		listeCartes.add(carteBuilder.createCarte("Faible"));
		listeCartes.add(carteBuilder.createCarte("Faible"));
		listeCartes.add(carteBuilder.createCarte("Faible"));
		listeCartes.add(carteBuilder.createCarte("Faible"));
		listeCartes.add(carteBuilder.createCarte("Faible"));
		listeCartes.add(carteBuilder.createCarte("Faible"));
		listeCartes.add(carteBuilder.createCarte("Faible"));
		listeCartes.add(carteBuilder.createCarte("Faible"));
		// carte a -1
		listeCartes.add(carteBuilder.createCarte("Distrait", -1));
		listeCartes.add(carteBuilder.createCarte("Distrait", -1));
		listeCartes.add(carteBuilder.createCarte("Distrait", -1));
		// carte a 1
		listeCartes.add(carteBuilder.createCarte("Concentré", 1));
		listeCartes.add(carteBuilder.createCarte("Concentré", 1));
		listeCartes.add(carteBuilder.createCarte("Concentré", 1));
		// carte a 2
		listeCartes.add(carteBuilder.createCarte("Ingénieux", 2));

		Collections.shuffle(listeCartes);
		return listeCartes;
	}
}

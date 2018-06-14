package fr.mygms.vendredi.builder;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.mygms.vendredi.danger.Danger;
import fr.mygms.vendredi.model.carte.Carte;
import fr.mygms.vendredi.model.carte.Difficulte;


@Service
@Scope("singleton")
public class DangerBuilder {
	
	@Autowired
    private ApplicationContext context;
	
	@Autowired
    private PuissanceDangerBuilder puissanceDangerBuilder;
	
	public Danger createDanger(String libelle, Map<Difficulte, Integer> puissance, int nbCartesGratuites, Carte carte) {
		Danger danger = context.getBean(Danger.class);
		danger.setLibelle(libelle);
		danger.setPuissance(puissance);
		danger.setNbCartesGratuites(nbCartesGratuites);
		danger.setCarte(carte);
		return danger;
	}
	
	public Danger createDanger(String libelle, int puissanceFacile, 
			int puissanceMoyen, int puissanceDifficile, int nbCartesGratuites, Carte carte) {
		Danger danger = context.getBean(Danger.class);
		danger.setLibelle(libelle);
		danger.setPuissance(puissanceDangerBuilder.createPuissanceDanger(puissanceFacile, puissanceMoyen, puissanceDifficile));
		danger.setNbCartesGratuites(nbCartesGratuites);
		danger.setCarte(carte);
		return danger;
	}
}

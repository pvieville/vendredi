package fr.mygms.vendredi.builder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.mygms.vendredi.model.carte.pouvoir.Pouvoir;
import fr.mygms.vendredi.model.carte.pouvoir.PouvoirNourriture;


@Service
@Scope("singleton")
public class PouvoirBuilder {
	
	@Autowired
    private ApplicationContext context;
	
	public Pouvoir createPouvoirNourriture(int nourriture) {
		PouvoirNourriture pouvoir = context.getBean(PouvoirNourriture.class);
		pouvoir.setNourriture(nourriture);
		pouvoir.setNourriture(nourriture);
		return pouvoir;
	}
}

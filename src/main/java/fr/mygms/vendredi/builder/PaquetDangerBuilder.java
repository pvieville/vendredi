package fr.mygms.vendredi.builder;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.mygms.vendredi.danger.Danger;
import fr.mygms.vendredi.danger.PaquetDanger;


@Service
@Scope("singleton")
public class PaquetDangerBuilder {
	
	@Autowired
    private ApplicationContext context;
	
	@Autowired
    private DangerBuilder dangerBuilder;
	
	@Autowired
    private CarteBuilder carteBuilder;
	
	@Autowired
    private PouvoirBuilder pouvoirBuilder;
	
	public PaquetDanger createPaquetDanger() {
		PaquetDanger paquetDanger = context.getBean(PaquetDanger.class);
		paquetDanger.setListeDangers(createMainBase());
		return paquetDanger;
	}
	
	private List<Danger> createMainBase() {
		
		List<Danger> listeDangers = new ArrayList<>();
		listeDangers.add(
				dangerBuilder.createDanger("Explorer l'île", 1, 3, 6, 2, 
						carteBuilder.createCarte("Nourriture", 1, 1, pouvoirBuilder.createPouvoirNourriture(1))));
		listeDangers.add(
				dangerBuilder.createDanger("Explorer l'île", 1, 3, 6, 2, 
						carteBuilder.createCarte("Nourriture", 1, 1, pouvoirBuilder.createPouvoirNourriture(1))));
		
		Collections.shuffle(listeDangers);
		return listeDangers;
		
	}
}

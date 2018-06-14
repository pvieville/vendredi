package fr.mygms.vendredi.builder;
import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import fr.mygms.vendredi.danger.Difficulte;


@Service
@Scope("singleton")
public class PuissanceDangerBuilder {
	
	public Map<Difficulte, Integer> createPuissanceDanger(int puissanceFacile, int puissanceMoyen, int puissanceDifficile) {
		Map<Difficulte, Integer> mapVieDanger = new HashMap<>();
		mapVieDanger.put(Difficulte.FACILE, puissanceFacile);
		mapVieDanger.put(Difficulte.MOYEN, puissanceMoyen);
		mapVieDanger.put(Difficulte.DIFFICILE, puissanceDifficile);
		return mapVieDanger;
	}
}

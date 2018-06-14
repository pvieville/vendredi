package fr.mygms.vendredi.danger;

import java.util.List;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class PaquetDanger {

	private List<Danger> listeDangers;

	public List<Danger> getListeDangers() {
		return listeDangers;
	}
	public void setListeDangers(List<Danger> listeDangers) {
		this.listeDangers = listeDangers;
	}
}

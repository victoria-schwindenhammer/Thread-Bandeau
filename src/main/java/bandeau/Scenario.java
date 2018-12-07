package bandeau;

/**
 * Un scenario memorise une liste d'effets, et le nombre de repetitions pour chaque effet Un scenario sait se jouer sur
 * un bandeau.
 */
import java.util.List;
import java.util.LinkedList;

class ScenarioElement {

	Effect effect;
	int repeats;

	ScenarioElement(Effect e, int r) {
		effect = e;
		repeats = r;
	}
}

public class Scenario {

	private final List<ScenarioElement> myElements = new LinkedList<>();

	/**
	 * Ajouter un effect au scenario.
	 *
	 * @param e l'effet a� ajouter
	 * @param repeats le nombre de repetitions pour cet effet
	 */
	public void addEffect(Effect e, int repeats) {
		myElements.add(new ScenarioElement(e, repeats));
	}

	/**
	 * Jouer ce scenario sur un bandeau
	 *
	 * @param b le bandeau ou s'afficher.
	 */
	public void playOn(Bandeau b) {
		for (ScenarioElement element : myElements) {
			for (int repeats = 0; repeats < element.repeats; repeats++) {
				element.effect.playOn(b);
			}
		}
	}
}

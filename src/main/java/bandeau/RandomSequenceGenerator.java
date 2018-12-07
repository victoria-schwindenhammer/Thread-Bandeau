package bandeau;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

/**
 * RandomSequenceGenerator génère tous les entiers de 0 (inclus) à max (exclus) 
 * dans un ordre aléatoire
 */
public class RandomSequenceGenerator {

	private final ArrayList<Integer> myIntegers;

	public RandomSequenceGenerator(int max) {
		myIntegers = new ArrayList<>();
		for (int i = 0; i < max; i++) {
			myIntegers.add(i);
		}
		Collections.shuffle(myIntegers);
	}

	public List<Integer> integers() {
		return Collections.unmodifiableList(myIntegers);
	}
}

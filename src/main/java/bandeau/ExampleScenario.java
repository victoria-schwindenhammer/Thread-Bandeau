package bandeau;

public class ExampleScenario {

	/**
	 * "Programme principal" : point d'entr�e d'ex�cution
	 *
	 * @param args les "arguments de ligne de commande", transmis au lancement du programme
	 */
	public static void main(String[] args) {
		String message;
		if (args.length > 0) // J'ai au moins un param�tre
		{
			message = args[0]; // le premier param�tre
		} else {
			message = "Je m'affiche caractere par caractere";
		}

		ExampleScenario instance = new ExampleScenario();
		instance.exemple(message);
	}

	public void exemple(String message) {
		// On cree un scenario
		Scenario s = new Scenario();
		// On lui ajoute des effets
		//s.addEffect(new FontEnumerator(10), 1);
		s.addEffect(new RandomEffect("Le jeu du pendu", 700), 1);
		s.addEffect(new TeleType(message, 100), 1);
		s.addEffect(new Blink("Je clignote 10x", 100), 10);
		s.addEffect(new Zoom("Je zoome", 50), 1);
		//s.addEffect(new Rainbow("Comme c'est joli !", 30), 1);
		s.addEffect(new Rotate("Je fais 2 tours"), 2);
		// On cree le bandeau
		Bandeau b = new Bandeau();
		b.sleep(5000);
		// On joue le scenario sur le bandeau
		s.playOn(b);
	}

}

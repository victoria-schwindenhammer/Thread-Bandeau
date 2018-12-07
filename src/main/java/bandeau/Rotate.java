package bandeau;

/**
 * Un effet qui fait faire un tour complet au texte
 */
public class Rotate extends Effect {

	public Rotate(String message) {
		super(message);
	}

	@Override
	public void playOn(Bandeau b) {
		super.init(b);
		Double old = b.getRotation();
		for (int theta = 0; theta < 360; theta += 10) {
			b.setRotation(Math.toRadians(theta));
			b.sleep(50);
		}
		b.setRotation(old);
	}
}

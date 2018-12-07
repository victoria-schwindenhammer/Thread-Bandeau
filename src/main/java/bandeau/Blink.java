package bandeau;

/**
 * Un effet qui clignote le texte une fois, avec un delai à specifier
 */
public class Blink extends Effect {

    private final int myDelay;

    public Blink(String message, int delay) {
        super(message);
        myDelay = delay;
    }

    public void playOn(Bandeau bandeau) {
        super.init(bandeau);
        String message = bandeau.getMessage();
        bandeau.setMessage("");
        bandeau.sleep(myDelay);
        bandeau.setMessage(message);
        bandeau.sleep(myDelay);
    }
        
}

package bandeau;

import java.awt.Font;
/**
 * Un effet qui affiche les caracteres du message un par un
 * dans un style qui rappelle l'affichage du "jeu du pendu" :
 * Au d�part, tous les caract�res du message sont affich�s par un trait de soulignement "_"
 * Les caract�res du message sont ensuite r�v�l�s un par un, dans un ordre al�atoire.
 * Cet effet doit fonctionner correctement, quelle que soit la longueur du message � afficher
 */
public class RandomEffect extends Effect {
    private final int myDelay;
    private RandomSequenceGenerator myRandom;
    public RandomEffect(String message, int delay) {
        super(message);
        myDelay = delay;
}

    public void playOn(Bandeau b) {
        super.init(b);
        Font initial = b.getFont();
        String message = b.getMessage();
        StringBuffer display = new StringBuffer();
        
        for (int i = 0; i < message.length(); i++)
            display.append("_");
        
        myRandom = new RandomSequenceGenerator(message.length());
        b.setFont(new Font("Monospaced", Font.BOLD, 25));
        b.setMessage(display.toString());
        b.sleep(myDelay);        
        for (Integer i : myRandom.integers()) {
            display.setCharAt(i, message.charAt(i));
            b.setMessage(display.toString());
            b.sleep(myDelay);
        }
        b.setFont(initial);
    }
}

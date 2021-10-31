/**
 * Classe <code>RandomBot</code> : classe du bot aléatoire.
 * @author Théo Chollet
 * @version 1.0
 */
public class RandomBot implements BotAPI {
    // Attributs

    /**
     * Constructeur du Bot.
     */
    public RandomBot() {
        // Appel de la classe mère
        super();
    }

    /**
     * Méthode qui permet de jouer un coup.
     * @param grid Grille sur laquelle le Bot va jouer.
     * @return Coordonnées [x, y] du coup à jouer.
     */
    public int[] playMove(Grid grid) {
        // Demande à la grille de calculer un bloc disponible aléatoire
        return grid.getRandomBlock();
    }
}
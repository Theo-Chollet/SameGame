/**
 * Classe <code>RandomBot</code> : classe du bot glouton.
 * @author Théo Chollet
 * @version 1.0
 */
public class GreedyBot {
    // Attributs

    /**
     * Méthode qui permet de jouer un coup.
     * @param grid Grille sur laquelle le Bot va jouer.
     * @return Coordonnées [x, y] du coup à jouer.
     */
    public int[] playMove(Grid grid) {
        /**
         * Pour tester :
         GreedyBot greedyBot = new GreedyBot();
         int[] block = greedyBot.playMove(grid);
         System.out.println("" + block[0] + ", " + block[1]);
         */

        // Demande à la grille de calculer un bloc disponible aléatoire
        return grid.getBestGroup();
    }
}
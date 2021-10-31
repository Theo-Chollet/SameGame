public interface BotAPI {
    /**
     * Méthode qui permet de jouer un coup.
     * @param grid Grille sur laquelle le Bot va jouer.
     * @return Coordonnées [x, y] du coup à jouer.
     */
    public int[] playMove(Grid grid);
}

/** Interface utilisée par le moteur du jeu
 *
 * */
public interface GridAPI {
    /**
     * Retourne si un bloc est vide.
     * @param x : L'index de ligne.
     * @param y : L'index de colonne.
     * @return true si bolc vide, false sinon.
     */
    public boolean estVide(int x, int y);

    /**
     * Retourne le gain d'un bloc dans un groupe.
     * @param x : L'index de ligne.
     * @param y : L'index de colonne.
     * @return Le gain du groupe de bloc.
     */
    public int nbPoints(int x, int y);

    /**
     * Retourne le score total.
     * @return Le score total.
     */
    public int getScore();

    /**
     * Retourne la taille de la grille en X.
     * @return La taille de la grille en X.
     */
    public int getSizeX();

    /**
     * Retourne la taille de la grille en Y.
     * @return La taille de la grille en Y.
     */
    public int getSizeY();
}
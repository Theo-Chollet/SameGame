/**
 * Classe <code>GameButtons</code> : énumération des boutons du jeu.
 * @author Théo Chollet
 * @version 1.0
 */
public enum GameButtons {
    // Enumération des blocs
    NEW_GAME    ("Nouvelle partie"),
    RANDOM_BOT  ("Bot aléatoire"),
    GREEDY_BOT  ("Bot glouton"),
    SAVE        ("Sauvegarder"),
    LOAD        ("Charger"),
    DARK_MODE   ("Mode clair/sombre"),
    QUIT        ("Quitter");

    // Attributs
    private final String text;

    /**
     * Constructeur du bouton de base.<br>
     * @param text Le texte du bouton.
     */
    GameButtons(String text) {
        // MAJ des attributs
        this.text = text;
    }

    // Méthode qui retourne le text du bouton
    public String text() {
        return text;
    }
}
import javax.swing.*;
import java.awt.*;

/**
 * Classe <code>GameMenuPanel</code> : panneau du Menu de jeu.
 * @author Théo Chollet, Tomy Da Rocha
 * @version 1.0
 */
public class GameMenuPanel extends GamePanel {
    // Boutons
    private JButton[] menuButtons;
    // Titre des boutons
    private String[] buttonsNames;

    /**
     * Constructeur du Menu de jeu.
     *     Définition du nombre et du nom des boutons.
     * @param mainWindow : La fenêtre principale.
     */
    public GameMenuPanel(MainWindow mainWindow) {
        // Appel de la classe mère
        super(mainWindow);

        // Tableau de boutons
        this.menuButtons = new BaseButton[GameButtons.values().length];

        // Ecouteur : gestionnaire d'actions
        GameMenuEvents action = new GameMenuEvents(this.mainWindow);

        // On crée un bouton dans chacune des cases du tableau de boutons
        // puis on les ajoute à la fenêtre
        int btnIdx = 0;
        for (GameButtons btn : GameButtons.values()) {
            // Création du bouton
            this.menuButtons[btnIdx] = new BaseButton(btn, action);

            // Ajout du bouton à la fenêtre
            this.add(this.menuButtons[btnIdx]);

            // Incrément du compteur de boutons
            btnIdx++;
        }
    }

    /**
     * Méthode qui passe le panneau en mode "<b>Sombre</b>" ou "<b>clair</b>".
     * @param darkMode : true si sombre, false pour clair.
     */
    public void setDarkMode(boolean darkMode) {
        // Appel de la classe mère
        super.setDarkMode(darkMode);

        // Les couleurs à régler
        Color btnBackColor;
        Color btnForeColor;

        // Selon le mode
        if (darkMode) {
            btnBackColor = Defines.DARK_BUTTON;
            btnForeColor = Defines.DARK_FOREGROUND;
        }
        else {
            btnBackColor = Defines.LIGHT_BUTTON;
            btnForeColor = Defines.LIGHT_FOREGROUND;
        }

        // Pour tous les boutons
        for (int i = 0; i < this.menuButtons.length; i++) {
            this.menuButtons[i].setBackground(btnBackColor);
            this.menuButtons[i].setForeground(btnForeColor);
        }
    }
}
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.io.File;

/**
 * Classe <code>GameMenuEvents</code> définissant les différents évènements souris
 * sur les boutons du Menu de jeu.
 * @author Théo Chollet, Tomy Da Rocha
 * @version 1.0
 */
public class GameMenuEvents implements MouseListener {
    // La fenêtre principale
    private MainWindow mainWindow;

    /**
     * Constructeur des évènements du Menu de jeu.
     * @param mainWindow La fenêtre principale.
     */
    public GameMenuEvents(MainWindow mainWindow) {
        // Fenêtre princiaple
        this.mainWindow = mainWindow;
    }

    /**
     * Méthode du clic souris.
     *      <ul>
     *      Bouton "<i>Nouvelle partie</i>":
     *      <li>Calcul d'une grille aléatoire.</li>
     *      <li>Mise à jour de la grille.</li>
     *      <li>Mise à jour du score et du gain.</li>
     *      <li>Affichage de la nouvelle grille.</li>
     *      </ul>
     *
     *      <ul>
     *      Bouton "<i>Sauvegarder</i>":
     *      <p>Sauvegarde sous la forme "date <b>+</b> heure <b>+</b> .grid".</p>
     *      <li>Affiche un message de confirmation ou d'erreur.</li>
     *      </ul>
     *
     *      <ul>
     *      Bouton "<i>Charger</i>":
     *      <li>Choix d'un fichier à charger.</li>
     *      <li>Si erreur -> affiche un message.</li>
     *      <li>Mise à jour de la grille.</li>
     *      <li>Mise à jour du score et du gain.</li>
     *      <li>Affichage de la nouvelle grille.</li>
     *      </ul>
     *
     *      <ul>
     *      Bouton "<i>Mode clair/sombre</i>":
     *      <li>Mise à jour des panneaux selon le mode.</li>
     *      </ul>
     *
     *      <ul>
     *      Bouton "<i>Quitter</i>":
     *      <li>Fermeture du jeu.</li>
     *      </ul>
     * @param event L'évènement.
     */
    @Override
    public void mouseClicked(MouseEvent event) {
    }

    /**
     * Méthode sur appui souris, ne fait rien ici.
     */
    @Override
    public void mousePressed(MouseEvent event) {
    }

    /**
     * Méthode sur relachement de la souris, ne fait rien ici.
     */
    @Override
    public void mouseReleased(MouseEvent event) {
        // Bouton cliqué
        BaseButton buttonClicked = (BaseButton) event.getSource();

        // Exécution de l'action
        buttonClicked.executeAction(this.mainWindow);
    }

    /**
     * Méthode appelée lors du survol de la souris, ne fait rien ici.
     */
    @Override
    public void mouseEntered(MouseEvent event) {
    }

    /**
     * Méthode sur sortie de la souris, ne fait rien ici.
     */
    @Override
    public void mouseExited(MouseEvent event) {
    }
}
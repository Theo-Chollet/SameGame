// Importation des bibliothèques graphiques

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.awt.event.MouseListener;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

// Classe BaseButton : desc.
public class BaseButton extends JButton {
    // Attributs
    // Le bouton
    GameButtons btn;

    /**
     * Constructeur du type de bloc selon le caractère et le chemin de l'image.<br>
     * @param btn Le caractère de bloc.
     * @param action Le chemin de l'image.
     */
    BaseButton(GameButtons btn, MouseListener action) {
        // Appel de la classe mère
        super(btn.text());

        // MAJ des attributs
        this.btn = btn;

        // Ajout d'un écouteur
        this.addMouseListener(action);
    }

    //
    public void executeAction(MainWindow mainWindow) {
        // Retour de la boîte de dialogue de choix de fichier
        int returnVal;

        // Boite de dialogue de choix de fichier
        JFileChooser fileChooser = new JFileChooser(Defines.SAVE_PATH);
        // Extensions de fichiers (.grid)
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "SameGame GRID file", Defines.GRID_FILE_EXT);
        // Ajoute un filtre d'extension
        fileChooser.setFileFilter(filter);

        // Calcul du nom de fichier
        // Date et heure (sauvegarde)
        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss");
        Date date = new Date();

        // Sauvegarde au format : date + heure + extension
        String fileName = Defines.SAVE_PATH + format.format(date) + "." + Defines.GRID_FILE_EXT;

        // Nouvelle partie
        if (this.btn == GameButtons.NEW_GAME) {
            // Demande la création d'une nouvelle partie
            mainWindow.newGame();
        }
        // Bot aléatoire
        else if (this.btn == GameButtons.RANDOM_BOT) {
            // Demande au bot aléatoire de jouer un tour
            mainWindow.startRandomBot();
        }
        // Bot glouton
        else if (this.btn == GameButtons.GREEDY_BOT) {
            // Demande au bot glouton de jouer un tour
            mainWindow.startGreedyBot();
        }
        // Sauvegarder une partie
        else if (this.btn == GameButtons.SAVE) {
            // Demande de sauvegarde de la partie dans un fichier
            fileChooser.setDialogTitle("Sauver une partie");
            fileChooser.setSelectedFile(new File(fileName));

            // Affichage de la boite de dialogue
            returnVal = fileChooser.showSaveDialog(mainWindow);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                // Fichier à sauver
                File selectedFile = fileChooser.getSelectedFile();

                // Demande de sauvegarde de fichier
                mainWindow.saveFileGrid(selectedFile.getAbsolutePath());
            }
        }
        // Charger une partie
        else if (this.btn == GameButtons.LOAD) {
            // Demande de chargement de la partie depuis un fichier
            fileChooser.setDialogTitle("Charger une partie");

            // Affichage de la boite de dialogue
            returnVal = fileChooser.showOpenDialog(mainWindow);
            if (returnVal == JFileChooser.APPROVE_OPTION) {
                // Fichier à charger
                File selectedFile = fileChooser.getSelectedFile();

                // Demande de chargement de fichier
                mainWindow.loadFileGrid(selectedFile.getAbsolutePath());
            }
        }
        // Mode sombre
        else if (this.btn == GameButtons.DARK_MODE) {
            // Demande de changement de mode
            mainWindow.askChangeMode();
        }
        // Quitter
        else if (this.btn == GameButtons.QUIT) {
            // On quitte la fenêtre principale
            mainWindow.dispose();
        }
    }
}
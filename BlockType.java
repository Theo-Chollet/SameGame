// Importation des bibliothèques graphiques

import javax.swing.*;
import java.awt.*;

// Classe BlockType : desc.
public enum BlockType {
    // Enumération des blocs
    RED   ('R', "img/rouge.png"),
    GREEN ('G', "img/vert.png"),
    BLUE  ('B', "img/bleu.png"),
    EMPTY (' ', "img/empty.png");

    // Attributs
    private final char carac;
    private final String image_path;

    /**
     * Constructeur du type de bloc selon le caractère et le chemin de l'image.<br>
     * @param carac Le caractère de bloc.
     * @param image_path Le chemin de l'image.
     */
    BlockType(char carac, String image_path) {
        this.carac = carac;
        this.image_path = image_path;
    }

    private char carac() {
        return this.carac;
    }
    private String image_path() {
        return this.image_path;
    }
}
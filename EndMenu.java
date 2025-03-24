import java.awt.Font;

import MG2D.*;
import MG2D.audio.Bruitage;
import MG2D.geometrie.*;

public class EndMenu {
    private Fenetre window;
    private Texte winnerText;
    private Rectangle mainMenuButton;
    private Rectangle mainMenuButtonBorder;
    private Texte mainMenuText;
    private Souris mouse;
    private Bruitage clicSound;

    /**
     * Constructeur par défaut qui définit que le joueur 1 à gagné
     */
    public EndMenu() {
        this.window = new Fenetre("Echekémons - Fin du jeu", 675, 400);
        this.mouse = this.window.getSouris();
        this.mainMenuButton = new Rectangle(Couleur.GRIS_CLAIR, new Point(150, 100), new Point(525, 200), 50, 50, true);
        this.mainMenuButtonBorder = new Rectangle(Couleur.NOIR, new Point(150, 100), new Point(525, 200), 50, 50);
        this.mainMenuText = new Texte(Couleur.NOIR, "Menu principal", new Font("Ubuntu", Font.BOLD, 30), new Point(this.mainMenuButton.getA().getX()+this.mainMenuButton.getLargeur()/2, this.mainMenuButton.getA().getY()+this.mainMenuButton.getHauteur()/2));
        this.winnerText = new Texte(Couleur.NOIR, "Félicitations au joueur 1 qui gagne la partie !", new Font("Ubuntu", Font.BOLD, 30), new Point(this.window.getWidth()/2, 300));
    }

    /**
     * Constructeur prenant le gagnant de la partie en paramètre et indique qu'il a gagné
     * @param winner Gagnant de la partie
     */
    public EndMenu(int winner) {
        this();
        this.winnerText = new Texte(Couleur.NOIR, "Félicitations au joueur " + winner + " qui gagne la partie !", new Font("Ubuntu", Font.BOLD, 30), new Point(this.window.getWidth()/2, 300));
    }

    /**
     * Méthode run pour lancer le menu
     */
    public void run() {
        this.drawMenu();

        boolean running = true;

        while (running) {
            try {
                Thread.sleep(5);
            } catch (Exception e) {}

            if (this.mouse.getClicGauche()) {
                if (this.mouse.getPosition().intersection(this.mainMenuButton)) {
                    this.clicSound = new Bruitage("sounds/click.mp3");
                    this.clicSound.lecture();
                    running = false;
                }
            }
        }
        this.window.fermer();
    }

    /**
     * Méthode pour dessiner tous les éléments du menu
     */
    public void drawMenu() {
        this.window.setBackground(new Couleur(0, 150, 255));
        this.window.ajouter(winnerText);
        this.window.ajouter(mainMenuButton);
        this.window.ajouter(mainMenuButtonBorder);
        this.window.ajouter(mainMenuText);
        this.window.rafraichir();
    }
}

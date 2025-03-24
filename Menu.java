import MG2D.*;
import MG2D.audio.Bruitage;
import MG2D.geometrie.*;
import java.awt.Font;

public class Menu {
    private Fenetre window;
    private Souris mouse;
    private Texture title;
    private Rectangle firstButtonBorder;
    private Rectangle secondButtonBorder;
    private Rectangle firstButton;
    private Rectangle secondButton;
    private Texte playText;
    private Texte quitText;
    private Texte twoPlayersText;
    private Texte fourPlayersText;
    private Texte defaultText;
    private Texte persoText;
    private Bruitage clicSound;

    /**
     * Constructeur par défaut créant le menu principal du jeu
     */
    public Menu() {
        this.window = new Fenetre("Echekémons - Menu principal", 675, 875);
        this.mouse = this.window.getSouris();
        this.title = new Texture("images/titre.png", new Point(100 ,675), 475, 100);
        this.firstButton = new Rectangle(Couleur.GRIS_CLAIR, new Point(150, 400), new Point(525, 500), 50, 50, true);
        this.secondButton = new Rectangle(Couleur.GRIS_CLAIR, new Point(150, 200), new Point(525, 300), 50, 50, true);
        this.firstButtonBorder = new Rectangle(Couleur.NOIR, new Point(150, 400), new Point(525, 500), 50, 50);
        this.secondButtonBorder = new Rectangle(Couleur.NOIR, new Point(150, 200), new Point(525, 300), 50, 50);
        this.playText = new Texte(Couleur.NOIR, "Jouer", new Font("Ubuntu", Font.BOLD, 45), new Point(this.firstButton.getA().getX()+this.firstButton.getLargeur()/2, this.firstButton.getA().getY()+this.firstButton.getHauteur()/2));
        this.quitText = new Texte(Couleur.NOIR, "Quitter", new Font("Ubuntu", Font.BOLD, 45), new Point(this.secondButton.getA().getX()+this.secondButton.getLargeur()/2, this.secondButton.getA().getY()+this.secondButton.getHauteur()/2));
        this.twoPlayersText = new Texte(Couleur.NOIR, "2 Joueurs", new Font("Ubuntu", Font.BOLD, 40), this.playText.getA());
        this.fourPlayersText = new Texte(Couleur.NOIR, "4 Joueurs", new Font("Ubuntu", Font.BOLD, 40), this.quitText.getA());
        this.defaultText = new Texte(Couleur.NOIR, "Plateau par défaut", new Font("Ubuntu", Font.BOLD, 30), this.playText.getA());
        this.persoText = new Texte(Couleur.NOIR, "Plateau personnalisé (JSON)", new Font("Ubuntu", Font.BOLD, 25), this.quitText.getA());
    }

    /**
     * Méthode run pour lancer et faire tourner le menu
     * @return Informations nécessaires pour lancer une partie
     */
    public int[] run() {
        int[] res = new int[2];
        this.drawFirstMenu();

        boolean mainMenu = true;

        while (mainMenu) {
            try {
                Thread.sleep(5);
            } catch (Exception e) {}
            
            if (this.mouse.getClicGauche()) {
    
                if (this.mouse.getPosition().intersection(firstButton)) {

                    this.playClickSound();
                    this.drawSecondMenu();

                    boolean playersMenu = true;

                    while (playersMenu) {
                        try {
                            Thread.sleep(5);
                        } catch (Exception e) {}
                        
                        if (this.mouse.getClicGauche()) {
                            boolean plateauMenu = false;

                            if (this.mouse.getPosition().intersection(firstButton)) {
                                res[0] = 2;

                                this.playClickSound();
                                this.drawThirdMenu();

                                plateauMenu = true;
                            }
                
                            if (this.mouse.getPosition().intersection(secondButton)) {
                                res[0] = 4;

                                this.playClickSound();
                                this.drawThirdMenu();

                                plateauMenu = true;
                            }

                            while (plateauMenu) {
                                try {
                                    Thread.sleep(5);
                                } catch (Exception e) {}

                                if (this.mouse.getClicGauche()) {
                                    if (this.mouse.getPosition().intersection(firstButton)) {
                                        this.playClickSound();
                                        res[1] = 0;
                                        this.window.fermer();
                                        return res;
                                    }

                                    if (this.mouse.getPosition().intersection(secondButton)) {
                                        this.playClickSound();
                                        res[1] = 1;
                                        this.window.fermer();
                                        return res;
                                    }
                                }
                            }
                        }
                    }
                }

                if (this.mouse.getPosition().intersection(secondButton)) {
                    this.playClickSound();
                    this.window.fermer();
                    mainMenu = false;
                }
            }
        }
        res[1] = -1;
        return res;
    }

    /**
     * Méthode pour déssiner la première partie du menu
     */
    public void drawFirstMenu() {
        this.window.setBackground(new Couleur(0, 150, 255));
        this.window.ajouter(this.title);
        this.window.ajouter(this.firstButton);
        this.window.ajouter(this.secondButton);
        this.window.ajouter(this.firstButtonBorder);
        this.window.ajouter(this.secondButtonBorder);
        this.window.ajouter(this.playText);
        this.window.ajouter(this.quitText);
        this.window.rafraichir();
    }

    /**
     * Méthode pour déssiner la deuxième partie du menu
     */
    public void drawSecondMenu() {
        this.window.supprimer(playText);
        this.window.supprimer(quitText);
        this.window.ajouter(this.twoPlayersText);
        this.window.ajouter(this.fourPlayersText);
        this.window.rafraichir();
    }

    /**
     * Méthode pour déssiner la troisième partie du menu
     */
    public void drawThirdMenu() {
        this.window.supprimer(twoPlayersText);
        this.window.supprimer(fourPlayersText);
        this.window.ajouter(this.defaultText);
        this.window.ajouter(this.persoText);
        this.window.rafraichir();
    }

    /**
     * Méthode pour créer et jouer le son du clic
     */
    public void playClickSound() {
        this.clicSound = new Bruitage("sounds/click.mp3");
        this.clicSound.lecture();
    }
}

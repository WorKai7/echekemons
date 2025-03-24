import MG2D.*;
import MG2D.audio.Bruitage;
import MG2D.geometrie.*;
import java.awt.Font;
import java.util.ArrayList;

/**
 * Classe partie représentant une partie du jeu
 */
public class Partie {
    private Fenetre window;
    private Souris mouse;
    private Plateau plateau;
    private Carre plateauGraphique;
    private Rectangle panneauTexte;
    private Rectangle panneauTexteBorder;
    private ArrayList<Texte> textes;
    private ArrayList<Integer> players;
    private int playersNumber;
    private Bruitage moveSound;
    private Bruitage attackSound;
    private Bruitage deathSound;
    private Bruitage loseSound;

    /**
     * Constructeur par défaut : initialise le plateau par défaut et lance la partie pour 2 joueurs
     */
    public Partie() {
        this.players = new ArrayList<Integer>();
        this.players.add(1);
        this.players.add(2);
        this.playersNumber = 2;
        this.window = new Fenetre("Echekémons - Jeu", 675, 875);
        this.mouse = this.window.getSouris();
        this.plateau = new Plateau();
        this.panneauTexte = new Rectangle(Couleur.GRIS_CLAIR, new Point(50, 700), new Point(625, 850), 50, 50, true);
        this.panneauTexteBorder = new Rectangle(Couleur.NOIR, new Point(50, 700), new Point(625, 850), 50, 50);
        this.textes = new ArrayList<Texte>();
        this.textes.add(new Texte(Couleur.ROUGE, "Au joueur 1 de jouer", new Font("Arial", Font.BOLD, 50), new Point(this.window.getWidth()/2, 775)));
        this.textes.add(new Texte(Couleur.VERT, "Au joueur 2 de jouer", new Font("Arial", Font.BOLD, 50), new Point(this.window.getWidth()/2, 775)));
        this.textes.add(new Texte(Couleur.JAUNE, "Au joueur 3 de jouer", new Font("Arial", Font.BOLD, 50), new Point(this.window.getWidth()/2, 775)));
        this.textes.add(new Texte(Couleur.BLEU, "Au joueur 4 de jouer", new Font("Arial", Font.BOLD, 50), new Point(this.window.getWidth()/2, 775)));
        this.plateauGraphique = new Carre(Couleur.BLANC, new Point(0, 0), 675, true);
    }

    /**
     * Constructeur prenant en paramètres le nombre de joueurs et la personnalisation du plateau
     * @param nbJoueurs Nombre de joueurs
     * @param perso true : plateau perso | false : plateau par défaut
     * @throws Exception
     */
    public Partie(int nbJoueurs, boolean perso) throws Exception {
        this.playersNumber = nbJoueurs;
        this.players = new ArrayList<Integer>();

        String[] fichiers = new String[this.playersNumber];
        for (int i = 1; i <= this.playersNumber; i++) {
            this.players.add(i);
            if (perso) {
                fichiers[i-1] = "data/j" + i + ".json";
            }
        }

        if (perso) {
            this.plateau = new Plateau(fichiers, this.playersNumber);
        } else {
            this.plateau = new Plateau(this.playersNumber);
        }

        this.window = new Fenetre("Echekémons - Jeu", 675, 875);
        this.mouse = this.window.getSouris();
        this.panneauTexte = new Rectangle(Couleur.GRIS_CLAIR, new Point(50, 700), new Point(625, 850), 50, 50, true);
        this.panneauTexteBorder = new Rectangle(Couleur.NOIR, new Point(50, 700), new Point(625, 850), 50, 50);
        this.textes = new ArrayList<Texte>();
        this.textes.add(new Texte(Couleur.ROUGE, "Au joueur 1 de jouer", new Font("Arial", Font.BOLD, 50), new Point(this.window.getWidth()/2, 775)));
        this.textes.add(new Texte(Couleur.VERT, "Au joueur 2 de jouer", new Font("Arial", Font.BOLD, 50), new Point(this.window.getWidth()/2, 775)));
        this.textes.add(new Texte(Couleur.JAUNE, "Au joueur 3 de jouer", new Font("Arial", Font.BOLD, 50), new Point(this.window.getWidth()/2, 775)));
        this.textes.add(new Texte(Couleur.BLEU, "Au joueur 4 de jouer", new Font("Arial", Font.BOLD, 50), new Point(this.window.getWidth()/2, 775)));
        this.plateauGraphique = new Carre(Couleur.BLANC, new Point(0, 0), 675, true);
    }

    /**
     * Méthode run pour lancer la partie
     */
    public int run() {

        this.drawScreen();

        // Initialisation de variables utiles à la boucle du jeu
        boolean running = true;
        boolean action;
        boolean hasPlayed = false;
        int turn = 1;
        ArrayList<Cercle> cerclesDeplacements = new ArrayList<Cercle>();
        ArrayList<Cercle> cerclesAttaques = new ArrayList<Cercle>();

        // Boucle du jeu
        while (running) {

            try {
                Thread.sleep(5);
            } catch (Exception e) {}

            // Clic gauche
            if (this.mouse.getClicGauche()) {

                ArrayList<Piece> pieces = this.plateau.getPiecesJoueur(turn);

                // Check si une pièce à été cliqué
                for (int j = 0; j < pieces.size(); j++) {
                    Piece piece = pieces.get(j);

                    if (this.mouse.getPosition().intersection(piece.getImage())) {
                        
                        // Création et affichage des cercles de déplacements et d'attaques
                        ArrayList<Position> deplacementsPos = piece.getDeplacementPossible(this.plateau);
                        ArrayList<Position> attaquesPos = piece.getAttaquePossible(this.plateau);

                        cerclesDeplacements = this.createAndDrawMoveCircles(cerclesDeplacements, deplacementsPos);
                        cerclesAttaques = this.createAndDrawAttackCircles(cerclesAttaques, attaquesPos);

                        // Boucle d'action
                        action = true;
                        while (action) {

                            try {
                                Thread.sleep(5);
                            } catch (Exception e) {}

                            // Clic gauche
                            if (this.mouse.getClicGauche()) {

                                // Si un cercle de déplacement est cliqué, on se déplace
                                for (int i = 0; i < deplacementsPos.size(); i++) {
                                    if (cerclesDeplacements.get(i).intersection(this.mouse.getPosition())) {
                                        piece.getImage().setA(new Point(deplacementsPos.get(i).getX()*75, deplacementsPos.get(i).getY()*75));
                                        piece.getTexte().setA(new Point(deplacementsPos.get(i).getX()*75+10, deplacementsPos.get(i).getY()*75+10));
                                        piece.setPos(new Position(deplacementsPos.get(i)));
                                        this.moveSound = new Bruitage("sounds/move.mp3");
                                        this.moveSound.lecture();
                                        hasPlayed = true;
                                    }
                                }

                                // Si un cercle d'attaque est cliqué, on attaque la cible
                                for (int i = 0; i < attaquesPos.size(); i++) {

                                    if (cerclesAttaques.get(i).intersection(this.mouse.getPosition())) {
                                        Piece adversaire = this.plateau.getCase(new Position(attaquesPos.get(i)));
                                        piece.getPokemon().attaque(adversaire.getPokemon());
                                        adversaire.getTexte().setTexte(Integer.toString(adversaire.getPokemon().getHp()));
                                        piece.getTexte().setTexte(Integer.toString(piece.getPokemon().getHp()));
                                        this.attackSound = new Bruitage("sounds/attack.mp3");
                                        this.attackSound.lecture();
                                        hasPlayed = true;
                                        
                                        // Si un pokémon est mort on vérifie si c'est Mewtoo puis on le supprime
                                        if (piece.getPokemon().getHp() <= 0) {
                                            if (piece.getPokemon().getId() == 150) {
                                                this.loseSound = new Bruitage("sounds/lose.mp3");
                                                this.loseSound.lecture();
                                                removeAllPokemons(piece.getJoueur());
                                            } else {
                                                this.deathSound = new Bruitage("sounds/death.mp3");
                                                this.deathSound.lecture();
                                                this.window.supprimer(piece.getImage());
                                                this.window.supprimer(piece.getTexte());
                                                this.plateau.getPieces().remove(piece);
                                            }
                                        }

                                        if (adversaire.getPokemon().getHp() <= 0) {
                                            if (adversaire.getPokemon().getId() == 150) {
                                                this.loseSound = new Bruitage("sounds/lose.mp3");
                                                this.loseSound.lecture();
                                                removeAllPokemons(adversaire.getJoueur());
                                            } else {
                                                this.deathSound = new Bruitage("sounds/death.mp3");
                                                this.deathSound.lecture();
                                                this.window.supprimer(adversaire.getImage());
                                                this.window.supprimer(adversaire.getTexte());
                                                this.plateau.getPieces().remove(adversaire);
                                            }
                                        }
                                    }
                                }

                                // Suppression des cercles après chaque action
                                for (Cercle cercle : cerclesAttaques) {
                                    this.window.supprimer(cercle);
                                }

                                for (Cercle cercle : cerclesDeplacements) {
                                    this.window.supprimer(cercle);
                                }

                                cerclesAttaques.clear();
                                cerclesDeplacements.clear();
                                
                                // Changement de tour
                                if (hasPlayed) {
                                    turn = changeTurn(turn);
                                    while (!this.players.contains(turn)) {
                                        turn = changeTurn(turn);
                                    }

                                    hasPlayed = false;
                                }
                                action = false;
                            }
                            this.window.rafraichir();
                        }
                    }
                }
            }

            if (this.checkWin()) {
                System.out.println("Le joueur " + this.players.get(0) + " a gagné la partie !");
                running = false;
            }

            this.window.rafraichir();
        }
        this.window.fermer();
        return this.players.get(0);
    }

    /**
     * Méthode pour vérifier si un joueur à gagné ou non
     * @return true ou false si le joueur a gagné ou non
     */
    public boolean checkWin() {
        return this.players.size() == 1;
    }

    /**
     * Méthode pour supprimer tous les pokémons d'un joueur qui a perdu son Mewtwo
     * @param player Joueur ayant perdu son Mewtwo
     */
    public void removeAllPokemons(int player) {
        for (Piece piece : this.plateau.getPiecesJoueur(player)) {
            this.window.supprimer(piece.getImage());
            this.window.supprimer(piece.getTexte());
            this.plateau.getPieces().remove(piece);
        }
        this.players.remove((Integer) player);
    }

    /**
     * Méthode pour changer le tour de la partie
     * @param turn Tour actuel
     * @return Nouveau tour
     */
    public int changeTurn(int turn) {
        if (turn >= this.playersNumber) {
            this.window.supprimer(this.textes.get(turn-1));
            turn = 1;
            this.window.ajouter(this.textes.get(turn-1));
        } else {
            this.window.supprimer(this.textes.get(turn-1));
            turn++;
            this.window.ajouter(this.textes.get(turn-1));
        }

        return turn;
    }

    /**
     * Méthode pour déssiner tous les éléments de la partie
     */
    public void drawScreen() {
        this.window.setBackground(new Couleur(0, 150, 255));
        this.window.ajouter(this.panneauTexte);
        this.window.ajouter(this.panneauTexteBorder);
        this.window.ajouter(this.textes.get(0));
        this.window.ajouter(this.plateauGraphique);

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                Carre c = new Carre(Couleur.NOIR, new Point(i*75, j*75), 75);
                this.window.ajouter(c);
            }
        }

        for (Piece piece : this.plateau.getPieces()) {
            this.window.ajouter(piece.getImage());
            this.window.ajouter(piece.getTexte());
        }
    }

    /**
     * Méthode pour créer et déssiner les cercles de déplacements disponibles
     * @param moveCircles ArrayList contenant les cercles de déplacements
     * @param movePos ArrayList contenant les positions de déplacements disponibles
     * @return Nouvel ArrayList contenant les cercles de déplacements
     */
    public ArrayList<Cercle> createAndDrawMoveCircles(ArrayList<Cercle> moveCircles, ArrayList<Position> movePos) {
        for (Position deplacement : movePos) {
            Cercle cercleDeplacement = new Cercle(new Point(deplacement.getX()*75+75/2, deplacement.getY()*75+75/2), 75/2);
            moveCircles.add(cercleDeplacement);
            this.window.ajouter(cercleDeplacement);
        }

        return moveCircles;
    }

    /**
     * Méthode pour créer et déssiner les cercles d'attaques disponibles
     * @param attackCircles ArrayList contenant les cercles d'attaques
     * @param attackPos ArrayList contenant les positions d'attaques disponibles
     * @return Nouvel ArrayList contenant les cercles d'attaques
     */
    public ArrayList<Cercle> createAndDrawAttackCircles(ArrayList<Cercle> attackCircles, ArrayList<Position> attackPos) {
        for (Position attaque : attackPos) {
            Cercle cercleAttaque = new Cercle(Couleur.ROUGE, new Point(attaque.getX()*75+75/2, attaque.getY()*75+75/2), 75/2);
            attackCircles.add(cercleAttaque);
            this.window.ajouter(cercleAttaque);
        }

        return attackCircles;
    }
}

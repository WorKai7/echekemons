import java.awt.Font;
import java.util.ArrayList;

import MG2D.Couleur;
import MG2D.geometrie.Point;
import MG2D.geometrie.Texture;
import MG2D.geometrie.Texte;

import pokemons.*;

public class Piece {
    private Pokemon pokemon;
    private int joueur;
    private Position position;
    private Texture image;
    private Texte nb_hp;

    /**
     * Constructeur par défaut: création d'un Taupiqueur en A1
     */
    public Piece() {
        this.pokemon = new Taupiqueur();
        this.joueur = 1;
        this.position = new Position();
        this.image = new Texture("images/" + this.pokemon.getId() + ".png", new Point(this.position.getX()*75, this.position.getY()*75), 75, 75);
        this.nb_hp = new Texte(Couleur.ROUGE, Integer.toString(this.pokemon.getHp()), new Font("Arial", Font.BOLD, 20), new Point(this.position.getX()*75+15, this.position.getY()*75+10));
    }

    /**
     * Constructeur par copie
     * @param p Piece
     */
    public Piece(Piece p) {
        this.pokemon = p.pokemon;
        this.joueur = p.joueur;
        this.position = p.position;
        this.image = new Texture("images/" + this.pokemon.getId() + ".png", new Point(this.position.getX()*75, this.position.getY()*75), 75, 75);
        this.nb_hp = p.nb_hp;
    }

    /**
     * Constructeur prenant un pokémon, un joueur et deux entiers
     * @param pokemon Pokemon
     * @param joueur Numéro du joueur
     * @param x Position x
     * @param y Position Y
     */
    public Piece(Pokemon pokemon, int joueur, int x, int y) {
        this.pokemon = pokemon;
        this.joueur = joueur;
        this.position = new Position(x, y);
        this.image = new Texture("images/" + this.pokemon.getId() + ".png", new Point(this.position.getX()*75, this.position.getY()*75), 75, 75);
        
        switch (this.joueur) {
            case 1:
                this.nb_hp = new Texte(Couleur.ROUGE, Integer.toString(this.pokemon.getHp()), new Font("Arial", Font.BOLD, 20), new Point(this.position.getX()*75+15, this.position.getY()*75+10));
                break;
            
            case 2:
                this.nb_hp = new Texte(new Couleur(0, 175, 0), Integer.toString(this.pokemon.getHp()), new Font("Arial", Font.BOLD, 20), new Point(this.position.getX()*75+15, this.position.getY()*75+10));
                break;
            
            case 3:
                this.nb_hp = new Texte(Couleur.JAUNE, Integer.toString(this.pokemon.getHp()), new Font("Arial", Font.BOLD, 20), new Point(this.position.getX()*75+15, this.position.getY()*75+10));
                break;

            case 4:
                this.nb_hp = new Texte(Couleur.BLEU, Integer.toString(this.pokemon.getHp()), new Font("Arial", Font.BOLD, 20), new Point(this.position.getX()*75+15, this.position.getY()*75+10));
                break;
        }
    }

    /**
     * Constructeur prenant un pokémon, un joueur et une position
     * @param pokemon Pokemon
     * @param joueur Numéro du joueur
     * @param pos Position de la pièce
     */
    public Piece(Pokemon pokemon, int joueur, Position pos) {
        this(pokemon, joueur, pos.getX(), pos.getY());
    }

    /**
     * Constructeur prenant un pokémon, un joueur et une position sous forme de string
     * @param pokemon Pokemon
     * @param joueur Numéro du joueur
     * @param pos Position sous forme de string
     */
    public Piece(Pokemon pokemon, int joueur, String pos) {
        this(pokemon, joueur, new Position(pos));
    }

    /**
     * Récupère la position de la pièce
     * @return Position de la pièce
     */
    public Position getPos() {
        return this.position;
    }

    /**
     * Met à jour la position de la pièce
     * @param position Nouvelle position
     */
    public void setPos(Position position) {
        this.position = position;
    }

    /**
     * Récupère le numéro du joueur auquel appartient la pièce
     * @return Numéro du joueur
     */
    public int getJoueur() {
        return this.joueur;
    }

    /**
     * Récupère le pokémon correspondant à la pièce
     * @return Pokémon
     */
    public Pokemon getPokemon() {
        return this.pokemon;
    }

    /**
     * Récupère l'image graphique du pokémon correspondant à la pièce
     * @return Texture
     */
    public Texture getImage() {
        return this.image;
    }

    /**
     * Récupère le texte graphique correspondant au nombre d'hp du pokémon correspondant à la pièce
     * @return Objet Texte
     */
    public Texte getTexte() {
        return this.nb_hp;
    }

    /**
     * Récupère les positions auxquelles le pokémon peut se déplacer
     * @param p Plateau du jeu
     * @return Tableau dynamique des positions de déplacements possibles
     */
    public ArrayList<Position> getDeplacementPossible(Plateau p) {
        ArrayList<Position> deplacements = new ArrayList<Position>();

        for (int i = this.position.getX()-1; i <= this.position.getX()+1; i++) {
            for (int j = this.position.getY()-1; j <= this.position.getY()+1; j++) {
                if (i >= 0 && i <= 8 && j >= 0 && j <= 8 && p.getCase(i, j) == null) {
                    deplacements.add(new Position(i, j));
                }
            }
        }
        return deplacements;
    }

    /**
     * Récupère les positions auxquelles le pokémon peut attaquer
     * @param p Plateau du jeu
     * @return Tableau dynamique des positions des attaques possibles
     */
    public ArrayList<Position> getAttaquePossible(Plateau p) {
        ArrayList<Position> attaques = new ArrayList<Position>();

        for (int i = this.position.getX()-1; i <= this.position.getX()+1; i++) {
            for (int j = this.position.getY()-1; j <= this.position.getY()+1; j++) {
                if (i >= 0 && i <= 9 && j >= 0 && j <= 9 && p.getCase(i, j) != null && p.getCase(i, j).joueur != this.joueur) {
                    attaques.add(new Position(i, j));
                }
            }
        }
        return attaques;
    }
    
    public String toString() {
        return this.pokemon.getName() + " du joueur " + this.joueur + " en " + this.position;
    }
}

import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;

import org.json.simple.*;
import org.json.simple.parser.JSONParser;

import pokemons.*;

public class Plateau {
    private ArrayList<Piece> pieces;

    /**
     * Constructeur par défaut: plateau correspondant à l'image donné dans le sujet du TP
     */
    public Plateau() {
        this.pieces = new ArrayList<Piece>();
        
        this.pieces.add(new Piece(new Mewtwo(), 2, "E1"));
        this.pieces.add(new Piece(new Mewtwo(), 1, "E9"));

        this.pieces.add(new Piece(new Salameche(), 2, "A1"));
        this.pieces.add(new Piece(new Salameche(), 2, "I1"));
        this.pieces.add(new Piece(new Salameche(), 1, "A9"));
        this.pieces.add(new Piece(new Salameche(), 1, "I9"));

        this.pieces.add(new Piece(new Carapuce(), 2, "B1"));
        this.pieces.add(new Piece(new Carapuce(), 2, "H1"));
        this.pieces.add(new Piece(new Carapuce(), 1, "B9"));
        this.pieces.add(new Piece(new Carapuce(), 1, "H9"));

        this.pieces.add(new Piece(new Bulbizarre(),2, "C1"));
        this.pieces.add(new Piece(new Bulbizarre(),2, "G1"));
        this.pieces.add(new Piece(new Bulbizarre(), 1, "C9"));
        this.pieces.add(new Piece(new Bulbizarre(), 1, "G9"));
    
        this.pieces.add(new Piece(new Reptincel(), 2, "A2"));
        this.pieces.add(new Piece(new Reptincel(), 2, "I2"));
        this.pieces.add(new Piece(new Reptincel(), 1, "A8"));
        this.pieces.add(new Piece(new Reptincel(), 1, "I8"));

        this.pieces.add(new Piece(new Carabaffe(), 2, "B2"));
        this.pieces.add(new Piece(new Carabaffe(), 2, "H2"));
        this.pieces.add(new Piece(new Carabaffe(), 1, "B8"));
        this.pieces.add(new Piece(new Carabaffe(), 1, "H8"));

        this.pieces.add(new Piece(new Herbizarre(), 2, "C2"));
        this.pieces.add(new Piece(new Herbizarre(), 2, "G2"));
        this.pieces.add(new Piece(new Herbizarre(), 1, "C8"));
        this.pieces.add(new Piece(new Herbizarre(), 1, "G8"));

        this.pieces.add(new Piece(new Dracolosse(), 2, "D2"));
        this.pieces.add(new Piece(new Dracolosse(), 2, "F2"));
        this.pieces.add(new Piece(new Dracolosse(), 1, "D8"));
        this.pieces.add(new Piece(new Dracolosse(), 1, "F8"));
        
        this.pieces.add(new Piece(new Sulfura(), 2, "D1"));
        this.pieces.add(new Piece(new Sulfura(), 1, "D9"));
        
        this.pieces.add(new Piece(new Electhor(), 2, "F1"));
        this.pieces.add(new Piece(new Electhor(), 1, "F9"));

        this.pieces.add(new Piece(new Artikodin(), 2, "E2"));
        this.pieces.add(new Piece(new Artikodin(), 1, "E8"));

        this.pieces.add(new Piece(new Tortank(), 2, "E3"));
        this.pieces.add(new Piece(new Tortank(), 1, "E7"));

        this.pieces.add(new Piece(new Dracaufeu(), 2, "F3"));
        this.pieces.add(new Piece(new Dracaufeu(), 1, "D7"));

        this.pieces.add(new Piece(new Florizarre(), 2, "D3"));
        this.pieces.add(new Piece(new Florizarre(), 1, "F7"));
    }

    /**
     * Constructeur prenant en paramètre le nombre de joueurs: génère un plateau par défaut en fonction du nombre de joueurs
     * @param nbJoueurs Nombre de joueurs
     */
    public Plateau(int nbJoueurs) {
        // Reprise du constructeur par défaut si c'est un plateau pour 2 joueurs
        this();

        if (nbJoueurs == 4) {
            this.pieces.clear();
            this.pieces.add(new Piece(new Mewtwo(), 1, "E9"));
            this.pieces.add(new Piece(new Mewtwo(),2, "I5"));
            this.pieces.add(new Piece(new Mewtwo(), 3, "E1"));
            this.pieces.add(new Piece(new Mewtwo(),4, "A5"));

            this.pieces.add(new Piece(new Dracolosse(), 1, "E8"));
            this.pieces.add(new Piece(new Dracolosse(), 2, "H5"));
            this.pieces.add(new Piece(new Dracolosse(), 3, "E2"));
            this.pieces.add(new Piece(new Dracolosse(), 4, "B5"));

            this.pieces.add(new Piece(new Sulfura(), 1, "F9"));
            this.pieces.add(new Piece(new Sulfura(), 2, "I4"));
            this.pieces.add(new Piece(new Sulfura(), 3, "D1"));
            this.pieces.add(new Piece(new Sulfura(), 4, "A6"));

            this.pieces.add(new Piece(new Artikodin(), 1, "D9"));
            this.pieces.add(new Piece(new Artikodin(), 2, "I6"));
            this.pieces.add(new Piece(new Artikodin(), 3, "F1"));
            this.pieces.add(new Piece(new Artikodin(), 4, "A4"));

            this.pieces.add(new Piece(new Triopikeur(), 1, "E7"));
            this.pieces.add(new Piece(new Triopikeur(), 2, "G5"));
            this.pieces.add(new Piece(new Triopikeur(), 3, "E3"));
            this.pieces.add(new Piece(new Triopikeur(), 4, "C5"));

            this.pieces.add(new Piece(new Taupiqueur(), 1, "C9"));
            this.pieces.add(new Piece(new Taupiqueur(), 1, "G9"));
            this.pieces.add(new Piece(new Taupiqueur(), 2, "I7"));
            this.pieces.add(new Piece(new Taupiqueur(), 2, "I3"));
            this.pieces.add(new Piece(new Taupiqueur(), 3, "G1"));
            this.pieces.add(new Piece(new Taupiqueur(), 3, "C1"));
            this.pieces.add(new Piece(new Taupiqueur(), 4, "A7"));
            this.pieces.add(new Piece(new Taupiqueur(), 4, "A3"));

            this.pieces.add(new Piece(new Evoli(), 1, "D8"));
            this.pieces.add(new Piece(new Evoli(), 1, "F8"));
            this.pieces.add(new Piece(new Evoli(), 2, "H6"));
            this.pieces.add(new Piece(new Evoli(), 2, "H4"));
            this.pieces.add(new Piece(new Evoli(), 3, "F2"));
            this.pieces.add(new Piece(new Evoli(), 3, "D2"));
            this.pieces.add(new Piece(new Evoli(), 4, "B4"));
            this.pieces.add(new Piece(new Evoli(), 4, "B6"));
        }
    }

    /**
     * Constructeur prenant un tableau de fichiers json en paramètre décrivant les pièces de chaque joueur
     * @param fichiers Tableau contenant les chemins des fichiers JSON
     * @throws Exception
     */
    public Plateau(String[] fichiers, int nbJoueurs) throws Exception {
        
        // Création du plateau et ajout des Mewtwo
        this.pieces = new ArrayList<Piece>();

        if (nbJoueurs == 2) {
            this.pieces.add(new Piece(new Mewtwo(), 1, "E1"));
            this.pieces.add(new Piece(new Mewtwo(),2, "E9"));
        } else {
            this.pieces.add(new Piece(new Mewtwo(), 1, "E9"));
            this.pieces.add(new Piece(new Mewtwo(),2, "I5"));
            this.pieces.add(new Piece(new Mewtwo(), 3, "E1"));
            this.pieces.add(new Piece(new Mewtwo(),4, "A5"));
        }

        for (int i = 1; i <= fichiers.length; i++) {
            int hpTotal = 0;

            // Lecture du fichier JSON et récupération des données dans un JSONArray
            JSONParser parser = new JSONParser();

            Object obj = parser.parse(new FileReader(fichiers[i-1]));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray pokemons = (JSONArray) jsonObject.get("pokemons");
    
            @SuppressWarnings("unchecked")
            Iterator<String> iterator = pokemons.iterator();
            
            // Pour chaque pokémons dans le fichier json, récupération des infos de celui-ci
            while (iterator.hasNext()) {
                String infos = iterator.next();
                String nomPokemon = infos.substring(5);
                String posPokemon = infos.substring(0, 2);
                Pokemon pokemon = (Pokemon) Class.forName("pokemons." + nomPokemon).getConstructor().newInstance();

                // Check si la position est n'est pas déjà utilisée par un autre pokémon
                for (Piece p : this.pieces) {
                    Position pos = new Position(posPokemon);
                    if (p.getPos().equals(pos)) {
                        System.out.println("Erreur de positionnement, deux pokémons se superposent");
                        System.exit(0);
                    }
                }

                // Check si il y a un Mewtwo dans le json (interdit dans la consigne du TP)
                if (nomPokemon.equals("Mewtwo")) {
                    System.out.println("Erreur, un mewtwo ne peut pas être ajouté manuellement.");
                        System.exit(0);
                }
                
                // Vérification des règles de positions et de vie maximum pour le jeu à deux joueurs
                // (Pas de règles établies pour le jeu à quatre joueurs pour le moment)
                if (nbJoueurs == 2) {
                    if (i == 1) {
                        if (posPokemon.charAt(1) - '0' >= 0 && posPokemon.charAt(1) - '0' <= 3) {
                            if (hpTotal + pokemon.getHp() <= 1500) {
                                this.pieces.add(new Piece(pokemon, i, posPokemon));
                                hpTotal += pokemon.getHp();
                            } else {
                                System.out.println("Le joueur 1 n'a pas respecté la règle du nombre de vie maximum");
                                System.exit(0);
                            }
                        } else {
                            System.out.println("Le joueur 1 n'a pas respecté la règle de placements de pokémons");
                            System.exit(0);
                        }
                    } else {
                        if (posPokemon.charAt(1) - '0' >= 7 && posPokemon.charAt(1) - '0' <= 9) {
                            if (hpTotal + pokemon.getHp() <= 1500) {
                                this.pieces.add(new Piece(pokemon, i, posPokemon));
                                hpTotal += pokemon.getHp();
                            } else {
                                System.out.println("Le joueur 2 n'a pas respecté la règle du nombre de vie maximum");
                                System.exit(0);
                            }
                        } else {
                            System.out.println("Le joueur 2 n'a pas respecté la règle de placements de pokémons");
                            System.exit(0);
                        }
                    }
                } else {
                    this.pieces.add(new Piece(pokemon, i, posPokemon));
                }
            }
        }
    }

    /**
     * Récupère la pièce présente dans la case correspondant aux coordonnées donnée en paramètre
     * @param x Coordonnée x
     * @param y Coordonnée y
     * @return Pièce correspondante si elle existe, sinon null
     */
    public Piece getCase(int x, int y) {
        for (Piece piece : this.pieces) {
            if (piece.getPos().getX() == x && piece.getPos().getY() == y) {
                return piece;
            }
        }
        return null;
    }

    /**
     * Récupère la pièce présente dans la case à la position passée en paramètre
     * @param pos Position de la case
     * @return Pièce dans la case si elle exite, sinon null
     */
    public Piece getCase(Position pos) {
        for (Piece piece : this.pieces) {
            if (piece.getPos().equals(pos)) {
                return piece;
            }
        }
        return null;
    }

    /**
     * Récupère la pièce dans la case correspondant à la position donnée en paramètre
     * @param pos Position sous forme de string
     * @return Pièce correspondante si elle exite, sinon null
     */
    public Piece getCase(String pos) {
        Position ref = new Position(pos);
        for (Piece piece : this.pieces) {
            if (piece.getPos().equals(ref)) {
                return piece;
            }
        }
        return null;
    }

    /**
     * Récupère un tableau dynamique des pièces du joueur donné en paramètre
     * @return Tableau des pièces du joueur donné
     */
    public ArrayList<Piece> getPiecesJoueur(int joueur) {
        ArrayList<Piece> pieces = new ArrayList<Piece>();
        for (Piece piece : this.pieces) {
            if (piece.getJoueur() == joueur) {
                pieces.add(piece);
            }
        }
        return pieces;
    }

    /**
     * Récupère la liste des pièces du plateau
     * @return Tableau des pièces du plateau
     */
    public ArrayList<Piece> getPieces() {
        return this.pieces;
    }

    
    public String toString() {
        String res = new String();
        for (int y = 0; y < 9; y++) {
            for (int x = 0; x < 9; x++) {
                String piece = new String();
                if (this.getCase(x, y) != null) {
                    piece += this.getCase(x, y).toString();
                } else {
                    Position pos = new Position(x, y);
                    piece += "Case " + pos + " vide";
                }
                res += piece + "\n";
            }
            res += "\n";
        }

        return res;
    }
}

public class Position {
    private int x;
    private int y;

    /**
     * Constructeur par défaut: position A1 (0, 0)
     */
    public Position() {
        this.x = 0;
        this.y = 0;
    }

    /**
     * Constructeur par copie
     * @param p Position
     */
    public Position(Position p) {
        this.x = p.x;
        this.y = p.y;
    }

    /**
     * Constructeur prenant en paramètre deux coordonnées
     * @param x Coordonnée x
     * @param y Coordonnée y
     */
    public Position(int x, int y) {
        if (x >= 0 && x < 9 && y >= 0 && y < 9) {
            this.x = x;
            this.y = y;
        } else {
            System.out.println("Erreur de saisie de l'objet, Arrêt du programme.");
            System.exit(0);
        }
    }

    /**
     * Constructeur prenant une position sous forme de string
     * @param pos Position sous forme de string
     */
    public Position(String pos) {
        boolean erreur = false;
        if (pos.charAt(1) - '0' >= 0 && pos.charAt(1) - '0' - 1 < 9) {
            this.y = pos.charAt(1) - '0' - 1;
        } else {
            System.out.println("Erreur de saisie de l'objet, Arrêt du programme.");
            System.exit(0);
            erreur = true;
        }

        if (!erreur) {
            char[] tab_lettres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
            int i = 0;
            int index = -1;
            while (i < tab_lettres.length && index == -1) {
                if (pos.charAt(0) == tab_lettres[i]) {
                    index = i;
                }
                i++;
            }
            if (index == -1) {
                System.out.println("Erreur de saisie de l'objet, Arrêt du programme.");
                System.exit(0);
            }
    
            this.x = index;
        }
    }

    /**
     * Récupère la coordonnée x de la position
     * @return Coordonnée x
     */
    public int getX() {
        return this.x;
    }

    /**
     * Récupère la coordonnée y de la position
     * @return Coordonnée y
     */
    public int getY() {
        return this.y;
    }

    /**
     * Met à jour la coordonnée x
     * @param x Nouvelle valeur de x
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * Met à jour la coordonnée y
     * @param y Nouvelle valeur de y
     */
    public void setY(int y) {
        this.y = y;
    }

    public String toString() {
        char[] tab_lettres = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I'};
        char x = tab_lettres[this.x];
        char y = (char) (this.y+1 + '0');
        return String.valueOf(x) + String.valueOf(y);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof Position)) {
            return false;
        }

        Position pos = (Position) o;
        return this.x == pos.x && this.y == pos.y;
    }
}

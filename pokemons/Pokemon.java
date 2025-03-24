package pokemons;

import java.util.Random;

public abstract class Pokemon {
    private int id;
    private String name;
    private int type1;
    private int type2;
    private int hp;
    private int attack;
    private int defence;
    private int speed;

    /**
     * Crée un pokémon par défaut: il aura les statistiques de Taupiqueur
     */
    public Pokemon() {
        this.id = 50;
        this.name = new String("Taupiqueur");
        this.type1 = Type.SOL;
        this.type2 = Type.SANS;
        this.hp = 10;
        this.attack = 55;
        this.defence = 25;
        this.speed = 95;
    }

    /**
     * Crée un pokémon en fonction des paramètres donnés
     * @param id Numéro du pokemon
     * @param name Nom du pokémon
     * @param type1 Type 1 du pokémon
     * @param type2 Type 2 du pokémon
     * @param hp Points de vie du pokémon
     * @param attack Attaque du pokémon
     * @param defence Défense du pokémon
     * @param speed Vitesse du pokémon
     */
    public Pokemon(int id, String name, int type1, int type2, int hp, int attack, int defence, int speed) {
        this.id = id;
        this.name = name;
        this.type1 = type1;
        this.type2 = type2;
        this.hp = hp;
        this.attack = attack;
        this.defence = defence;
        this.speed = speed;
    }

    /**
     * Lance un tour de jeu: programme principal du jeu
     * @param p Pokémon adversaire
     */
    public void attaque(Pokemon p) {
        Random rand = new Random();

        if (this.speed < p.speed) {
            if (rand.nextInt(10) == 0) {

                int efficacite;
                if (Type.getEfficacite(p.type1, this.type1) > Type.getEfficacite(p.type2, this.type1)) {
                    efficacite = (int) Type.getEfficacite(p.type1, this.type1);
                } else {
                    efficacite = (int) Type.getEfficacite(p.type2, this.type1);
                }

                int degatsSurSoi = p.attack * efficacite - this.defence;
                degatsSurSoi *= (double) (rand.nextInt(30) + 50) / 100;

                if (degatsSurSoi <= 0) {
                    degatsSurSoi = 1;
                }

                this.hp -= degatsSurSoi;
                System.out.println(p.name + " a pris de vitesse " + this.name + " et l'a attaqué ! (-" + degatsSurSoi + "❤)");
            }
        }

        int efficacite;
        if (Type.getEfficacite(this.type1, p.type1) > Type.getEfficacite(this.type2, p.type1)) {
            efficacite = (int) Type.getEfficacite(this.type1, p.type1);
        } else {
            efficacite = (int) Type.getEfficacite(this.type2, p.type1);
        }

        int degatsSurAdversaire = this.attack * efficacite - p.defence;
        degatsSurAdversaire *= (double) (rand.nextInt(30) + 50) / 100;

        if (degatsSurAdversaire <= 0) {
            degatsSurAdversaire = 1;
        }

        if (rand.nextInt(10) == 0) {
            degatsSurAdversaire *= 1.5;
            System.out.println(this.name + " va mettre un coup critique à " + p.name + " !");
        }

        p.hp -= degatsSurAdversaire;
        System.out.println(this.name + " attaque " + p.name + " ! (-" + degatsSurAdversaire + "❤)");
    }

    /**
     * Permet de récuperer le nombre de points de vie du pokémon
     * @return Points de vie
     */
    public int getHp() {
        return this.hp;
    }

    /**
     * Permet de récuperer le nom du pokémon
     * @return Nom du pokémon
     */
    public String getName() {
        return this.name;
    }

    /**
     * Permet de récuperer l'ID du pokémon
     * @return ID du pokémon
     */
    public int getId() {
        return this.id;
    }

    public String toString() {
        return new String("---" + this.name + "---\n\nID: " + this.id + "\nEspece: " + this.getEspece() + "\nType: " + this.type1 + "|" + this.type2 + "\nHP: " + this.hp + "\nAttack: " + this.attack + "\nDefence: " + this.defence + "\nSpeed: " + this.speed);
    }

    public boolean equals(Pokemon p) {
        return this.id == p.id && this.type1 == p.type1 && this.type2 == p.type2 && this.hp == p.hp && this.attack == p.attack && this.defence == p.defence && this.speed == p.speed;
    }

    /**
     * Méthode abstraite pour récupérer l'éspèce du pokémon
     * @return Espece du pokémon
     */
    public abstract String getEspece();
}

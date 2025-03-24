public class Game {
    private Menu menu;
    private boolean running;

    /**
     * Constructeur par défaut créant le jeu en lui-même
     */
    public Game() {
        this.running = true;
    }

    /**
     * Méthode pour lancer le jeu
     * @throws Exception
     */
    public void run() throws Exception {

        while (this.running) {
            this.menu = new Menu();
            int[] nbJoueurs = this.menu.run();

            if (nbJoueurs[1] != -1) {
                boolean perso = false;
                if (nbJoueurs[1] == 1) {
                    perso = true;
                }

                Partie partie = new Partie(nbJoueurs[0], perso);
                int winner = partie.run();

                EndMenu endMenu = new EndMenu(winner);
                endMenu.run();
            } else {
                this.running = false;
            }
        }
    }
}

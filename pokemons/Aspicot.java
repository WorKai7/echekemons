package pokemons;

public class Aspicot extends Pokemon{
  public Aspicot() {
    super(13, new String("Aspicot"), Type.INSECTE, Type.POISON, 40, 35, 30, 50);
  }

  public Aspicot(String name) {
    super(13, name, Type.INSECTE, Type.POISON, 40, 35, 30, 50);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


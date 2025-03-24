package pokemons;

public class Pikachu extends Pokemon{
  public Pikachu() {
    super(25, new String("Pikachu"), Type.ELECTRIK, Type.SANS, 35, 55, 30, 90);
  }

  public Pikachu(String name) {
    super(25, name, Type.ELECTRIK, Type.SANS, 35, 55, 30, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


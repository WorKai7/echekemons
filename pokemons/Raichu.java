package pokemons;

public class Raichu extends Pokemon{
  public Raichu() {
    super(26, new String("Raichu"), Type.ELECTRIK, Type.SANS, 60, 90, 55, 100);
  }

  public Raichu(String name) {
    super(26, name, Type.ELECTRIK, Type.SANS, 60, 90, 55, 100);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


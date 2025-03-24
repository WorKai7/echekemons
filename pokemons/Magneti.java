package pokemons;

public class Magneti extends Pokemon{
  public Magneti() {
    super(81, new String("Magnéti"), Type.ELECTRIK, Type.SANS, 25, 35, 70, 45);
  }

  public Magneti(String name) {
    super(81, name, Type.ELECTRIK, Type.SANS, 25, 35, 70, 45);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


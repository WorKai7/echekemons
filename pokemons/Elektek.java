package pokemons;

public class Elektek extends Pokemon{
  public Elektek() {
    super(125, new String("Élektek"), Type.ELECTRIK, Type.SANS, 65, 83, 57, 105);
  }

  public Elektek(String name) {
    super(125, name, Type.ELECTRIK, Type.SANS, 65, 83, 57, 105);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


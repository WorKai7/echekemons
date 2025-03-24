package pokemons;

public class Magneton extends Pokemon{
  public Magneton() {
    super(82, new String("Magnéton"), Type.ELECTRIK, Type.SANS, 50, 60, 95, 70);
  }

  public Magneton(String name) {
    super(82, name, Type.ELECTRIK, Type.SANS, 50, 60, 95, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


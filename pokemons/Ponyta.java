package pokemons;

public class Ponyta extends Pokemon{
  public Ponyta() {
    super(77, new String("Ponyta"), Type.FEU, Type.SANS, 50, 85, 55, 90);
  }

  public Ponyta(String name) {
    super(77, name, Type.FEU, Type.SANS, 50, 85, 55, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


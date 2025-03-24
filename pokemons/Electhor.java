package pokemons;

public class Electhor extends Pokemon{
  public Electhor() {
    super(145, new String("Électhor"), Type.ELECTRIK, Type.VOL, 90, 90, 85, 100);
  }

  public Electhor(String name) {
    super(145, name, Type.ELECTRIK, Type.VOL, 90, 90, 85, 100);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


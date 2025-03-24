package pokemons;

public class Sulfura extends Pokemon{
  public Sulfura() {
    super(146, new String("Sulfura"), Type.FEU, Type.VOL, 90, 100, 90, 90);
  }

  public Sulfura(String name) {
    super(146, name, Type.FEU, Type.VOL, 90, 100, 90, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


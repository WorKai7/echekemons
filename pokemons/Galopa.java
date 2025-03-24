package pokemons;

public class Galopa extends Pokemon{
  public Galopa() {
    super(78, new String("Galopa"), Type.FEU, Type.SANS, 65, 100, 70, 105);
  }

  public Galopa(String name) {
    super(78, name, Type.FEU, Type.SANS, 65, 100, 70, 105);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Machoc extends Pokemon{
  public Machoc() {
    super(66, new String("Machoc"), Type.COMBAT, Type.SANS, 70, 80, 50, 35);
  }

  public Machoc(String name) {
    super(66, name, Type.COMBAT, Type.SANS, 70, 80, 50, 35);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Ferosinge extends Pokemon{
  public Ferosinge() {
    super(56, new String("Férosinge"), Type.COMBAT, Type.SANS, 40, 80, 35, 70);
  }

  public Ferosinge(String name) {
    super(56, name, Type.COMBAT, Type.SANS, 40, 80, 35, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


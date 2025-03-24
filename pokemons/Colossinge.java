package pokemons;

public class Colossinge extends Pokemon{
  public Colossinge() {
    super(57, new String("Colossinge"), Type.COMBAT, Type.SANS, 65, 105, 60, 95);
  }

  public Colossinge(String name) {
    super(57, name, Type.COMBAT, Type.SANS, 65, 105, 60, 95);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


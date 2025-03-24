package pokemons;

public class Mackogneur extends Pokemon{
  public Mackogneur() {
    super(68, new String("Mackogneur"), Type.COMBAT, Type.SANS, 90, 130, 80, 55);
  }

  public Mackogneur(String name) {
    super(68, name, Type.COMBAT, Type.SANS, 90, 130, 80, 55);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


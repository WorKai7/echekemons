package pokemons;

public class Rattatac extends Pokemon{
  public Rattatac() {
    super(20, new String("Rattatac"), Type.NORMAL, Type.SANS, 55, 81, 60, 97);
  }

  public Rattatac(String name) {
    super(20, name, Type.NORMAL, Type.SANS, 55, 81, 60, 97);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


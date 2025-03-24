package pokemons;

public class Mew extends Pokemon{
  public Mew() {
    super(151, new String("Mew"), Type.PSY, Type.SANS, 100, 100, 100, 100);
  }

  public Mew(String name) {
    super(151, name, Type.PSY, Type.SANS, 100, 100, 100, 100);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


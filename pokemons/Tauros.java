package pokemons;

public class Tauros extends Pokemon{
  public Tauros() {
    super(128, new String("Tauros"), Type.NORMAL, Type.SANS, 75, 100, 95, 110);
  }

  public Tauros(String name) {
    super(128, name, Type.NORMAL, Type.SANS, 75, 100, 95, 110);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


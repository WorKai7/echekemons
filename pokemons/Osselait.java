package pokemons;

public class Osselait extends Pokemon{
  public Osselait() {
    super(104, new String("Osselait"), Type.SOL, Type.SANS, 50, 50, 95, 35);
  }

  public Osselait(String name) {
    super(104, name, Type.SOL, Type.SANS, 50, 50, 95, 35);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


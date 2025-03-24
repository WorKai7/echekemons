package pokemons;

public class Tortank extends Pokemon{
  public Tortank() {
    super(9, new String("Tortank"), Type.EAU, Type.SANS, 79, 83, 100, 78);
  }

  public Tortank(String name) {
    super(9, name, Type.EAU, Type.SANS, 79, 83, 100, 78);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


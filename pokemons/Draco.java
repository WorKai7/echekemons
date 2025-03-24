package pokemons;

public class Draco extends Pokemon{
  public Draco() {
    super(148, new String("Draco"), Type.DRAGON, Type.SANS, 61, 84, 65, 70);
  }

  public Draco(String name) {
    super(148, name, Type.DRAGON, Type.SANS, 61, 84, 65, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Minidraco extends Pokemon{
  public Minidraco() {
    super(147, new String("Minidraco"), Type.DRAGON, Type.SANS, 41, 64, 45, 50);
  }

  public Minidraco(String name) {
    super(147, name, Type.DRAGON, Type.SANS, 41, 64, 45, 50);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


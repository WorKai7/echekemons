package pokemons;

public class Smogogo extends Pokemon{
  public Smogogo() {
    super(110, new String("Smogogo"), Type.POISON, Type.SANS, 65, 90, 120, 60);
  }

  public Smogogo(String name) {
    super(110, name, Type.POISON, Type.SANS, 65, 90, 120, 60);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


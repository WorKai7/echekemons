package pokemons;

public class Artikodin extends Pokemon{
  public Artikodin() {
    super(144, new String("Artikodin"), Type.GLACE, Type.VOL, 90, 85, 100, 85);
  }

  public Artikodin(String name) {
    super(144, name, Type.GLACE, Type.VOL, 90, 85, 100, 85);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


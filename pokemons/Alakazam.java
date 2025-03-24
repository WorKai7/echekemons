package pokemons;

public class Alakazam extends Pokemon{
  public Alakazam() {
    super(65, new String("Alakazam"), Type.PSY, Type.SANS, 55, 50, 45, 120);
  }

  public Alakazam(String name) {
    super(65, name, Type.PSY, Type.SANS, 55, 50, 45, 120);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


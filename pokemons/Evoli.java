package pokemons;

public class Evoli extends Pokemon{
  public Evoli() {
    super(133, new String("Évoli"), Type.NORMAL, Type.SANS, 55, 55, 50, 55);
  }

  public Evoli(String name) {
    super(133, name, Type.NORMAL, Type.SANS, 55, 55, 50, 55);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Florizarre extends Pokemon{
  public Florizarre() {
    super(3, new String("Florizarre"), Type.PLANTE, Type.POISON, 80, 82, 83, 80);
  }

  public Florizarre(String name) {
    super(3, name, Type.PLANTE, Type.POISON, 80, 82, 83, 80);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


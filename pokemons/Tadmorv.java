package pokemons;

public class Tadmorv extends Pokemon{
  public Tadmorv() {
    super(88, new String("Tadmorv"), Type.POISON, Type.SANS, 80, 80, 50, 25);
  }

  public Tadmorv(String name) {
    super(88, name, Type.POISON, Type.SANS, 80, 80, 50, 25);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


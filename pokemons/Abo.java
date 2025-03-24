package pokemons;

public class Abo extends Pokemon{
  public Abo() {
    super(23, new String("Abo"), Type.POISON, Type.SANS, 35, 60, 44, 55);
  }

  public Abo(String name) {
    super(23, name, Type.POISON, Type.SANS, 35, 60, 44, 55);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


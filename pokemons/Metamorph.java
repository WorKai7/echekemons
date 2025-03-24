package pokemons;

public class Metamorph extends Pokemon{
  public Metamorph() {
    super(132, new String("Métamorph"), Type.NORMAL, Type.SANS, 48, 48, 48, 48);
  }

  public Metamorph(String name) {
    super(132, name, Type.NORMAL, Type.SANS, 48, 48, 48, 48);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


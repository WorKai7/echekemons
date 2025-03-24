package pokemons;

public class Chetiflor extends Pokemon{
  public Chetiflor() {
    super(69, new String("Chétiflor"), Type.PLANTE, Type.POISON, 50, 75, 35, 40);
  }

  public Chetiflor(String name) {
    super(69, name, Type.PLANTE, Type.POISON, 50, 75, 35, 40);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


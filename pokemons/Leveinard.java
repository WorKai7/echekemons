package pokemons;

public class Leveinard extends Pokemon{
  public Leveinard() {
    super(113, new String("Leveinard"), Type.NORMAL, Type.SANS, 250, 5, 5, 50);
  }

  public Leveinard(String name) {
    super(113, name, Type.NORMAL, Type.SANS, 250, 5, 5, 50);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


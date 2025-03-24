package pokemons;

public class Persian extends Pokemon{
  public Persian() {
    super(53, new String("Persian"), Type.NORMAL, Type.SANS, 65, 70, 60, 115);
  }

  public Persian(String name) {
    super(53, name, Type.NORMAL, Type.SANS, 65, 70, 60, 115);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


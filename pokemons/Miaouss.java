package pokemons;

public class Miaouss extends Pokemon{
  public Miaouss() {
    super(52, new String("Miaouss"), Type.NORMAL, Type.SANS, 40, 45, 35, 90);
  }

  public Miaouss(String name) {
    super(52, name, Type.NORMAL, Type.SANS, 40, 45, 35, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


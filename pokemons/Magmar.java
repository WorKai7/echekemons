package pokemons;

public class Magmar extends Pokemon{
  public Magmar() {
    super(126, new String("Magmar"), Type.FEU, Type.SANS, 65, 95, 57, 93);
  }

  public Magmar(String name) {
    super(126, name, Type.FEU, Type.SANS, 65, 95, 57, 93);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


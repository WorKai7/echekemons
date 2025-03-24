package pokemons;

public class Kadabra extends Pokemon{
  public Kadabra() {
    super(64, new String("Kadabra"), Type.PSY, Type.SANS, 40, 35, 30, 105);
  }

  public Kadabra(String name) {
    super(64, name, Type.PSY, Type.SANS, 40, 35, 30, 105);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Electrode extends Pokemon{
  public Electrode() {
    super(101, new String("Électrode"), Type.ELECTRIK, Type.SANS, 60, 50, 70, 140);
  }

  public Electrode(String name) {
    super(101, name, Type.ELECTRIK, Type.SANS, 60, 50, 70, 140);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Nidoqueen extends Pokemon{
  public Nidoqueen() {
    super(31, new String("Nidoqueen"), Type.POISON, Type.SOL, 90, 82, 87, 76);
  }

  public Nidoqueen(String name) {
    super(31, name, Type.POISON, Type.SOL, 90, 82, 87, 76);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Goupix extends Pokemon{
  public Goupix() {
    super(37, new String("Goupix"), Type.FEU, Type.SANS, 38, 41, 40, 65);
  }

  public Goupix(String name) {
    super(37, name, Type.FEU, Type.SANS, 38, 41, 40, 65);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


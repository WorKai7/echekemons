package pokemons;

public class Reptincel extends Pokemon{
  public Reptincel() {
    super(5, new String("Reptincel"), Type.FEU, Type.SANS, 58, 64, 58, 80);
  }

  public Reptincel(String name) {
    super(5, name, Type.FEU, Type.SANS, 58, 64, 58, 80);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


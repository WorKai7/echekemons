package pokemons;

public class Caninos extends Pokemon{
  public Caninos() {
    super(58, new String("Caninos"), Type.FEU, Type.SANS, 55, 70, 45, 60);
  }

  public Caninos(String name) {
    super(58, name, Type.FEU, Type.SANS, 55, 70, 45, 60);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


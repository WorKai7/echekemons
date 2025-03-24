package pokemons;

public class Arcanin extends Pokemon{
  public Arcanin() {
    super(59, new String("Arcanin"), Type.FEU, Type.SANS, 90, 110, 80, 95);
  }

  public Arcanin(String name) {
    super(59, name, Type.FEU, Type.SANS, 90, 110, 80, 95);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


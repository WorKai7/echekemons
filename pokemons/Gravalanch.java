package pokemons;

public class Gravalanch extends Pokemon{
  public Gravalanch() {
    super(75, new String("Gravalanch"), Type.ROCHE, Type.SOL, 55, 95, 115, 35);
  }

  public Gravalanch(String name) {
    super(75, name, Type.ROCHE, Type.SOL, 55, 95, 115, 35);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


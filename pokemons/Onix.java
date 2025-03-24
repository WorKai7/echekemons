package pokemons;

public class Onix extends Pokemon{
  public Onix() {
    super(95, new String("Onix"), Type.ROCHE, Type.SOL, 35, 45, 160, 70);
  }

  public Onix(String name) {
    super(95, name, Type.ROCHE, Type.SOL, 35, 45, 160, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


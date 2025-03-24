package pokemons;

public class Kabuto extends Pokemon{
  public Kabuto() {
    super(140, new String("Kabuto"), Type.ROCHE, Type.EAU, 30, 80, 90, 55);
  }

  public Kabuto(String name) {
    super(140, name, Type.ROCHE, Type.EAU, 30, 80, 90, 55);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


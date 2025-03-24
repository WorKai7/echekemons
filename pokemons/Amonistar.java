package pokemons;

public class Amonistar extends Pokemon{
  public Amonistar() {
    super(139, new String("Amonistar"), Type.ROCHE, Type.EAU, 70, 60, 125, 55);
  }

  public Amonistar(String name) {
    super(139, name, Type.ROCHE, Type.EAU, 70, 60, 125, 55);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


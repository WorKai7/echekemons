package pokemons;

public class Magicarpe extends Pokemon{
  public Magicarpe() {
    super(129, new String("Magicarpe"), Type.EAU, Type.SANS, 20, 10, 55, 80);
  }

  public Magicarpe(String name) {
    super(129, name, Type.EAU, Type.SANS, 20, 10, 55, 80);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


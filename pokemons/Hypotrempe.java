package pokemons;

public class Hypotrempe extends Pokemon{
  public Hypotrempe() {
    super(116, new String("Hypotrempe"), Type.EAU, Type.SANS, 30, 40, 70, 60);
  }

  public Hypotrempe(String name) {
    super(116, name, Type.EAU, Type.SANS, 30, 40, 70, 60);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


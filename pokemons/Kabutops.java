package pokemons;

public class Kabutops extends Pokemon{
  public Kabutops() {
    super(141, new String("Kabutops"), Type.ROCHE, Type.EAU, 60, 115, 105, 80);
  }

  public Kabutops(String name) {
    super(141, name, Type.ROCHE, Type.EAU, 60, 115, 105, 80);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


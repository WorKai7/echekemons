package pokemons;

public class Hypocean extends Pokemon{
  public Hypocean() {
    super(117, new String("Hypocéan"), Type.EAU, Type.SANS, 55, 65, 95, 85);
  }

  public Hypocean(String name) {
    super(117, name, Type.EAU, Type.SANS, 55, 65, 95, 85);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


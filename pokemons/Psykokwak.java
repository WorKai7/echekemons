package pokemons;

public class Psykokwak extends Pokemon{
  public Psykokwak() {
    super(54, new String("Psykokwak"), Type.EAU, Type.SANS, 50, 52, 48, 55);
  }

  public Psykokwak(String name) {
    super(54, name, Type.EAU, Type.SANS, 50, 52, 48, 55);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


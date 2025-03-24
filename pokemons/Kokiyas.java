package pokemons;

public class Kokiyas extends Pokemon{
  public Kokiyas() {
    super(90, new String("Kokiyas"), Type.EAU, Type.SANS, 30, 65, 100, 40);
  }

  public Kokiyas(String name) {
    super(90, name, Type.EAU, Type.SANS, 30, 65, 100, 40);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


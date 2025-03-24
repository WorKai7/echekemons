package pokemons;

public class Krabby extends Pokemon{
  public Krabby() {
    super(98, new String("Krabby"), Type.EAU, Type.SANS, 30, 105, 90, 50);
  }

  public Krabby(String name) {
    super(98, name, Type.EAU, Type.SANS, 30, 105, 90, 50);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Carapuce extends Pokemon{
  public Carapuce() {
    super(7, new String("Carapuce"), Type.EAU, Type.SANS, 44, 48, 65, 43);
  }

  public Carapuce(String name) {
    super(7, name, Type.EAU, Type.SANS, 44, 48, 65, 43);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


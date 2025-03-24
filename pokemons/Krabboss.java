package pokemons;

public class Krabboss extends Pokemon{
  public Krabboss() {
    super(99, new String("Krabboss"), Type.EAU, Type.SANS, 55, 130, 115, 75);
  }

  public Krabboss(String name) {
    super(99, name, Type.EAU, Type.SANS, 55, 130, 115, 75);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


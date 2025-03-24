package pokemons;

public class Poissoroy extends Pokemon{
  public Poissoroy() {
    super(119, new String("Poissoroy"), Type.EAU, Type.SANS, 80, 92, 65, 68);
  }

  public Poissoroy(String name) {
    super(119, name, Type.EAU, Type.SANS, 80, 92, 65, 68);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


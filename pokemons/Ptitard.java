package pokemons;

public class Ptitard extends Pokemon{
  public Ptitard() {
    super(60, new String("Ptitard"), Type.EAU, Type.SANS, 40, 50, 40, 90);
  }

  public Ptitard(String name) {
    super(60, name, Type.EAU, Type.SANS, 40, 50, 40, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


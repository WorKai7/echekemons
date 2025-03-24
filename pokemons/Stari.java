package pokemons;

public class Stari extends Pokemon{
  public Stari() {
    super(120, new String("Stari"), Type.EAU, Type.SANS, 30, 45, 55, 85);
  }

  public Stari(String name) {
    super(120, name, Type.EAU, Type.SANS, 30, 45, 55, 85);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


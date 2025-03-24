package pokemons;

public class Tartard extends Pokemon{
  public Tartard() {
    super(62, new String("Tartard"), Type.EAU, Type.COMBAT, 90, 85, 95, 70);
  }

  public Tartard(String name) {
    super(62, name, Type.EAU, Type.COMBAT, 90, 85, 95, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


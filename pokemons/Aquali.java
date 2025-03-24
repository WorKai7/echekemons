package pokemons;

public class Aquali extends Pokemon{
  public Aquali() {
    super(134, new String("Aquali"), Type.EAU, Type.SANS, 130, 65, 60, 65);
  }

  public Aquali(String name) {
    super(134, name, Type.EAU, Type.SANS, 130, 65, 60, 65);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


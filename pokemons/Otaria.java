package pokemons;

public class Otaria extends Pokemon{
  public Otaria() {
    super(86, new String("Otaria"), Type.EAU, Type.SANS, 65, 45, 55, 45);
  }

  public Otaria(String name) {
    super(86, name, Type.EAU, Type.SANS, 65, 45, 55, 45);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


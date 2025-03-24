package pokemons;

public class Akwakwak extends Pokemon{
  public Akwakwak() {
    super(55, new String("Akwakwak"), Type.EAU, Type.SANS, 80, 82, 78, 85);
  }

  public Akwakwak(String name) {
    super(55, name, Type.EAU, Type.SANS, 80, 82, 78, 85);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


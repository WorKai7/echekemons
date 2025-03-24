package pokemons;

public class Carabaffe extends Pokemon{
  public Carabaffe() {
    super(8, new String("Carabaffe"), Type.EAU, Type.SANS, 59, 63, 80, 58);
  }

  public Carabaffe(String name) {
    super(8, name, Type.EAU, Type.SANS, 59, 63, 80, 58);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


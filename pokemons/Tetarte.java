package pokemons;

public class Tetarte extends Pokemon{
  public Tetarte() {
    super(61, new String("Têtarte"), Type.EAU, Type.SANS, 65, 65, 65, 90);
  }

  public Tetarte(String name) {
    super(61, name, Type.EAU, Type.SANS, 65, 65, 65, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


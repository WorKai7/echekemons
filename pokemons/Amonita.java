package pokemons;

public class Amonita extends Pokemon{
  public Amonita() {
    super(138, new String("Amonita"), Type.ROCHE, Type.EAU, 35, 40, 100, 35);
  }

  public Amonita(String name) {
    super(138, name, Type.ROCHE, Type.EAU, 35, 40, 100, 35);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


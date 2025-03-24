package pokemons;

public class Tygnon extends Pokemon{
  public Tygnon() {
    super(107, new String("Tygnon"), Type.COMBAT, Type.SANS, 50, 105, 79, 76);
  }

  public Tygnon(String name) {
    super(107, name, Type.COMBAT, Type.SANS, 50, 105, 79, 76);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


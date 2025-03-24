package pokemons;

public class Arbok extends Pokemon{
  public Arbok() {
    super(24, new String("Arbok"), Type.POISON, Type.SANS, 60, 85, 69, 80);
  }

  public Arbok(String name) {
    super(24, name, Type.POISON, Type.SANS, 60, 85, 69, 80);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


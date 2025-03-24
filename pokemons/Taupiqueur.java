package pokemons;

public class Taupiqueur extends Pokemon{
  public Taupiqueur() {
    super(50, new String("Taupiqueur"), Type.SOL, Type.SANS, 10, 55, 25, 95);
  }

  public Taupiqueur(String name) {
    super(50, name, Type.SOL, Type.SANS, 10, 55, 25, 95);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


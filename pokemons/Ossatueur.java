package pokemons;

public class Ossatueur extends Pokemon{
  public Ossatueur() {
    super(105, new String("Ossatueur"), Type.SOL, Type.SANS, 60, 80, 110, 45);
  }

  public Ossatueur(String name) {
    super(105, name, Type.SOL, Type.SANS, 60, 80, 110, 45);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Scarabrute extends Pokemon{
  public Scarabrute() {
    super(127, new String("Scarabrute"), Type.INSECTE, Type.SANS, 65, 125, 100, 85);
  }

  public Scarabrute(String name) {
    super(127, name, Type.INSECTE, Type.SANS, 65, 125, 100, 85);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


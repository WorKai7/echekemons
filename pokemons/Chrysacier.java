package pokemons;

public class Chrysacier extends Pokemon{
  public Chrysacier() {
    super(11, new String("Chrysacier"), Type.INSECTE, Type.SANS, 50, 20, 55, 30);
  }

  public Chrysacier(String name) {
    super(11, name, Type.INSECTE, Type.SANS, 50, 20, 55, 30);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


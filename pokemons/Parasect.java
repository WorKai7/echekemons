package pokemons;

public class Parasect extends Pokemon{
  public Parasect() {
    super(47, new String("Parasect"), Type.INSECTE, Type.PLANTE, 60, 95, 80, 30);
  }

  public Parasect(String name) {
    super(47, name, Type.INSECTE, Type.PLANTE, 60, 95, 80, 30);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


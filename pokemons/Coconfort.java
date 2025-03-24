package pokemons;

public class Coconfort extends Pokemon{
  public Coconfort() {
    super(14, new String("Coconfort"), Type.INSECTE, Type.POISON, 45, 25, 50, 35);
  }

  public Coconfort(String name) {
    super(14, name, Type.INSECTE, Type.POISON, 45, 25, 50, 35);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


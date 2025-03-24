package pokemons;

public class Bulbizarre extends Pokemon{
  public Bulbizarre() {
    super(1, new String("Bulbizarre"), Type.PLANTE, Type.POISON, 45, 49, 49, 45);
  }

  public Bulbizarre(String name) {
    super(1, name, Type.PLANTE, Type.POISON, 45, 49, 49, 45);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


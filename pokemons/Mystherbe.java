package pokemons;

public class Mystherbe extends Pokemon{
  public Mystherbe() {
    super(43, new String("Mystherbe"), Type.PLANTE, Type.POISON, 45, 50, 55, 30);
  }

  public Mystherbe(String name) {
    super(43, name, Type.PLANTE, Type.POISON, 45, 50, 55, 30);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


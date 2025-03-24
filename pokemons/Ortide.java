package pokemons;

public class Ortide extends Pokemon{
  public Ortide() {
    super(44, new String("Ortide"), Type.PLANTE, Type.POISON, 60, 65, 70, 40);
  }

  public Ortide(String name) {
    super(44, name, Type.PLANTE, Type.POISON, 60, 65, 70, 40);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


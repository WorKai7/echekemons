package pokemons;

public class Machopeur extends Pokemon{
  public Machopeur() {
    super(67, new String("Machopeur"), Type.COMBAT, Type.SANS, 80, 100, 70, 45);
  }

  public Machopeur(String name) {
    super(67, name, Type.COMBAT, Type.SANS, 80, 100, 70, 45);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


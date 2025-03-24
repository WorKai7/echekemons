package pokemons;

public class Kicklee extends Pokemon{
  public Kicklee() {
    super(106, new String("Kicklee"), Type.COMBAT, Type.SANS, 50, 120, 53, 87);
  }

  public Kicklee(String name) {
    super(106, name, Type.COMBAT, Type.SANS, 50, 120, 53, 87);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


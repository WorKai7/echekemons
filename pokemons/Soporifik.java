package pokemons;

public class Soporifik extends Pokemon{
  public Soporifik() {
    super(96, new String("Soporifik"), Type.PSY, Type.SANS, 60, 48, 45, 42);
  }

  public Soporifik(String name) {
    super(96, name, Type.PSY, Type.SANS, 60, 48, 45, 42);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Abra extends Pokemon{
  public Abra() {
    super(63, new String("Abra"), Type.PSY, Type.SANS, 25, 20, 15, 90);
  }

  public Abra(String name) {
    super(63, name, Type.PSY, Type.SANS, 25, 20, 15, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


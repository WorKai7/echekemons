package pokemons;

public class Mewtwo extends Pokemon{
  public Mewtwo() {
    super(150, new String("Mewtwo"), Type.PSY, Type.SANS, 106, 110, 90, 130);
  }

  public Mewtwo(String name) {
    super(150, name, Type.PSY, Type.SANS, 106, 110, 90, 130);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


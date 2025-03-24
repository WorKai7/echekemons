package pokemons;

public class Boustiflor extends Pokemon{
  public Boustiflor() {
    super(70, new String("Boustiflor"), Type.PLANTE, Type.POISON, 65, 90, 50, 55);
  }

  public Boustiflor(String name) {
    super(70, name, Type.PLANTE, Type.POISON, 65, 90, 50, 55);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


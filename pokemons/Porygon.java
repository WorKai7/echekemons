package pokemons;

public class Porygon extends Pokemon{
  public Porygon() {
    super(137, new String("Porygon"), Type.NORMAL, Type.SANS, 65, 60, 70, 40);
  }

  public Porygon(String name) {
    super(137, name, Type.NORMAL, Type.SANS, 65, 60, 70, 40);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Dracolosse extends Pokemon{
  public Dracolosse() {
    super(149, new String("Dracolosse"), Type.DRAGON, Type.VOL, 91, 134, 95, 80);
  }

  public Dracolosse(String name) {
    super(149, name, Type.DRAGON, Type.VOL, 91, 134, 95, 80);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


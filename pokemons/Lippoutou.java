package pokemons;

public class Lippoutou extends Pokemon{
  public Lippoutou() {
    super(124, new String("Lippoutou"), Type.GLACE, Type.PSY, 65, 50, 35, 95);
  }

  public Lippoutou(String name) {
    super(124, name, Type.GLACE, Type.PSY, 65, 50, 35, 95);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


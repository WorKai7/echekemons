package pokemons;

public class Grodoudou extends Pokemon{
  public Grodoudou() {
    super(40, new String("Grodoudou"), Type.NORMAL, Type.SANS, 140, 70, 45, 45);
  }

  public Grodoudou(String name) {
    super(40, name, Type.NORMAL, Type.SANS, 140, 70, 45, 45);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Rattata extends Pokemon{
  public Rattata() {
    super(19, new String("Rattata"), Type.NORMAL, Type.SANS, 30, 56, 35, 72);
  }

  public Rattata(String name) {
    super(19, name, Type.NORMAL, Type.SANS, 30, 56, 35, 72);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


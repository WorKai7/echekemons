package pokemons;

public class Noeunoeuf extends Pokemon{
  public Noeunoeuf() {
    super(102, new String("Noeunoeuf"), Type.PLANTE, Type.PSY, 60, 40, 80, 40);
  }

  public Noeunoeuf(String name) {
    super(102, name, Type.PLANTE, Type.PSY, 60, 40, 80, 40);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


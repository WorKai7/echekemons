package pokemons;

public class Noadkoko extends Pokemon{
  public Noadkoko() {
    super(103, new String("Noadkoko"), Type.PLANTE, Type.PSY, 95, 95, 85, 55);
  }

  public Noadkoko(String name) {
    super(103, name, Type.PLANTE, Type.PSY, 95, 95, 85, 55);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


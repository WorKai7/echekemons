package pokemons;

public class Kangourex extends Pokemon{
  public Kangourex() {
    super(115, new String("Kangourex"), Type.NORMAL, Type.SANS, 105, 95, 80, 90);
  }

  public Kangourex(String name) {
    super(115, name, Type.NORMAL, Type.SANS, 105, 95, 80, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


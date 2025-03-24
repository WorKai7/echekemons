package pokemons;

public class Dodrio extends Pokemon{
  public Dodrio() {
    super(85, new String("Dodrio"), Type.NORMAL, Type.VOL, 60, 110, 70, 100);
  }

  public Dodrio(String name) {
    super(85, name, Type.NORMAL, Type.VOL, 60, 110, 70, 100);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


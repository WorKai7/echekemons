package pokemons;

public class Roucarnage extends Pokemon{
  public Roucarnage() {
    super(18, new String("Roucarnage"), Type.NORMAL, Type.VOL, 83, 80, 75, 91);
  }

  public Roucarnage(String name) {
    super(18, name, Type.NORMAL, Type.VOL, 83, 80, 75, 91);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


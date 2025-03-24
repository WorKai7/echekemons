package pokemons;

public class Roucool extends Pokemon{
  public Roucool() {
    super(16, new String("Roucool"), Type.NORMAL, Type.VOL, 40, 45, 40, 56);
  }

  public Roucool(String name) {
    super(16, name, Type.NORMAL, Type.VOL, 40, 45, 40, 56);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Canarticho extends Pokemon{
  public Canarticho() {
    super(83, new String("Canarticho"), Type.NORMAL, Type.VOL, 52, 65, 55, 60);
  }

  public Canarticho(String name) {
    super(83, name, Type.NORMAL, Type.VOL, 52, 65, 55, 60);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


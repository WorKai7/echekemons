package pokemons;

public class Roucoups extends Pokemon{
  public Roucoups() {
    super(17, new String("Roucoups"), Type.NORMAL, Type.VOL, 63, 60, 55, 71);
  }

  public Roucoups(String name) {
    super(17, name, Type.NORMAL, Type.VOL, 63, 60, 55, 71);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


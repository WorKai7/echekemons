package pokemons;

public class Rapasdepic extends Pokemon{
  public Rapasdepic() {
    super(22, new String("Rapasdepic"), Type.NORMAL, Type.VOL, 65, 90, 65, 100);
  }

  public Rapasdepic(String name) {
    super(22, name, Type.NORMAL, Type.VOL, 65, 90, 65, 100);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


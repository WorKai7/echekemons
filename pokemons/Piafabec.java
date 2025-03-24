package pokemons;

public class Piafabec extends Pokemon{
  public Piafabec() {
    super(21, new String("Piafabec"), Type.NORMAL, Type.VOL, 40, 60, 30, 70);
  }

  public Piafabec(String name) {
    super(21, name, Type.NORMAL, Type.VOL, 40, 60, 30, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


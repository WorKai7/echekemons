package pokemons;

public class Papilusion extends Pokemon{
  public Papilusion() {
    super(12, new String("Papilusion"), Type.INSECTE, Type.VOL, 60, 45, 50, 70);
  }

  public Papilusion(String name) {
    super(12, name, Type.INSECTE, Type.VOL, 60, 45, 50, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


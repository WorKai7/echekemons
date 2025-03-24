package pokemons;

public class Racaillou extends Pokemon{
  public Racaillou() {
    super(74, new String("Racaillou"), Type.ROCHE, Type.SOL, 40, 80, 100, 20);
  }

  public Racaillou(String name) {
    super(74, name, Type.ROCHE, Type.SOL, 40, 80, 100, 20);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


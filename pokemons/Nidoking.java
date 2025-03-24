package pokemons;

public class Nidoking extends Pokemon{
  public Nidoking() {
    super(34, new String("Nidoking"), Type.POISON, Type.SOL, 81, 92, 77, 85);
  }

  public Nidoking(String name) {
    super(34, name, Type.POISON, Type.SOL, 81, 92, 77, 85);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


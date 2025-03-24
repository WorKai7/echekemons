package pokemons;

public class Voltorbe extends Pokemon{
  public Voltorbe() {
    super(100, new String("Voltorbe"), Type.ELECTRIK, Type.SANS, 40, 30, 50, 100);
  }

  public Voltorbe(String name) {
    super(100, name, Type.ELECTRIK, Type.SANS, 40, 30, 50, 100);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


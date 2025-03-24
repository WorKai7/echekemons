package pokemons;

public class Voltali extends Pokemon{
  public Voltali() {
    super(135, new String("Voltali"), Type.ELECTRIK, Type.SANS, 65, 65, 60, 130);
  }

  public Voltali(String name) {
    super(135, name, Type.ELECTRIK, Type.SANS, 65, 65, 60, 130);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


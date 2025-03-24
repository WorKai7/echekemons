package pokemons;

public class Sablaireau extends Pokemon{
  public Sablaireau() {
    super(28, new String("Sablaireau"), Type.SOL, Type.SANS, 75, 100, 110, 65);
  }

  public Sablaireau(String name) {
    super(28, name, Type.SOL, Type.SANS, 75, 100, 110, 65);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


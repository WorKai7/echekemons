package pokemons;

public class Sabelette extends Pokemon{
  public Sabelette() {
    super(27, new String("Sabelette"), Type.SOL, Type.SANS, 50, 75, 85, 40);
  }

  public Sabelette(String name) {
    super(27, name, Type.SOL, Type.SANS, 50, 75, 85, 40);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


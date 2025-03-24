package pokemons;

public class Rhinocorne extends Pokemon{
  public Rhinocorne() {
    super(111, new String("Rhinocorne"), Type.SOL, Type.ROCHE, 80, 85, 95, 25);
  }

  public Rhinocorne(String name) {
    super(111, name, Type.SOL, Type.ROCHE, 80, 85, 95, 25);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


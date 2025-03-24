package pokemons;

public class Rhinoferos extends Pokemon{
  public Rhinoferos() {
    super(112, new String("Rhinoféros"), Type.SOL, Type.ROCHE, 105, 130, 120, 40);
  }

  public Rhinoferos(String name) {
    super(112, name, Type.SOL, Type.ROCHE, 105, 130, 120, 40);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


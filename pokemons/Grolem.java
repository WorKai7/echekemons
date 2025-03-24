package pokemons;

public class Grolem extends Pokemon{
  public Grolem() {
    super(76, new String("Grolem"), Type.ROCHE, Type.SOL, 80, 110, 130, 45);
  }

  public Grolem(String name) {
    super(76, name, Type.ROCHE, Type.SOL, 80, 110, 130, 45);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


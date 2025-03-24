package pokemons;

public class Feunard extends Pokemon{
  public Feunard() {
    super(38, new String("Feunard"), Type.FEU, Type.SANS, 73, 76, 75, 100);
  }

  public Feunard(String name) {
    super(38, name, Type.FEU, Type.SANS, 73, 76, 75, 100);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Pyroli extends Pokemon{
  public Pyroli() {
    super(136, new String("Pyroli"), Type.FEU, Type.SANS, 65, 130, 60, 65);
  }

  public Pyroli(String name) {
    super(136, name, Type.FEU, Type.SANS, 65, 130, 60, 65);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


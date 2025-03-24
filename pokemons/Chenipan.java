package pokemons;

public class Chenipan extends Pokemon{
  public Chenipan() {
    super(10, new String("Chenipan"), Type.INSECTE, Type.SANS, 45, 30, 35, 45);
  }

  public Chenipan(String name) {
    super(10, name, Type.INSECTE, Type.SANS, 45, 30, 35, 45);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


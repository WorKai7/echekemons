package pokemons;

public class Ronflex extends Pokemon{
  public Ronflex() {
    super(143, new String("Ronflex"), Type.NORMAL, Type.SANS, 160, 110, 65, 30);
  }

  public Ronflex(String name) {
    super(143, name, Type.NORMAL, Type.SANS, 160, 110, 65, 30);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


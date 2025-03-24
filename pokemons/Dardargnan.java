package pokemons;

public class Dardargnan extends Pokemon{
  public Dardargnan() {
    super(15, new String("Dardargnan"), Type.INSECTE, Type.POISON, 65, 80, 40, 75);
  }

  public Dardargnan(String name) {
    super(15, name, Type.INSECTE, Type.POISON, 65, 80, 40, 75);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


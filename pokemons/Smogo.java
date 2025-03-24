package pokemons;

public class Smogo extends Pokemon{
  public Smogo() {
    super(109, new String("Smogo"), Type.POISON, Type.SANS, 40, 65, 95, 35);
  }

  public Smogo(String name) {
    super(109, name, Type.POISON, Type.SANS, 40, 65, 95, 35);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


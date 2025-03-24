package pokemons;

public class Salameche extends Pokemon{
  public Salameche() {
    super(4, new String("Salamèche"), Type.FEU, Type.SANS, 39, 52, 43, 65);
  }

  public Salameche(String name) {
    super(4, name, Type.FEU, Type.SANS, 39, 52, 43, 65);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


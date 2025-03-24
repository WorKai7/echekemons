package pokemons;

public class Paras extends Pokemon{
  public Paras() {
    super(46, new String("Paras"), Type.INSECTE, Type.PLANTE, 35, 70, 55, 25);
  }

  public Paras(String name) {
    super(46, name, Type.INSECTE, Type.PLANTE, 35, 70, 55, 25);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


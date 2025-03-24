package pokemons;

public class Insecateur extends Pokemon{
  public Insecateur() {
    super(123, new String("Insécateur"), Type.INSECTE, Type.VOL, 70, 110, 80, 105);
  }

  public Insecateur(String name) {
    super(123, name, Type.INSECTE, Type.VOL, 70, 110, 80, 105);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


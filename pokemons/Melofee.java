package pokemons;

public class Melofee extends Pokemon{
  public Melofee() {
    super(35, new String("Mélofée"), Type.NORMAL, Type.SANS, 70, 45, 48, 35);
  }

  public Melofee(String name) {
    super(35, name, Type.NORMAL, Type.SANS, 70, 45, 48, 35);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


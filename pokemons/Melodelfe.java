package pokemons;

public class Melodelfe extends Pokemon{
  public Melodelfe() {
    super(36, new String("Mélodelfe"), Type.NORMAL, Type.SANS, 95, 70, 73, 60);
  }

  public Melodelfe(String name) {
    super(36, name, Type.NORMAL, Type.SANS, 95, 70, 73, 60);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


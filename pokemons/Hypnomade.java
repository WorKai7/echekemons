package pokemons;

public class Hypnomade extends Pokemon{
  public Hypnomade() {
    super(97, new String("Hypnomade"), Type.PSY, Type.SANS, 85, 73, 70, 67);
  }

  public Hypnomade(String name) {
    super(97, name, Type.PSY, Type.SANS, 85, 73, 70, 67);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


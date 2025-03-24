package pokemons;

public class Grotadmorv extends Pokemon{
  public Grotadmorv() {
    super(89, new String("Grotadmorv"), Type.POISON, Type.SANS, 105, 105, 75, 50);
  }

  public Grotadmorv(String name) {
    super(89, name, Type.POISON, Type.SANS, 105, 105, 75, 50);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


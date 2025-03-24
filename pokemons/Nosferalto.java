package pokemons;

public class Nosferalto extends Pokemon{
  public Nosferalto() {
    super(42, new String("Nosferalto"), Type.POISON, Type.VOL, 75, 80, 70, 90);
  }

  public Nosferalto(String name) {
    super(42, name, Type.POISON, Type.VOL, 75, 80, 70, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


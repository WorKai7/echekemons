package pokemons;

public class Fantominus extends Pokemon{
  public Fantominus() {
    super(92, new String("Fantominus"), Type.SPECTRE, Type.POISON, 30, 35, 30, 80);
  }

  public Fantominus(String name) {
    super(92, name, Type.SPECTRE, Type.POISON, 30, 35, 30, 80);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


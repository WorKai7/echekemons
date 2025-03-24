package pokemons;

public class Spectrum extends Pokemon{
  public Spectrum() {
    super(93, new String("Spectrum"), Type.SPECTRE, Type.POISON, 45, 50, 45, 95);
  }

  public Spectrum(String name) {
    super(93, name, Type.SPECTRE, Type.POISON, 45, 50, 45, 95);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


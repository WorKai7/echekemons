package pokemons;

public class Ectoplasma extends Pokemon{
  public Ectoplasma() {
    super(94, new String("Ectoplasma"), Type.SPECTRE, Type.POISON, 60, 65, 60, 110);
  }

  public Ectoplasma(String name) {
    super(94, name, Type.SPECTRE, Type.POISON, 60, 65, 60, 110);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


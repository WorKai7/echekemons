package pokemons;

public class Nidorino extends Pokemon{
  public Nidorino() {
    super(33, new String("Nidorino"), Type.POISON, Type.SANS, 61, 72, 57, 65);
  }

  public Nidorino(String name) {
    super(33, name, Type.POISON, Type.SANS, 61, 72, 57, 65);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


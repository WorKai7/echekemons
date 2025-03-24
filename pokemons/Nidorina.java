package pokemons;

public class Nidorina extends Pokemon{
  public Nidorina() {
    super(30, new String("Nidorina"), Type.POISON, Type.SANS, 70, 62, 67, 56);
  }

  public Nidorina(String name) {
    super(30, name, Type.POISON, Type.SANS, 70, 62, 67, 56);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


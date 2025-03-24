package pokemons;

public class Empiflor extends Pokemon{
  public Empiflor() {
    super(71, new String("Empiflor"), Type.PLANTE, Type.POISON, 80, 105, 65, 70);
  }

  public Empiflor(String name) {
    super(71, name, Type.PLANTE, Type.POISON, 80, 105, 65, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


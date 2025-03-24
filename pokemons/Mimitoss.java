package pokemons;

public class Mimitoss extends Pokemon{
  public Mimitoss() {
    super(48, new String("Mimitoss"), Type.INSECTE, Type.POISON, 60, 55, 50, 45);
  }

  public Mimitoss(String name) {
    super(48, name, Type.INSECTE, Type.POISON, 60, 55, 50, 45);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


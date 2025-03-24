package pokemons;

public class Rafflesia extends Pokemon{
  public Rafflesia() {
    super(45, new String("Rafflesia"), Type.PLANTE, Type.POISON, 75, 80, 85, 50);
  }

  public Rafflesia(String name) {
    super(45, name, Type.PLANTE, Type.POISON, 75, 80, 85, 50);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Nosferapti extends Pokemon{
  public Nosferapti() {
    super(41, new String("Nosferapti"), Type.POISON, Type.VOL, 40, 45, 35, 55);
  }

  public Nosferapti(String name) {
    super(41, name, Type.POISON, Type.VOL, 40, 45, 35, 55);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


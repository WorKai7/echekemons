package pokemons;

public class Doduo extends Pokemon{
  public Doduo() {
    super(84, new String("Doduo"), Type.NORMAL, Type.VOL, 35, 85, 45, 75);
  }

  public Doduo(String name) {
    super(84, name, Type.NORMAL, Type.VOL, 35, 85, 45, 75);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


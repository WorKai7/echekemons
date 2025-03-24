package pokemons;

public class Tentacruel extends Pokemon{
  public Tentacruel() {
    super(73, new String("Tentacruel"), Type.EAU, Type.POISON, 80, 70, 65, 100);
  }

  public Tentacruel(String name) {
    super(73, name, Type.EAU, Type.POISON, 80, 70, 65, 100);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


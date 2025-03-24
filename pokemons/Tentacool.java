package pokemons;

public class Tentacool extends Pokemon{
  public Tentacool() {
    super(72, new String("Tentacool"), Type.EAU, Type.POISON, 40, 40, 35, 70);
  }

  public Tentacool(String name) {
    super(72, name, Type.EAU, Type.POISON, 40, 40, 35, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


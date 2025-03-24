package pokemons;

public class Staross extends Pokemon{
  public Staross() {
    super(121, new String("Staross"), Type.EAU, Type.PSY, 60, 75, 85, 115);
  }

  public Staross(String name) {
    super(121, name, Type.EAU, Type.PSY, 60, 75, 85, 115);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


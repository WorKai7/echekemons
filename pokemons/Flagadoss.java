package pokemons;

public class Flagadoss extends Pokemon{
  public Flagadoss() {
    super(80, new String("Flagadoss"), Type.EAU, Type.PSY, 95, 75, 110, 30);
  }

  public Flagadoss(String name) {
    super(80, name, Type.EAU, Type.PSY, 95, 75, 110, 30);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


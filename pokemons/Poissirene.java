package pokemons;

public class Poissirene extends Pokemon{
  public Poissirene() {
    super(118, new String("Poissirène"), Type.EAU, Type.SANS, 45, 67, 60, 63);
  }

  public Poissirene(String name) {
    super(118, name, Type.EAU, Type.SANS, 45, 67, 60, 63);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


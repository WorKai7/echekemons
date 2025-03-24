package pokemons;

public class Ramoloss extends Pokemon{
  public Ramoloss() {
    super(79, new String("Ramoloss"), Type.EAU, Type.PSY, 90, 65, 65, 15);
  }

  public Ramoloss(String name) {
    super(79, name, Type.EAU, Type.PSY, 90, 65, 65, 15);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


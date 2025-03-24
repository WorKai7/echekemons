package pokemons;

public class Lokhlass extends Pokemon{
  public Lokhlass() {
    super(131, new String("Lokhlass"), Type.EAU, Type.GLACE, 130, 85, 80, 60);
  }

  public Lokhlass(String name) {
    super(131, name, Type.EAU, Type.GLACE, 130, 85, 80, 60);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


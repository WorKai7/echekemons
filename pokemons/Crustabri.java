package pokemons;

public class Crustabri extends Pokemon{
  public Crustabri() {
    super(91, new String("Crustabri"), Type.EAU, Type.GLACE, 50, 95, 180, 70);
  }

  public Crustabri(String name) {
    super(91, name, Type.EAU, Type.GLACE, 50, 95, 180, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


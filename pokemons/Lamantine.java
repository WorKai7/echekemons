package pokemons;

public class Lamantine extends Pokemon{
  public Lamantine() {
    super(87, new String("Lamantine"), Type.EAU, Type.GLACE, 90, 70, 80, 70);
  }

  public Lamantine(String name) {
    super(87, name, Type.EAU, Type.GLACE, 90, 70, 80, 70);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


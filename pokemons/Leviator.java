package pokemons;

public class Leviator extends Pokemon{
  public Leviator() {
    super(130, new String("Léviator"), Type.EAU, Type.VOL, 95, 125, 79, 81);
  }

  public Leviator(String name) {
    super(130, name, Type.EAU, Type.VOL, 95, 125, 79, 81);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


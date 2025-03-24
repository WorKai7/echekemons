package pokemons;

public class Herbizarre extends Pokemon{
  public Herbizarre() {
    super(2, new String("Herbizarre"), Type.PLANTE, Type.POISON, 60, 62, 63, 60);
  }

  public Herbizarre(String name) {
    super(2, name, Type.PLANTE, Type.POISON, 60, 62, 63, 60);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


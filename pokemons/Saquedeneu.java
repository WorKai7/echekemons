package pokemons;

public class Saquedeneu extends Pokemon{
  public Saquedeneu() {
    super(114, new String("Saquedeneu"), Type.PLANTE, Type.SANS, 65, 55, 115, 60);
  }

  public Saquedeneu(String name) {
    super(114, name, Type.PLANTE, Type.SANS, 65, 55, 115, 60);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Rondoudou extends Pokemon{
  public Rondoudou() {
    super(39, new String("Rondoudou"), Type.NORMAL, Type.SANS, 115, 45, 20, 20);
  }

  public Rondoudou(String name) {
    super(39, name, Type.NORMAL, Type.SANS, 115, 45, 20, 20);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


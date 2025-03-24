package pokemons;

public class M_Mime extends Pokemon{
  public M_Mime() {
    super(122, new String("M. Mime"), Type.PSY, Type.SANS, 40, 45, 65, 90);
  }

  public M_Mime(String name) {
    super(122, name, Type.PSY, Type.SANS, 40, 45, 65, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


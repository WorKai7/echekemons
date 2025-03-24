package pokemons;

public class Dracaufeu extends Pokemon{
  public Dracaufeu() {
    super(6, new String("Dracaufeu"), Type.FEU, Type.VOL, 78, 84, 78, 100);
  }

  public Dracaufeu(String name) {
    super(6, name, Type.FEU, Type.VOL, 78, 84, 78, 100);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


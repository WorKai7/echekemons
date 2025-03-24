package pokemons;

public class Ptera extends Pokemon{
  public Ptera() {
    super(142, new String("Ptéra"), Type.ROCHE, Type.VOL, 80, 105, 65, 130);
  }

  public Ptera(String name) {
    super(142, name, Type.ROCHE, Type.VOL, 80, 105, 65, 130);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


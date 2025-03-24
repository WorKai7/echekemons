package pokemons;

public class NidoranF extends Pokemon{
  public NidoranF() {
    super(29, new String("Nidoran♀"), Type.POISON, Type.SANS, 55, 47, 52, 41);
  }

  public NidoranF(String name) {
    super(29, name, Type.POISON, Type.SANS, 55, 47, 52, 41);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


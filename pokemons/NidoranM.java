package pokemons;

public class NidoranM extends Pokemon{
  public NidoranM() {
    super(32, new String("Nidoran♂"), Type.POISON, Type.SANS, 46, 57, 40, 50);
  }

  public NidoranM(String name) {
    super(32, name, Type.POISON, Type.SANS, 46, 57, 40, 50);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


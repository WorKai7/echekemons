package pokemons;

public class Excelangue extends Pokemon{
  public Excelangue() {
    super(108, new String("Excelangue"), Type.NORMAL, Type.SANS, 90, 55, 75, 30);
  }

  public Excelangue(String name) {
    super(108, name, Type.NORMAL, Type.SANS, 90, 55, 75, 30);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


package pokemons;

public class Triopikeur extends Pokemon{
  public Triopikeur() {
    super(51, new String("Triopikeur"), Type.SOL, Type.SANS, 35, 80, 50, 120);
  }

  public Triopikeur(String name) {
    super(51, name, Type.SOL, Type.SANS, 35, 80, 50, 120);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


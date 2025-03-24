package pokemons;

public class Aeromite extends Pokemon{
  public Aeromite() {
    super(49, new String("Aéromite"), Type.INSECTE, Type.POISON, 70, 65, 60, 90);
  }

  public Aeromite(String name) {
    super(49, name, Type.INSECTE, Type.POISON, 70, 65, 60, 90);
  }

  public String getEspece() {
    return new String(Type.espece[this.getId()-1]);
  }
}


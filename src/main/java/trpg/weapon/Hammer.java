package trpg.weapon;

public class Hammer extends Weapon {

  public Hammer() {
    super();
  }

  public String asciiArt() {
    return "Hammer";
  }

  public String toString() {
    return "Marteau: " + super.toString();
  }

}

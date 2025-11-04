package trpg.weapon;

public class Bow extends Weapon {

  public Bow() {
    super();
  }

  public String asciiArt() {
    return "bow";
    // " /| \n" +
    // " / | \n" +
    // " / | \n" +
    // " | | \n" +
    // " \ | \n" +
    // " \ | \n" +
    // " \ | \n" +
    // " \| \n"
    // ;
  }

  public String toString() {
    return "Arc: " + super.toString();
  }
}

package trpg.weapon;

public class Axe extends Weapon {
  public static double MONSTER_DAMAGE_RATIO = 1.2;
  public static double OBSTACLE_DAMAGE_RATIO = 0.8;

  public Axe() {
    super();
  }

  public String asciiArt() {
    return "axe";
    // " /''\/\ \n" +
    // "| ||>\n" +
    // "\___/|| \n" +
    // " || \n" +
    // " || \n" +
    // " || \n" +
    // " - \n";
  }

  public String toString() {
    return "Hache: " + super.toString();
  }
}

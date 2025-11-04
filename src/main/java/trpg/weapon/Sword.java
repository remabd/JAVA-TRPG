package trpg.weapon;

public class Sword extends Weapon {
  public static double MONSTER_DAMAGE_RATIO = 1;
  public static double OBSTACLE_DAMAGE_RATIO = 1;

  public Sword() {
    super();
  }

  public String asciiArt() {
    return "Sword";
  }

  public String toString() {
    return "Épée: " + super.toString();
  }
}

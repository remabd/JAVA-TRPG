package rpg;

public class Obstacle implements Healthy {
  private int hp;

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }
}

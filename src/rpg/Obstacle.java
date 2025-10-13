package rpg;

public class Obstacle extends Healthy {
  private int hp;

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }

  public void takeDamage(Axe a) {
    this.hp -= a.getDamage() * a.OBSTACLE_DAMAGE_RATIO;
  }
}

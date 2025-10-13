package rpg;

public abstract class Healthy {
  public int hp;
  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }
}

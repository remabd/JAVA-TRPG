package rpg;

public abstract class Healthy {
  public int hp;

  public Healthy() {}

  public Healthy(int hp) {
    this.hp = hp;
  }

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }
}

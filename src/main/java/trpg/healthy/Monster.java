package trpg.healthy;

public class Monster extends Healthy {
  private int hp;
  private int damage;

  public Monster() {
    super();
  }

  public Monster(int damage) {
    super();
    this.damage = damage;
  }

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }

}

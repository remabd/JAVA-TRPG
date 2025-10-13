package rpg;

public class Monster extends Healthy {
  private int hp;

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }
  
}

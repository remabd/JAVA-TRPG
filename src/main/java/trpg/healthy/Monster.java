package trpg.healthy;

import trpg.map.*;
import trpg.weapon.*;

public class Monster extends Healthy {
  private int hp;
  private int damage;
  private Position position;

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

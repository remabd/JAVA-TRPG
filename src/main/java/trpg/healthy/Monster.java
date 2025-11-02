package trpg.healthy;

import trpg.map.*;
import trpg.weapon.*;

public class Monster extends Healthy {
  private int hp;
  private int damage;
  private Position position;

  public Monster(int diff, Position p) {
    int h = (int) Math.floor(Math.random() * 30 * diff);
    this.damage = (int) Math.floor(Math.random() * 10 * diff);
    super(h, p);
  }

  public void hit(Player p) {
    p.getHit(this.damage);
  }

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }
}

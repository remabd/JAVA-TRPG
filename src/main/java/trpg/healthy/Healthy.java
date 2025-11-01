package trpg.healthy;

import trpg.map.*;
import trpg.weapon.*;

public abstract class Healthy extends Positionnable {
  public int hp;
  private Position position;

  public Healthy(int hp, Position p) {
    super(p);
    this.hp = hp;
  }

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }
}

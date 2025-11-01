package trpg.healthy;

import trpg.weapon.*;
import trpg.map.*;

public class Obstacle extends Healthy {
  private int hp;
  private Position position;

  public Obstacle(Position p) {
    int h = (int) Math.floor(Math.random() * 60);
    super(h, p);
  }

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }

  // public void takeDamage(Axe a) {
  // this.hp -= a.getDamage() * a.OBSTACLE_DAMAGE_RATIO;
  // }
}

package trpg.healthy;

import trpg.weapon.*;
import trpg.map.*;

public class Obstacle extends Healthy {
  public Obstacle(Position p) {
    int h = (int) Math.floor(Math.random() * 60);
    super(h, p);
  }

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }

}

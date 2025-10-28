package trpg.healthy;

import trpg.map.*;
import trpg.weapon.*;

public abstract class Healthy implements Positionnable {
  public int hp;
  private Position position;

  public Healthy() {
  }

  public Healthy(int hp) {
    this.hp = hp;
  }

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }

  public Position getPosition() {
    return this.position;
  }

  public void setPosition(Position p) {
    this.position = p;
  }
}

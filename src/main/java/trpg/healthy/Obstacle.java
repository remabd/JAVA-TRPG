package trpg.healthy;

import trpg.weapon.*;
import trpg.NumberUtil;
import trpg.map.*;

public class Obstacle extends Healthy {
  public Obstacle(Position p) {
    int h = NumberUtil.randomNbr(60, 80);
    super(h, p);
  }

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }

  public void resolveEncounter(Player player) {
    System.out.println("Un obstacle se dresse devant vous, vous décidez de le détruire.");
    int counter = 0;
    while (this.isAlive()) {
      player.hit(this);
      counter++;
    }
    System.out.println("L'obstacle a été détruit en " + counter + " coups.");
  }

  public String getSymbol() {
    return " O ";
  }
}

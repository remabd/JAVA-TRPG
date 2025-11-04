package trpg.healthy;

import java.util.ArrayList;

import trpg.map.*;
import trpg.weapon.*;

public class Player extends Healthy {
  private int gold;
  private int lvl;
  private int xp;
  public Weapon weapon;

  public Player(int hp, Weapon w) {
    Position p = new Position(0, 0);
    this.weapon = w;
    super(hp, p);
  }

  public void takeDamage(int damage) {
    this.hp -= damage;
  }

  public int getGold() {
    return this.gold;
  }

  public void gainGold(int amount) {
    this.gold += amount;
  }

  public void spendGold(int amount) {
    this.gold -= amount;
  }

  public void swapWeapon(Weapon w) {
    this.weapon = w;
  }

  public void hit(Healthy target) {
    target.takeDamage(this.weapon);
  }
}

package trpg.weapon;

import trpg.NumberUtil;

public abstract class Weapon {
  private int damage;
  private int price;

  public Weapon() {
    this.damage = NumberUtil.randomNbr(10, 20);
    this.price = NumberUtil.randomNbr(30, 40);
  }

  public int getDamage() {
    return this.damage;
  }

  public int getPrice() {
    return this.price;
  }

  public abstract String asciiArt();

  public String toString() {
    return this.damage + "Atk, " + this.price + "g.";
  }
}

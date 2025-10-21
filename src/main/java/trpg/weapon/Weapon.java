package trpg.weapon;

public abstract class Weapon {
  private int damage;
  private int price;
  private int rarity;

  public Weapon() {
  }

  public int getDamage() {
    return this.damage;
  }

  public int getPrice() {
    return this.price;
  }

  public abstract String asciiArt();
}

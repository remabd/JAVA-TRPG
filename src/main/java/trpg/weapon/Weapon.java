package trpg.weapon;

public abstract class Weapon {
  private int damage;
  private int price;

  public Weapon() {
    this.damage = (int) Math.floor(Math.random() * 15);
    this.price = (int) Math.floor(Math.random() * 35);
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

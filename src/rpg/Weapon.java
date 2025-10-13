package rpg;

public abstract class Weapon {
  private int damage;

  public Weapon(int d) {
    this.damage = d;
  }

  public int getDamage() {
    return this.damage;
  }

  public abstract String asciiArt() {};
}

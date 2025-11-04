package trpg.healthy;

import trpg.map.*;
import trpg.weapon.*;

public class Monster extends Healthy {
  public int damage;

  public Monster(int diff, Position p) {
    int h = (int) Math.floor(Math.random() * 30 * diff);
    this.damage = (int) Math.floor(Math.random() * 10 * diff);
    super(h, p);
  }

  public void hit(Player p) {
    p.takeDamage(this.damage);
  }

  public void takeDamage(Weapon w) {
    this.hp -= w.getDamage();
  }

  public void resolveEncounter(Player player) {
    System.out.println("Un monstre se dresse devant vous. Préparez vous au combat !");
    while (player.isAlive() && this.isAlive()) {
      player.hit(this);
      if (player.isAlive()) {
        this.hit(player);
      }
    }
    if (!this.isAlive()) {
      System.out.println("Le monstre est mort");
      System.out.println("Il vous reste " + player.getHp() + " points de vie");
      int gold = 20 + (int) Math.floor(Math.random() * 20);
      int xp = 20 + (int) Math.floor(Math.random() * 20);
      player.gainGold(gold);
      player.gainXP(xp);
    } else {
      System.out.println("Vous êtes mort");
      return;
    }
  }

  public String getSymbol() {
    return " M ";
  }
}

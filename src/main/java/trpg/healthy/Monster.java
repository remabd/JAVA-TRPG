package trpg.healthy;

import trpg.map.*;
import trpg.weapon.*;
import trpg.NumberUtil;

public class Monster extends Healthy {
  public int damage;

  public Monster(int diff, Position p) {
    int h = NumberUtil.randomNbr(30, 50);
    this.damage = NumberUtil.randomNbr(10, 15);
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
      int gold = NumberUtil.randomNbr(20, 30);
      int xp = NumberUtil.randomNbr(10, 15);
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

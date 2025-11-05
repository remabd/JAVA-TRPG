package trpg.healthy;

import java.util.ArrayList;

import trpg.map.*;
import trpg.weapon.*;

public class Player extends Healthy {
  private int gold;
  private int maxHP;
  private int lvl;
  private int xp;
  public Weapon weapon;

  public Player(int hp, Weapon w) {
    Position p = new Position(0, 0);
    this.weapon = w;
    this.maxHP = hp;
    super(hp, p);
  }

  public void takeDamage(int damage) {
    this.hp -= damage;
  }

  public int getGold() {
    return this.gold;
  }

  public void gainGold(int amount) {
    System.out.println("Vous avez gagné " + amount + "g.");
    this.gold += amount;
    System.out.println("Vous avez " + this.gold + "g.");
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

  public void showInformation() {
    System.out.println("Points de vie: " + this.hp);
    System.out.println("Niveau: " + this.lvl);
    System.out.println("Arme équipée: " + this.weapon.toString());
  }

  public void gainXP(int xp) {
    System.out.println("Vous avez gagné " + xp + " points d'experiences");
    this.xp += xp;
    if (xp >= lvl * 10) {
      this.xp -= lvl * 10;
      this.lvl++;
      this.maxHP += 5;
      this.heal(this.getMissingHP());
      System.out.println("Vous avez gagné un niveau, vous êtes niveau " + this.lvl);
    }
  }

  public void heal(int amount) {
    this.hp += amount;
  }

  public int getMissingHP() {
    return this.maxHP - this.hp;
  }

  public String getSymbol() {
    return " P ";
  }

  public void resolveEncounter(Player player) {
  };
}

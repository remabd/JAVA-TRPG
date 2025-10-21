package trpg.healthy;

import java.util.ArrayList;

import trpg.weapon.*;

public class Player {
  private int hp;
  private int mp;
  private int gold;
  private int lvl;
  private int xp;
  private Weapon weapon;
  private int position;
  private ArrayList<Weapon> inventory;

  public Player() {
  }

  public void buyWeapon(Weapon w, int price) {
    this.inventory.add(w);
    this.gold -= weapon.getPrice();
  }

  public void sellWeapon(Weapon w) {
    int index = this.inventory.indexOf(w);
    if (index != -1) {
      this.inventory.remove(index);
      this.gold += weapon.getPrice();
    }
  }

  public void changeWeapon(Weapon w) {
    if (inventory.contains(w)) {
      this.weapon = w;
    }
  }
}

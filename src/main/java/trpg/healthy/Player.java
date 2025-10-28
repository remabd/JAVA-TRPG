package trpg.healthy;

import java.util.ArrayList;

import trpg.map.*;
import trpg.weapon.*;

public class Player implements Positionnable {
  private int hp;
  private int mp;
  private int gold;
  private int lvl;
  private int xp;
  private Weapon weapon;
  private Position position;
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

  public Position getPosition() {
    return this.position;
  }

  public void setPosition(Position p) {
    this.position = p;
  }

}

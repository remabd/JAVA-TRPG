package trpg;

import java.util.ArrayList;
import java.util.Map;

import trpg.map.*;
import trpg.weapon.*;

public class WeaponStore extends Positionnable {
  private ArrayList<Weapon> weapons;
  private Position position;

  public WeaponStore(Position p) {
    super(p);
    this.weapons = new ArrayList<Weapon>();
    this.initialize();
  }

  private void initialize() {
    int nbWeapons = (int) Math.floor(Math.random() * 6);
    for (int i = 0; i < nbWeapons; i++) {
      int typeWeapon = (int) Math.floor(Math.random() * 4);
      Weapon w;
      switch (typeWeapon) {
        case 0:
          w = new Axe();
          break;
        case 1:
          w = new Sword();
          break;
        case 2:
          w = new Hammer();
          break;
        case 3:
          w = new Bow();
          break;
        default:
          System.out.println("Erreur lors de la céation de l'arme");
          return;
      }
      this.weapons.add(w);
    }
  }

  public ArrayList<Weapon> getShop() {
    return this.weapons;
  }

  public void showShop() {
    String inventory = "Magasin: [ 1: " + this.weapons.get(0);
    for (int i = 1; i < this.weapons.size(); i++) {
      inventory += ", " + i + 1 + ": " + this.weapons.get(i);
    }
    inventory += "].";
    System.out.println(inventory);
  }

  public void sell(Weapon w) {
    this.weapons.remove(this.weapons.indexOf(w));
  }
}

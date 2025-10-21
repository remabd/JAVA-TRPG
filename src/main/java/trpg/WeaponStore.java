package trpg;

import java.util.ArrayList;
import java.util.Map;

import trpg.weapon.*;

public class WeaponStore {
  private ArrayList<Weapon> weapons;

  public WeaponStore() {
  }

  public ArrayList<Weapon> showShop() {
    return this.weapons;
  }

  public void sell(Weapon w) {
    this.weapons.remove(this.weapons.indexOf(w));
  }
}

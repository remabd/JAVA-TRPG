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
  }

  public ArrayList<Weapon> showShop() {
    return this.weapons;
  }

  public void sell(Weapon w) {
    this.weapons.remove(this.weapons.indexOf(w));
  }
}

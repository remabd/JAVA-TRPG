package trpg;

import java.util.ArrayList;
import java.util.Map;

import trpg.map.*;
import trpg.weapon.*;

public class WeaponStore implements Positionnable {
  private ArrayList<Weapon> weapons;
  private Position position;

  public WeaponStore() {
  }

  public ArrayList<Weapon> showShop() {
    return this.weapons;
  }

  public void sell(Weapon w) {
    this.weapons.remove(this.weapons.indexOf(w));
  }

  public void setPosition(Position p) {
    this.position = p;
  }

  public Position getPosition() {
    return this.position;
  }
}

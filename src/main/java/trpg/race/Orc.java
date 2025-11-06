package trpg.race;

import trpg.healthy.*;
import trpg.weapon.*;
import trpg.NumberUtil;

public class Orc extends Player {

  public Orc() {
    Weapon w = new Axe();
    int hp = NumberUtil.randomNbr(60, 80);
    super(hp, w);
  }
}

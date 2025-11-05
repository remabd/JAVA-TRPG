package trpg.race;

import trpg.weapon.*;
import trpg.NumberUtil;
import trpg.healthy.*;

public class Human extends Player {

  public Human() {
    Weapon w = new Sword();
    super(NumberUtil.randomNbr(40, 60), w);
  }
}

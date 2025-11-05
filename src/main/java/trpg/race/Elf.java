package trpg.race;

import trpg.healthy.*;
import trpg.weapon.*;

public class Elf extends Player {

  public Elf() {
    Weapon w = new Bow();
    int hp = NumberUtil.randomNbr(40, 60);
    super(hp, w);
  }
}

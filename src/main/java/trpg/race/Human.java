package trpg.race;

import trpg.weapon.*;
import trpg.healthy.*;

public class Human extends Player {

  public Human() {
    Weapon w = new Sword();
    super((int) Math.floor(Math.random() * 40), w);
  }
}

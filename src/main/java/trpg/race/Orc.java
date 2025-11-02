package trpg.race;

import trpg.healthy.*;
import trpg.weapon.*;

public class Orc extends Player {

  public Orc() {
    Weapon w = new Axe();
    int hp = (int) Math.floor(Math.random() * 80);
    super(hp, w);
  }
}

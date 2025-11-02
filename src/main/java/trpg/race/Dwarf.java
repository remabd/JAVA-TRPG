package trpg.race;

import trpg.healthy.*;
import trpg.weapon.*;

public class Dwarf extends Player {

  public Dwarf() {
    Weapon w = new Hammer();
    int hp = (int) Math.floor(Math.random() * 80);
    super(hp, w);
  }
}

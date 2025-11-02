package trpg.race;

import trpg.healthy.*;
import trpg.weapon.*;

public class Elf extends Player {

  public Elf() {
    Weapon w = new Bow();
    int hp = (int) Math.floor(Math.random() * 40);
    super(hp, w);
  }
}

package trpg.encounterable;

import trpg.map.Positionnable;
import trpg.map.Position;
import trpg.healthy.Player;

public class Fontain extends Positionnable {
  private int charges;

  public Fontain(Position p) {
    super(p);
    this.charges = 3;
  }

  public void resolveEncounter(Player player) {
    player.heal(player.getMissingHP());
    this.charges--;
    System.out.println("Vous êtes soigné, il reste " + this.charges + " charges à la fontaine");
  }

  public String getSymbol() {
    return " F ";
  }
}

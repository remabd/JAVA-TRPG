package trpg.encounterable;

import trpg.map.Positionnable;
import trpg.map.Position;
import trpg.healthy.Player;

public class Fontain extends Positionnable {
  private int charges;

  public Fontain(Position p) {
    super(p);
  }

  public void resolveEncounter(Player player) {
    player.heal(player.getMissingHP());
  }

  public String getSymbol() {
    return " F ";
  }
}

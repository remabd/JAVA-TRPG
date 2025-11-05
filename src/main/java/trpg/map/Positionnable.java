package trpg.map;

import trpg.map.Position;
import trpg.healthy.Player;

public abstract class Positionnable {
  private Position position;

  public Positionnable(Position p) {
    this.position = p;
  }

  public Position getPosition() {
    return this.position;
  }

  public void move(Position p) {
    if (this.position.isNextTo(p)) {
      this.position = p;
    }
  }

  public abstract void resolveEncounter(Player player);

  public abstract String getSymbol();
}

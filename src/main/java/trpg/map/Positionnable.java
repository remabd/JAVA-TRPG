package trpg.map;

import trpg.map.Position;

public abstract class Positionnable {
  private Position position;

  public Positionnable(Position p) {
    this.position = p;
  }

  public Position getPosition() {
    return this.position;
  }

  public void setPosition(Position p) {
    this.position = p;
  }

  public void move(Position p) {
    if (this.position.isNextTo(p)) {
      this.position = p;
    }
  }
}

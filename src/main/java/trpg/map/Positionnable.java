package trpg.map;

import trpg.map.Position;

public interface Positionnable {
  public Position position = new Position();

  public Position getPosition();

  public void setPosition(Position p);
}

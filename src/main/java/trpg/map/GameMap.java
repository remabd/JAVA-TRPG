package trpg.map;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

import trpg.map.Position;

public class GameMap<E> {
  private int size;
  private int difficulty;
  private ConcurrentMap<Position, Tile<E>> tiles;
  private Player player;

  public GameMap() {
  };

  public GameMap(int s, int d) {
    this.size = s;
    this.difficulty = d;
  }

  public void initialize() {

  }

  private void resolve() {
    for (Position p : tiles.keySet()) {
      if (p == player.getPosition()) {
        if (tiles.get(p).getEventType == "combat") {

        }
      }
    }
  }

  public String toString() {
    String map = new String();
    for (Tile<E> tile : tiles.values()) {
      map += tile.toString();
    }
    return map;
  }
}

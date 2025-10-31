package trpg.map;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

import trpg.*;
import trpg.healthy.*;

public class GameMap<E extends Positionnable> {
  private int size;
  // private int difficulty;
  private ConcurrentMap<Position, Tile<E>> tiles;

  public GameMap() {
  };

  public GameMap(int s, int d) {
    this.size = s;
    // this.difficulty = d;
  }

  public void initialize() {
    this.tiles.put(new Position(0, 0), new Tile<>(new Position(0, 0)));
    for (int i = 0; i < Math.pow(this.size, 2) - 2; i++) {
      Tile<E> t;
      int r = (int) Math.floor(Math.random() * 10);
      if (r <= 2) {
        t = new Tile<Monster>(new Position(i % this.size, i / this.size), new Monster());
      } else if (r <= 4) {
        t = new Tile<Obstacle>(new Position(i % this.size, i / this.size), new Obstacle());
      } else if (r == 5) {
        t = new Tile<WeaponStore>(new Position(i % this.size, i / this.size), new WeaponStore());
      } else {
        t = new Tile<>(new Position(this.size, this.size));
      }
      this.tiles.put(t.getPosition(), t);
    }
    new Tile<>(new Position(this.size, this.size));
  }

  private void resolve() {
  }

  public String toString() {
    String map = new String();
    for (Tile<E> tile : tiles.values()) {
      map += tile.toString();
    }
    return map;
  }
}

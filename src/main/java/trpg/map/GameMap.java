package trpg.map;

import java.util.ArrayList;
import java.util.concurrent.ConcurrentMap;

import trpg.*;
import trpg.healthy.*;

public class GameMap {
  private int size;
  private int difficulty;
  private ConcurrentMap<Position, Positionnable> tiles;

  public GameMap() {
  };

  public GameMap(int s, int d) {
    this.size = s;
    this.difficulty = d;
  }

  public void initialize() {
    this.tiles.put(new Position(0, 0), null);
    for (int i = 0; i < Math.pow(this.size, 2) - 2; i++) {
      Position p = new Position(i % this.size, i / this.size);
      int r = (int) Math.floor(Math.random() * 10);
      if (r <= 2) {
        this.tiles.put(p, new Monster(this.difficulty, p));
      } else if (r <= 4) {
        this.tiles.put(p, new Obstacle(p));
      } else if (r == 5) {
        this.tiles.put(p, new WeaponStore(p));
      } else {
        this.tiles.put(new Position(i % this.size, i / this.size), null);
      }
    }
    this.tiles.put(new Position(this.size, this.size), null);
  }

  private void resolve() {
  }

  // public String display() {
  //
  // }

  public void move(Positionnable positionnable, Position newPosition) {
    for (Position p : this.tiles.keySet()) {
      if (p.equals(positionnable.getPosition())) {
        positionnable.move(newPosition);
      }
    }
  }
}

package trpg.map;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import trpg.*;
import trpg.healthy.*;
import trpg.map.Position;
import trpg.map.Positionnable;

public class GameMap {
  private int size;
  private int difficulty;
  private HashMap<Position, Positionnable> tiles;
  private Player player;
  private EventResolver eventResolver;

  public GameMap() {
  };

  public GameMap(int s, int d, Player p) {
    this.size = s;
    this.difficulty = d;
    this.player = p;
    this.eventResolver = new EventResolver();
    this.initialize();
  }

  private void initialize() {
    this.tiles = new HashMap<Position, Positionnable>();

    for (int j = 0; j < this.size; j++) {
      for (int i = 0; i < this.size; i++) {
        Position p = new Position(j, i);
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
    }
    this.tiles.put(new Position(0, 0), null);
    this.tiles.put(new Position(this.size, this.size), null);
  }

  public void resolvePosition(Position p) {
    this.tiles.put(p, null);
    Positionnable event = this.tiles.get(this.player.getPosition());
    if (event == null) {
      return;
    } else {
      event.resolveEncounter(this.player);
    }
  }

  public void display() {
    System.out.println("Légende: P = Player, M = Monstre, O = Obstacle, S = Shop, E = Exit");
    String map = new String();
    for (int i = 0; i < this.size; i++) {
      for (int j = 0; j < this.size; j++) {
        if (i == size - 1 && j == size - 1) {
          map += " E ";
        } else {
          if (new Position(j, i).equals(this.player.getPosition())) {
            map += " P ";
          } else {
            Positionnable e = tiles.get(new Position(j, i));
            if (e == null) {
              map += " . ";
            } else {
              map += e.getSymbol();
            }
          }
        }
      }
      map += "\n";
    }
    System.out.println(map);
  }

  public void move(Positionnable positionnable, Position newPosition) {
    for (Position p : this.tiles.keySet()) {
      if (p.equals(positionnable.getPosition())) {
        positionnable.move(newPosition);
      }
    }
  }
}

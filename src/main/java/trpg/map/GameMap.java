package t.rpg.map;

import java.util.ArrayList;

public class GameMap<E> {
  private int size;
  private int difficulty;
  private ArrayList<Tile<E>> tiles;

  public GameMap() {
  };

  public GameMap(int s, int d) {
    this.size = s;
    this.difficulty = d;
  }

  public GameMap(int s, int d, ArrayList<Tile<E>> t) {
    this.size = s;
    this.difficulty = d;
    this.tiles = t;
  }

  public void initialize() {
  }

  private Tile<E> createEncounter() {

  }

  public String toString() {
    String map = new String();
    for (Tile<E> tile : tiles) {
      map += tile.toString();
    }
    return map;
  }
}

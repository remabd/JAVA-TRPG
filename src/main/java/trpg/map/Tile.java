package t.rpg.map;

public abstract class Tile<E> {
  private int position;
  private E event;

  public Tile() {
  };

  public Tile(E e, int p) {
    this.position = p;
    this.event = e;
  }

  public String toString() {
    return "|_E_|";
  }
}

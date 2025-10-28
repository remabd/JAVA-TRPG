package trpg.map;

public class Tile<E> {
  private Position position;
  private E event;

  public Tile() {
  };

  public Tile(E e, Position p) {
    this.position = p;
    this.event = e;
  }

  public String toString() {
    return "|_E_|";
  }

  public String getEventType() {
    return typeof(this.event);
  }

}

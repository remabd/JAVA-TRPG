package trpg.map;

public class Tile<E extends Positionnable> {
  private Position position;
  private E event;

  public Tile(Position p) {
    this.position = p;
    this.event = null;
  };

  public Tile(Position p, E e) {
    this.position = p;
    this.event = e;
  }

  public Position getPosition() {
    return this.position;
  }

  // public String toString() {
  //
  // // return "|_E_|";
  // }
  //
  // public String getEventType() {
  // // return typeof(this.event);
  // }

}

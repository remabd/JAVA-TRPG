package trpg.map;

public class Position {
  private int x;
  private int y;

  public Position() {
  }

  public Position(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public int[] getPosition() {
    int[] position = { this.x, this.y };
    return position;
  }
}

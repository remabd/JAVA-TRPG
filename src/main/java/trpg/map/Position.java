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

  public boolean isNextTo(Position p) {
    if (this.equals(p)) {
      return false;
    }
    if (this.x >= p.getPosition()[0] - 1 && this.x <= p.getPosition()[0] + 1 && this.y == p.getPosition()[1]) {
      return true;
    } else if (this.y >= p.getPosition()[1] - 1 && this.y <= p.getPosition()[1] + 1 && this.x == p.getPosition()[0]) {
      return true;
    }
    return false;
  }

  public boolean equals(Position p) {
    if (this.x == p.getPosition()[0] && this.y == p.getPosition()[1]) {
      return true;
    }
    return false;
  }
}

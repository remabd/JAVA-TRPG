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

  public Position shiftGauche() {
    return new Position(this.getPosition()[0] - 1, this.getPosition()[1]);
  }

  public Position shiftHaut() {
    return new Position(this.getPosition()[0], this.getPosition()[1] - 1);
  }

  public Position shiftDroite() {
    return new Position(this.getPosition()[0] + 1, this.getPosition()[1]);
  }

  public Position shiftBas() {
    return new Position(this.getPosition()[0], this.getPosition()[1] + 1);
  }

  @Override
  public boolean equals(Object o) {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    Position position = (Position) o;
    return x == position.x && y == position.y;
  }

  @Override
  public int hashCode() {
    return 31 * x + y;
  }

  public String toString() {
    return "(" + x + ", " + y + ")";
  }
}

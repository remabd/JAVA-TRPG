package trpg;

public final class NumberUtil {
  private NumberUtil() {
  };

  public static int randomNbr(int min, int max) {
    return min + ((int) Math.floor(Math.random() * (max - min)));
  }
}

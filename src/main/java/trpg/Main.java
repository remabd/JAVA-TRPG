package trpg;

import java.util.Arrays;
import java.util.Scanner;

import trpg.map.*;
import trpg.race.*;
import trpg.healthy.*;

public class Main {
  public static void main(String[] args) {

    System.out.println("Enter difficulty (1 for easy, 4 to very hard):");
    Scanner scanner = new Scanner(System.in);
    int difficulty = Integer.parseInt(scanner.nextLine());

    System.out.println("Enter size of map");
    int size = Integer.parseInt(scanner.nextLine());

    String[] classes = { "Humain", "Elfe", "Nain", "Orc" };
    String classe = null;
    do {
      System.out.println("Les classes disponibles sont: ");
      System.out.println(Arrays.toString(classes));
      System.out.println("Enter class");
      classe = scanner.nextLine();
    } while (!Arrays.asList(classes).contains(classe));

    Player player;
    switch (classe) {
      case "Humain":
        player = new Human();
        break;
      case "Elfe":
        player = new Elf();
        break;
      case "Nain":
        player = new Dwarf();
        break;
      case "Orc":
        player = new Orc();
        break;

      default:
        System.out.println("Erreur lors de l'attribution de la classe, fin du programme");
        return;
    }

    GameMap gameMap = new GameMap(size, difficulty, player);
    gameMap.display();

  }
}

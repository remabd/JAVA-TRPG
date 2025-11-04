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

    while (player.isAlive() && !player.getPosition().equals(new Position(size - 1, size - 1))) {
      Position playerPosition = player.getPosition();
      System.out.println("Où voulez vous aller ?");
      System.out.println("Gauche: 1, Haut: 2, Droite: 3, Bas: 4, Abandonner: 5");
      int action = Integer.parseInt(scanner.nextLine());
      switch (action) {
        case 1:
          if (playerPosition.getPosition()[0] == 0) {
            System.out.println("Vous ne pouvez pas allez là");
          } else {
            player.move(playerPosition.shiftGauche());
          }
          gameMap.resolvePosition(playerPosition);
          break;
        case 2:
          if (playerPosition.getPosition()[1] == 0) {
            System.out.println("Vous ne pouvez pas allez là");
          } else {
            player.move(playerPosition.shiftHaut());
          }
          gameMap.resolvePosition(playerPosition);
          break;
        case 3:
          if (playerPosition.getPosition()[0] == size) {
            System.out.println("Vous ne pouvez pas allez là");
          } else {
            player.move(playerPosition.shiftDroite());
          }
          gameMap.resolvePosition(playerPosition);
          break;
        case 4:
          if (playerPosition.getPosition()[1] == size) {
            System.out.println("Vous ne pouvez pas allez là");
          } else {
            player.move(playerPosition.shiftBas());
          }
          gameMap.resolvePosition(playerPosition);
          break;
        case 5:
          System.out.println("Abandon ! Fin du jeu");
          return;
        default:
          System.out.println("Erreur lors du déplacement");
          break;
      }
      gameMap.display();
    }

    if (!player.isAlive()) {
      System.out.println("Game Over !");
    } else {
      System.out.println("Victoire !");
    }

  }
}

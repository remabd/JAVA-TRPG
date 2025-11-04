package trpg;

import java.util.Scanner;

import trpg.healthy.*;
import trpg.weapon.*;

public class EventResolver {
  Scanner scanner;

  public EventResolver() {
    this.scanner = new Scanner(System.in);
  }

  public void Fight(Player player, Monster monster) {
    System.out.println("Un monstre se dresse devant vous. Préparez vous au combat !");
    while (player.isAlive() && monster.isAlive()) {
      player.hit(monster);
      if (player.isAlive()) {
        monster.hit(player);
      }
    }
    if (!monster.isAlive()) {
      System.out.println("Le monstre est mort");
      System.out.println("Il vous reste " + player.getHp() + " points de vie");
      int gold = (int) Math.floor(Math.random() * 30);
      player.gainGold(gold);
      System.out.println("Vous avez gagné " + gold + "g.");
    } else {
      System.out.println("Vous êtes mort");
      return;
    }
  }

  public void destroyObstacle(Player player, Obstacle obstacle) {
    System.out.println("Un obstacle se dresse devant vous, vous décidez de le détruire.");
    int counter = 0;
    while (obstacle.isAlive()) {
      player.hit(obstacle);
      counter++;
    }
    System.out.println("L'obstacle a été détruit en " + counter + " coups.");
  }

  public void shopItems(Player player, WeaponStore store) {
    boolean next = false;
    do {
      store.showShop();
      System.out.println("Vous avez " + player.getGold() + "g.");
      System.out.println("Quel item voulez vous acheter ? (0 pour sortir).");
      int choice = Integer.parseInt(this.scanner.nextLine());
      if (choice == 0) {
        next = true;
      } else {
        Weapon w = store.getShop().get(choice - 1);
        if (player.getGold() >= w.getPrice()) {
          player.swapWeapon(w);
          player.spendGold(w.getPrice());
          System.out.println("Arme achetée, il vous reste " + player.getGold() + "g.");
        } else {
          System.out.println("Pas assez d'argent");
        }
      }
    } while (!next);
  }
}

package trpg.encounterable;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import trpg.NumberUtil;
import trpg.healthy.Player;
import trpg.map.*;
import trpg.weapon.*;

public class WeaponStore extends Positionnable {
  private Scanner scanner;
  private ArrayList<Weapon> weapons;
  private Position position;

  public WeaponStore(Position p) {
    super(p);
    this.weapons = new ArrayList<Weapon>();
    this.initialize();
    this.scanner = new Scanner(System.in);
  }

  private void initialize() {
    int nbWeapons = NumberUtil.randomNbr(1, 7);
    for (int i = 0; i < nbWeapons; i++) {
      int typeWeapon = NumberUtil.randomNbr(0, 4);
      Weapon w;
      switch (typeWeapon) {
        case 0:
          w = new Axe();
          break;
        case 1:
          w = new Sword();
          break;
        case 2:
          w = new Hammer();
          break;
        case 3:
          w = new Bow();
          break;
        default:
          System.out.println("Erreur lors de la céation de l'arme");
          return;
      }
      this.weapons.add(w);
    }
  }

  public ArrayList<Weapon> getShop() {
    return this.weapons;
  }

  public void showShop() {
    String inventory = "Magasin: [ 1: " + this.weapons.get(0);
    for (int i = 1; i < this.weapons.size(); i++) {
      inventory += ", " + i + 1 + ": " + this.weapons.get(i);
    }
    inventory += "].";
    System.out.println(inventory);
  }

  public void sell(Weapon w) {
    this.weapons.remove(this.weapons.indexOf(w));
  }

  public void resolveEncounter(Player player) {
    boolean next = false;
    do {
      this.showShop();
      System.out.println("Vous avez " + player.getGold() + "g.");
      System.out.println("Quel item voulez vous acheter ? (0 pour sortir).");
      int choice = Integer.parseInt(this.scanner.nextLine());
      if (choice == 0) {
        next = true;
      } else {
        Weapon w = this.getShop().get(choice - 1);
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

  public String getSymbol() {
    return " S ";
  }
}

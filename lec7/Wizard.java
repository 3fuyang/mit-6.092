package lec7;

import java.util.ArrayList;

public class Wizard extends Dude {
  ArrayList<Spell> spells = new ArrayList<>();

  public void cast(Spell spell) {
    mp -= spell.mpCost;
    System.out.println("Casting " + spell.name + " for " + spell.mpCost + " MP");
  }
}
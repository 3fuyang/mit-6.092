package lec5;

import java.util.ArrayList;

public class ArrayListExample {
  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Evan");
    strings.add("Eugene");
    strings.add("Adam");

    System.out.println(strings.size());
    System.out.println(strings.get(0));
    System.out.println(strings.get(1));
    System.out.println(strings.get(2));

    strings.set(0, "Goodbye");
    strings.remove(1);

    for (String s : strings) {
      System.out.println(s);
    }
  }
}
package lec5;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
  public static void main(String[] args) {
    HashMap<String, String> strings = new HashMap<>();

    strings.put("Evan", "email1@mit.edu");
    strings.put("Eugene", "email2@mit.edu");
    strings.put("Admin", "email3@mit.edu");

    System.out.println(strings.size());
    strings.remove("Evan");

    System.out.println("Keys:");
    for (String s : strings.keySet()) {
      System.out.println(s);
    }
    System.out.println("Values:");
    for (String s : strings.values()) {
      System.out.println(s);
    }
    System.out.println("KVs:");
    for (Map.Entry<String, String> pairs : strings.entrySet()) {
      System.out.println(pairs);
    }
  }
}

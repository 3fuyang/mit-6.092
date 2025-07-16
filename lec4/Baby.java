package lec4;

public class Baby {
  String name;
  boolean isMale;
  double weight;
  double decibels;
  int numPoops = 0;
  Baby[] siblings;

  Baby(String myname, boolean maleBaby) {
    name = myname;
    isMale = maleBaby;
  }

  void sayHi() {
    System.out.println(
      "Hi, my name is.. " + name
    );
  }

  void poop() {
    numPoops++;
    System.out.println("Dear mom, I have pooped. Ready the diaper.");
  }
}

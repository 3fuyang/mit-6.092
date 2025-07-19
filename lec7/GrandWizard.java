package lec7;

public class GrandWizard extends Wizard {
  public void sayName() {
    System.out.println("Grand wizard " + name);
  }

  public static void main(String[] args) {
    GrandWizard g = new GrandWizard();
    g.name = "Flash";
    g.sayName();
    // NOTE: casting does not influence the method that is called
    ((Dude) g).sayName();
  }
}

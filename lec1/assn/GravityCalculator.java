package lec1.assignments;

import java.util.Scanner;

public class GravityCalculator {
  // x(t) = 0.5 × at2 + vi × t + xi
  public static void main(String[] args) {
    double gravity = -9.81;
    Scanner reader = new Scanner(System.in);
    System.out.println("Enter the initial velocity in m/s: ");
    double initialVelocity = reader.nextDouble();
    System.out.println("Enter the falling time in s: ");
    double fallingTime = reader.nextDouble();
    System.out.println("Enter the initial position in m: ");
    double initialPosition = reader.nextDouble();
    double finalPosition = 0.5 * gravity * fallingTime * fallingTime + initialVelocity * fallingTime + initialPosition;
    System.out
        .println("The object's position after " + fallingTime + "s is " + String.format("%.2f", finalPosition) + "m.");
    reader.close();
  }
}

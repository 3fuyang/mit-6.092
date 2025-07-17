package lec2.assignments;

import java.util.Scanner;

public class FooCorporation {
  public static double calculatePay(double baseWage, double hoursWorked) {
    double overtimeRatio = 1.5;
    double overtimeWage = baseWage * overtimeRatio;
    double baseHours = 40.0;
    double maximumHoursPerWeek = 60.0;
    double pay;

    if (hoursWorked > baseHours) {
      double overtimeHours = Math.min(hoursWorked, maximumHoursPerWeek) - baseHours;
      pay = overtimeHours * overtimeWage + baseHours * baseWage;
    } else {
      pay = hoursWorked * baseWage;
    }

    return pay;
  }

  public static void pay(double baseWage, double hoursWorked) {
    if (hoursWorked > 0) {
      double pay = calculatePay(baseWage, hoursWorked);
      System.out.println("The pay is " + pay);
    } else {
      System.out.println("Invalid input");
    }
  }

  public static void main(String[] args) {
    Scanner reader = new Scanner(System.in);

    System.out.println("Enter the base hourly wage: ");
    double baseWage = reader.nextDouble();
    double minimumWage = 8.0;
    if (baseWage < minimumWage) {
      System.out.println("Base wage too low: will use minimum wage: $8.00/hour");
      baseWage = minimumWage;
    }
    System.out.println("Enter the number of hours worked: ");
    double hoursWorked = reader.nextDouble();
    pay(baseWage, hoursWorked);

    reader.close();
  }
}

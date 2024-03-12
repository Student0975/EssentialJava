package ua.com.csb.homework.task5MyArea;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int radius = 0;

    do {
      System.out.println("Input a circle radius, R:");
      try{
        radius = scanner.nextInt();
      } catch (InputMismatchException ex) {
        scanner.next();
      }
    } while (verifyInputConditions(radius));

    System.out.printf("Area of the circle with radius=%s : %.2f", radius, MyArea.areaOfCircle(radius));
  }

  private static boolean verifyInputConditions(int r) {
    if (r <= 0) {
      System.out.println("""
          Input must be >0 and integer!
          Please, try to input again!
          """);
      return true;
    }
    return false;
  }
}

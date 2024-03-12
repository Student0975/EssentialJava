package ua.com.cbs.homework.task2Rectangle;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Створити клас із ім'ям Rectangle.
 * У тілі класу створити два поля, що описують довжини сторін double side1, double side2.
 * Створити два методи, що обчислюють площу прямокутника - double areaCalculator (double side1, double side2)
 * і периметр прямокутника - double perimeterCalculator (double side1, double side2).
 * Написати програму, яка приймає від користувача довжини двох сторін прямокутника і виводить на екран периметр та площу.
 */

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    // 1st case : by using empty constructor
    Rectangle rectangle1 = new Rectangle();
    rectangle1.setSide1(inputSide(scanner,1));
    rectangle1.setSide2(inputSide(scanner,2));
    System.out.println("Case 1:");
    System.out.println("-------");
    printRectangleDetails(rectangle1);

    // 2nd case : by using not empty constructor
    System.out.println("Case 2:");
    System.out.println("-------");
    double s1 = inputSide(scanner,1);
    double s2 = inputSide(scanner,2);
    Rectangle rectangle2 = new Rectangle(s1,s2);
    printRectangleDetails(rectangle2);

    scanner.close();
  }

  private static void printRectangleDetails(Rectangle rectangle) {
    System.out.printf("There is a rectangle ==> %.2fx%.2f\n", rectangle.getSide1(), rectangle.getSide2());
    System.out.printf("It's area is      : %.2f\n", rectangle.areaCalculator(rectangle.getSide1(), rectangle.getSide2()));
    System.out.printf("It's perimeter is : %.2f\n", rectangle.perimeterCalculator(rectangle.getSide1(), rectangle.getSide2()));
  }

  private static double inputSide(Scanner scanner, int i) {
    double n = 0;
    do {
      System.out.println("Input " + i +" side of the rectangle :");
      try {
        n = scanner.nextDouble();
      } catch (InputMismatchException ex) {
        scanner.next();
      }
    } while (verifyInputConditions(n));
    return n;
  }

  private static boolean verifyInputConditions(double n) {
    if (n <= 0) {
      System.out.println("""
          Input must be >0!
          Try input again, please!
          """);
      return true;
    }
    return false;
  }
}

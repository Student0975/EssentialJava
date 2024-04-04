package ua.com.csb.homework.task5_Calculator;

/**
 *  Створіть клас Calculator.
 *  У тілі класу створіть чотири методи для арифметичних дій: (add – додавання, sub – віднімання, mul – множення, div – поділ).
 *  Метод поділу повинен перевірити поділ на нуль, якщо перевірка не проходить, згенерувати виняток.
 *  Користувач вводить значення, над якими хоче зробити операцію та вибрати саму операцію.
 *  У разі виникнення помилок повинні викидатися винятки.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  static final public Scanner scanner = new Scanner(System.in);
  static public int choiceOption;
  static double prevNumber = 0;
  static double currentNumber = 0;

  public static void main(String[] args) {

    printMainMenu();

    try (scanner) {
      do {
        choiceOption = -1;
        System.out.println("Make your choice(0 / 1 / 2 / 3 / 4) :");
        try {
          choiceOption = scanner.nextInt();
        } catch (InputMismatchException ex) {
          scanner.nextLine();
        }
      } while (verifyInputOption(choiceOption));
    }
  }

  private static void printMainMenu() {
    System.out.println("""
        Calculator:
        ------------
        1 - Addition
        2 - Subtraction
        3 - Multiplication
        4 - Division
        ------------
        0 - Exit(stop)
        """);
  }

  private static boolean verifyInputOption(int choiceOption) {

    Calculator calculator = new Calculator();

    switch (choiceOption) {
      case 0 -> {
        System.out.println("Good bye!");
        return false;
      }
      case 1 -> {
        double inputtedNumber = inputNumber();
        currentNumber = calculator.add(prevNumber, inputtedNumber);
        System.out.printf("(%.2f + %.2f) ==> %.2f\n", prevNumber, inputtedNumber, currentNumber);
        return true;
      }
      case 2 -> {
        double inputtedNumber = inputNumber();
        currentNumber = calculator.sub(prevNumber, inputtedNumber);
        System.out.printf("(%.2f - %.2f) ==> %.2f\n", prevNumber, inputtedNumber, currentNumber);
        return true;
      }
      case 3 -> {
        double inputtedNumber = inputNumber();
        currentNumber = calculator.mul(prevNumber, inputtedNumber);
        System.out.printf("(%.2f * %.2f) ==> %.2f\n", prevNumber, inputtedNumber, currentNumber);
        return true;
      }
      case 4 -> {
        double inputtedNumber = inputNumber();
        try {
          if (inputtedNumber == 0) {
            throw new DivByZeroException("Division by O is forbidden!");
          }
          currentNumber = calculator.div(prevNumber, inputtedNumber);
          System.out.printf("(%.2f / %.2f) ==> %.2f\n", prevNumber, inputtedNumber, currentNumber);
        } catch (DivByZeroException ex) {
          System.err.println(ex.getMessage());
        }
        return true;
      }
      default -> {
        System.err.println("Please, choose only from 0 / 1 / 2 / 3 / 4 !");
        return true;
      }
    }
  }

  private static double inputNumber() {
    prevNumber = currentNumber;
    while (true) {
      System.out.println("Input number :");
      scanner.nextLine();
      try {
        return scanner.nextDouble();
      } catch (InputMismatchException ex) {
        System.err.println("Must be only number!");
      }
    }
  }
}

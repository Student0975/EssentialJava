package ua.com.csb.homework.task2_Worker;

import ua.com.csb.homework.task2_Worker.exception.EmptyWorkersArrayException;
import ua.com.csb.homework.task2_Worker.exception.FullWorkersArrayException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Описати клас з ім'ям Worker, що містить такі поля:
 *  прізвище та ініціали працівника;
 *  назва посади;
 *  рік надходження на роботу.
 * Написати програму, яка виконує такі дії:
 *  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
 *  якщо значення року введено не у відповідному форматі, видає виняток.
 *  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.
 */

public class Main {
  static int choiceNumber;
  static ArrayList<Worker> listWorkers = new ArrayList<>();
  static final Scanner scanner = new Scanner(System.in);

  public static void main(String[] args) {

    try(scanner) {
      do {
        choiceNumber = -1;
        printMainMenu();
        try {
          choiceNumber = scanner.nextInt();
          scanner.nextLine();
        } catch (InputMismatchException ex) {
          scanner.next();
        }
      } while (verifyInputConditions(choiceNumber));
    }
  }

  private static boolean verifyInputConditions(int choiceNumber) {

    HandlerModule handlerModule = new HandlerModule();

    switch (choiceNumber) {
      case 0 -> {
        System.out.println("Good Bye!");
        return false;
      }

      case 1 -> {
        try {
          if (listWorkers.size() == 5) {
            throw new FullWorkersArrayException("All position are occupied!\nNo ability adding a new worker!");
          }
          handlerModule.process(1);
        } catch (FullWorkersArrayException ex) {
          System.err.println(ex.getMessage());
        }
        return true;
      }

      case 2 -> {
        try {
          if (listWorkers.isEmpty()) {
            throw new EmptyWorkersArrayException("There is no worker!");
          }
          handlerModule.process(2);
        } catch (EmptyWorkersArrayException ex) {
          System.err.println(ex.getMessage());
        }
        return true;
      }

      case 3 -> {
        try {
          if (listWorkers.isEmpty()) {
            throw new EmptyWorkersArrayException("There is no worker!");
          }
          handlerModule.process(3);
        } catch (EmptyWorkersArrayException ex) {
          System.err.println(ex.getMessage());
        }
        return true;
      }

      default -> {
        System.err.println("Be attentive!\nChoice must be only among 1 / 2 / 3 / 0");
        return true;
      }
    }
  }

  private static void printMainMenu() {
    System.out.println("""
        \nMain Menu :
        ---------------------
        1 - add a new worker
        2 - list of workers with a certain length of service
        3 - list of all workers by alphabet order
        0 - exit
        """);
    System.out.println("Make your choice :");
  }
}

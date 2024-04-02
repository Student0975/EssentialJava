package ua.com.csb.homework.task3_Price;

/**
 *  Потрібно: Описати клас з іменем Price, що містить такі поля:
 *   назву товару;
 *   назву магазину, в якому продається товар;
 *   вартість товару у гривнях.
 *  Написати програму, яка виконує такі дії:
 *   введення з клавіатури даних до масиву, що складається з двох елементів типу Price (записи мають бути впорядковані в алфавітному порядку за назвами магазинів);
 *   виведення на екран інформації про товари, що продаються в магазині, назва якого введена з клавіатури (якщо такого магазину немає, вивести виняток).
 */

import ua.com.csb.homework.task3_Price.exception.EmptyItemsArrayException;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

  static int choice = -1;
  static final Scanner scanner = new Scanner(System.in);
  static ArrayList<Price> priceArrayList = new ArrayList<>();

  public static void main(String[] args) {

    try (scanner){
      do {
        choice = -1;
        printMainMenu();

        try {
          choice = scanner.nextInt();
          scanner.nextLine();
        } catch (InputMismatchException ex) {
          scanner.nextLine();
        }
      } while (verifyInputOption(choice));
    }
  }

  private static boolean verifyInputOption(int choice) {
    HandlerModule handlerModule = new HandlerModule();

    switch (choice) {
      case 0 -> {
        System.out.println("Good Bye!");
        return false;
      }
      case 1 -> {
        handlerModule.process(1);
        return true;
      }
      case 2 -> {
        try {
          if (priceArrayList.isEmpty()) {
            throw new EmptyItemsArrayException("No goods yet!");
          }
          handlerModule.process(2);
        } catch (EmptyItemsArrayException ex) {
          System.err.println(ex.getMessage());
        }
        return true;
      }
      default -> {
        System.err.println("""
            Be attentive!
            Choice must be only among 1 / 2 / 0);
            """);
        return true;
      }
    }
  }

  private static void printMainMenu() {
    System.out.println("""
        \nMain Menu:
        ---------------
        1 - add a new item
        2 - list of goods from the shop
        0 - exit
        """);
    System.out.println("Make your choice :");
  }
}

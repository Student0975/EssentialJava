package ua.com.cbs.homework.DocumentWorker;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Створити клас DocumentWorker.
 * У тілі класу створіть три методи openDocument(), editDocument(), saveDocument().
 * У тілі кожного з методів додайте виведення на екран відповідних рядків:
 * "Документ відкритий", "Правка документа доступна у версії Про", "Збереження документа доступне у версії Про".
 * Створіть похідний клас ProDocumentWorker.
 * Перевизначте відповідні методи, при перевизначенні методів виводьте наступні рядки:
 * "Документ відредаговано", "Документ збережено у старому форматі, збереження в інших форматах доступне у версії Експерт".
 * Створіть похідний клас ExpertDocumentWorker від базового класу ProDocumentWorker. Перевизначте відповідний метод.
 * При викликі даного методу необхідно виводити на екран документ збережений в новому форматі.
 * У тілі методу main() реалізуйте можливість прийому від користувача номер ключа доступу pro і exp.
 * Якщо користувач не вводить ключ, він може користуватися тільки безкоштовною версією (створюється екземпляр базового класу),
 * якщо користувач ввів номери ключа доступу pro і exp,
 * то повинен створити екземпляр відповідної версії класу, наведений до базового – DocumentWorker.
 */


public class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int key = 0;
    boolean exit = true;
    DocumentWorker document = new DocumentWorker();

    while (exit) {
      do {
        printMenu();
        try {
          key = scanner.nextInt();
        } catch (InputMismatchException ex) {
          scanner.next();
        }
      } while (verifyingInputConditions(key));

      switch (key) {
        case 1 -> document = new ProDocumentWorker();
        case 2 -> document = new ExpertDocumentWorker();
      }
      exit = false;
    }

    document.openDocument();
    document.editDocument();
    document.saveDocument();

  }

  private static void printMenu() {
    System.out.println("""
        Input your key access
        ---------------------
        0 - general
        1 - pro
        2 - exp
        """);
    System.out.println("Make your choice :");
  }

  private static boolean verifyingInputConditions(int key) {
    if (key < 0 || key > 3) {
      System.out.println("""
          Key must be only 0 / 1 / 2!
          Try to input again!
          """);
      return true;
    }
    return false;
  }
}

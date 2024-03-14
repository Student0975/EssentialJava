package ua.com.cbs.homework.task6Printer;

public class RedPrinter extends Printer{

  @Override
  void print(String value) {
    System.out.println("value is : " + "\u001B[31m" + value + "\u001B[0m");
    System.out.println("value is : " + (char) 27 + "[31m" + value + (char) 27 + "[0m");
  }
}

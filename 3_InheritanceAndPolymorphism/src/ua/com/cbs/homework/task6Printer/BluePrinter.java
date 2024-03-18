package ua.com.cbs.homework.task6Printer;

public class BluePrinter extends Printer{

  @Override
  void print(String value) {
    System.out.println("value is : " + "\u001B[34m" + value + "\u001B[0m");
    System.out.println("value is : " + (char) 27 + "[34m" + value + (char) 27 + "[0m");
  }
}

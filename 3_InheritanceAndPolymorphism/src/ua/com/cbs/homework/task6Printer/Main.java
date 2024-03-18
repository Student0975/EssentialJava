package ua.com.cbs.homework.task6Printer;

public class Main {
  public static void main(String[] args) {
    Printer printer = new Printer();
    printer.print("Standard color");
    Printer printer1 = new RedPrinter();
    printer1.print("Red color");
    Printer printer2 = new BluePrinter();
    printer2.print("Blue color");
    Printer printer3 = new YellowPrinter();
    printer3.print("Yellow color");
  }
}

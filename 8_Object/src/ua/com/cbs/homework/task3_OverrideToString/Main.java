package ua.com.cbs.homework.task3_OverrideToString;

/**
 * Дивитися завдання 2. В обох класах перевизначити метод toString, щоб виведення було наступним:
 *
 * Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
 * Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, X=1280, Y=1024
 */

public class Main {
  public static void main(String[] args) {
    Device device = new Device("Samsung", 120f, "AB1234567CD");
    Monitor monitor = new Monitor("Samsung", 120f, "AB1234567CD",1280, 1024);

    // with overriding of the toString() method
    // without overriding of the hashCode(), equals() methods

    System.out.println(device);
    System.out.println(monitor);

    System.out.println("device hashCode = " + device.hashCode());
    System.out.println("monitor hashCode = " + monitor.hashCode());
    System.out.println("device.equals(monitor) = " + device.equals(monitor));
  }
}

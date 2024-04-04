package ua.com.cbs.homework.task4_OverrideEqualsHashCode;

/**
 * Подивитися завдання 2.
 * Перевизначити методи equals & hashCode у кожному класі.
 * Створити клас Main, де створити об'єкти класів і продемонструвати перевизначені методи.
 */

public class Main {
  public static void main(String[] args) {
    Device device1 = new Device();
    Device device2 = new Device();
    System.out.println("device1 : " + device1);
    System.out.println("device2 : " + device2);
    System.out.println("device1.equals(device2) : " + device1.equals(device2)); // checking by content
    System.out.println("device1 == device2      : " + (device1 == device2));    // checking by reference
    System.out.println("device1.hashCode()      = " + device1.hashCode());      // equal objects have equal hashcode
    System.out.println("device2.hashCode()      = " + device2.hashCode());
    System.out.println("-".repeat(15));

    Monitor monitor1 = new Monitor(1280,1024);
    Monitor monitor2 = new Monitor(1280,1024);
    System.out.println("monitor1 : " + monitor1);
    System.out.println("monitor2 : " + monitor2);
    System.out.println("monitor1.equals(monitor2) : " + monitor1.equals(monitor2));
    System.out.println("monitor1 == monitor2      : " + (monitor1 == monitor2));
    System.out.println("monitor1.hashCode()       = " + monitor1.hashCode());
    System.out.println("monitor2.hashCode()       = " + monitor2.hashCode());
    System.out.println("-".repeat(15));

    System.out.println("device1.equals(monitor1) : " + device1.equals(monitor1));
    System.out.println("device1 == monitor1      : " + (device1 == monitor1));
    System.out.println("-".repeat(15));

    EthernetAdapter ethernetAdapter1 = new EthernetAdapter("hp",20f,"32342FF3",10,"10:22:43");
    EthernetAdapter ethernetAdapter2 = new EthernetAdapter("hp",20f,"32342FF3",10,"10:22:43");
    System.out.println("ethernetAdapter1 : " + ethernetAdapter1);
    System.out.println("ethernetAdapter2 : " + ethernetAdapter2);
    System.out.println("ethernetAdapter1.equals(ethernetAdapter2) : " + ethernetAdapter1.equals(ethernetAdapter2));
    System.out.println("ethernetAdapter1 == ethernetAdapter2      : " + (ethernetAdapter1 == ethernetAdapter2));
    System.out.println("ethernetAdapter1.hashCode()               = " + ethernetAdapter1.hashCode());
    System.out.println("ethernetAdapter2.hashCode()               = " + ethernetAdapter2.hashCode());
  }
}

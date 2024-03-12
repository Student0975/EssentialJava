package ua.com.csb.homework.task3Car;

/**
 * Створити клас Машина з полями рік(int), швидкість(double), вага(int) колір(String).
 * Створити конструктор за замовчуванням, конструктор з 1 параметром, 2-а, 3-я, 4-а.
 * Перевантажити конструктори.
 * Створити клас Main, де створити екземляри класу Машина з різними параметрами.
 */

public class Main {

  public static void main(String[] args) {
    Car car1 = new Car();
    Car car2 = new Car(2023);
    Car car3 = new Car(2022,210);
    Car car4 = new Car(2020,215,560,"red");

    System.out.println(car1);
    System.out.println(car2);
    System.out.println(car3);
    System.out.println(car4);
  }
}

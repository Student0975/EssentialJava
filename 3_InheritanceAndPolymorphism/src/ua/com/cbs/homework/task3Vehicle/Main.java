package ua.com.cbs.homework.task3Vehicle;

/**
 * Потрібно: Створити клас Vehicle.
 * У тілі класу створіть поля: координати та параметри суден (ціна, швидкість, рік випуску).
 * Створіть 3 похідних класи Plane, Саг та Ship.
 * Для класу Plane має бути визначена висота та кількість пасажирів.
 * Для класу Ship – кількість пасажирів та порт приписки.
 * Написати програму, яка виводить на екран інформацію про кожен засіб пересування.
 */

public class Main {
  public static void main(String[] args) {
    Car car = new Car(12.38, 20.36, 30000, 200, 1990);
    System.out.println("Car info :\n" + car.showInfo());

    Plane plane = new Plane(15.20, 16.39, 250, 2100, 1999, 250.00, 150);
    System.out.println("Plane info :\n" + plane.showInfo());

    Ship ship = new Ship(10.90, 21.09, 1200, 300, 2009, 120, "Odesa");
    System.out.println("Ship info :\n" + ship.showInfo());

  }
}

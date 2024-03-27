package ua.com.cbs.homework.task4_VehicleEnum;

/**
 * Створіть перечислювальний тип (enum) Vehicles,
 * що містить конструктор, який повинен набувати цілого числа (вартість автомобіля),
 * містити метод getColor(), який повертає рядок з кольором автомобіля,
 * і містити перевантажений метод toString(),
 * який повинен повертати рядок з назвою екземпляра, кольором та вартістю автомобіля.
 */

public class Main {
  public static void main(String[] args) {
    Vehicle.RENO.setColor("black");
    Vehicle.PEUGEOT.setColor("white");
    Vehicle.MERCEDES.setColor("grey");
    Vehicle.AUDI.setColor("red");

    Vehicle[] values = Vehicle.values();
    for (Vehicle vehicle :values) {
      System.out.println(vehicle);
    }
  }
}

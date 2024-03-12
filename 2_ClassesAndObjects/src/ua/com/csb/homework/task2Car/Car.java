package ua.com.csb.homework.task2Car;

public class Car {
  private int year;
  private String color;

  public Car() {
  }

  public Car(int year) {
    this.year = year;
    color = "red";
  }

  public Car(int year, String color) {
    this.year = year;
    this.color = color;
  }

  @Override
  public String toString() {
    return "Car{" +
        "year=" + year +
        ", color='" + color + '\'' +
        '}';
  }
}

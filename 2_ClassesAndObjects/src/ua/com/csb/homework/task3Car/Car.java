package ua.com.csb.homework.task3Car;

public class Car {
  private int yearRelease;
  private double speed;
  private int weight;
  private String color;

  public Car() {
  }

  public Car(int yearRelease) {
    this.yearRelease = yearRelease;
  }

  public Car(int yearRelease, double speed) {
    this.yearRelease = yearRelease;
    this.speed = speed;
  }

  public Car(int yearRelease, double speed, int weight) {
    this.yearRelease = yearRelease;
    this.speed = speed;
    this.weight = weight;
  }

  public Car(int yearRelease, double speed, int weight, String color) {
    this.yearRelease = yearRelease;
    this.speed = speed;
    this.weight = weight;
    this.color = color;
  }

  @Override
  public String toString() {
    return "Car{" +
        "yearRelease=" + yearRelease +
        ", speed=" + speed +
        ", weight=" + weight +
        ", color='" + color + '\'' +
        '}';
  }
}

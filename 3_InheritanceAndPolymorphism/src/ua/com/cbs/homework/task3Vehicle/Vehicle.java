package ua.com.cbs.homework.task3Vehicle;

public class Vehicle {
  private double longitude;
  private double latitude;
  private double price;
  private double speed;
  private int yearReleased;

  public Vehicle(double longitude, double latitude, double price, double speed, int yearReleased) {
    this.longitude = longitude;
    this.latitude = latitude;
    this.price = price;
    this.speed = speed;
    this.yearReleased = yearReleased;
  }

  public String showInfo() {
    return "longitude " + longitude + ", latitude " + latitude +
        ", price " + price + ", speed " + speed + ", year of released " + yearReleased;
  }
}

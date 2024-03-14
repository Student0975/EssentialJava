package ua.com.cbs.homework.task3Vehicle;

public class Plane extends Vehicle{

  private double height;
  private int capacity;

  public Plane(double longitude, double latitude, double price, double speed, int yearReleased, double height, int capacity) {
    super(longitude, latitude, price, speed, yearReleased);
    this.height = height;
    this.capacity = capacity;
  }

  @Override
  public String showInfo() {
    return super.showInfo() + ", height : " + height + ", capacity : " + capacity;
  }
}

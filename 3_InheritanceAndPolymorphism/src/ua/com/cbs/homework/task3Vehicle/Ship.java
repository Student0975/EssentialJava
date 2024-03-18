package ua.com.cbs.homework.task3Vehicle;

public class Ship extends Vehicle{

  private int capacity;
  private String mainPort;

  public Ship(double longitude, double latitude, double price, double speed, int yearReleased, int capacity, String mainPort) {
    super(longitude, latitude, price, speed, yearReleased);
    this.capacity = capacity;
    this.mainPort = mainPort;
  }

  @Override
  public String showInfo() {
    return super.showInfo() + ", capacity " + capacity + ", main port " + mainPort;
  }
}

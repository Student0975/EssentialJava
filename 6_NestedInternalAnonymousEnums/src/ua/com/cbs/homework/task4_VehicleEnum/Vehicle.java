package ua.com.cbs.homework.task4_VehicleEnum;

public enum Vehicle {
  RENO(15000), PEUGEOT(18000), MERCEDES(25000), AUDI(2000);

  private int price;
  private String color;

  Vehicle(int price) {
    this.price = price;
  }

  public int getPrice() {
    return price;
  }

  public String getColor() {
    return color;
  }

  public void setColor(String color) {
    this.color = color;
  }

  @Override
  public String toString() {
    return "Vehicle{" +
        "name=" + name() +
        ", price=" + price +
        ", color='" + color + '\'' +
        '}';
  }
}

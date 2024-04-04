package ua.com.cbs.homework.task4_OverrideEqualsHashCode;

import java.util.Objects;

public class EthernetAdapter extends Device {
  private int speed;
  private String mac;

  public EthernetAdapter() {
  }

  public EthernetAdapter(int speed, String mac) {
    this.speed = speed;
    this.mac = mac;
  }

  public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
    super(manufacturer, price, serialNumber);
    this.speed = speed;
    this.mac = mac;
  }

  public int getSpeed() {
    return speed;
  }

  public void setSpeed(int speed) {
    this.speed = speed;
  }

  public String getMac() {
    return mac;
  }

  public void setMac(String mac) {
    this.mac = mac;
  }

  @Override
  public String toString() {
    return "EthernetAdapter{" +
        "manufacturer='" + super.getManufacturer() +
        ", price=" + super.getPrice() +
        ", serialNumber='" + super.getSerialNumber() +
        ", speed=" + speed +
        ", mac='" + mac + '\'' +
        '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof EthernetAdapter that)) return false;
    if (!super.equals(o)) return false;
    return getSpeed() == that.getSpeed() && getMac().equalsIgnoreCase(that.getMac());
  }

  @Override
  public int hashCode() {
    return Objects.hash(super.hashCode(), getSpeed(), getMac());
  }
}

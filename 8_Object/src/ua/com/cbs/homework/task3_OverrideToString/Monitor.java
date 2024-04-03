package ua.com.cbs.homework.task3_OverrideToString;

public class Monitor extends Device {
  private int resolutionX;
  private int resolutionY;

  public Monitor() {
  }

  public Monitor(int resolutionX, int resolutionY) {
    this.resolutionX = resolutionX;
    this.resolutionY = resolutionY;
  }

  public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
    super(manufacturer, price, serialNumber);
    this.resolutionX = resolutionX;
    this.resolutionY = resolutionY;
  }

  public int getResolutionX() {
    return resolutionX;
  }

  public void setResolutionX(int resolutionX) {
    this.resolutionX = resolutionX;
  }

  public int getResolutionY() {
    return resolutionY;
  }

  public void setResolutionY(int resolutionY) {
    this.resolutionY = resolutionY;
  }

  @Override
  public String toString() {
    return "Monitor{" +
        "manufacturer='" + super.getManufacturer() +
        ", price=" + super.getPrice() +
        ", serialNumber='" + super.getSerialNumber() +
        ", resolutionX=" + resolutionX +
        ", resolutionY=" + resolutionY +
        '}';
  }
}

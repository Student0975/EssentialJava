package ua.com.cbs.homework.task2Rectangle;

public class Rectangle {
  private double side1;
  private double side2;

  public Rectangle() {
  }

  public Rectangle(double side1, double side2) {
    this.side1 = side1;
    this.side2 = side2;
  }

  public double getSide1() {
    return side1;
  }

  public void setSide1(double side1) {
    this.side1 = side1;
  }

  public double getSide2() {
    return side2;
  }

  public void setSide2(double side2) {
    this.side2 = side2;
  }

  public double areaCalculator (double side1, double side2) {
    return side1 * side2;
  }

  public double perimeterCalculator (double side1, double side2) {
    return (side1 + side2) *2;
  }
}

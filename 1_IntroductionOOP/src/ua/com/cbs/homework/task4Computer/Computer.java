package ua.com.cbs.homework.task4Computer;

public class Computer {
  private final int number;

  public Computer(int number) {
    this.number = number;
  }

  @Override
  public String toString() {
    return "Computer{" +
        "number=" + number +
        '}';
  }
}

package ua.com.csb.homework.task2_Worker;


public class Worker {
  private final String surnameInitials;
  private final String position;
  private final int yearStartWork;

  public Worker(String surnameInitials, String position, int yearStartWork) {
    this.surnameInitials = surnameInitials;
    this.position = position;
    this.yearStartWork = yearStartWork;
  }

  public String getSurnameInitials() {
    return surnameInitials;
  }

  public int getYearStartWork() {
    return yearStartWork;
  }

  @Override
  public String toString() {
    return "Worker{" +
        "surnameInitials='" + surnameInitials + '\'' +
        ", position='" + position + '\'' +
        ", yearStartWork=" + yearStartWork +
        '}';
  }
}

package ua.com.cbs.homework.task2Classroom;

public class BadPupil extends Pupil{
  @Override
  void study() {
    System.out.println("studies badly!!!");
  }

  @Override
  void read() {
    System.out.println("reads badly!!!");
  }

  @Override
  void write() {
    System.out.println("writes badly!!!");
  }

  @Override
  void relax() {
    System.out.println("relaxes badly!!!");
  }
}

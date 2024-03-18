package ua.com.cbs.homework.task2Classroom;

public class NoPupil extends Pupil{
  @Override
  void study() {
    System.out.println("There is no pupil!");
  }

  @Override
  void read() {
    System.out.println("There is no pupil!");
  }

  @Override
  void write() {
    System.out.println("There is no pupil!");
  }

  @Override
  void relax() {
    System.out.println("There is no pupil!");
  }
}

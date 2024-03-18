package ua.com.cbs.homework.task2Classroom;

public class Classroom {
  private final Pupil pupil1;
  private final Pupil pupil2;
  private final Pupil pupil3;
  private final Pupil pupil4;

  public Classroom(Pupil pupil1, Pupil pupil2) {
    this.pupil1 = pupil1;
    this.pupil2 = pupil2;
    this.pupil3 = new NoPupil();
    this.pupil4 = new NoPupil();
  }

  public Classroom(Pupil pupil1, Pupil pupil2, Pupil pupil3) {
    this.pupil1 = pupil1;
    this.pupil2 = pupil2;
    this.pupil3 = pupil3;
    this.pupil4 = new NoPupil();
  }

  public Classroom(Pupil pupil1, Pupil pupil2, Pupil pupil3, Pupil pupil4) {
    this.pupil1 = pupil1;
    this.pupil2 = pupil2;
    this.pupil3 = pupil3;
    this.pupil4 = pupil4;
  }

  public void classInfoExcellentPupil() {
    System.out.print("Pupil 1 - ");
    pupil1.study();
    System.out.print("Pupil 2 - ");
    pupil2.study();
    System.out.print("Pupil 3 - ");
    pupil3.study();
    System.out.print("Pupil 4 - ");
    pupil4.study();
  }

  public void classInfoReadRate() {
    System.out.print("Pupil 1 - ");
    pupil1.read();
    System.out.print("Pupil 2 - ");
    pupil2.read();
    System.out.print("Pupil 3 - ");
    pupil3.read();
    System.out.print("Pupil 4 - ");
    pupil4.read();
  }

  public void classInfoWriteRate() {
    System.out.print("Pupil 1 - ");
    pupil1.write();
    System.out.print("Pupil 2 - ");
    pupil2.write();
    System.out.print("Pupil 3 - ");
    pupil3.write();
    System.out.print("Pupil 4 - ");
    pupil4.write();
  }

  public void classInfoRelaxRate() {
    System.out.print("Pupil 1 - ");
    pupil1.relax();
    System.out.print("Pupil 2 - ");
    pupil2.relax();
    System.out.print("Pupil 3 - ");
    pupil3.relax();
    System.out.print("Pupil 4 - ");
    pupil4.relax();
  }

  public void showInfo(String s, Classroom classroom) {
    System.out.println(s);
    System.out.println("-".repeat(15));
    classroom.classInfoExcellentPupil();
    System.out.println();
    classroom.classInfoReadRate();
    System.out.println();
    classroom.classInfoWriteRate();
    System.out.println();
    classroom.classInfoRelaxRate();
  }
}

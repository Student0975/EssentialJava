package ua.com.cbs.homework.task2Classroom;

/**
 * Створити клас, який представляє навчальний клас ClassRoom.
 * Створіть клас учень Pupil. У тілі класу створіть методи void study(), void read(), void write(), void relax().
 * Створіть 3 похідні класу ExcellentPupil, GoodPupil, BadPupil від класу базового класу Pupil і
 * перевизначте кожен із методів, залежно від успішності учня.
 * Конструктор класу ClassRoom приймає аргументи типу Pupil, клас має складатися із 4 учнів.
 * Передбачте можливість, що користувач може передати 2 або 3 аргументи.
 * Виведіть інформацію про те, як усі учні екземпляра класу ClassRoom вміють навчатися, читати, писати, відпочивати.
 */

public class Main {

  public static void main(String[] args) {
    ExcellentPupil pupil1 = new ExcellentPupil();
    ExcellentPupil pupil2 = new ExcellentPupil();
    GoodPupil      pupil3 = new GoodPupil();
    GoodPupil      pupil4 = new GoodPupil();
    BadPupil       pupil5 = new BadPupil();
    BadPupil       pupil6 = new BadPupil();

    Classroom classroom1 = new Classroom(pupil1, pupil3);
    classroom1.showInfo("\nClassroom1 info :", classroom1);

    Classroom classroom2 = new Classroom(pupil3, pupil5);
    classroom2.showInfo("\nClassroom2 info :", classroom2);

    Classroom classroom3 = new Classroom(pupil1, pupil3, pupil5);
    classroom3.showInfo("\nClassroom3 info :", classroom3);

    Classroom classroom4 = new Classroom(pupil1, pupil4, pupil3, pupil6);
    classroom3.showInfo("\nClassroom4 info :", classroom4);
  }


}
